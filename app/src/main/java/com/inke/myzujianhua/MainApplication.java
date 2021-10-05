package com.inke.myzujianhua;

import android.app.Application;

import com.inke.componentlib.AppCompat;
import com.inke.componentlib.AppConfig;

public class MainApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        for(String component : AppConfig.COMPONENTS) {
            try {
                Class<?> clazz = Class.forName(component);
                Object object = clazz.newInstance();
                if(object instanceof AppCompat) {
                    ((AppCompat) object).initialize(this);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
