package com.dea;

public class B {
    public OnLoginEventListener loginEventListener;

    public void registerOnGeekEventListener(OnLoginEventListener onLoginEventListener) {
        this.loginEventListener = onLoginEventListener;
    }

    public void doStuff() {
        System.out.println("login() done!");

        if(loginEventListener != null) {
            loginEventListener.configRequest();
            loginEventListener.goToScannerActivity();
        }
    }
}
