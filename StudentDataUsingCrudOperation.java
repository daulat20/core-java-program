import java.sql.*;
import java.util.Scanner;

public class StudentDataUsingCrudOperation {

    public static void main(String[] args) {
        try {
            //  Load JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            //  Establish database connection
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/College", "root", "Daulat@@6920");

            Scanner sc = new Scanner(System.in);
            int choice;

            //  Menu-driven structure
            do {
                System.out.println("\n===== Student Database Menu =====");
                System.out.println("1. Insert Data");
                System.out.println("2. Display Data");
                System.out.println("3. Update Data");
                System.out.println("4. Delete Data");
                System.out.println("5. Exit");
                System.out.print("Enter your choice: ");
                choice = sc.nextInt();

                switch (choice) {

                    //  Insert data
                    case 1:
                        System.out.print("Enter ID: ");
                        int id = sc.nextInt();
                        System.out.print("Enter Name: ");
                        String name = sc.next();
                        System.out.print("Enter City: ");
                        String city = sc.next();

                        PreparedStatement ps = con.prepareStatement(
                                "INSERT INTO student (id, name, city) VALUES (?, ?, ?)");
                        ps.setInt(1, id);
                        ps.setString(2, name);
                        ps.setString(3, city);

                        ps.executeUpdate();
                        System.out.println("Record added successfully!");
                        break;

                    //  Display data
                    case 2:
                        PreparedStatement ps1 = con.prepareStatement("SELECT * FROM student");
                        ResultSet rs = ps1.executeQuery();
                        System.out.println("\nID\tName\tCity");
                        System.out.println("----------------------------");
                        while (rs.next()) {
                            System.out.println(rs.getInt("id") + "\t" + rs.getString("name") + "\t" + rs.getString("city"));
                        }
                        break;

                    //  Update data
                    case 3:
                        System.out.print("Enter ID to update: ");
                        int id1 = sc.nextInt();
                        System.out.print("Enter new Name: ");
                        String name1 = sc.next();
                        System.out.print("Enter new City: ");
                        String city1 = sc.next();

                        PreparedStatement ps3 = con.prepareStatement(
                                "UPDATE student SET name = ?, city = ? WHERE id = ?");
                        ps3.setString(1, name1);
                        ps3.setString(2, city1);
                        ps3.setInt(3, id1);

                        int updated = ps3.executeUpdate();
                        if (updated > 0)
                            System.out.println("Student data updated successfully!");
                        else
                            System.out.println("No record found with ID: " + id1);
                        break;

                    //  Delete data
                    case 4:
                        System.out.print("Enter ID to delete: ");
                        int id2 = sc.nextInt();

                        PreparedStatement ps4 = con.prepareStatement("DELETE FROM student WHERE id = ?");
                        ps4.setInt(1, id2);

                        int deleted = ps4.executeUpdate();
                        if (deleted > 0)
                            System.out.println("Record deleted successfully!");
                        else
                            System.out.println("No record found with ID: " + id2);
                        break;

                    //  Exit
                    case 5:
                        System.out.println("Exiting program... Goodbye!");
                        con.close();
                        break;

                    //  Invalid choice
                    default:
                        System.out.println("Invalid option, please try again!");
                        break;
                }

            } while (choice != 5);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

