package com.company;

public class Person implements Comparable<Person> {
    //In timpul cinei, un grup de prieteni doreste sa stabileasca un program pentru seara ce urmeaza.O persoana este
    // caracterizata de nume si varsta.Pentru clasa Person implementati:
    //*Constructor pentru initializarea campurilor clasei
    //*Pentru a-i ajuta sa isi faca planurile potrivite pentru varsta lor in Person, ordonati persoanele
    // descrescator in functie de varsta.Pentru fiecare membru al grupului printati: [name]is[age]years old and ...
    //...is going to the Mall.(daca varsta <25)
    //... is partying tonight(daca 25<=varsta<30)
    //...is going to the theatre.( daca 30<=varsta<=40)
    //... is staying home tonight(daca varsta>40)

    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return this.age;
    }
    public String toString(){
        return (this.getName()+" is "+this.getAge()+" years old and ");
    }

    @Override
    public int compareTo(Person o) {
        if (age > o.age) {
            return -1;
        } else {
            if (age == o.age) {
                return 0;
            } else {
                return 1;
            }
        }
    }
}
