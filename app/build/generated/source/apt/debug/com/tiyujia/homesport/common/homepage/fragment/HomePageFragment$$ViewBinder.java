// Generated code from Butter Knife. Do not modify!
package com.tiyujia.homesport.common.homepage.fragment;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class HomePageFragment$$ViewBinder<T extends com.tiyujia.homesport.common.homepage.fragment.HomePageFragment> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131558825, "field 'swipeContainer'");
    target.swipeContainer = finder.castView(view, 2131558825, "field 'swipeContainer'");
    view = finder.findRequiredView(source, 2131558833, "field 'cbHomePage'");
    target.cbHomePage = finder.castView(view, 2131558833, "field 'cbHomePage'");
    view = finder.findRequiredView(source, 2131558832, "field 'rvRecentVenue'");
    target.rvRecentVenue = finder.castView(view, 2131558832, "field 'rvRecentVenue'");
    view = finder.findRequiredView(source, 2131558831, "field 'ivHomePageAllVenue'");
    target.ivHomePageAllVenue = finder.castView(view, 2131558831, "field 'ivHomePageAllVenue'");
    view = finder.findRequiredView(source, 2131558834, "field 'tvCourse'");
    target.tvCourse = finder.castView(view, 2131558834, "field 'tvCourse'");
    view = finder.findRequiredView(source, 2131558835, "field 'tvEquipment'");
    target.tvEquipment = finder.castView(view, 2131558835, "field 'tvEquipment'");
    view = finder.findRequiredView(source, 2131558836, "field 'tvDate'");
    target.tvDate = finder.castView(view, 2131558836, "field 'tvDate'");
    view = finder.findRequiredView(source, 2131558829, "field 'tvSearchCity'");
    target.tvSearchCity = finder.castView(view, 2131558829, "field 'tvSearchCity'");
    view = finder.findRequiredView(source, 2131558830, "field 'tvSearchDetail'");
    target.tvSearchDetail = finder.castView(view, 2131558830, "field 'tvSearchDetail'");
  }

  @Override public void unbind(T target) {
    target.swipeContainer = null;
    target.cbHomePage = null;
    target.rvRecentVenue = null;
    target.ivHomePageAllVenue = null;
    target.tvCourse = null;
    target.tvEquipment = null;
    target.tvDate = null;
    target.tvSearchCity = null;
    target.tvSearchDetail = null;
  }
}
