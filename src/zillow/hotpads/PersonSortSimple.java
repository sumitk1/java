package com.zillow.hotpads;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;
import java.util.List;

public class PersonSortSimple {

    public static void main(String[] args) {
        Person p1 = new Person("111-11-1111", new Date(18661400000L), "Ajohn", "Fsmith", 5.1, 178.24);
        Person p2 = new Person("222-22-2222", new Date(18662400000L), "Bjohn", "Esmith", 5.2, 188.24);
        Person p3 = new Person("333-33-3333", new Date(18663400000L), "Cjohn", "Dsmith", 5.3, 198.24);

        List<Person> personList = new ArrayList<>();
        personList.add(p1);
        personList.add(p3);
        personList.add(p2);

        System.out.println("\nBefore Sort\n");
        for (Person person : personList) {
            System.out.println(person);
        }

        List<Person> result = null;

        System.out.println("\nSorting by SSN ascending-false\n");
        result = sort(personList, "ssn", "false");
        result.forEach((person)->System.out.println(person));

        System.out.println("\nSorting by SSN ascending-true\n");
        result = sort(personList, "ssn", "true");
        result.forEach((person)->System.out.println(person));

        System.out.println("-----");

        System.out.println("\nSorting by dateOfBirth ascending-false\n");
        result = sort(personList, "dateOfBirth", "false");
        result.forEach((person)->System.out.println(person));

        System.out.println("\nSorting by dateOfBirth ascending-true\n");
        result = sort(personList, "dateOfBirth", "true");
        result.forEach((person)->System.out.println(person));

        System.out.println("-----");

        System.out.println("\nSorting by firstName ascending-false\n");
        result = sort(personList, "firstName", "false");
        result.forEach((person)->System.out.println(person));

        System.out.println("\nSorting by firstName ascending-true\n");
        result = sort(personList, "firstName", "true");
        result.forEach((person)->System.out.println(person));

        System.out.println("-----");

        System.out.println("\nSorting by lastName ascending-false\n");
        result = sort(personList, "lastName", "false");
        result.forEach((person)->System.out.println(person));

        System.out.println("\nSorting by lastName ascending-true\n");
        result = sort(personList, "lastName", "true");
        result.forEach((person)->System.out.println(person));

        System.out.println("-----");

        System.out.println("\nSorting by heightIn ascending-false\n");
        result = sort(personList, "heightIn", "false");
        result.forEach((person)->System.out.println(person));

        System.out.println("\nSorting by heightIn ascending-true\n");
        result = sort(personList, "heightIn", "true");
        result.forEach((person)->System.out.println(person));

        System.out.println("-----");

        System.out.println("\nSorting by weightLb ascending-false\n");
        result = sort(personList, "weightLb", "false");
        result.forEach((person)->System.out.println(person));

        System.out.println("\nSorting by weightLb ascending-true\n");
        result = sort(personList, "weightLb", "true");
        result.forEach((person)->System.out.println(person));

    }

    static List<Person> sort(Iterable<Person> people, String sortField, String ascending){

        List<Person> returnList = new ArrayList<>();
        for (Person person : people) {
            returnList.add(person);
        }

        switch (sortField) {
            case "ssn":
                if (ascending.equals("true")) {
                    returnList.sort((Person o1, Person o2)->
                            Comparator.nullsFirst(String::compareTo).compare(o1.getSsn(), o2.getSsn()));
                } else {
                    returnList.sort((Person o2, Person o1)->
                            Comparator.nullsLast(String::compareTo).compare(o1.getSsn(), o2.getSsn()));
                }
                break;

            case "dateOfBirth":
                if (ascending.equals("true")) {
                    returnList.sort((Person o1, Person o2)->
                            Comparator.nullsFirst(Date::compareTo).compare(o1.getDateOfBirth(), o2.getDateOfBirth()));
                } else {
                    returnList.sort((Person o2, Person o1)->
                            Comparator.nullsLast(Date::compareTo).compare(o1.getDateOfBirth(), o2.getDateOfBirth()));
                }
                break;

            case "firstName":
                if (ascending.equals("true")) {
                    returnList.sort((Person o1, Person o2)->
                            Comparator.nullsFirst(String::compareTo).compare(o1.getFirstName(), o2.getFirstName()));
                } else {
                    returnList.sort((Person o2, Person o1)->
                            Comparator.nullsLast(String::compareTo).compare(o1.getFirstName(), o2.getFirstName()));
                }
                break;

            case "lastName":
                if (ascending.equals("true")) {
                    returnList.sort((Person o1, Person o2)->
                            Comparator.nullsFirst(String::compareTo).compare(o1.getLastName(), o2.getLastName()));
                } else {
                    returnList.sort((Person o2, Person o1)->
                            Comparator.nullsLast(String::compareTo).compare(o1.getLastName(), o2.getLastName()));
                }
                break;

            case "heightIn":
                if (ascending.equals("true")) {
                    returnList.sort((Person o1, Person o2)->
                            Comparator.nullsFirst(Double::compareTo).compare(o1.getHeightIn(), o2.getHeightIn()));
                } else {
                    returnList.sort((Person o2, Person o1)->
                            Comparator.nullsLast(Double::compareTo).compare(o1.getHeightIn(), o2.getHeightIn()));
                }
                break;

            case "weightLb":
                if (ascending.equals("true")) {
                    returnList.sort((Person o1, Person o2)->
                            Comparator.nullsFirst(Double::compareTo).compare(o1.getWeightLb(), o2.getWeightLb()));
                } else {
                    returnList.sort((Person o2, Person o1)->
                            Comparator.nullsLast(Double::compareTo).compare(o1.getWeightLb(), o2.getWeightLb()));
                }
                break;
        }

        return returnList;
    }
}
