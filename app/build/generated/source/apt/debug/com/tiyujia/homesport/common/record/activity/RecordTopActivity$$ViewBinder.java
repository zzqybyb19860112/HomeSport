// Generated code from Butter Knife. Do not modify!
package com.tiyujia.homesport.common.record.activity;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class RecordTopActivity$$ViewBinder<T extends com.tiyujia.homesport.common.record.activity.RecordTopActivity> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131558537, "field 'ivBack'");
    target.ivBack = finder.castView(view, 2131558537, "field 'ivBack'");
    view = finder.findRequiredView(source, 2131558691, "field 'ivAvatar'");
    target.ivAvatar = finder.castView(view, 2131558691, "field 'ivAvatar'");
    view = finder.findRequiredView(source, 2131558693, "field 'ivLv'");
    target.ivLv = finder.castView(view, 2131558693, "field 'ivLv'");
    view = finder.findRequiredView(source, 2131559050, "field 'tvUserNumber'");
    target.tvUserNumber = finder.castView(view, 2131559050, "field 'tvUserNumber'");
    view = finder.findRequiredView(source, 2131558692, "field 'tvNickname'");
    target.tvNickname = finder.castView(view, 2131558692, "field 'tvNickname'");
    view = finder.findRequiredView(source, 2131559041, "field 'tvTotalScore'");
    target.tvTotalScore = finder.castView(view, 2131559041, "field 'tvTotalScore'");
    view = finder.findRequiredView(source, 2131558605, "field 'recyclerView'");
    target.recyclerView = finder.castView(view, 2131558605, "field 'recyclerView'");
    view = finder.findRequiredView(source, 2131559049, "field 'llUserinfo'");
    target.llUserinfo = finder.castView(view, 2131559049, "field 'llUserinfo'");
  }

  @Override public void unbind(T target) {
    target.ivBack = null;
    target.ivAvatar = null;
    target.ivLv = null;
    target.tvUserNumber = null;
    target.tvNickname = null;
    target.tvTotalScore = null;
    target.recyclerView = null;
    target.llUserinfo = null;
  }
}
