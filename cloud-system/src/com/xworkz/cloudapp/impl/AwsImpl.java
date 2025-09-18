package com.xworkz.cloudapp.impl;

import com.xworkz.cloudapp.cloud.Cloud;

public class AwsImpl implements Cloud {
    @Override
    public void upload() {
        System.out.println("Uploading to AWS cloud");
    }

    @Override
    public void download() {
        System.out.println("Downloading from AWS cloud");
    }

    @Override
    public void sync() {
        System.out.println("Sync to AWS cloud");
    }
}
