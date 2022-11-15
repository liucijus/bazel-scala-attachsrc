package com.example2;

import com.example.JavaClassOne;

public class MainJava {
    public static void main(String[] args) {

        // Example when Java has dependency on Scala, which fails to attach sources due to jdeps ijar
        System.out.println(new JavaClassOne().foo());

    }
}
