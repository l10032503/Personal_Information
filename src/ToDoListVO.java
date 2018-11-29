public class ToDoListVO {
	private String name;
	private long date;
	private long due;
	private String description;
	
	public ToDoListVO(String name, long date, long due, String description) {
		this.name=name;
		this.date=date;
		this.due=due;
		this.description=description;
	}
	//Getter,Setter
	public long getDate() {
		return date;
	}
	public void setDate(long date) {
		this.date=date;
	}
	
	public long getDue() {
		return due;
	}
	public void setDue(long due) {
		this.due=due;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name=name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description=description;
	}
}