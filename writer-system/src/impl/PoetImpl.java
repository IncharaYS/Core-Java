package impl;

import writer.Writer;

public class PoetImpl implements Writer {
    @Override
    public void write() {
        System.out.println("Writing poem");
    }

    @Override
    public void edit() {
        System.out.println("Editing poem");
    }

    @Override
    public void publish() {
        System.out.println("Publishing poem");
    }
}
