package Exercise2;


import java.util.Scanner;

public class StudentDriver {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter your name");
        String name=sc.next();

        System.out.print("Are you a full time student (true or false) :");
        Boolean full_time_status = sc.nextBoolean();

        Student[] students = new Student[1];
        if(full_time_status == true )
        {
            FullTimeStudent fullTimeStudent = new FullTimeStudent(name,full_time_status,2000.00);
            students[0] = fullTimeStudent;
        }
        else
        {
            System.out.print("Enter the number of hours: ");
            Double hours = sc.nextDouble();
            PartTimeStudent partTimeStudent= new PartTimeStudent(name,full_time_status,100.00,hours);
            students[0] = partTimeStudent;
        }

        System.out.println("Student details is");

        for (Student currentStudent : students) {
            currentStudent.tuition();
            System.out.println(currentStudent);
            System.out.printf("Tuition fees is $%s%n", currentStudent.tuition());

        }

        }

    }

