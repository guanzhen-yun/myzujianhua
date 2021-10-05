package com.inke.componentlib;

public class ServiceFactory {

    private static final ServiceFactory instance = new ServiceFactory();
    public static ServiceFactory getInstance() {
        return instance;
    }
    private ServiceFactory(){}

    private ILoginService mLoginService;
    private IMineService mMineService;

    public ILoginService getmLoginService() {
        if(mLoginService == null) {
            return new EmptyLoginService();
        }
        return mLoginService;
    }

    public void setmLoginService(ILoginService mLoginService) {
        this.mLoginService = mLoginService;
    }

    public IMineService getmMineService() {
        return mMineService;
    }

    public void setmMineService(IMineService mMineService) {
        this.mMineService = mMineService;
    }

}
