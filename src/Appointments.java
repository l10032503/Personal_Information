import java.util.Scanner;

public class Appointments {
	AppointmentList appointmentList = new AppointmentList();
	Scanner scan = new Scanner(System.in);
	final static int unknownIndex = -1;
	
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
				createAppointment();
				break;
			case 2:
				viewAppointments();
				break;
			case 3:
				updateAppointment();
				break;
			case 4:
				deleteAppointment();
			break;
			case 0:
				return;
			}
		}
	}
	

	public void createAppointment() {
		System.out.println("Create Appointment");
		inputAppointmentItem(unknownIndex);
		appointmentList.printList();
	}

	public void viewAppointments() {
		System.out.println("<Show Appointments>");
		appointmentList.printList();
	}

	public void updateAppointment() {
		String key_updateName;
		int update_index;
		
		System.out.println("Update Appointment");
		System.out.print("Appointment Name : ");
		key_updateName = scan.next();
		update_index = appointmentList.searchListItem(key_updateName);
		if(update_index != unknownIndex) {
			System.out.println("update " + key_updateName);
			inputAppointmentItem(update_index);
			appointmentList.printList();
		}
		else {
			System.out.println(key_updateName + " is not exist.");
		}
	}

	public void deleteAppointment() {
		String key_deletionName;
		int deletion_index;
		
		System.out.println("Delete Appointment");
		System.out.print("Appointment Name : ");
		key_deletionName = scan.next();
		deletion_index = appointmentList.searchListItem(key_deletionName);
		if(deletion_index != unknownIndex) {
			appointmentList.deleteListItem(deletion_index);
			System.out.println("delete! " + key_deletionName);
		}
		else {
			System.out.println(key_deletionName + " is not exist.");
		}
	}
	
	public void inputAppointmentItem(int index) {
		AppointmentList.ListItem tempItem = new AppointmentList.ListItem();
		
		System.out.print("Appointment name : ");
		tempItem.appointmentName = scan.next();
		
		System.out.print("date : ");
		tempItem.date = scan.next();
		
		System.out.print("location : ");
		tempItem.location = scan.next();
		
		System.out.print("people : ");
		tempItem.peopleNum = scan.nextInt();
		
		appointmentList.addListItem(tempItem, index);
	}
}
