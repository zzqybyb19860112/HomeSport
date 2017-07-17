// Generated code from Butter Knife. Do not modify!
package com.tiyujia.homesport.common.personal.activity;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class PersonalActive$$ViewBinder<T extends com.tiyujia.homesport.common.personal.activity.PersonalActive> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131558776, "field 'personal_back'");
    target.personal_back = finder.castView(view, 2131558776, "field 'personal_back'");
    view = finder.findRequiredView(source, 2131558742, "field 'tab'");
    target.tab = finder.castView(view, 2131558742, "field 'tab'");
    view = finder.findRequiredView(source, 2131558743, "field 'vp'");
    target.vp = finder.castView(view, 2131558743, "field 'vp'");
    view = finder.findRequiredView(source, 2131558538, "field 'tv_title'");
    target.tv_title = finder.castView(view, 2131558538, "field 'tv_title'");
  }

  @Override public void unbind(T target) {
    target.personal_back = null;
    target.tab = null;
    target.vp = null;
    target.tv_title = null;
  }
}
