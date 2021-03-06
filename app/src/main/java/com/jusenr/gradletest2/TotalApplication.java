package com.jusenr.gradletest2;

import android.app.Application;

import com.jusenr.toolslibrary.AndroidTools;
import com.mob.MobSDK;

/**
 * Description:
 * Copyright  : Copyright (c) 2017
 * Email      : jusenr@163.com
 * Author     : Jusenr
 * Date       : 2017/07/25
 * Time       : 14:51
 * Project    ：GradleTest2.
 */
public class TotalApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();


        MobSDK.init(this, null, null);

        AndroidTools.init(getApplicationContext(), BuildConfig.LOG_TAG);
    }
}
