package com.dea;

public class Main implements OnLoginEventListener {

    private static OnLoginEventListener loginEventListener = new A();

    public static void main(String[] args) {
	// write your code here
        //B b = new B();
        //OnLoginEventListener mListener = new A();
        doStuffMain();
    }

    public static void doStuffMain(){
        System.out.println("0 done!");

        if(loginEventListener != null) {
            configRequest();
            goToScannerActivity();
        }
    }

    public static void configRequest() {
        System.out.println("1");
    }

    public static void goToScannerActivity() {
        System.out.println("2");
    }
}