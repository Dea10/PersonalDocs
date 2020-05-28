package com.dea;

public class A implements OnLoginEventListener {

    @Override
    public void configRequest() {
        System.out.println("configRequest() done!");
    }

    @Override
    public void goToScannerActivity() {
        System.out.println("goToScannerActivity() done!");
    }
}
