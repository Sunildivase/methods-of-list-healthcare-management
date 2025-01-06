package com.methodsofcollection.service;

import com.methodsofcollection.model.Hospital;

import java.util.ArrayList;
import java.util.Scanner;

public class HospitalService {

    private ArrayList hospitals = new ArrayList();

    private static Scanner scanner = new Scanner(System.in);

    void printHospital(Hospital hospital){
        System.out.println(hospital);
    }

    public Hospital createHospital(){

        System.out.println("please enter id");
        int hospitalId = Integer.parseInt(scanner.nextLine());

        System.out.println("please enter hospital name");
        String hospitalName = scanner.nextLine();

        System.out.println("please enter hospital address");
        String hospitalAddress = scanner.nextLine();

        System.out.println("please enter contact no");
        String contactNo = scanner.nextLine();

        System.out.println("please enter email Id ");
        String emailId = scanner.nextLine();

        Hospital hospital = new Hospital();
        hospital.setHospitalId(hospitalId);
        hospital.setHospitalName(hospitalName);
        hospital.setHospitalAddress(hospitalAddress);
        hospital.setContactNo(contactNo);
        hospital.setEmailId(emailId);

        if(hospitals.contains(hospital)){
            System.out.println("hospital already in system");
        }
        else {
            hospitals.add(hospital);
        }
        return hospital;
    }

    public void displayHospital(){
        if(hospitals.size()!=0) {
            for (Object hospital : hospitals) {
                System.out.println("create hospital: " + hospital);
            }
        }else{
            System.out.println("no hospital in system");
        }
    }

}