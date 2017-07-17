// Generated code from Butter Knife. Do not modify!
package com.tiyujia.homesport.common.personal.activity;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class PersonalFeedback$$ViewBinder<T extends com.tiyujia.homesport.common.personal.activity.PersonalFeedback> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131558778, "field 'tv_number'");
    target.tv_number = finder.castView(view, 2131558778, "field 'tv_number'");
    view = finder.findRequiredView(source, 2131558777, "field 'tv_push'");
    target.tv_push = finder.castView(view, 2131558777, "field 'tv_push'");
    view = finder.findRequiredView(source, 2131558622, "field 'content'");
    target.content = finder.castView(view, 2131558622, "field 'content'");
    view = finder.findRequiredView(source, 2131558776, "field 'personal_back'");
    target.personal_back = finder.castView(view, 2131558776, "field 'personal_back'");
  }

  @Override public void unbind(T target) {
    target.tv_number = null;
    target.tv_push = null;
    target.content = null;
    target.personal_back = null;
  }
}
