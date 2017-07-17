// Generated code from Butter Knife. Do not modify!
package com.tiyujia.homesport.common.homepage.activity;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class HomePageVenueSurveyActivity$$ViewBinder<T extends com.tiyujia.homesport.common.homepage.activity.HomePageVenueSurveyActivity> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131558742, "field 'tab'");
    target.tab = finder.castView(view, 2131558742, "field 'tab'");
    view = finder.findRequiredView(source, 2131558743, "field 'vp'");
    target.vp = finder.castView(view, 2131558743, "field 'vp'");
    view = finder.findRequiredView(source, 2131558599, "field 'ivVenueSurveySearch'");
    target.ivVenueSurveySearch = finder.castView(view, 2131558599, "field 'ivVenueSurveySearch'");
    view = finder.findRequiredView(source, 2131558598, "field 'ivVenueSurveyBack'");
    target.ivVenueSurveyBack = finder.castView(view, 2131558598, "field 'ivVenueSurveyBack'");
    view = finder.findRequiredView(source, 2131558602, "field 'tvVenueSurveyClose'");
    target.tvVenueSurveyClose = finder.castView(view, 2131558602, "field 'tvVenueSurveyClose'");
    view = finder.findRequiredView(source, 2131558606, "field 'tvClearAll'");
    target.tvClearAll = finder.castView(view, 2131558606, "field 'tvClearAll'");
    view = finder.findRequiredView(source, 2131558604, "field 'tvSearchTitle'");
    target.tvSearchTitle = finder.castView(view, 2131558604, "field 'tvSearchTitle'");
    view = finder.findRequiredView(source, 2131558605, "field 'recyclerView'");
    target.recyclerView = finder.castView(view, 2131558605, "field 'recyclerView'");
    view = finder.findRequiredView(source, 2131558597, "field 'rlStartSearch'");
    target.rlStartSearch = finder.castView(view, 2131558597, "field 'rlStartSearch'");
    view = finder.findRequiredView(source, 2131558600, "field 'llEndSearch'");
    target.llEndSearch = finder.castView(view, 2131558600, "field 'llEndSearch'");
    view = finder.findRequiredView(source, 2131559068, "field 'tabResult'");
    target.tabResult = finder.castView(view, 2131559068, "field 'tabResult'");
    view = finder.findRequiredView(source, 2131558603, "field 'llSearchResult'");
    target.llSearchResult = finder.castView(view, 2131558603, "field 'llSearchResult'");
  }

  @Override public void unbind(T target) {
    target.tab = null;
    target.vp = null;
    target.ivVenueSurveySearch = null;
    target.ivVenueSurveyBack = null;
    target.tvVenueSurveyClose = null;
    target.tvClearAll = null;
    target.tvSearchTitle = null;
    target.recyclerView = null;
    target.rlStartSearch = null;
    target.llEndSearch = null;
    target.tabResult = null;
    target.llSearchResult = null;
  }
}
