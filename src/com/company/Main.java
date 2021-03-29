package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	//In timpul cinei, un grup de prieteni doreste sa stabileasca un program pentru seara ce urmeaza.O persoana este
        // caracterizata de nume si varsta.Pentru clasa Person implementati:
        //*Constructor pentru initializarea campurilor clasei
        //*Pentru a-i ajuta sa isi faca planurile potrivite pentru varsta lor in Person, ordonati persoanele
        // descrescator in functie de varsta.Pentru fiecare membru al grupului printati: [name]is[age]years old and ...
        //...is going to the Mall.(daca varsta <25)
        //... is partying tonight(daca 25<=varsta<30)
        //...is going to the theatre.( daca 30<=varsta<=40)
        //... is staying home tonight(daca varsta>40)
        Scanner scan=new Scanner(System.in);
        System.out.println("Introduceti numarul de persoane din grup: ");
        int numberOfPersons=scan.nextInt();
        Person[] personGroup=new Person[numberOfPersons];
        for(int i=0; i< numberOfPersons;i++){
            System.out.println("Introduceti numele persoanei "+(i+1));
            String name=scan.next();
            System.out.println("Introduceti varsta persoanei "+(i+1));
            int age=scan.nextInt();
        Person person=new Person(name, age);
        personGroup[i]=person;
        }
        Arrays.sort(personGroup);
        for (int i=0;i<numberOfPersons;i++){
            //System.out.println(personGroup[i].getName()+" "+personGroup[i].getAge());
            if(personGroup[i].getAge()<25)
                System.out.println(personGroup[i].toString()+"is going to the Mall.");
            if(personGroup[i].getAge()>=25&&personGroup[i].getAge()<30)
                System.out.println(personGroup[i].toString()+"is partying tonight.");
            if(personGroup[i].getAge()>=30&&personGroup[i].getAge()<=40)
                System.out.println(personGroup[i].toString()+"is going to the theatre.");
            if(personGroup[i].getAge()>40)
                System.out.println(personGroup[i].toString()+"is staying home tonight.");
        }
    }
}
