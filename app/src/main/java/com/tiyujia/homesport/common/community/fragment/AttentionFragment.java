package com.tiyujia.homesport.common.community.fragment;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.Nullable;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.lzy.okgo.OkGo;
import com.lzy.okgo.cache.CacheMode;
import com.tiyujia.homesport.API;
import com.tiyujia.homesport.BaseFragment;
import com.tiyujia.homesport.R;
import com.tiyujia.homesport.common.community.adapter.RecommendAdapter;
import com.tiyujia.homesport.common.community.model.RecommendModel;
import com.tiyujia.homesport.common.personal.model.ActiveModel;
import com.tiyujia.homesport.entity.LoadCallback;
import com.tiyujia.homesport.util.RefreshUtil;

import java.util.ArrayList;

import okhttp3.Call;
import okhttp3.Response;

/**
 * 作者: Cymbi on 2016/10/20 16:51.1
 * 邮箱:928902646@qq.com
 */

public class AttentionFragment extends BaseFragment implements  SwipeRefreshLayout.OnRefreshListener,BaseQuickAdapter.RequestLoadMoreListener{
    private View view;
    private RecyclerView recyclerView;
    private SwipeRefreshLayout srlRefresh;
    private RecommendAdapter adapter;
    private String mToken;
    private int mUserId;
    private int page=1;
    private int pageSize=20;
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
        adapter=new RecommendAdapter(getActivity(),null);
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
       // adapter.setOnLoadMoreListener(this);
        onRefresh();
    }

    private void setInfo() {
        SharedPreferences share = getActivity().getSharedPreferences("UserInfo", Context.MODE_PRIVATE);
        mToken=share.getString("Token","");
        mUserId=share.getInt("UserId",0);
    }

    @Override
    public void onRefresh() {
        OkGo.get(API.BASE_URL+"/v2/concern/getFollow")
                .tag(this)
                .params("token",mToken)
                .params("loginUserId",mUserId)
                .params("page",page)
                .params("pageSize",pageSize)
                .execute(new LoadCallback<RecommendModel>(getActivity()) {
                    @Override
                    public void onSuccess(RecommendModel recommendModel, Call call, Response response) {
                        if (recommendModel.state==200){adapter.setNewData(recommendModel.data);}
                    }
                    @Override
                    public void onError(Call call, Response response, Exception e) {
                        super.onError(call, response, e);
                        showToast("服务器故障");
                    }
                    @Override
                    public void onAfter(@Nullable RecommendModel recommendModel, @Nullable Exception e) {
                        super.onAfter(recommendModel, e);
                        if (adapter!=null){
                            adapter.removeAllFooterView();
                            setRefreshing(false);
                        }
                    }
                });
    }
    public void setRefreshing(final boolean refreshing) {
        if (srlRefresh!=null) {
            srlRefresh.post(new Runnable() {
                @Override
                public void run() {
                    srlRefresh.setRefreshing(refreshing);
                }
            });
        }
    }

    @Override
    public void onLoadMoreRequested() {
        OkGo.get(API.BASE_URL+"/v2/concern/getFollow")
                .tag(this)
                .params("token",mToken)
                .params("loginUserId",mUserId)
                .params("page",page+1)
                .params("pageSize",pageSize)
                .cacheMode(CacheMode.NO_CACHE)
                .execute(new LoadCallback<RecommendModel>(getActivity()) {
                    @Override
                    public void onSuccess(RecommendModel recommendModel, Call call, Response response) {
                        page=page+1;
                        if (recommendModel.state==200){adapter.setNewData(recommendModel.data);}
                    }
                    @Override
                    public void onError(Call call, Response response, Exception e) {
                        super.onError(call, response, e);
                        showToast("服务器故障");
                        adapter.showLoadMoreFailedView();
                    }
                });
    }
    public static boolean isFirstIn=true;
    @Override
    public void onResume() {
        super.onResume();
        if (!isFirstIn) {
            onRefresh();
        }
    }
}
