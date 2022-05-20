package com.team7.app;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class SuperClass {
    public static void main(String[] args) throws IOException {
        SubClass obj = new SubClass();
        obj.transaksi();

        Scanner scanner = new Scanner(System.in);
        System.out.println("ingin generate struk?");
        String generated = scanner.next();
        if(generated.equalsIgnoreCase("y")){
            obj.generateInvoice();
        }else{
            System.exit(0);
        }
    }
}
