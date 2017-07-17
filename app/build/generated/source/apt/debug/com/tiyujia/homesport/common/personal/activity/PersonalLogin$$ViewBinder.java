// Generated code from Butter Knife. Do not modify!
package com.tiyujia.homesport.common.personal.activity;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class PersonalLogin$$ViewBinder<T extends com.tiyujia.homesport.common.personal.activity.PersonalLogin> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131558929, "field 'tvRegister'");
    target.tvRegister = finder.castView(view, 2131558929, "field 'tvRegister'");
    view = finder.findRequiredView(source, 2131558931, "field 'tvLogin'");
    target.tvLogin = finder.castView(view, 2131558931, "field 'tvLogin'");
    view = finder.findRequiredView(source, 2131558930, "field 'tvForget'");
    target.tvForget = finder.castView(view, 2131558930, "field 'tvForget'");
    view = finder.findRequiredView(source, 2131558537, "field 'ivBack'");
    target.ivBack = finder.castView(view, 2131558537, "field 'ivBack'");
    view = finder.findRequiredView(source, 2131558779, "field 'etPhone'");
    target.etPhone = finder.castView(view, 2131558779, "field 'etPhone'");
    view = finder.findRequiredView(source, 2131558782, "field 'etPassword'");
    target.etPassword = finder.castView(view, 2131558782, "field 'etPassword'");
  }

  @Override public void unbind(T target) {
    target.tvRegister = null;
    target.tvLogin = null;
    target.tvForget = null;
    target.ivBack = null;
    target.etPhone = null;
    target.etPassword = null;
  }
}
