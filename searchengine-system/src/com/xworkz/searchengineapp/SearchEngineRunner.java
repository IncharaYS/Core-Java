package com.xworkz.searchengineapp;

import com.xworkz.searchengineapp.google.Google;
import com.xworkz.searchengineapp.searchengine.SearchEngine;

public class SearchEngineRunner {
    public static void main(String[] args) {
        System.out.println("main started");
        SearchEngine searchEngine=new Google();
        searchEngine.searchEngine();
        System.out.println("main ended");
    }
}
