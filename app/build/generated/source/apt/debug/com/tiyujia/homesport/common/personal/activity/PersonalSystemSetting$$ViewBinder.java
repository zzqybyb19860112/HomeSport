// Generated code from Butter Knife. Do not modify!
package com.tiyujia.homesport.common.personal.activity;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class PersonalSystemSetting$$ViewBinder<T extends com.tiyujia.homesport.common.personal.activity.PersonalSystemSetting> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131558776, "field 'personal_back'");
    target.personal_back = finder.castView(view, 2131558776, "field 'personal_back'");
    view = finder.findRequiredView(source, 2131559001, "field 're_info'");
    target.re_info = finder.castView(view, 2131559001, "field 're_info'");
    view = finder.findRequiredView(source, 2131559002, "field 're_attestation'");
    target.re_attestation = finder.castView(view, 2131559002, "field 're_attestation'");
    view = finder.findRequiredView(source, 2131559005, "field 're_grade'");
    target.re_grade = finder.castView(view, 2131559005, "field 're_grade'");
    view = finder.findRequiredView(source, 2131559006, "field 're_clean'");
    target.re_clean = finder.castView(view, 2131559006, "field 're_clean'");
    view = finder.findRequiredView(source, 2131559009, "field 're_about'");
    target.re_about = finder.castView(view, 2131559009, "field 're_about'");
    view = finder.findRequiredView(source, 2131559008, "field 're_feedback'");
    target.re_feedback = finder.castView(view, 2131559008, "field 're_feedback'");
    view = finder.findRequiredView(source, 2131559010, "field 'tv_loginout'");
    target.tv_loginout = finder.castView(view, 2131559010, "field 'tv_loginout'");
    view = finder.findRequiredView(source, 2131559007, "field 'tvCache'");
    target.tvCache = finder.castView(view, 2131559007, "field 'tvCache'");
    view = finder.findRequiredView(source, 2131559004, "field 'togglebutton'");
    target.togglebutton = finder.castView(view, 2131559004, "field 'togglebutton'");
    view = finder.findRequiredView(source, 2131558538, "field 'tv_title'");
    target.tv_title = finder.castView(view, 2131558538, "field 'tv_title'");
  }

  @Override public void unbind(T target) {
    target.personal_back = null;
    target.re_info = null;
    target.re_attestation = null;
    target.re_grade = null;
    target.re_clean = null;
    target.re_about = null;
    target.re_feedback = null;
    target.tv_loginout = null;
    target.tvCache = null;
    target.togglebutton = null;
    target.tv_title = null;
  }
}
