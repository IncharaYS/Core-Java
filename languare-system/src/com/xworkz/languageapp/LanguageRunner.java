package com.xworkz.languageapp;

import com.xworkz.languageapp.kannada.Kannada;
import com.xworkz.languageapp.language.Language;

public class LanguageRunner {
    public static void main(String[] args) {
        System.out.println("main started");
        Language language=new Kannada();
        language.language();
        System.out.println("main ended");
    }
}
