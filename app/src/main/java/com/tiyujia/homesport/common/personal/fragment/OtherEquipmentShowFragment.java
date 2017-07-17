package com.tiyujia.homesport.common.personal.fragment;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.lzy.okgo.OkGo;
import com.tiyujia.homesport.API;
import com.tiyujia.homesport.BaseFragment;
import com.tiyujia.homesport.ImmersiveActivity;
import com.tiyujia.homesport.R;
import com.tiyujia.homesport.common.personal.adapter.DynamicAdapter;
import com.tiyujia.homesport.common.personal.adapter.EquipmentShowAdapter;
import com.tiyujia.homesport.common.personal.model.EquipmentShowModel;
import com.tiyujia.homesport.entity.LoadCallback;
import com.tiyujia.homesport.util.RefreshUtil;

import butterknife.Bind;
import okhttp3.Call;
import okhttp3.Response;

/**
 * 作者: Cymbi on 2016/11/14 17:45.
 * 邮箱:928902646@qq.com
 */

public class OtherEquipmentShowFragment extends BaseFragment implements SwipeRefreshLayout.OnRefreshListener{
    private  SwipeRefreshLayout srlRefresh;
    private  RecyclerView recyclerView;
    private String mToken;
    private int mUserId;
    private EquipmentShowAdapter adapter;
    private int pageSize=100;
    private int page=1;
    private View view;

    @Override
    protected View initView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view=inflater.inflate(R.layout.recycleview_layout,null);
        return view;
    }

    @Override
    protected void initData() {
        setInfo();
        recyclerView= (RecyclerView)view.findViewById(R.id.recyclerView);
        srlRefresh= (SwipeRefreshLayout)view.findViewById(R.id.srlRefresh);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        adapter=new EquipmentShowAdapter(null);
        adapter.openLoadAnimation(BaseQuickAdapter.SCALEIN);
        adapter.isFirstOnly(false);
        recyclerView.setAdapter(adapter);
        View view= LayoutInflater.from(getActivity()).inflate(R.layout.normal_empty_image_view,null);
        LinearLayout.LayoutParams lp2 = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT);
        view.setLayoutParams(lp2);
        TextView tvEmptyText= (TextView) view.findViewById(R.id.text_empty);
        tvEmptyText.setText("暂无数据");
        adapter.setEmptyView(view);
        RefreshUtil.refresh(srlRefresh,getActivity());
        srlRefresh.setOnRefreshListener(this);
        //adapter.setOnLoadMoreListener(this);
        onRefresh();
    }
    private void setInfo() {
        SharedPreferences share = getActivity().getSharedPreferences("UserInfo", Context.MODE_PRIVATE);
        mToken=share.getString("Token","");
        mUserId=getArguments().getInt("account_id",0  );
    }
    @Override
    public void onRefresh() {
        OkGo.get(API.BASE_URL+"/v2/my/equipment/create/list")
                .tag(this)
                .params("token",mToken)
                .params("userId",mUserId)
                .params("page",page)
                .params("pageSize",pageSize)
                .execute(new LoadCallback<EquipmentShowModel>(getActivity()) {
                    @Override
                    public void onSuccess(EquipmentShowModel equipmentShowModel, Call call, Response response) {
                                if (equipmentShowModel.state==200){adapter.setNewData(equipmentShowModel.data);}
                    }
                    @Override
                    public void onError(Call call, Response response, Exception e) {
                        super.onError(call, response, e);
                        showToast("服务器故障");
                    }

                    @Override
                    public void onAfter(@Nullable EquipmentShowModel equipmentShowModel, @Nullable Exception e) {
                        super.onAfter(equipmentShowModel, e);
                        adapter.removeAllFooterView();
                        setRefreshing(false);
                    }
                });
    }
    public void setRefreshing(final boolean refreshing) {
        srlRefresh.post(new Runnable() {
            @Override
            public void run() {
                srlRefresh.setRefreshing(refreshing);
            }
        });
    }
}