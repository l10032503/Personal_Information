import java.util.Scanner;

public class Personal_Information {
	public static void main(String[]args) {
		Personal_Information personal_information = new Personal_Information();
		personal_information.start();
	}
	
	public void start() {
		int choice;
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			System.out.println("1. Contacts");
			System.out.println("2. To-do List");
			System.out.println("3. Appotintments");
			System.out.println("0. Exit");
			System.out.print("Choice Number =>  ");
		
			choice = scan.nextInt();
		
			switch(choice) {
			case 1:
				Contacts contact_list = new Contacts();
				contact_list.PrintMenu();
				break;
			case 2:
				ToDoList todoList = new ToDoList();
				todoList.startProgram();
				break;
			case 3:
				//Appointments appointments = new Appointments();
				//appointments.menu_Appointment();
				break;
			case 0:
				return;
			}
		}
	}

}
