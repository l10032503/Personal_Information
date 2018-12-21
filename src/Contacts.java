import java.util.Scanner;

public class Contacts {
	static Scanner scan = new Scanner(System.in);
	
	public Node head = new Node(null,null,null);
	public Node tail = new Node(null,null,null);
	public int size;
	
	public Contacts() {
		head = new Node(null,null,null);
		size = 0;
	}
	
	private class Node{
		private String name;
		private String phone_number;
		private String email;
		private Node next;
		
		public Node(String NM, String PN, String EM) {
			this.name = NM;
			this.phone_number = PN;
			this.email = EM;
			this.next = null;		
		}
		
		public String printName(){
			return this.name;
		}
		
		public String printPhoneNumber(){
			return this.phone_number;
		}
		
		public String printEmail() {
			return this.email;
		}
		
	}
	
	public void PrintMenu() {
		int select;
		String NM,PN,EM;
		
		while(1>0) {
			System.out.println("0. Main Menu");
			System.out.println("1.Create");
			System.out.println("2.View");
			System.out.println("3.Update");
			System.out.println("4.Delete");
			System.out.print("Choice Number=> ");
			select = scan.nextInt();
			
			switch(select) {
			case 1:
				System.out.print("Name: ");
				NM = scan.next();
				System.out.print("Phone Number: ");
				PN = scan.next();
				System.out.print("E-mail: ");
				EM = scan.next();
				CreateContacts(NM, PN, EM);
				break;
			case 2:
				ViewContacts();
				break;
			case 3:
				if (isContactSizeZero(size)) {
					System.out.println("No data.\n");
					break;
				}
				System.out.print("Update Name:");
				NM = scan.next();
				UpdateContacts(NM);
				break;
			case 4:
				if (isContactSizeZero(size)) {
					System.out.println("No data.\n");
					break;
				}
				System.out.print("Delete Name:");
				NM = scan.next();
				DeleteContacts(NM);
				break;
			case 0:
				return;
			}
		}
	}
	
	public void CreateContacts(String NM, String PN, String EM) {
		if (isContactSizeZero(size)) {
			Node newNode = new Node(NM,PN,EM);
			newNode.next = head;
			head = newNode;
			size++;
			//System.out.println(newNode.name + newNode.phone_number + newNode.email);
			//System.out.println("head " + head.name + head.phone_number + head.email + size);			
			tail = head;
			//System.out.println("tail " + tail.name + tail.phone_number + tail.email + size);			
			
		} else {
			Node newNode = new Node(NM,PN,EM);
			//System.out.println("tail " + tail.name + tail.phone_number + tail.email + size);		
			tail.next = newNode;
			tail = newNode;
			tail.next = new Node(null,null,null);
			//System.out.println("tail " + tail.name + tail.phone_number + tail.email + size);		
			size++;
		}
		ViewContacts();		
	}
	
	public void ViewContacts() {
		Node temp = new Node(null,null,null);
		temp = head;
		
		//System.out.println("head " + head.name + head.phone_number + head.email + size);
		//System.out.println("temp " + temp.name + temp.phone_number + temp.email + size);
		//System.out.println("temp " + temp.next.name + temp.next.phone_number + temp.next.email + size);
		
		//System.out.println("tail " + tail.name + tail.phone_number + tail.email + size);		
			
		System.out.println("Name\tPhone Number\te-mail");
		System.out.println("==================================================");
		do{
			if (temp.name != null)
				System.out.println(temp.name + "\t" + temp.phone_number + "\t" + temp.email);
			temp = temp.next;
		}while (temp != null);
		System.out.println("==================================================");
		System.out.println();
		return;
	}
	
	public void UpdateContacts(String NM) {
		Node temp = new Node(null,null,null); 
		temp = head;
		String new_NM, new_PN, new_EM;
		
		
		while (!temp.name.equals(NM)) {
			//System.out.println(temp.name + " " + NM);
			if (isitLastData(temp.next.name)) {
				System.out.println("There isn't name you find.\n");
				return;
			}
			temp = temp.next;
			/*if (temp == null) {
				System.out.println(".");
				return;
			}*/
		}
		
		System.out.print("Name: ");
		new_NM = scan.next();
		System.out.print("Phone Number: ");
		new_PN = scan.next();
		System.out.print("E-mail: ");
		new_EM = scan.next();
		
		temp.name = new_NM;
		temp.phone_number = new_PN;
		temp.email = new_EM;
		
		ViewContacts();
		
		return;
	}
	
	public void DeleteContacts(String NM) {
		Node temp;
		temp = new Node(null,null,null);
		temp = head;
		Node prev = new Node(null,null,null);
		
		while (!temp.name.equals(NM)) {
			//System.out.println(temp.name + " " + NM);
			prev = temp;
			if (isitLastData(temp.next.name)) {
				System.out.println("There isn't name you find.\n");
				return;
			}
			temp = temp.next;
			
		}
		
		if (temp == head) {
			if (isThereOneData()) {
				//System.out.println("head " + head.name + head.phone_number + head.email + size);
				//System.out.println("temp " + temp.name + temp.phone_number + temp.email + size);
				//System.out.println("tail " + tail.name + tail.phone_number + tail.email + size);		
				head = new Node (null,null,null);
				tail = new Node (null,null,null);
			} else {
			//System.out.println("head " + head.name + head.phone_number + head.email + size);
			//System.out.println("temp " + temp.name + temp.phone_number + temp.email + size);
			//System.out.println("temp " + temp.next.name + temp.next.phone_number + temp.next.email + size);
			//System.out.println("tail " + tail.name + tail.phone_number + tail.email + size);		
			head = temp.next;
			}
		} else {
			prev.next = temp.next;
			
			if(temp == tail) {
				tail = prev;
			}
			
		}
		temp = null;
		size--;
		ViewContacts();
		return;
	}
	
	public boolean isContactSizeZero(int contactSize) {
		if (contactSize == 0)
			return true;
		else
			return false;
	}
	
	public boolean isThereOneData() {
		if (head == tail)
			return true;
		else
			return false;
	}
	
	public boolean isitLastData(String dataname) {
		if (dataname == null)
			return true;
		else
			return false;
	}
}