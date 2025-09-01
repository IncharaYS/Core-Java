package com.xworkz.webbrowserapp;

import com.xworkz.webbrowserapp.firefox.FireFox;
import com.xworkz.webbrowserapp.webbrowser.WebBrowser;

public class WebBrowserRunner {
    public static void main(String[] args) {
        System.out.println("main started");
        WebBrowser webBrowser=new FireFox();
        webBrowser.webBrowser();
        System.out.println("main ended");
    }
}
