// Generated code from Butter Knife. Do not modify!
package com.tiyujia.homesport.common.community.activity;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class CommunityAddAttention$$ViewBinder<T extends com.tiyujia.homesport.common.community.activity.CommunityAddAttention> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131558537, "field 'ivBack'");
    target.ivBack = finder.castView(view, 2131558537, "field 'ivBack'");
    view = finder.findRequiredView(source, 2131558707, "field 'ivSearch'");
    target.ivSearch = finder.castView(view, 2131558707, "field 'ivSearch'");
    view = finder.findRequiredView(source, 2131558544, "field 'swipeRefresh'");
    target.swipeRefresh = finder.castView(view, 2131558544, "field 'swipeRefresh'");
    view = finder.findRequiredView(source, 2131558605, "field 'recyclerView'");
    target.recyclerView = finder.castView(view, 2131558605, "field 'recyclerView'");
    view = finder.findRequiredView(source, 2131558697, "field 'tv_title'");
    target.tv_title = finder.castView(view, 2131558697, "field 'tv_title'");
    view = finder.findRequiredView(source, 2131558708, "field 'tvSuggest'");
    target.tvSuggest = finder.castView(view, 2131558708, "field 'tvSuggest'");
    view = finder.findRequiredView(source, 2131558709, "field 'llSearchUser'");
    target.llSearchUser = finder.castView(view, 2131558709, "field 'llSearchUser'");
    view = finder.findRequiredView(source, 2131558711, "field 'tvSearchUserClose'");
    target.tvSearchUserClose = finder.castView(view, 2131558711, "field 'tvSearchUserClose'");
  }

  @Override public void unbind(T target) {
    target.ivBack = null;
    target.ivSearch = null;
    target.swipeRefresh = null;
    target.recyclerView = null;
    target.tv_title = null;
    target.tvSuggest = null;
    target.llSearchUser = null;
    target.tvSearchUserClose = null;
  }
}
