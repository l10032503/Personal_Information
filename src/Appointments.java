
import java.util.Scanner;

public class Appointments {
	public void menu_Appointment() {

		int select;
		Scanner scan = new Scanner(System.in);
		
		while(true){
			System.out.println("0. Main Menu");
			System.out.println("1. Create");
			System.out.println("2. View ");
			System.out.println("3. Update");
			System.out.println("4. Delete");
			System.out.print("Choice :  ");
		
			select = scan.nextInt();
		
			switch(select) {
			case 1:
				createAppointments();
				break;
			case 2:
				viewAppointments();
				break;
			case 3:
				updateAppointments();
				break;
			case 4:
				deleteAppointments();
			break;
			case 0:
				return;
			}
		}
	}

	public void createAppointments() {
		String appointmentName, date, location;
		int people;
		System.out.println("Create Appointments");
	}

	public void viewAppointments() {
		System.out.println("Show Appointments");
	}

	public void updateAppointments() {
		String key_revisionName;
		System.out.println("Update Appointments");
	}

	public void deleteAppointments() {
		String key_deletionName;
		System.out.println("Delete Appointments");
	}
}
