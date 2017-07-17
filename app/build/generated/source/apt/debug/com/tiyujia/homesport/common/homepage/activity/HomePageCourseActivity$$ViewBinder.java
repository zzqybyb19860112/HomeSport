// Generated code from Butter Knife. Do not modify!
package com.tiyujia.homesport.common.homepage.activity;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class HomePageCourseActivity$$ViewBinder<T extends com.tiyujia.homesport.common.homepage.activity.HomePageCourseActivity> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131558537, "field 'ivBack'");
    target.ivBack = finder.castView(view, 2131558537, "field 'ivBack'");
    view = finder.findRequiredView(source, 2131558742, "field 'tab'");
    target.tab = finder.castView(view, 2131558742, "field 'tab'");
    view = finder.findRequiredView(source, 2131558743, "field 'vp'");
    target.vp = finder.castView(view, 2131558743, "field 'vp'");
  }

  @Override public void unbind(T target) {
    target.ivBack = null;
    target.tab = null;
    target.vp = null;
  }
}
