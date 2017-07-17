// Generated code from Butter Knife. Do not modify!
package com.tiyujia.homesport.common.personal.activity;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class PersonalAttention$$ViewBinder<T extends com.tiyujia.homesport.common.personal.activity.PersonalAttention> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131558537, "field 'ivBack'");
    target.ivBack = finder.castView(view, 2131558537, "field 'ivBack'");
    view = finder.findRequiredView(source, 2131558707, "field 'iv_search'");
    target.iv_search = finder.castView(view, 2131558707, "field 'iv_search'");
    view = finder.findRequiredView(source, 2131558544, "field 'swipeRefresh'");
    target.swipeRefresh = finder.castView(view, 2131558544, "field 'swipeRefresh'");
    view = finder.findRequiredView(source, 2131558605, "field 'recyclerView'");
    target.recyclerView = finder.castView(view, 2131558605, "field 'recyclerView'");
    view = finder.findRequiredView(source, 2131558697, "field 'tv_title'");
    target.tv_title = finder.castView(view, 2131558697, "field 'tv_title'");
    view = finder.findRequiredView(source, 2131558708, "field 'tvSuggest'");
    target.tvSuggest = finder.castView(view, 2131558708, "field 'tvSuggest'");
  }

  @Override public void unbind(T target) {
    target.ivBack = null;
    target.iv_search = null;
    target.swipeRefresh = null;
    target.recyclerView = null;
    target.tv_title = null;
    target.tvSuggest = null;
  }
}
