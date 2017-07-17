// Generated code from Butter Knife. Do not modify!
package com.tiyujia.homesport.common.personal.activity;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class PersonalPanyanGold$$ViewBinder<T extends com.tiyujia.homesport.common.personal.activity.PersonalPanyanGold> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131558538, "field 'tv_title'");
    target.tv_title = finder.castView(view, 2131558538, "field 'tv_title'");
    view = finder.findRequiredView(source, 2131558990, "field 'tv_rule'");
    target.tv_rule = finder.castView(view, 2131558990, "field 'tv_rule'");
    view = finder.findRequiredView(source, 2131558989, "field 'tvShareNumber'");
    target.tvShareNumber = finder.castView(view, 2131558989, "field 'tvShareNumber'");
    view = finder.findRequiredView(source, 2131558988, "field 'tvDynamicNumber'");
    target.tvDynamicNumber = finder.castView(view, 2131558988, "field 'tvDynamicNumber'");
    view = finder.findRequiredView(source, 2131558987, "field 'tvPinlun'");
    target.tvPinlun = finder.castView(view, 2131558987, "field 'tvPinlun'");
    view = finder.findRequiredView(source, 2131558986, "field 'tvZanNumber'");
    target.tvZanNumber = finder.castView(view, 2131558986, "field 'tvZanNumber'");
    view = finder.findRequiredView(source, 2131558984, "field 'tv_gold_number'");
    target.tv_gold_number = finder.castView(view, 2131558984, "field 'tv_gold_number'");
    view = finder.findRequiredView(source, 2131558776, "field 'personal_back'");
    target.personal_back = finder.castView(view, 2131558776, "field 'personal_back'");
    view = finder.findRequiredView(source, 2131558985, "field 're_record'");
    target.re_record = finder.castView(view, 2131558985, "field 're_record'");
    view = finder.findRequiredView(source, 2131558983, "field 're_gold'");
    target.re_gold = finder.castView(view, 2131558983, "field 're_gold'");
  }

  @Override public void unbind(T target) {
    target.tv_title = null;
    target.tv_rule = null;
    target.tvShareNumber = null;
    target.tvDynamicNumber = null;
    target.tvPinlun = null;
    target.tvZanNumber = null;
    target.tv_gold_number = null;
    target.personal_back = null;
    target.re_record = null;
    target.re_gold = null;
  }
}
