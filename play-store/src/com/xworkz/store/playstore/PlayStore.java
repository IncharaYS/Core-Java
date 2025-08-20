package com.xworkz.store.playstore;

import com.xworkz.store.app.Application;
import com.xworkz.store.validator.AppValidator;

public class PlayStore {
    Application application;

    public boolean addApplication(Application application){
        boolean isApplicationAdded=false;
        boolean isApplicationInfoValid=false;

        AppValidator appValidator=new AppValidator();

        isApplicationInfoValid=appValidator.validateApplicationInfo(application);

        if(isApplicationInfoValid){
            this.application=application;
            isApplicationAdded=true;
        }

        return isApplicationAdded;
    }
    public void getAppInfo(){
        System.out.println("application Id is: "+this.application.getAppId());
        System.out.println("application name is: "+this.application.getAppName());
        System.out.println("application version is: "+this.application.getAppVersion());
        System.out.println("application is released on: "+this.application.getReleasedOn());
        System.out.println("application required OS is: "+this.application.getRequiredOs());
        System.out.println("application is updated on: "+this.application.getUpdatedOn());
        System.out.println("application download size is: "+this.application.getDownloadSize());
        System.out.println("application no of downloads is: "+this.application.getNoOfDownloads()+"\n");
    }
}
