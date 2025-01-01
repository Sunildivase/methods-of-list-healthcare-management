package com.methodsofcollection.service;

import com.methodsofcollection.model.Prescription;

import java.util.ArrayList;
import java.util.Scanner;

public class PrescriptionService {

    private ArrayList prescriptions = new ArrayList();

    private static Scanner scanner = new Scanner(System.in);

    void printPrescription(Prescription prescription){
        System.out.println(prescription);

    }

    public Prescription createPrescription(){

        System.out.println("please enter prescription Id");
        int prescriptionId = Integer.parseInt(scanner.nextLine());

        System.out.println("please enter prescription details");
        String prescriptionDetails = scanner.nextLine();

        System.out.println("please enter person id ");
        int personId = Integer.parseInt(scanner.nextLine());

        Prescription prescription = new Prescription();
        prescription.setPrescriptionId(prescriptionId);
        prescription.setPrescriptionDetails(prescriptionDetails);
        prescription.setPersonId(personId);
        prescriptions.add(prescription);
        return prescription;
    }
    public void displayPrescription(){
        if(prescriptions.size()!=0) {
            for (Object prescription : prescriptions) {
                System.out.println("create prescription :" + prescription);
            }
        }else{
            System.out.println("no prescription in system");
        }
    }
}
