package com.inke.logincomponent;

import android.app.Application;

import com.inke.componentlib.AppCompat;
import com.inke.componentlib.ServiceFactory;

public class LoginApplication extends Application implements AppCompat {

    private static Application application;

    public static Application getApplication() {
        return application;
    }


    @Override
    public void initialize(Application app) {
        application = app;
        ServiceFactory.getInstance().setmLoginService(new LoginService());
    }
}
