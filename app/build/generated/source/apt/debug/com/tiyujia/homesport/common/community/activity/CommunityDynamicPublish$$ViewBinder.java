// Generated code from Butter Knife. Do not modify!
package com.tiyujia.homesport.common.community.activity;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class CommunityDynamicPublish$$ViewBinder<T extends com.tiyujia.homesport.common.community.activity.CommunityDynamicPublish> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131558537, "field 'ivBack'");
    target.ivBack = finder.castView(view, 2131558537, "field 'ivBack'");
    view = finder.findRequiredView(source, 2131558734, "field 'tvPush'");
    target.tvPush = finder.castView(view, 2131558734, "field 'tvPush'");
    view = finder.findRequiredView(source, 2131558740, "field 'tvIssueEdit'");
    target.tvIssueEdit = finder.castView(view, 2131558740, "field 'tvIssueEdit'");
    view = finder.findRequiredView(source, 2131558718, "field 'tvCity'");
    target.tvCity = finder.castView(view, 2131558718, "field 'tvCity'");
    view = finder.findRequiredView(source, 2131558735, "field 'etIssueContent'");
    target.etIssueContent = finder.castView(view, 2131558735, "field 'etIssueContent'");
    view = finder.findRequiredView(source, 2131558736, "field 'rlVideo'");
    target.rlVideo = finder.castView(view, 2131558736, "field 'rlVideo'");
    view = finder.findRequiredView(source, 2131558737, "field 'framelayoutvideo'");
    target.framelayoutvideo = finder.castView(view, 2131558737, "field 'framelayoutvideo'");
  }

  @Override public void unbind(T target) {
    target.ivBack = null;
    target.tvPush = null;
    target.tvIssueEdit = null;
    target.tvCity = null;
    target.etIssueContent = null;
    target.rlVideo = null;
    target.framelayoutvideo = null;
  }
}
