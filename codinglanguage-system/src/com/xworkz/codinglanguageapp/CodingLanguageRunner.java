package com.xworkz.codinglanguageapp;

import com.xworkz.codinglanguageapp.codinglanguage.CodingLanguage;
import com.xworkz.codinglanguageapp.impl.JavaImpl;

public class CodingLanguageRunner {
    public static void main(String[] args) {
        CodingLanguage codingLanguage=new JavaImpl();
        codingLanguage.compile();
        codingLanguage.debug();
        codingLanguage.execute();
    }
}
