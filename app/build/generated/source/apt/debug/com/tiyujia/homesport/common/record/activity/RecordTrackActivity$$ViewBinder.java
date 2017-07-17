// Generated code from Butter Knife. Do not modify!
package com.tiyujia.homesport.common.record.activity;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class RecordTrackActivity$$ViewBinder<T extends com.tiyujia.homesport.common.record.activity.RecordTrackActivity> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131558537, "field 'ivBack'");
    target.ivBack = finder.castView(view, 2131558537, "field 'ivBack'");
    view = finder.findRequiredView(source, 2131558811, "field 'ivShare'");
    target.ivShare = finder.castView(view, 2131558811, "field 'ivShare'");
    view = finder.findRequiredView(source, 2131559039, "field 'llTrack'");
    target.llTrack = finder.castView(view, 2131559039, "field 'llTrack'");
    view = finder.findRequiredView(source, 2131558605, "field 'recyclerView'");
    target.recyclerView = finder.castView(view, 2131558605, "field 'recyclerView'");
    view = finder.findRequiredView(source, 2131559040, "field 'tvSportTimes'");
    target.tvSportTimes = finder.castView(view, 2131559040, "field 'tvSportTimes'");
    view = finder.findRequiredView(source, 2131559041, "field 'tvTotalScore'");
    target.tvTotalScore = finder.castView(view, 2131559041, "field 'tvTotalScore'");
  }

  @Override public void unbind(T target) {
    target.ivBack = null;
    target.ivShare = null;
    target.llTrack = null;
    target.recyclerView = null;
    target.tvSportTimes = null;
    target.tvTotalScore = null;
  }
}
