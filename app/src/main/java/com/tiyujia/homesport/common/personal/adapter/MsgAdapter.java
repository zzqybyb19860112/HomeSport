package com.tiyujia.homesport.common.personal.adapter;

import android.widget.ImageView;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.tiyujia.homesport.API;
import com.tiyujia.homesport.R;
import com.tiyujia.homesport.common.personal.model.MsgModel;
import com.tiyujia.homesport.util.LvUtil;
import com.tiyujia.homesport.util.PicUtil;
import com.tiyujia.homesport.util.PicassoUtil;
import com.tiyujia.homesport.util.StringUtil;
import com.tiyujia.homesport.util.TimeUtil;

import java.text.ParseException;
import java.util.Date;
import java.util.List;

/**
 * 作者: Cymbi on 2016/11/16 10:58.
 * 邮箱:928902646@qq.com
 */

public class MsgAdapter extends BaseQuickAdapter<MsgModel.Msg> {

    public MsgAdapter(List<MsgModel.Msg> data) {
        super(R.layout.personal_msg_item, data);
    }
    @Override
    protected void convert(BaseViewHolder baseViewHolder, MsgModel.Msg msg) {
        String  s=API.simpleDateFormat.format(msg.createTime);
        Date date = null;
        try {
            date=API.simpleDateFormat.parse(s);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        baseViewHolder.setText(R.id.tvNickname,msg.userVo.nickName)
                .setText(R.id.tvTime, TimeUtil.formatFriendly(date))
                .setText(R.id.tvTitle,msg.toObject.toTitle)
                .setText(R.id.tvReplyType,msg.fromContent);
        ImageView ivAvatar=baseViewHolder.getView(R.id.ivAvatar);
        ImageView ivLv=baseViewHolder.getView(R.id.ivLv);
        if (msg.userVo.level!=null&&msg.userVo.level.equals("")){
            LvUtil.setLv(ivLv,msg.userVo.level.pointDesc);
        }else {
            LvUtil.setLv(ivLv,"初学乍练");
        }
        PicassoUtil.handlePic(mContext, PicUtil.getImageUrlDetail(mContext, StringUtil.isNullAvatar(msg.userVo.avatar), 320, 320),ivAvatar,320,320);
    }
}
