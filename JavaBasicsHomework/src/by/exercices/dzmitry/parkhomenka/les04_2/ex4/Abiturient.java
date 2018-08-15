package by.exercices.dzmitry.parkhomenka.les04_2.ex4;

public class Abiturient {
	private String name;
	private int mark1;
	private int mark2;
	private int mark3;

	public Abiturient() {
		this.name = "";
		this.mark1 = 0;
		this.mark2 = 0;
		this.mark3 = 0;
	}
	
	public Abiturient(String name, int mark1, int mark2, int mark3) {
		this.name = name;
		this.mark1 = mark1;
		this.mark2 = mark2;
		this.mark3 = mark3;
	}
	
	@Override
	public String toString() {
		return "Name - " + this.name + "\nMark 1 - " + this.mark1 + "\nMark 2 - " + this.mark2 + "\nMark 3 - " + this.mark3; 
	}
		
	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public int getMark1() {
		return mark1;
	}

	public void setMark1(int mark1) {
		this.mark1 = mark1;
	}

	public int getMark2() {
		return mark2;
	}

	public void setMark2(int mark2) {
		this.mark2 = mark2;
	}

	public int getMark3() {
		return mark3;
	}

	public void setMark3(int mark3) {
		this.mark3 = mark3;
	}

}