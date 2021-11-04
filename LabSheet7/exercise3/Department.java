package LabSheet7.exercise3;

public class Department {

    private String name;
    private Student Students[];


    Department(String name, Student[] Students){

        setName(name);
        setStudents(Students);

    }

    public void setName(String name){
        this.name = name;
    }

    public void setStudents(Student[] Students){
        this.Students = Students;
    }

    public String getName(){
        return name;
    }

    public Student[] getStudents(){
        return Students;
    }

    public String toString(){
        String str = "\nName: " + getName() + "\nList of Students: ";// + getStudents() +"\n\n";

        for(int i = 0; i < getStudents().length; i++){
            if(Students[i] != null){
                str+=Students[i];
            }
        }

        return str;
    }

}
