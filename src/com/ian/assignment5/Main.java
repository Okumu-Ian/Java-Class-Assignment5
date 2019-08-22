package com.ian.assignment5;

public class Main {

    public static void main(String[] args) {

       int [] computers = {10,20,33,12,29,87,67,45,68,37};
       int [] students = {6,9,8,10,5,3,16,70,28,9};

       System.out.println("Mean of Students: "+meanOfStudents(students));
       System.out.println("Mean of computers: "+meanOfComputers(computers));

       Main myMain = new Main();
       System.out.println("Ratio of Students to Computers: "+myMain.ratioOfStudentsToComps(
               meanOfComputers(computers) , meanOfStudents(students)
       ));

    }

    private static int meanOfStudents(int [] student){
        int totalStudents = 0;
        for(int x =0; x< student.length; x++){
            totalStudents += student[x];
        }
        int mean = totalStudents/student.length;
        return mean;
    }

    private static int meanOfComputers(int [] computer){
        int totalComputers = 0;
        for(int x = 0; x< computer.length; x++){
            totalComputers += computer[x];
        }
        int mean = totalComputers/computer.length;
        return mean;
    }

    public int ratioOfStudentsToComps( int computer,int student ){
        int ratio = computer/student;
        return ratio;
    }
}
