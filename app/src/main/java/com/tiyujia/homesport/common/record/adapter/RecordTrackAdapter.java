package com.tiyujia.homesport.common.record.adapter;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.tiyujia.homesport.API;
import com.tiyujia.homesport.R;
import com.tiyujia.homesport.common.community.activity.CommunityDynamicDetailActivity;
import com.tiyujia.homesport.common.community.activity.CommunityDynamicPublish;
import com.tiyujia.homesport.common.personal.model.ActiveModel;
import com.tiyujia.homesport.common.record.model.CityHistoryModel;
import com.tiyujia.homesport.util.PicUtil;
import com.tiyujia.homesport.util.PicassoUtil;
import com.tiyujia.homesport.util.StringUtil;
import com.tiyujia.homesport.util.TimeUtil;

import java.util.ArrayList;
import java.util.List;

import butterknife.ButterKnife;

/**
 * 作者: Cymbi on 2016/11/22 11:04.
 * 邮箱:928902646@qq.com
 */

public class RecordTrackAdapter extends BaseQuickAdapter<CityHistoryModel.History> {

    public RecordTrackAdapter(List<CityHistoryModel.History> data) {
        super(R.layout.record_track_item,data);
    }

    @Override
    protected void convert(BaseViewHolder baseViewHolder, final CityHistoryModel.History history) {
        baseViewHolder.setText(R.id.tvTitle,history.venueName)
                .setText(R.id.tvTime, API.min.format(history.spendTime))
                .setText(R.id.tvDate,API.format.format(history.createTime)+"");
        ImageView ivBackground=baseViewHolder.getView(R.id.ivBackground);
        ImageView ivImage=baseViewHolder.getView(R.id.ivImage);
        TextView tvLevel=baseViewHolder.getView(R.id.tvLevel);
        View view=baseViewHolder.getConvertView();
        if(TextUtils.isEmpty(history.level)){
            tvLevel.setText("难度: "+"5.0");
        }else {tvLevel.setText("难度: "+history.level);}
        if (history.concernId==null){
            ivImage.setImageResource(R.mipmap.pic_gray);
            view.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                  Intent i = new Intent(mContext, CommunityDynamicPublish.class);
                    i.putExtra("recordId",history.id);
                    mContext.startActivity(i);
                }
            });
        }else {
            ivImage.setImageResource(R.mipmap.btn_image);
            view.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent=new Intent(mContext,CommunityDynamicDetailActivity.class);
                    intent.putExtra("recommendId",history.concernId);
                    mContext.startActivity(intent);
                }
            });
        }
        PicassoUtil.handlePic(mContext, PicUtil.getImageUrlDetail(mContext, StringUtil.isNullAvatar(history.imgUrls), 720, 720),ivBackground,720,720);

    }
}
