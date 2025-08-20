package com.xworkz.store.validator;

import com.xworkz.store.app.Application;

public class AppValidator {
    public boolean validateApplicationInfo(Application application){
        boolean isAppValidated=false;
        boolean isIdValid=false;
        boolean isNameValid=false;
        boolean isAppVersionValid=false;
        boolean isUpdatedOnValid=false;
        boolean isNoOfDownloadsValid=false;
        boolean isDownloadSizeValid=false;
        boolean isRequiredOsValid=false;
        boolean isReleasedOnValid=false;

        if(application.getAppId()>0) isIdValid=true;
        else System.out.println("Entered Id is not valid");

        if(application.getAppName()!=null&&!application.getAppName().isEmpty()) isNameValid=true;
        else System.out.println("Entered app name is not valid");

        if(application.getAppVersion()!=null&&!application.getAppVersion().isEmpty()) isAppVersionValid=true;
        else System.out.println("Entered app version is not valid");

        if(application.getUpdatedOn()!=null&&!application.getUpdatedOn().isEmpty()) isUpdatedOnValid=true;
        else System.out.println("Updated on info is not valid");

        if (application.getNoOfDownloads()>0) isNoOfDownloadsValid=true;
        else System.out.println("Entered no of downloads is not valid");

        if(application.getDownloadSize()>0) isDownloadSizeValid=true;
        else System.out.println("Entered download size is not valid");

        if(application.getRequiredOs()!=null&&!application.getRequiredOs().isEmpty()) isRequiredOsValid=true;
        else System.out.println("Entered required OS info is not valid");

        if(application.getReleasedOn()!=null&&!application.getReleasedOn().isEmpty()) isReleasedOnValid=true;
        else System.out.println("Entered released on date is not valid");

        /*System.out.println(isIdValid);
        System.out.println(isAppVersionValid);
        System.out.println(isReleasedOnValid);
        System.out.println(isDownloadSizeValid);
        System.out.println(isNoOfDownloadsValid);
        System.out.println(isRequiredOsValid);
        System.out.println(isReleasedOnValid);*/

        if(isIdValid &&isNameValid && isAppVersionValid && isRequiredOsValid && isNoOfDownloadsValid && isDownloadSizeValid && isUpdatedOnValid && isReleasedOnValid){
          isAppValidated=true;
        }
        return  isAppValidated;
    }
}
