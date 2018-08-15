package by.exercices.dzmitry.parkhomenka.les04_2.ex4;

import java.util.ArrayList;

public class List {
	private ArrayList<Abiturient> abiturient = new ArrayList<Abiturient>();
	
	public List() {
		
	}
	
	public ArrayList<Abiturient> getAbiturient(){
		return abiturient;
	}
	
	public void add(Abiturient abit) {
		abiturient.add(abit);
	}
	
	public boolean delete(Abiturient abit) {
		return abiturient.remove(abit);
	}
	
}