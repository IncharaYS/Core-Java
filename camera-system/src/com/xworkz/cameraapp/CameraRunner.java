package com.xworkz.cameraapp;

import com.xworkz.cameraapp.camera.Camera;
import java.util.ArrayList;
import java.util.List;

public class CameraRunner {
    public static void main(String[] args) {
        List<Camera> cameraList = new ArrayList<>();

        cameraList.add(new Camera("1","Canon","EOS R6",250000.0,"DSLR",true));
        cameraList.add(new Camera("2","Nikon","Z6 II",200000.0,"DSLR",true));
        cameraList.add(new Camera("3","Sony","Alpha 7 IV",220000.0,"Mirrorless",true));
        cameraList.add(new Camera("4","Fujifilm","X-T4",180000.0,"Mirrorless",true));
        cameraList.add(new Camera("5","Panasonic","Lumix S5",170000.0,"Mirrorless",true));
        cameraList.add(new Camera("6","Olympus","OM-D E-M1",150000.0,"Mirrorless",true));
        cameraList.add(new Camera("7","GoPro","Hero 11",50000.0,"Action",true));
        cameraList.add(new Camera("8","DJI","Osmo Pocket",45000.0,"Action",true));
        cameraList.add(new Camera("9","Leica","Q2",750000.0,"Compact",true));
        cameraList.add(new Camera("10","Kodak","PixPro",35000.0,"Compact",true));

        System.out.println("Camera list 1:");
        for(Camera camera:cameraList){
            System.out.println(camera);
        }
        System.out.println();
        System.out.println("Size of Camera list 1:"+cameraList.size());

        List<Camera> cameraList2 = new ArrayList<>();

        cameraList2.add(new Camera("11","Canon","EOS M50",70000.0,"Mirrorless",true));
        cameraList2.add(new Camera("12","Nikon","D5600",65000.0,"DSLR",true));
        cameraList2.add(new Camera("13","Sony","Alpha 6400",80000.0,"Mirrorless",true));
        cameraList2.add(new Camera("14","Fujifilm","X-T30",60000.0,"Mirrorless",true));
        cameraList2.add(new Camera("15","Panasonic","Lumix G85",55000.0,"Mirrorless",true));
        cameraList2.add(new Camera("16","Olympus","OM-D E-M10",45000.0,"Mirrorless",true));
        cameraList2.add(new Camera("17","GoPro","Hero 10",48000.0,"Action",true));
        cameraList2.add(new Camera("18","DJI","Pocket 2",40000.0,"Action",true));
        cameraList2.add(new Camera("19","Leica","CL",650000.0,"Compact",true));
        cameraList2.add(new Camera("20","Kodak","PixPro AZ401",30000.0,"Compact",true));

        System.out.println("Camera list 2:");
        for(Camera camera:cameraList2){
            System.out.println(camera);
        }
        System.out.println();
        System.out.println("Size of Camera list 2:"+cameraList2.size());

        cameraList.addAll(cameraList2);
        System.out.println("Full camera list:");
        for(Camera camera:cameraList){
            System.out.println(camera);
        }
        System.out.println();

        Camera camera1 = new Camera("6","Olympus","OM-D E-M1",150000.0,"Mirrorless",true);
        Camera camera2 = new Camera("21","Fujifilm","X-H2",250000.0,"Mirrorless",true);
        cameraList.add(4,camera2);

        System.out.println("Does list contain camera1:"+cameraList.contains(camera1));
        System.out.println("Does list contain cameraList2:"+cameraList.containsAll(cameraList2));
        System.out.println();

        cameraList.remove(camera1);
        cameraList.remove(7);

        System.out.println("Camera list after remove(Object) and remove(index):");
        for(Camera camera:cameraList){
            System.out.println(camera);
        }
        System.out.println();

        cameraList.removeAll(cameraList2);
        System.out.println("Camera list after removing cameraList2:");
        for(Camera camera:cameraList){
            System.out.println(camera);
        }
        System.out.println();

        System.out.println("Does list contain camera1:"+cameraList.contains(camera1));
        System.out.println("Does list contain cameraList2:"+cameraList.containsAll(cameraList2));
        System.out.println();

        cameraList.addAll(cameraList2);
        cameraList.retainAll(cameraList2);

        System.out.println("Camera list after retaining only cameraList2:");
        for(Camera camera:cameraList){
            System.out.println(camera);
        }
        System.out.println();
    }
}
