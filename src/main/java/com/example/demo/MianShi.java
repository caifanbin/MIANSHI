package com.example.demo;

import java.util.ArrayList;
import java.util.List;

public class MianShi {

    public static void main(String[] args) {
        Thread t1= new Ace();
        Thread t2=new Ace();
        t1.start();
        t2.start();
    }

}
class Ace extends Thread{
    @Override
    public void run() {
        System.out.println("xiancheng");
    }
}
