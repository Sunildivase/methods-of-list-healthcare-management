package com.methodsofcollection.service;

import com.methodsofcollection.model.Billing;

import java.util.ArrayList;
import java.util.Scanner;

public class BillingService {
    private ArrayList billings = new ArrayList();

    private static Scanner scanner = new Scanner(System.in);

    void printBilling(Billing billing){
        System.out.println(billing);
    }

    public Billing createBilling(){

        System.out.println("please enter id");
        int bId = Integer.parseInt(scanner.nextLine());

        System.out.println("please enter person Id ");
        int personId = Integer.parseInt(scanner.nextLine());

        System.out.println("please enter bill");
        int bill = Integer.parseInt(scanner.nextLine());

        System.out.println("please enter total bill");
        int totalBill = Integer.parseInt(scanner.nextLine());

        Billing billing = new Billing();
        billing.setBillId(bId);
        billing.setPersonId(personId);
        billing.setBill(bill);
        billing.setTotalBill(totalBill);
        billings.add(billing);
        return billing;
    }
    public void displayBilling(){
        if(billings.size()!=0) {
            for (Object billing : billings) {
                System.out.println("create billings: " + billing);
            }
        }
        else{
            System.out.println("no bill in system");
        }
    }
}
