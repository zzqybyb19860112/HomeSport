// Generated code from Butter Knife. Do not modify!
package com.tiyujia.homesport.common.record.activity;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class CityMapHistoryActivity$$ViewBinder<T extends com.tiyujia.homesport.common.record.activity.CityMapHistoryActivity> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131558568, "field 'tvCityNumber'");
    target.tvCityNumber = finder.castView(view, 2131558568, "field 'tvCityNumber'");
    view = finder.findRequiredView(source, 2131558569, "field 'tvHistoryNumber'");
    target.tvHistoryNumber = finder.castView(view, 2131558569, "field 'tvHistoryNumber'");
  }

  @Override public void unbind(T target) {
    target.tvCityNumber = null;
    target.tvHistoryNumber = null;
  }
}
