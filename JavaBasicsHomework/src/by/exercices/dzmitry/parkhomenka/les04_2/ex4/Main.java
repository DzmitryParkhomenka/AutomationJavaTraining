package by.exercices.dzmitry.parkhomenka.les04_2.ex4;

public class Main {

	public static void main(String[] args) {
		//Добавление новых абитуриентов и их оценок
		Abiturient abit1 = new Abiturient("Dmitry", 8, 9, 10);
		Abiturient abit2 = new Abiturient("Egor", 5, 6, 7);
		Abiturient abit3 = new Abiturient("Kirill", 3, 4, 5);
		Abiturient abit4 = new Abiturient("Lena", 7, 8, 9);
		
		Logic log = new Logic();
		List list = new List();
		
		//Сейчас в списке 3 абитуриента
		list.add(abit1);
		list.add(abit2);
		list.add(abit3);
		
		//Если добавить четвертого, появится сообщение, что мы не можем принять столько абитуриентов
		//list.add(abit4);
	
		//Проверка количества абитуриентов. Можем принять только 3 абитуриентов
		log.passOrNot(list.getAbiturient(), 3);
	}

}