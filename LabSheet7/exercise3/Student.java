package LabSheet7.exercise3;

public class Student {
    private int id;
    private String name;
    private String dept;

    public Student(int id, String name, String dept){
        setId(id);
        setName(name);
        setDepartment(dept);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDept() {
        return dept;
    }

    public void setDepartment(String department) {
        this.dept = department;
    }

    public String toString(){

        return "Name: " + getName() + "  ID: " + getId() + "  Department: " + getDept() + "\n";

    }

}

