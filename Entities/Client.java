package Entities;

public class Client {

	private String name;
	
	public Client() {
		
	}
	public Client(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String toString() {
		StringBuilder sb = new StringBuilder();
			sb.append("Name Client:"+"("+name+")");
		return sb.toString();
	}
}
