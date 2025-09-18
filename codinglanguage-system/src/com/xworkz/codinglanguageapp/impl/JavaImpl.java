package com.xworkz.codinglanguageapp.impl;

import com.xworkz.codinglanguageapp.codinglanguage.CodingLanguage;

public class JavaImpl implements CodingLanguage {
    @Override
    public void compile() {
        System.out.println("Compiling java code");
    }

    @Override
    public void execute() {
        System.out.println("Executing java code");
    }

    @Override
    public void debug() {
        System.out.println("Debugging java code");
    }
}
