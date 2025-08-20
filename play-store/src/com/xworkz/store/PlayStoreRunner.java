package com.xworkz.store;

import com.xworkz.store.app.Application;
import com.xworkz.store.playstore.PlayStore;

public class PlayStoreRunner {
    public static void main(String[] args) {
        System.out.println("main stared\n");

        Application application1=new Application();
        application1.setAppId(1);
        application1.setAppName("Instagram");
        application1.setAppVersion("5.45.0");
        application1.setUpdatedOn("11/07/25");
        application1.setNoOfDownloads(100000000L);
        application1.setDownloadSize(49.91);
        application1.setRequiredOs("Android 5.0 and up");
        application1.setReleasedOn("30/09/22");

        PlayStore playStore1=new PlayStore();
        boolean isApplicationAdded=playStore1.addApplication(application1);
        if(isApplicationAdded) playStore1.getAppInfo();
        else System.out.println("Application is not added");

        Application application2=new Application(2,"Whatsapp","54.2","07/08/25",10000000L,30.62,"Android 5.0 and up","08/12/22");
        PlayStore playStore2=new PlayStore();
        if(playStore2.addApplication(application2)) playStore2.getAppInfo();
        else System.out.println("Application is not added");

        Application application3=new Application(0,"","","",0,0.0,"","");
        PlayStore playStore3=new PlayStore();
        if(playStore3.addApplication(application3)) playStore3.getAppInfo();
        else System.out.println("Application is not added");

        System.out.println("\nmain ended");
    }
}
