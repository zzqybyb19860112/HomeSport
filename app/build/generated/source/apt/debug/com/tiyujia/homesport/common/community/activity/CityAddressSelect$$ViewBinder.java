// Generated code from Butter Knife. Do not modify!
package com.tiyujia.homesport.common.community.activity;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class CityAddressSelect$$ViewBinder<T extends com.tiyujia.homesport.common.community.activity.CityAddressSelect> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131558589, "field 'tvSetCityCancel'");
    target.tvSetCityCancel = finder.castView(view, 2131558589, "field 'tvSetCityCancel'");
    view = finder.findRequiredView(source, 2131558716, "field 'tvNoAddress'");
    target.tvNoAddress = finder.castView(view, 2131558716, "field 'tvNoAddress'");
    view = finder.findRequiredView(source, 2131558605, "field 'recyclerView'");
    target.recyclerView = finder.castView(view, 2131558605, "field 'recyclerView'");
    view = finder.findRequiredView(source, 2131558588, "field 'etSearchCity'");
    target.etSearchCity = finder.castView(view, 2131558588, "field 'etSearchCity'");
  }

  @Override public void unbind(T target) {
    target.tvSetCityCancel = null;
    target.tvNoAddress = null;
    target.recyclerView = null;
    target.etSearchCity = null;
  }
}
