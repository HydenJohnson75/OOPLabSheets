package LabSheet7.exercise3;

public class TestCollegeApp {
    public static void main(String[] args) {

        Student computingStudents [] = new Student[10];
        Student cmStudents [] = new Student[10];
        Department deptName [] = new Department[5];

        Student s1 = new Student(154345,"Jake","Computing");
        Student s2 = new Student(234532,"Mary","Creative Media");
        Student s3 = new Student(453726,"Tommy","Computing");
        Student s4 = new Student(623456,"Peter","Creative Media");



        computingStudents[0] = s1;
        cmStudents[0] = s2;
        computingStudents[1] = s3;
        cmStudents[1] = s4;

        Department computing = new Department("Computing",computingStudents);
        Department creativeMedia = new Department("Creative Media", cmStudents);

        deptName[0] = computing;
        deptName[1] = creativeMedia;

        Institute i1 = new Institute("Institute of Technology Tralee",deptName);


        System.out.println(i1 + "\n\nTotal number of students: " + i1.getTotalStudents());

        System.out.println("\n\n\n" + deptName[0]);

    }
}
