package com.xworkz.store.app;

public class Application {

    public Application(int appId,String appName,String appVersion,String updatedOn,long noOfDownloads,double downloadSize,String requiredOs,String releasedOn){
        this.appId=appId;
        this.appName=appName;
        this.appVersion=appVersion;
        this.updatedOn=updatedOn;
        this.noOfDownloads=noOfDownloads;
        this.downloadSize=downloadSize;
        this.requiredOs=requiredOs;
        this.releasedOn=releasedOn;
    }
   public  Application(){

    }

    private int appId;
    private String appName;
    private String appVersion;
    private String updatedOn;
    private long noOfDownloads;
    private double downloadSize;
    private String requiredOs;
    private String releasedOn;

    public void setAppId(int appId) {
        this.appId = appId;
    }

    public int getAppId() {
        return appId;
    }

    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }

    public void setAppVersion(String appVersion) {
        this.appVersion = appVersion;
    }

    public String getAppVersion() {
        return appVersion;
    }

    public void setUpdatedOn(String updatedOn) {
        this.updatedOn = updatedOn;
    }

    public String getUpdatedOn() {
        return updatedOn;
    }

    public void setNoOfDownloads(long noOfDownloads) {
        this.noOfDownloads = noOfDownloads;
    }

    public long getNoOfDownloads() {
        return noOfDownloads;
    }

    public void setDownloadSize(double downloadSize) {
        this.downloadSize = downloadSize;
    }

    public double getDownloadSize() {
        return downloadSize;
    }

    public void setReleasedOn(String releasedOn) {
        this.releasedOn = releasedOn;
    }

    public String getReleasedOn() {
        return releasedOn;
    }

    public void setRequiredOs(String requiredOs) {
        this.requiredOs = requiredOs;
    }

    public String getRequiredOs() {
        return requiredOs;
    }
}
