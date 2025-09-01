package com.xworkz.workerapp;

import com.xworkz.workerapp.farmer.Farmer;
import com.xworkz.workerapp.worker.Worker;

public class WorkerRunner {
    public static void main(String[] args) {
        System.out.println("main started");
        Worker worker=new Farmer();
        worker.worker();
        System.out.println("main ended");
    }
}
