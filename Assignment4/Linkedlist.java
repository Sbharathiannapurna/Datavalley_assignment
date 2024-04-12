package Assignment4;
import java.util.Collections;
import java.util.LinkedList;
public class Linkedlist {
	
	
	    public static void main(String[] args) {
	   
	        LinkedList<Employee> employees = new LinkedList<>();

	        employees.add(new Employee(1, "Annapurna", "Manager", 50000));
	        employees.add(new Employee(2, "sharon", "Developer", 40000));
	        employees.add(new Employee(3, "Bhavani", "Designer", 55000));
	        employees.add(new Employee(4, "Durga", "Tester", 55000)); // For testing duplicate names

	        // Sort the list based on name and salary
	        Collections.sort(employees);

	        // Print the sorted list
	        System.out.println("Sorted Employee List:");
	        for (Employee emp : employees) {
	            System.out.println(emp);
	        }
	    }
	

}
