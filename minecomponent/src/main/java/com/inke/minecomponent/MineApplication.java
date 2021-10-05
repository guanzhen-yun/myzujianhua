package com.inke.minecomponent;

import android.app.Application;

import com.inke.componentlib.AppCompat;
import com.inke.componentlib.ServiceFactory;

public class MineApplication extends Application implements AppCompat {

    private static Application application;

    public static Application getApplication() {
        return application;
    }


    @Override
    public void initialize(Application app) {
        application = app;
        ServiceFactory.getInstance().setmMineService(new MineService());
    }
}
