package com.company;

public class Main {

    public static void main(String[] args) {
	// Example - If
    } double apiversion = Double.parseDouble(args[1]);
    final double DEPRECATED_VERSION = 3.11;
    final double LATEST_VERSION = 7.6;

    if (apiVersion <= DEPRECATED_VERSION) {
        system.out.println("Deprecated API Version : " + apiVersion);
    }
    else if (apiVersion == LATEST_VERSION) {
        system.out.println("Latest API Version : "  + apiVersion);
    }
    else{
        system.out.println("Accepted API Version : " + apiVersion);
    }


    //Example - switch
    switch(osName) {
        case"iOS":
            system.out.println("Vendor(s):");
            system.out.println("Apple");
            break;
        case "Android":
            system.out.println("Vendor(s):");
            system.out.println("Google");
            system.out.println("Samsung");
            system.out.println("Huawei");
            system.out.println("Oneplus");
            system.out.println("Nokia");
            break;
        case "windowsPhine":
            system.out.println("Vendor(s):");
            system.out.println("Nokia");
            break;
        default:
            system.out.println("unknown OS");

    }

    //convert from one data type to another compatible data type
    int valueA = 20, valueB = 30, valueC = 40;
    int sumInt = valueA + valueB = valueC;
    double sumDouble = (double) valueA (double) valueB + (double) valueC;

    system.out.println("sum Int = " + sumInt);
    system.out.println("sum double = " + sumdeouble);

    double div = 3.5;
    int avgInr = sumInt / (int) div;
    double avgIntDouble = sumInt / div;
    double avgDouble = sumInt / div;
    float a = (float)2.5;

    system.out.println("avgInt = " + avgInt);
    system.out.println("avgIntDouble = " + avgIntDouble);
    system.out.println("avgDouble = " + avgDouble);

}
