// Generated code from Butter Knife. Do not modify!
package com.tiyujia.homesport.common.homepage.activity;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class HomePageDateActivity$$ViewBinder<T extends com.tiyujia.homesport.common.homepage.activity.HomePageDateActivity> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131558772, "field 'ivMenu'");
    target.ivMenu = finder.castView(view, 2131558772, "field 'ivMenu'");
    view = finder.findRequiredView(source, 2131558537, "field 'ivBack'");
    target.ivBack = finder.castView(view, 2131558537, "field 'ivBack'");
    view = finder.findRequiredView(source, 2131558744, "field 'ivPush'");
    target.ivPush = finder.castView(view, 2131558744, "field 'ivPush'");
    view = finder.findRequiredView(source, 2131558809, "field 'tvline'");
    target.tvline = finder.castView(view, 2131558809, "field 'tvline'");
    view = finder.findRequiredView(source, 2131558810, "field 'cbDateBanner'");
    target.cbDateBanner = finder.castView(view, 2131558810, "field 'cbDateBanner'");
    view = finder.findRequiredView(source, 2131558605, "field 'recyclerView'");
    target.recyclerView = finder.castView(view, 2131558605, "field 'recyclerView'");
    view = finder.findRequiredView(source, 2131558544, "field 'srlRefresh'");
    target.srlRefresh = finder.castView(view, 2131558544, "field 'srlRefresh'");
  }

  @Override public void unbind(T target) {
    target.ivMenu = null;
    target.ivBack = null;
    target.ivPush = null;
    target.tvline = null;
    target.cbDateBanner = null;
    target.recyclerView = null;
    target.srlRefresh = null;
  }
}
