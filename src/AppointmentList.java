import java.util.ArrayList;

class AppointmentList {
	ArrayList<ListItem> appointments = new ArrayList<>();
	
	static class ListItem {
		String appointmentName, date, location;
		int peopleNum;
	}
	

	public void addListItem(ListItem item, int index) {
		if(index == -1) {
			appointments.add(item);
		}
		else {
			appointments.add(index, item);
			appointments.remove(index + 1);
		}
	}
	
	public void printList() {
		System.out.println("Name\t date\t location\t people");
		System.out.println("===================================================");
		for(int i = 0; i < appointments.size(); i++) {
			System.out.println(appointments.get(i).appointmentName + "\t "
								+ appointments.get(i).date + "\t "
								+ appointments.get(i).location + "\t "
								+ appointments.get(i).peopleNum);
		}
	}
	
	public int searchListItem(String searchKey) {
		int result = -1;
		
		for(int i = 0; i < appointments.size(); i++) {
			boolean discovery = searchKey.equals(appointments.get(i).appointmentName);
			if(discovery == true) {
				result = i;
				break;
			}
		}
		return result;
	}
	
	public void deleteListItem(int index) {
		appointments.remove(index);
	}
}
