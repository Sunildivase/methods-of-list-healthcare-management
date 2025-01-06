package com.methodsofcollection.service;

import com.methodsofcollection.model.Department;

import java.util.ArrayList;
import java.util.Scanner;

public class DepartmentService {
    private ArrayList<Department> departments = new ArrayList<>();

    private static Scanner scanner = new Scanner(System.in);

    void printDepartment(Department department){
        System.out.println(department);
    }
    public Department createDepartment(){

        System.out.println("please enter department Id");
        int deptId = Integer.parseInt(scanner.nextLine());

        System.out.println("please enter department name");
        String deptName = scanner.nextLine();

        System.out.println("please enter doctor id");
        int doctorId = Integer.parseInt(scanner.nextLine());

        System.out.println("please enter hospital id");
        int hospitalId = Integer.parseInt(scanner.nextLine());

        Department department = new Department();
        department.setDeptId(deptId);
        department.setDeptName(deptName);
        department.setDoctorId(doctorId);
        department.setHospitalId(hospitalId);

        if(departments.contains(department)){
            System.out.println("department already exists");
        }
        else {
            departments.add(department);
        }
        return department;

    }
    public void displayDepartment(){
        if(departments.size()!=0) {
            for (Object department : departments) {
                System.out.println("create department: " + department);
            }
        }

        else{
                System.out.println("no department in system");
            }
        }

        public Department deleteDepartment(int deptId){
        Department removeDept = departments.remove(deptId);
        return removeDept;
        }

        public void deleteAllDepartment(){
        departments.clear();
        }
    }


