package Assignment3;
import java.io.*;


class Customer implements Serializable {
 private int id;
 private String name;
 private String contactNo;
 private String address;


 public Customer(int id, String name, String contactNo, String address) {
     this.id = id;
     this.name = name;
     this.contactNo = contactNo;
     this.address = address;
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

 public String getContactNo() {
     return contactNo;
 }

 public void setContactNo(String contactNo) {
     this.contactNo = contactNo;
 }

 public String getAddress() {
     return address;
 }

 public void setAddress(String address) {
     this.address = address;
 }
}




public class Serialization {

		 public static void main(String[] args) {
		     
		     Customer customer = new Customer(1, "Annapurna", "1234567890", "123 Main St");

		    
		     try {
		         FileOutputStream fileOut = new FileOutputStream("JavaObject.txt");
		         ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);
		         objectOut.writeObject(customer);
		         objectOut.close();
		         System.out.println("Serialized data is saved in JavaObject.txt");
		     } catch (IOException e) {
		         e.printStackTrace();
		     }
		 }
		}

