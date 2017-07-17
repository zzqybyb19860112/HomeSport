// Generated code from Butter Knife. Do not modify!
package com.tiyujia.homesport.common.personal.activity;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class PersonalDynamic$$ViewBinder<T extends com.tiyujia.homesport.common.personal.activity.PersonalDynamic> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131558776, "field 'personal_back'");
    target.personal_back = finder.castView(view, 2131558776, "field 'personal_back'");
    view = finder.findRequiredView(source, 2131558544, "field 'srlRefresh'");
    target.srlRefresh = finder.castView(view, 2131558544, "field 'srlRefresh'");
    view = finder.findRequiredView(source, 2131558605, "field 'recyclerView'");
    target.recyclerView = finder.castView(view, 2131558605, "field 'recyclerView'");
    view = finder.findRequiredView(source, 2131558538, "field 'tv_title'");
    target.tv_title = finder.castView(view, 2131558538, "field 'tv_title'");
  }

  @Override public void unbind(T target) {
    target.personal_back = null;
    target.srlRefresh = null;
    target.recyclerView = null;
    target.tv_title = null;
  }
}
