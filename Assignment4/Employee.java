package Assignment4;

import java.util.LinkedList;

//Employee class
class Employee implements Comparable<Employee> {
 private int id;
 private String name;
 private String designation;
 private double salary;

 // Constructor
 public Employee(int id, String name, String designation, double salary) {
     this.id = id;
     this.name = name;
     this.designation = designation;
     this.salary = salary;
 }

 // Getters and setters
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

 public String getDesignation() {
     return designation;
 }

 public void setDesignation(String designation) {
     this.designation = designation;
 }

 public double getSalary() {
     return salary;
 }

 public void setSalary(double salary) {
     this.salary = salary;
 }

 // Implementing compareTo method for sorting based on name and salary
 @Override
 public int compareTo(Employee other) {
     // First, compare based on name
     int nameComparison = this.name.compareTo(other.name);
     if (nameComparison != 0) {
         return nameComparison;
     }
     // If names are equal, compare based on salary
     return Double.compare(this.salary, other.salary);
 }

 // Override toString method for printing employee details
 @Override
 public String toString() {
     return "Employee{" +
             "id=" + id +
             ", name='" + name + '\'' +
             ", designation='" + designation + '\'' +
             ", salary=" + salary +
             '}';
 }
}
