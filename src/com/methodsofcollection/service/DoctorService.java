package com.methodsofcollection.service;

import com.methodsofcollection.model.Doctor;

import java.util.ArrayList;
import java.util.Scanner;

public class DoctorService {
    private ArrayList<Doctor> doctors = new ArrayList<>();

    private static Scanner scanner = new Scanner(System.in);

    void printDoctor(Doctor doctor){
        System.out.println(doctor);
    }

    public Doctor createDoctor(){

        System.out.println("please enter doctor id");
        int doctorId = Integer.parseInt(scanner.nextLine());

        System.out.println("please enter first name");
        String firstName = scanner.nextLine();

        System.out.println("please enter last name");
        String lastName = scanner.nextLine();

        System.out.println("please enter age");
        int age = Integer.parseInt(scanner.nextLine());

        System.out.println("please enter gender");
        String gender = scanner.nextLine();

        System.out.println("please enter contact number");
        String contactNo = scanner.nextLine();

        System.out.println("please enter speciality");
        String speciality = scanner.nextLine();

        Doctor doctor = new Doctor();
        doctor.setDoctorId(doctorId);
        doctor.setFirstName(firstName);
        doctor.setLastName(lastName);
        doctor.setAge(age);
        doctor.setGender(gender);
        doctor.setContactNo(contactNo);
        doctor.setSpeciality(speciality);

        if(doctors.contains(doctor)){
            System.out.println("doctor already created");
        }
        else {
            doctors.add(doctor);
        }
        return doctor;
    }

    public void displayDoctor(){
        if(doctors.size() != 0) {
            for (Object doctor : doctors) {
                System.out.println("create doctor: " + doctor);
            }
        }else{
            System.out.println("no doctor present in system");
        }
    }

    public Doctor deleteDoctor(int doctorId){

        Doctor removeDoctor = doctors.remove(doctorId);
        return removeDoctor;
    }

    public void deleteAllDoctor(){
        doctors.clear();
    }
}
