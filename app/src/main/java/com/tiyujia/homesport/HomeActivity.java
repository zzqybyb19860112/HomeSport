package com.tiyujia.homesport;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.ViewPager;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import com.amap.api.location.AMapLocation;
import com.amap.api.location.AMapLocationClient;
import com.amap.api.location.AMapLocationClientOption;
import com.amap.api.location.AMapLocationListener;
import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.appindexing.Thing;
import com.google.android.gms.common.api.GoogleApiClient;
import com.tiyujia.homesport.common.homepage.fragment.HomePageFragment;
import com.tiyujia.homesport.common.community.fragment.CommunityFragment;
import com.tiyujia.homesport.common.personal.fragment.PersonalFragment;
import com.tiyujia.homesport.common.record.fragment.RecordFragment;
import com.tiyujia.homesport.util.CityUtils;
import com.tiyujia.homesport.util.StatusBarUtil;
import com.tiyujia.homesport.widget.CustomViewPager;
import java.util.ArrayList;
import java.util.List;

public class HomeActivity extends CheckPermissionsActivity implements View.OnClickListener {
    private final static int ACTIVE = 0;
    private final static int COMMUNITY = 1;
    private final static int CONCERN = 2;
    private final static int PERSONAL = 3;
    private int currentTabIndex = 0; // 当前tab下标
    private CustomViewPager pager;
    private Button tabActivie, tabCommunity, tabConcern, tabPersonal;
    List<Fragment> fragmentList;
    HomePageFragment homePageFragment = null;
    RecordFragment communityFragment = null;
    CommunityFragment recordFragment = null;
    private long exitTime = 0;
    PersonalFragment personalFragment = null;
    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    private GoogleApiClient client2;
    public static AMapLocationClient client = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
        setContentView(R.layout.activity_home);
        getLocation();
        setview();
        if (savedInstanceState != null) {
            if (fragmentList != null && fragmentList.size() > 0) {
                boolean showFlag = false;
                FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
                for (int i = fragmentList.size() - 1; i >= 0; i--) {
                    Fragment fragment = fragmentList.get(i);
                    if (fragment != null) {
                        if (!showFlag) {
                            ft.show(fragmentList.get(i));
                            showFlag = true;
                        } else {
                            ft.hide(fragmentList.get(i));
                        }
                    }
                }
                ft.commit();
            }
        }
        setTabSelection(ACTIVE);// 设置默认选中的tab页
        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client2 = new GoogleApiClient.Builder(this).addApi(AppIndex.API).build();
    }
    public  void getLocation() {
        client =new AMapLocationClient(App.getContext());
        AMapLocationListener aMapLocationListener = new AMapLocationListener() {
            @Override
            public void onLocationChanged(AMapLocation aMapLocation) {
                if(aMapLocation!=null&&aMapLocation.getErrorCode()==0){
                    String city= aMapLocation.getCity();
                    if(city.contains("市")){
                        city=city.replace("市","");
                    }
                    SharedPreferences share=getSharedPreferences("UserInfo",MODE_PRIVATE);
                    SharedPreferences.Editor etr = share.edit();
                    etr.putString("City",city);
                    etr.apply();
                    double jingDu=aMapLocation.getLongitude();
                    double weiDu=aMapLocation.getLatitude();
                    Intent intent=new Intent("GOT_LOCATION");
                    intent.putExtra("city",city);
                    intent.putExtra("jingDu",jingDu);
                    intent.putExtra("weiDu",weiDu);
                    Log.i("tag","send");
                    HomeActivity.this.sendBroadcast(intent);
                }
            }
        };
        client.setLocationListener(aMapLocationListener);
        AMapLocationClientOption  option=  new AMapLocationClientOption();
        //设置模式为高精度
        option.setLocationMode(AMapLocationClientOption.AMapLocationMode.Hight_Accuracy);
        //获取一次定位结果，该方法默认为false
        option.setOnceLocation(true);
        //获取最近3S内精度最高的一次定位结果
        //设置setOnceLocationLatest(boolean b)接口为true。启动定位是SKD会返回最近3秒最高的一次定位结果，如果设置为true，setOnceLocation(boolean b)也会为true，反之不会，默认为false。
        option.setOnceLocationLatest(true);
        //给定位客户端对象设置定位参数
        client.setLocationOption(option);
        client.startLocation();
    }
    /**
     * 连按两次返回
     *
     * @param keyCode
     * @param event
     * @return
     */
    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (KeyEvent.KEYCODE_BACK == keyCode) {
            // 判断是否在两秒之内连续点击返回键，是则退出，否则不退出
            if (System.currentTimeMillis() - exitTime > 2000) {
               showToast("再按一次退出程序");
                // 将系统当前的时间赋值给exitTime
                exitTime = System.currentTimeMillis();
            } else {
                exitApp();
            }
            return true;
        }
        return super.onKeyDown(keyCode, event);
    }
    /**
     * 退出应用程序的方法，发送退出程序的广播
     */
    private void exitApp() {
        Intent intent = new Intent();
        intent.setAction("net.loonggg.exitapp");
        this.sendBroadcast(intent);
    }
    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        if (this.getResources().getConfiguration().orientation == Configuration.ORIENTATION_LANDSCAPE) {
            //land
        } else if (this.getResources().getConfiguration().orientation == Configuration.ORIENTATION_PORTRAIT) {
            //port
        }
    }

    private void setview() {
        pager = (CustomViewPager) findViewById(R.id.home_viewpager);
        tabActivie = (Button) findViewById(R.id.tab_active_btn);
        tabCommunity = (Button) findViewById(R.id.tab_community_btn);
        tabConcern = (Button) findViewById(R.id.tab_concern_btn);
        tabPersonal = (Button) findViewById(R.id.tab_personal_btn);
        tabActivie.setOnClickListener(this);
        tabCommunity.setOnClickListener(this);
        tabConcern.setOnClickListener(this);
        tabPersonal.setOnClickListener(this);
        pager.addOnPageChangeListener(new HomeViewPagerListener());
        fragmentList = new ArrayList<Fragment>();
        homePageFragment = new HomePageFragment();
        communityFragment = new RecordFragment();
        recordFragment = new CommunityFragment();
        personalFragment = new PersonalFragment();
        fragmentList.add(homePageFragment);
        fragmentList.add(communityFragment);
        fragmentList.add(recordFragment);
        fragmentList.add(personalFragment);
        FragmentPagerAdapter fragmentPagerAdapter = new HomeFragmentPagerAdapter(this.getSupportFragmentManager(), fragmentList);
        pager.setAdapter(fragmentPagerAdapter);
        pager.setOffscreenPageLimit(fragmentList.size());
        pager.setSlide(false);
    }

    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    public Action getIndexApiAction() {
        Thing object = new Thing.Builder()
                .setName("Home Page") // TODO: Define a title for the content shown.
                // TODO: Make sure this auto-generated URL is correct.
                .setUrl(Uri.parse("http://[ENTER-YOUR-URL-HERE]"))
                .build();
        return new Action.Builder(Action.TYPE_VIEW)
                .setObject(object)
                .setActionStatus(Action.STATUS_TYPE_COMPLETED)
                .build();
    }

    @Override
    public void onStart() {
        super.onStart();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client2.connect();
        AppIndex.AppIndexApi.start(client2, getIndexApiAction());
    }

    @Override
    public void onStop() {
        super.onStop();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        AppIndex.AppIndexApi.end(client2, getIndexApiAction());
        client2.disconnect();
    }

    /**
     * note:   Adapter
     * Create : Cymbi 2016/10/19 14:54
     * email:928902646@qq.com
     */
    private class HomeFragmentPagerAdapter extends FragmentPagerAdapter {
        private List<Fragment> fragmentList;

        public HomeFragmentPagerAdapter(FragmentManager fm, List<Fragment> fragmentList) {
            super(fm);
            this.fragmentList = fragmentList;
        }

        @Override
        public Fragment getItem(int position) {
            return fragmentList.get(position);
        }

        @Override
        public int getCount() {
            return fragmentList == null ? 0 : fragmentList.size();
        }
    }

    private class HomeViewPagerListener implements ViewPager.OnPageChangeListener {
        @Override
        public void onPageScrollStateChanged(int position) {
        }

        @Override
        public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
        }

        @Override
        public void onPageSelected(int position) {
            setTabSelection(position);
        }
    }

    /**
     * 根据传入的index参数来设置选中的tab页
     */
    private void setTabSelection(int index) {
        // 重置状态
        resetState();
        switch (index) {
            case ACTIVE: {  // 主页
                tabActivie.setTextColor(this.getResources().getColor(R.color.home_tab_pressed_color));
                tabActivie.setSelected(true);
                break;
            }
            case COMMUNITY: { // 记录
                tabCommunity.setTextColor(this.getResources().getColor(R.color.home_tab_pressed_color));
                tabCommunity.setSelected(true);
                break;
            }
            case CONCERN: {  //社区
                tabConcern.setTextColor(this.getResources().getColor(R.color.home_tab_pressed_color));
                tabConcern.setSelected(true);
                break;
            }
            case PERSONAL: {  // 我的
                tabPersonal.setTextColor(this.getResources().getColor(R.color.home_tab_pressed_color));
                tabPersonal.setSelected(true);
                break;
            }
        }
        pager.setCurrentItem(index, false);
        currentTabIndex = index;
        //判断是否需要将状态栏字体颜色改变
        if (index == CONCERN || index == COMMUNITY) {
            StatusBarUtil.MIUISetStatusBarLightMode(getWindow(), true);
            StatusBarUtil.FlymeSetStatusBarLightMode(getWindow(), true);
        } else {
            StatusBarUtil.MIUISetStatusBarLightMode(getWindow(), false);
            StatusBarUtil.FlymeSetStatusBarLightMode(getWindow(), false);
        }
    }

    /**
     * 重置状态
     */
    private void resetState() {
        tabActivie.setTextColor(this.getResources().getColor(R.color.home_tab_nor_color));
        tabActivie.setSelected(false);
        tabCommunity.setTextColor(this.getResources().getColor(R.color.home_tab_nor_color));
        tabCommunity.setSelected(false);
        tabConcern.setTextColor(this.getResources().getColor(R.color.home_tab_nor_color));
        tabConcern.setSelected(false);
        tabPersonal.setTextColor(this.getResources().getColor(R.color.home_tab_nor_color));
        tabPersonal.setSelected(false);
    }

  /*  @Override
    public void onBackPressed() {//back to home
        Intent intent = new Intent(Intent.ACTION_MAIN, null);
        intent.addCategory(Intent.CATEGORY_HOME);
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_RESET_TASK_IF_NEEDED);
        startActivity(intent);
    }*/

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.tab_active_btn:
                setTabSelection(ACTIVE);
                break;
            case R.id.tab_community_btn:
                setTabSelection(COMMUNITY);
                break;
            case R.id.tab_concern_btn:
                setTabSelection(CONCERN);
                break;
            case R.id.tab_personal_btn:
                setTabSelection(PERSONAL);
                break;
        }
    }
}
