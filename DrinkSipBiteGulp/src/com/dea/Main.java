package com.dea;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class Main {

    public static void main(String[] args) {
        CompletableFuture completableFuture = CompletableFuture.supplyAsync(() -> tiempo(10));
        while (!completableFuture.isDone()) {
            System.out.println("CompletableFuture is not finished yet...");
        }
        try {
            completableFuture.get();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }

        System.out.println("fin");
    }

    public static void tiempo(int number){
        for(int i = 0; i<number; i++) {
            System.out.println("dea");
        }
    }
}
