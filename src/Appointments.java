
import java.util.Scanner;

public class Appointments {
	
	AppointmentList appointmentList = new AppointmentList();
	Scanner scan = new Scanner(System.in);
	
	
	public void menu_Appointment() {

		int select;
		
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
		int peopleNum;
		
		System.out.println("Create Appointments");
		
		System.out.print("Appointment name : ");
		appointmentName = scan.next();
		System.out.print("date : ");
		date = scan.next();
		System.out.print("location : ");
		location = scan.next();
		System.out.print("people : ");
		peopleNum = scan.nextInt();
		
		appointmentList.addListItem(appointmentName, date, location, peopleNum);
		appointmentList.printList();
	}

	public void viewAppointments() {
		System.out.println("Show Appointments");
		appointmentList.printList();
	}

	public void updateAppointments() {
		String key_updateName;
		int update_index;
		
		System.out.println("Update Appointments");
		key_updateName = scan.next();
		update_index = appointmentList.searchListItem(key_updateName);
		
		if(update_index != 0) {
			System.out.println("update " + key_updateName);
			System.out.print("Appointment name : ");
			String update_appointmentName = scan.next();
			System.out.print("date : ");
			String update_date = scan.next();
			System.out.print("location : ");
			String update_location = scan.next();
			System.out.print("people : ");
			int update_peopleNum = scan.nextInt();
			
			// new method of AppointmentLsit?
		}
		else {
			System.out.println(key_updateName + " is not exist.");
		}
	}

	public void deleteAppointments() {
		String key_deletionName;
		int deletion_index;
		
		System.out.println("Delete Appointments");
		key_deletionName = scan.next();
		deletion_index = appointmentList.searchListItem(key_deletionName);
		if(deletion_index != 0) {
			appointmentList.deleteLsitItem(deletion_index);
			System.out.println(key_deletionName + "delete!");
		}
		else {
			System.out.println(key_deletionName + " is not exist.");
		}
	}
}
