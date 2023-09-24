package org.maven.constructorin;

public class Person {

    private String name;
    private int personId;

    //we are not creating getter and setter for set and get the values
    //we make use constructor for set the values

    public Person(String name, int personId){
        this.name= name;
        this.personId = personId;
    }

    @Override
    public String toString() {
        return this.name + " : " + this.personId;
    }
}
