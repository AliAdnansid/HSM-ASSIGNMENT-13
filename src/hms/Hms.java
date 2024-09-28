package hms;

import java.sql.SQLException;
import java.util.Scanner;

public class Hms {

    public static void main(String[] args) throws SQLException {
        DTO_hms d = new DTO_hms();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("Hospital Management System Menu:");
            System.out.println("1. Add Patient");
            System.out.println("2. Delete Patient");
            System.out.println("3. Show All Patients");
            System.out.println("4. Update Patient Info");
            System.out.println("5. Add Doctor");
            System.out.println("6. Delete Doctor");
            System.out.println("7. Show All Doctors");
            System.out.println("8. Update Doctor Info");
            System.out.println("9. Add Appointment");
            System.out.println("10. Delete Appointment");
            System.out.println("11. Add Bill");
            System.out.println("12. Show All Bills");
            System.out.println("13. Search Appointment by Doctor ID");
            System.out.println("14. Search Bill by Name");
            System.out.println("15. Search Bill by Date");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            try {
                switch (choice) {
                    case 1:
                        d.insertStoredProcedureIntoPatient();
                        break;
                    case 2:
                        d.deleteStoredProcedureIntoPatient();
                        break;
                    case 3:
                        d.showAllStoredProcedureIntoPatient();
                        break;
                    case 4:
                        d.updateInfoStoredProcedureIntoPatient();
                        break;
                    case 5:
                        d.insertStoredProcedureIntoDoctor();
                        break;
                    case 6:
                        d.deleteStoredProcedureIntoDoctor();
                        break;
                    case 7:
                        d.showAllStoredProcedureIntoDoctor();
                        break;
                    case 8:
                        d.updateInfoStoredProcedureIntoDoctor();
                        break;
                    case 9:
                        d.insertStoredProcedureIntoAppointment();
                        break;
                    case 10:
                        d.deleteStoredProcedureIntoAppointment();
                        break;
                    case 11:
                        d.insertStoredProcedureIntoBill();
                        break;
                    case 12:
                        d.showAllStoredProcedureIntoBill();
                        break;
                    case 13:
                        d.searchAppointmentByDoctorId();
                        break;
                    case 14:
                        d.searchBillByName();
                        break;
                    case 15:
                        d.searchBillByDate();
                        break;
                    case 0:
                        System.out.println("Exiting...");
                        break;
                    default:
                        System.out.println("Invalid choice! Please try again.");
                }
            } catch (SQLException e) {
                System.out.println("Error: " + e.getMessage());
            }
        } while (choice != 0);

        scanner.close();
    }
}
