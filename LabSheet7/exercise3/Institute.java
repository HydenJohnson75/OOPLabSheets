package LabSheet7.exercise3;

public class Institute {

    private String name;
    private Department departments[];

    Institute(String name, Department[] departments){
        setName(name);
        setDepartments(departments);
    }

    public String getName() {
        return name;
    }

    public Department[] getDepartments() {
        return departments;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDepartments(Department[] departments) {
        this.departments = departments;
    }

    public String toString(){
        String str = "Name: " + getName() + "\n\nDepartments: ";// + getDepartments();

        for(int i = 0; i < getDepartments().length; i++){
            if(departments[i] != null){
                str+=departments[i];
            }
        }
        return str;
    }

    public int getTotalStudents(){
        int total = 0;
        Student students[];



        for (int i = 0; i < departments.length; i++) {
            if (departments[i] != null){
                students = departments[i].getStudents();

                for(int j = 0; j < students.length; j++){
                    if(students[j] != null){
                        total++;
                    }

                }
            }


        }
        return total;
    }

}
