package com.example.statictest;

import java.util.ArrayList;
import java.util.List;

public class SCContactList {
    public static ArrayList<Person> personList = new ArrayList<>();

    private static SCContactList INSTANCE;

    public static SCContactList getInstance() {
        if(INSTANCE == null) {
            INSTANCE = new SCContactList();
        }
        return INSTANCE;
    }
}