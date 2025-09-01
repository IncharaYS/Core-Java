package com.xworkz.workerapp.farmer;

import com.xworkz.workerapp.worker.Worker;

public class Farmer extends Worker {
    @Override public void worker(){
        System.out.println("Child method invoked");
    }
}
