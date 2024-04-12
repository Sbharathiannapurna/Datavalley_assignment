package Assignment5;
import java.sql.*;
public class SqlExample {
	

	// Department class
	class Department {
	    private int id;
	    private String name;

	    // Constructor
	    public Department(int id, String name) {
	        this.id = id;
	        this.name = name;
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
	}

	// Main class
	public class DepartmentDBInsertion {
	   
	    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/departments";
	    private static final String USERNAME = "your_username";
	    private static final String PASSWORD = "your_password";

	    // SQL query to insert department data
	    private static final String INSERT_DEPARTMENT_QUERY = "INSERT INTO department (id, name) VALUES (?, ?)";

	    public static void main(String[] args) {
	        // Create a department object
	        Department department = new Department(1, "IT");

	        // Try-with-resources to automatically close resources
	        try (Connection connection = DriverManager.getConnection(JDBC_URL, USERNAME, PASSWORD);
	             Statement statement = connection.createStatement()) {

	            // Execute the insertion query
	            PreparedStatement preparedStatement = connection.prepareStatement(INSERT_DEPARTMENT_QUERY);
	            preparedStatement.setInt(1, department.getId());
	            preparedStatement.setString(2, department.getName());
	            preparedStatement.executeUpdate();
	            System.out.println("Department data inserted successfully.");
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	    }
	}

}
