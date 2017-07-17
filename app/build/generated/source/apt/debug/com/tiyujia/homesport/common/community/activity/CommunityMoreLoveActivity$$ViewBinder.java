// Generated code from Butter Knife. Do not modify!
package com.tiyujia.homesport.common.community.activity;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class CommunityMoreLoveActivity$$ViewBinder<T extends com.tiyujia.homesport.common.community.activity.CommunityMoreLoveActivity> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131558537, "field 'ivBack'");
    target.ivBack = finder.castView(view, 2131558537, "field 'ivBack'");
    view = finder.findRequiredView(source, 2131558544, "field 'srlRefresh'");
    target.srlRefresh = finder.castView(view, 2131558544, "field 'srlRefresh'");
    view = finder.findRequiredView(source, 2131558605, "field 'recyclerView'");
    target.recyclerView = finder.castView(view, 2131558605, "field 'recyclerView'");
  }

  @Override public void unbind(T target) {
    target.ivBack = null;
    target.srlRefresh = null;
    target.recyclerView = null;
  }
}
