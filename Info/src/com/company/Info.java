package com.company;

public class Info implements InfOut {

    String name;
    String surname;
    String group;

    Info (String name, String surname, String group){
        this.name = name;
        this.surname = surname;
        this.group = group;
    }
    public void infOut(){
        System.out.println(name + " " + surname + ", " + group);
    }

}
