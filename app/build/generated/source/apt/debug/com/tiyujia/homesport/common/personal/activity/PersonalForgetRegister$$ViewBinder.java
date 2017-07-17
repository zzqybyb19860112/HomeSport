// Generated code from Butter Knife. Do not modify!
package com.tiyujia.homesport.common.personal.activity;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class PersonalForgetRegister$$ViewBinder<T extends com.tiyujia.homesport.common.personal.activity.PersonalForgetRegister> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131558537, "field 'ivBack'");
    target.ivBack = finder.castView(view, 2131558537, "field 'ivBack'");
    view = finder.findRequiredView(source, 2131558783, "field 'tvProtocol'");
    target.tvProtocol = finder.castView(view, 2131558783, "field 'tvProtocol'");
    view = finder.findRequiredView(source, 2131558784, "field 'tvSucceed'");
    target.tvSucceed = finder.castView(view, 2131558784, "field 'tvSucceed'");
    view = finder.findRequiredView(source, 2131558781, "field 'tvVerCode'");
    target.tvVerCode = finder.castView(view, 2131558781, "field 'tvVerCode'");
    view = finder.findRequiredView(source, 2131558782, "field 'etPassword'");
    target.etPassword = finder.castView(view, 2131558782, "field 'etPassword'");
    view = finder.findRequiredView(source, 2131558780, "field 'etVerCode'");
    target.etVerCode = finder.castView(view, 2131558780, "field 'etVerCode'");
    view = finder.findRequiredView(source, 2131558779, "field 'etPhone'");
    target.etPhone = finder.castView(view, 2131558779, "field 'etPhone'");
  }

  @Override public void unbind(T target) {
    target.ivBack = null;
    target.tvProtocol = null;
    target.tvSucceed = null;
    target.tvVerCode = null;
    target.etPassword = null;
    target.etVerCode = null;
    target.etPhone = null;
  }
}
