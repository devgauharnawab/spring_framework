package org.maven.collections;

import java.util.List;
import java.util.Map;

public class Employee {
    private String name;
    private List<String> phones;
    private List<String> address;
    private Map<String,String> courses;

    public Employee(String name,List<String> phones,List<String> address,Map<String,String> courses) {
        super();
        this.name = name;
        this.phones = phones;
        this.address = address;
        this.courses = courses;
    }

    public Employee(){
        super();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getPhones() {
        return phones;
    }

    public void setPhones(List<String> phones) {
        this.phones = phones;
    }

    public List<String> getAddress() {
        return address;
    }

    public void setAddress(List<String> address) {
        this.address = address;
    }

    public Map<String, String> getCourses() {
        return courses;
    }

    public void setCourses(Map<String, String> courses) {
        this.courses = courses;
    }
}
