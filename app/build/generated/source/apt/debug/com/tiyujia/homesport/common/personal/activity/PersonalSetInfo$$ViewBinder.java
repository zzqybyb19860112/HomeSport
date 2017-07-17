// Generated code from Butter Knife. Do not modify!
package com.tiyujia.homesport.common.personal.activity;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class PersonalSetInfo$$ViewBinder<T extends com.tiyujia.homesport.common.personal.activity.PersonalSetInfo> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131558538, "field 'tv_title'");
    target.tv_title = finder.castView(view, 2131558538, "field 'tv_title'");
    view = finder.findRequiredView(source, 2131558812, "field 'tvAddress'");
    target.tvAddress = finder.castView(view, 2131558812, "field 'tvAddress'");
    view = finder.findRequiredView(source, 2131558997, "field 'tvBirthday'");
    target.tvBirthday = finder.castView(view, 2131558997, "field 'tvBirthday'");
    view = finder.findRequiredView(source, 2131558995, "field 'tvSex'");
    target.tvSex = finder.castView(view, 2131558995, "field 'tvSex'");
    view = finder.findRequiredView(source, 2131558776, "field 'personal_back'");
    target.personal_back = finder.castView(view, 2131558776, "field 'personal_back'");
    view = finder.findRequiredView(source, 2131558691, "field 'ivAvatar'");
    target.ivAvatar = finder.castView(view, 2131558691, "field 'ivAvatar'");
    view = finder.findRequiredView(source, 2131558993, "field 'etNickName'");
    target.etNickName = finder.castView(view, 2131558993, "field 'etNickName'");
    view = finder.findRequiredView(source, 2131559000, "field 'etSignature'");
    target.etSignature = finder.castView(view, 2131559000, "field 'etSignature'");
  }

  @Override public void unbind(T target) {
    target.tv_title = null;
    target.tvAddress = null;
    target.tvBirthday = null;
    target.tvSex = null;
    target.personal_back = null;
    target.ivAvatar = null;
    target.etNickName = null;
    target.etSignature = null;
  }
}
