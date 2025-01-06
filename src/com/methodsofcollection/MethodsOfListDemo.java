package com.methodsofcollection;

import com.methodsofcollection.service.*;

import java.util.Scanner;

public class MethodsOfListDemo {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int option=0;
        do {
            System.out.println("-----------healthcare-management-system---------------");
            System.out.println("1.create person");
            System.out.println("2.create doctor");
            System.out.println("3.create hospital");
            System.out.println("4.create department");
            System.out.println("5.create appointment");
            System.out.println(("6.create prescription"));
            System.out.println("7.create billing");
            System.out.println("please choose the option");
            option = Integer.parseInt(scanner.nextLine());

            switch (option) {
                case 1:
                    PersonService personService = new PersonService();
                    personService.createPerson();
                    personService.displayPerson();
                    personService.deletePerson(1);
                    personService.deleteAllPerson();
                    System.out.println("person created");
                    break;

                case 2:
                    DoctorService doctorService = new DoctorService();
                    doctorService.createDoctor();
                    doctorService.displayDoctor();
                    doctorService.deleteDoctor(1);
                    doctorService.deleteAllDoctor();
                    System.out.println("doctor created");
                    break;

                case 3:
                    HospitalService hospitalService = new HospitalService();
                    hospitalService.createHospital();
                    hospitalService.displayHospital();
                    hospitalService.deleteHospital(1);
                    hospitalService.deleteAllHospital();
                    System.out.println("hospital created");
                    break;

                case 4:
                    DepartmentService departmentService = new DepartmentService();
                    departmentService.createDepartment();
                    departmentService.displayDepartment();
                    departmentService.deleteDepartment(1);
                    departmentService.deleteAllDepartment();
                    System.out.println("department created ");
                    break;

                case 5:
                    AppointmentService appointmentService = new AppointmentService();
                    appointmentService.createAppointment();
                    appointmentService.displayAppointment();
                    appointmentService.deleteAppointment(1);
                    appointmentService.deleteAllAppointment();
                    System.out.println("appointment created");
                    break;

                case 6:
                    PrescriptionService prescriptionService = new PrescriptionService();
                    prescriptionService.createPrescription();
                    prescriptionService.displayPrescription();
                    prescriptionService.deletePrescription(1);
                    prescriptionService.deleteALlPrescription();
                    System.out.println("prescription created ");
                    break;

                case 7:
                    BillingService billingService = new BillingService();
                    billingService.createBilling();
                    billingService.displayBilling();
                    billingService.deleteBilling(1);
                    billingService.deleteAllBilling();
                    System.out.println("bill created");
                    break;

                default:
                    System.out.println("invalid input please enter valid input");
                    break;

            }
        }while(option!=0);{
            System.out.println("Thank you !!!");
        }

    }
}
