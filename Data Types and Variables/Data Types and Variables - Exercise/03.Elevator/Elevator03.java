//Calculate how many courses will be needed to elevate n persons by using an elevator of capacity of p persons.
//The input holds two lines: the number of people n and the capacity p of the elevator.
//        Examples
//        Input	 Output	 Comments
//        17
//        3	       6	  5 courses * 3 people + 1 course * 2 persons
//
//        4
//        5        1 	  All the persons fit inside in the elevator. Only one course is needed.

import java.util.Scanner;

public class Elevator03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numPeople = Integer.parseInt(scanner.nextLine());
        int capacityElevator = Integer.parseInt(scanner.nextLine());
        int courses = numPeople / capacityElevator;

        if (courses % 2 > 0) {
            courses = courses + 1;
        }
        if (capacityElevator > numPeople) {
            courses = 1;
        }
        System.out.println(courses);
    }
}
