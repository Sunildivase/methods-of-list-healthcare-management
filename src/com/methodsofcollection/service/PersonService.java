package com.methodsofcollection.service;

import com.methodsofcollection.model.Person;

import java.util.ArrayList;
import java.util.Scanner;

public class PersonService {
    private ArrayList persons = new ArrayList();

//    private ArrayList<Person> persons = new ArrayList<>();

    private Scanner scanner = new Scanner(System.in);


    void printPerson(Person person){
        System.out.println(person);
    }

    public Person createPerson(){

        System.out.println("please enter id");
        int personId = Integer.parseInt(scanner.nextLine());

        System.out.println("please enter type");
        String type = scanner.nextLine();

        System.out.println("please enter first name");
        String firstName = scanner.nextLine();

        System.out.println("please enter last name");
        String lastName = scanner.nextLine();

        System.out.println("please enter age");
        int age = Integer.parseInt(scanner.nextLine());

        System.out.println("please enter gender");
        String gender = scanner.nextLine();

        System.out.println("please enter mobile");
        String mobile = scanner.nextLine();

        System.out.println("please enter alternateMobile");
        String alternateMobile = scanner.nextLine();

        System.out.println("please enter address");
        String address = scanner.nextLine();

        Person person = new Person();
        person.setPersonId(personId);
        person.setType(type);
        person.setFirstName(firstName);
        person.setLastName(lastName);
        person.setAge(age);
        person.setGender(gender);
        person.setMobile(mobile);
        person.setAlternateMobile(alternateMobile);
        person.setAddress(address);

        if(persons.contains(person)){
            System.out.println("person already created");
        }
        else {
            persons.add(person);
        }
        return person;
    }

    public void displayPerson(){
        if(persons.size() != 0) {

            for (Object person : persons) {
                System.out.println("create person: " + person);
            }
        }
        else{
                System.out.println("no person present in system");
        }

    }



}

