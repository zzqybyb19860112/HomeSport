// Generated code from Butter Knife. Do not modify!
package com.tiyujia.homesport.common.homepage.activity;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class HomePageWholeSearchActivity$$ViewBinder<T extends com.tiyujia.homesport.common.homepage.activity.HomePageWholeSearchActivity> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131558742, "field 'tab'");
    target.tab = finder.castView(view, 2131558742, "field 'tab'");
    view = finder.findRequiredView(source, 2131558608, "field 'tvWholeSearchClose'");
    target.tvWholeSearchClose = finder.castView(view, 2131558608, "field 'tvWholeSearchClose'");
    view = finder.findRequiredView(source, 2131558612, "field 'tvClearWholeRecord'");
    target.tvClearWholeRecord = finder.castView(view, 2131558612, "field 'tvClearWholeRecord'");
    view = finder.findRequiredView(source, 2131558610, "field 'tvWholeSearchTitle'");
    target.tvWholeSearchTitle = finder.castView(view, 2131558610, "field 'tvWholeSearchTitle'");
    view = finder.findRequiredView(source, 2131558611, "field 'rvWholeSearchResult'");
    target.rvWholeSearchResult = finder.castView(view, 2131558611, "field 'rvWholeSearchResult'");
    view = finder.findRequiredView(source, 2131558609, "field 'llWholeSearchResult'");
    target.llWholeSearchResult = finder.castView(view, 2131558609, "field 'llWholeSearchResult'");
    view = finder.findRequiredView(source, 2131559068, "field 'tabResult'");
    target.tabResult = finder.castView(view, 2131559068, "field 'tabResult'");
  }

  @Override public void unbind(T target) {
    target.tab = null;
    target.tvWholeSearchClose = null;
    target.tvClearWholeRecord = null;
    target.tvWholeSearchTitle = null;
    target.rvWholeSearchResult = null;
    target.llWholeSearchResult = null;
    target.tabResult = null;
  }
}
