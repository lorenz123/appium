package com.bibvip;

import java.net.MalformedURLException;

import static com.bibvip.login.ExecuteLoginTest.performLogin;


public class AppiumRunner {

    public static void main(String[] args) {
        try {
            performLogin();
        } catch (MalformedURLException e) {
            e.getCause();
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }





}
