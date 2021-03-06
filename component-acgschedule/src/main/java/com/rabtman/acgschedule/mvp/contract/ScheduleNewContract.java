package com.rabtman.acgschedule.mvp.contract;

import com.rabtman.acgschedule.mvp.model.jsoup.ScheduleNew;
import com.rabtman.common.base.mvp.IModel;
import com.rabtman.common.base.mvp.IView;
import io.reactivex.Flowable;

/**
 * @author Rabtman
 */
public interface ScheduleNewContract {

  interface View extends IView {

    void showScheduleNew(ScheduleNew scheduleNew);
  }

  interface Model extends IModel {

    Flowable<ScheduleNew> getScheduleNew(String url);
  }
}
