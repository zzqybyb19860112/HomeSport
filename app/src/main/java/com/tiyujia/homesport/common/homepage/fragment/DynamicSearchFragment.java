package com.tiyujia.homesport.common.homepage.fragment;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.tiyujia.homesport.API;
import com.tiyujia.homesport.BaseFragment;
import com.tiyujia.homesport.R;
import com.tiyujia.homesport.common.homepage.activity.HomePageWholeSearchActivity;
import com.tiyujia.homesport.common.homepage.adapter.SearchDynamicAdapter;
import com.tiyujia.homesport.common.homepage.adapter.SearchEquipAdapter;
import com.tiyujia.homesport.common.homepage.entity.SearchDynamicEntity;
import com.tiyujia.homesport.common.homepage.entity.SearchEquipEntity;
import com.tiyujia.homesport.util.CacheUtils;
import com.tiyujia.homesport.util.JSONParseUtil;
import com.tiyujia.homesport.util.PostUtil;
import com.tiyujia.homesport.util.RefreshUtil;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by zzqybyb19860112 on 2016/12/5.
 */

public class DynamicSearchFragment extends BaseFragment implements SwipeRefreshLayout.OnRefreshListener{
    View view;
    private RecyclerView recyclerView;
    private SwipeRefreshLayout srlRefresh;
    List<SearchDynamicEntity> list=new ArrayList<>();
    public static SearchDynamicAdapter adapter;
    public static final int HANDLE_DYNAMIC_DATA=1;
    Handler handler=new Handler(){
        @Override
        public void handleMessage(Message msg) {
            switch (msg.what){
                case HANDLE_DYNAMIC_DATA:
                    adapter=new SearchDynamicAdapter(getActivity(),list);
                    adapter.setFriends(list);
                    adapter.getFilter().filter(HomePageWholeSearchActivity.getSearchText());
                    RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getActivity());
                    recyclerView.setLayoutManager(layoutManager);
                    recyclerView.setAdapter(adapter);
                    srlRefresh.setRefreshing(false);
                    break;
            }
        }
    };
    @Override
    public void onRefresh() {
        setNetData();
        new Handler().postDelayed(new Runnable() {
            @Override public void run() {
                // 停止刷新
                srlRefresh.setRefreshing(false);
            }
        }, 1000);
    }

    @Override
    protected View initView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view=inflater.inflate(R.layout.recycleview_layout,null);
        return view;
    }

    @Override
    protected void initData() {
        recyclerView= (RecyclerView)view.findViewById(R.id.recyclerView);
        srlRefresh= (SwipeRefreshLayout)view.findViewById(R.id.srlRefresh);
        RefreshUtil.refresh(srlRefresh, getActivity());
        srlRefresh.setOnRefreshListener(this);
        setNetData();
    }
    private void setNetData(){
        ArrayList<String> cacheData= (ArrayList<String>) CacheUtils.readJson(getActivity(), DynamicSearchFragment.this.getClass().getName() + ".json");
        if (cacheData==null||cacheData.size()==0) {
            new Thread() {
                @Override
                public void run() {
                    String uri = API.BASE_URL + "/v2/search/model";
                    HashMap<String, String> params = new HashMap<>();
                    params.put("model", "3");
                    params.put("number", "10");
                    params.put("pageNumber", "1");
                    String result = PostUtil.sendPostMessage(uri, params);
                    JSONParseUtil.parseNetDataSearchDynamic(getActivity(),result, DynamicSearchFragment.this.getClass().getName()+".json",list, handler, HANDLE_DYNAMIC_DATA);
                }
            }.start();
        }else {
            JSONParseUtil.parseLocalDataSearchDynamic(getActivity(), DynamicSearchFragment.this.getClass().getName()+".json",list, handler, HANDLE_DYNAMIC_DATA);
        }
    }
}
