package com.cyde.java9;

import java.util.List;
import java.util.Scanner;

public class ModuleDemo {
    public static void main(String[] args) {

        System.out.println(String.class.getModule()); //outPut module java.base
        System.out.println(Scanner.class.getModule()); //outPut  module java.base
        System.out.println(List.class.getModule());
    }
}
