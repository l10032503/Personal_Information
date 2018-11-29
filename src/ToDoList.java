import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
public class ToDoList {
	private int input;
	private List<ToDoListVO> todolist_ArrayList;
	private ToDoListVO todolist_information;
	private Scanner scan;
	public int i=0;
	
	public ToDoList() {
		this.todolist_ArrayList=new ArrayList<ToDoListVO>();
		this.input=0;
		
		this.todolist_information=new ToDoListVO("", 0, 0, "");
		this.scan=new Scanner(System.in);
	}
	//Getter,Setter-todolist_ArrayList
	public List<ToDoListVO> getTodolist_ArrayList(){
		return todolist_ArrayList;
	}
	public void setTodolist_ArrayList(List<ToDoListVO>todolist_ArrayList) {
		this.todolist_ArrayList=todolist_ArrayList;
	}
	//Getter,Setter-input
	public int getInput() {
		return this.input;
	}
	public void setInput(int input) {
		this.input=input;
	}
	//Add
	public String toString() {
		return todolist_information.getName()+todolist_information.getDate()+todolist_information.getDue()+todolist_information.getDescription();
	}
	

	public void startProgram() {

		while(true) {
			System.out.println("0.Main Menu");
			System.out.println("1.Create");
			System.out.println("2.View");
			System.out.println("3.Update");
			System.out.println("4.Delete");
			System.out.print("Choice number");
			this.setInput(scan.nextInt());
			if(input==1) {
				//System.out.println(getInput());
				ToDoListCreate(todolist_information,todolist_ArrayList);				
			}
			else if(input==2) {
				ToDoListView(todolist_information,todolist_ArrayList);
			}
		}
		
	}
	public ToDoListVO inputInfo(ToDoListVO todolist_information) {
		System.out.print("name: ");
		todolist_information.setName(scan.next());
		System.out.print("date(YYMMDD): ");
		todolist_information.setDate(scan.nextLong());
		System.out.print("due(YYMMDD): ");
		todolist_information.setDue(scan.nextLong());		
		System.out.print("description: ");
		todolist_information.setDescription(scan.next());
		/*todolist_information.setName("ss");
		todolist_information.setDescription("ss");
		todolist_information.setDate(0);
		todolist_information.setDue(0);*/

		return todolist_information;
	}
	public void ToDoListCreate(ToDoListVO ti, List<ToDoListVO> todolist_ArrayList) {
		ToDoListVO todolist_information = new ToDoListVO(ti.getName(), ti.getDate(), ti.getDue(), ti.getDescription());
		this.inputInfo(todolist_information);
		todolist_ArrayList.add(todolist_information);
		//todolist_ArrayList.add(todolist_information(todolist_information.getName(),todolist_information.getDate(),todolist_information.getDue(),todolist_information.getDescription()));
		//todolist_ArrayList.add(new ToDoListVO(todolist_information.getName(), todolist_information.getDate(), todolist_information.getDue(), todolist_information.getDescription()));
		//todolist_ArrayList.add(new ToDoListVO("1",0,0,"1"));
		//System.out.println(todolist_information.getName()+todolist_information.getDate()+todolist_information.getDue()+todolist_information.getDescription());

		//System.out.println(todolist_ArrayList.get(i).toString());

		//todolist_ArrayList.add(new ToDoListVO());

	}

	public void ToDoListView(ToDoListVO todolist_information,List<ToDoListVO> todolist_ArrayList){
		System.out.println("name\t\tdate\tdue\tdescription\t\t\t");
		System.out.println("===================================================");
		/*for(ToDoListVO vo:this.getTodolist_ArrayList()) {
			System.out.println(vo.getName()+vo.getDate()+vo.getDue()+vo.getDescription());
		}*/
//		System.out.println(todolist_ArrayList.size());
		//System.out.println(todolist_information.getName()+todolist_information.getDate()+todolist_information.getDue()+todolist_information.getDescription());


		for(int i=0; i<todolist_ArrayList.size();i++) {
			//System.out.println(todolist_information.getName()+todolist_information.getDate()+todolist_information.getDue()+todolist_information.getDescription());
			System.out.println(todolist_ArrayList.get(i).getName() + "\t" 
			+ todolist_ArrayList.get(i).getDate() + "\t" 
			+ todolist_ArrayList.get(i).getDue() + "\t"
			+ todolist_ArrayList.get(i).getDescription());
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		ToDoList todolist_Program = new ToDoList();
		todolist_Program.startProgram();
	}

}