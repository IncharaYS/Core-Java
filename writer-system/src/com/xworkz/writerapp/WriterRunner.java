package com.xworkz.writerapp;

import impl.PoetImpl;
import writer.Writer;

public class WriterRunner {
    public static void main(String[] args) {
        Writer writer=new PoetImpl();
        writer.write();
        writer.edit();
        writer.publish();
    }
}
