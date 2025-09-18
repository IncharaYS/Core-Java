package com.xworkz.cloudapp;

import com.xworkz.cloudapp.cloud.Cloud;
import com.xworkz.cloudapp.impl.AwsImpl;

public class CloudRunner {
    public static void main(String[] args) {
        Cloud cloud=new AwsImpl();
        cloud.upload();
        cloud.sync();
        cloud.download();
    }
}
