// Generated code from Butter Knife. Do not modify!
package com.tiyujia.homesport.common.personal.activity;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class ProtocolAcitvity$$ViewBinder<T extends com.tiyujia.homesport.common.personal.activity.ProtocolAcitvity> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131558538, "field 'tv_title'");
    target.tv_title = finder.castView(view, 2131558538, "field 'tv_title'");
    view = finder.findRequiredView(source, 2131558776, "field 'personal_back'");
    target.personal_back = finder.castView(view, 2131558776, "field 'personal_back'");
    view = finder.findRequiredView(source, 2131558635, "field 'webview'");
    target.webview = finder.castView(view, 2131558635, "field 'webview'");
  }

  @Override public void unbind(T target) {
    target.tv_title = null;
    target.personal_back = null;
    target.webview = null;
  }
}
