package com.methodsofcollection.service;

import com.methodsofcollection.model.Appointment;

import java.util.ArrayList;
import java.util.Scanner;

public class AppointmentService {
    private ArrayList<Appointment> appointments = new ArrayList<>();

    private static Scanner scanner = new Scanner(System.in);

    void printAppointment(Appointment appointment){
        System.out.println(appointment);
    }

    public Appointment createAppointment(){

        System.out.println("please enter appointment id");
        int appointmentId = Integer.parseInt(scanner.nextLine());

        System.out.println("please enter person id ");
        int personId = Integer.parseInt(scanner.nextLine());

        System.out.println("please enter doctor id");
        int doctorId = Integer.parseInt(scanner.nextLine());

        System.out.println("please enter hospital id");
        int hospitalId = Integer.parseInt(scanner.nextLine());

        System.out.println("please enter dept id");
        int deptId = Integer.parseInt(scanner.nextLine());

        Appointment appointment = new Appointment();
        appointment.setAppointmentId(appointmentId);
        appointment.setPersonId(personId);
        appointment.setDoctorId(doctorId);
        appointment.setHospitalId(hospitalId);
        appointment.setDeptId(deptId);

        if(appointments.contains(appointment)){
            System.out.println("appointent already booked");
        }
        else {
            appointments.add(appointment);
        }
        return appointment;
    }
    public void displayAppointment(){
        if(appointments.size()!=0) {
            for (Object appointment : appointments) {
                System.out.println("create appointment: " + appointment);
            }
        }else{
            System.out.println("no appointment in system");
        }
    }
    public Appointment deleteAppointment(int appointmentId){
        Appointment removeAppointment = appointments.remove(appointmentId);
        return removeAppointment;
    }

    public void deleteAllAppointment(){
        appointments.clear();
    }
}
