package bailam;

import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		        Person[] persons = new Person[5];
		        input(persons);
		        print(persons);
		    }
		    public static void input(Person[] persons) {
		        Scanner scanner = new Scanner(System.in);

		        for (int i = 0; i < 3; i++) {
		            System.out.println("Enter student information:");
		            System.out.print("Name: ");
		            String name = scanner.nextLine();
		            System.out.print("Age: ");
		            int age = scanner.nextInt();
		            System.out.print("Math score: ");
		            double math = scanner.nextDouble();
		            System.out.print("Physics score: ");
		            double physics = scanner.nextDouble();
		            System.out.print("Chemistry score: ");
		            double chemistry = scanner.nextDouble();
		            scanner.nextLine(); // Consume newline
		            persons[i] = new Student(name, age, math, physics, chemistry);
		        }

		        for (int i = 3; i < 5; i++) {
		            System.out.println("Enter teacher information:");
		            System.out.print("Name: ");
		            String name = scanner.nextLine();
		            System.out.print("Age: ");
		            int age = scanner.nextInt();
		            System.out.print("Salary coefficient (HSL): ");
		            double hsl = scanner.nextDouble();
		            scanner.nextLine(); // Consume newline
		            persons[i] = new Teacher(name, age, hsl);
		        }

		        scanner.close();
		    }

		    // Method to print person information
		    public static void print(Person[] persons) {
		        System.out.println("\nPerson Information:");
		        for (Person person : persons) {
		            System.out.println("---------------------------");
		            System.out.println("Name: " + person.getAge());
		            System.out.println("Age: " + person.getAge());
		            if (person instanceof Student) {
		                Student student = (Student) person;
		                System.out.println("Math score: " + student.getMath());
		                System.out.println("Physics score: " + student.getPhysics());
		                System.out.println("Chemistry score: " + student.getChemistry());
		                System.out.println("Average score: " + student.calculateAverage());
		            } else if (person instanceof Teacher) {
		                Teacher teacher = (Teacher) person;
		                System.out.println("Salary coefficient (HSL): " + teacher.getHsl());
		                System.out.println("Salary: " + teacher.calculateSalary());
		            }
		        }
	}

}
