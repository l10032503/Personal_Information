import java.util.Scanner;

public class Personal_Information<TodoList> {
	public static void main(String[]args) {
		Personal_Information personal_information = new Personal_Information();
		personal_information.start();
	}
	
	public <TodoList> void start() {
		int choice;
		Scanner scan = new Scanner(System.in);
		
		while(1>0) {
			System.out.println("1. Contacts");
			System.out.println("2. To-do List");
			System.out.println("3. Appotintments");
			System.out.println("0. Exit");
			System.out.print("메뉴 번호 입력=> ");
		
			choice = scan.nextInt();
		
			switch(choice) {
			case 1:
				Contacts contact_list = new Contacts();
				contact_list.PrintMenu();
				break;
			case 2:
				ToDoList todoList = new ToDoList();
				todoList.starProgram_ToDoList();
				break;
			case 3:
				Appointments appointments = new Appointments();
				appointments.menu_Appointment();
				break;
			case 0:
				return;
			}
		}
	}

}