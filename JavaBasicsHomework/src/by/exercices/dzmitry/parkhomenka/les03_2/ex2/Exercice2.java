package by.exercices.dzmitry.parkhomenka.les03_2.ex2;

public class Exercice2 {

	public static void main(String[] args) {
		// создание ссылки на обьект типа Group
		Group group = new Group();

		// заполнение массива типа Student созданными ссылками на обьекты типа Student
		group.list[0] = new Student();
		group.list[1] = new Student();
		group.list[2] = new Student();

		// вызов метода определения средней оценки по группе
		int groupAvg = 0;
		groupAvg = group.avgGroup(group.list);

		// вызов метода определения количества студентов имеющих оценки 8, 9, 10
		int numberOfBest = 0;
		numberOfBest = group.list[0].bestNumber(group.list);

		// вызов метода определения количества студентов имеющих оценку 2
		int numberOfWorst = 0;
		numberOfWorst = group.list[0].worstNumber(group.list);

		// вывод на консоль среднего балла учебной группы
		System.out.println("Средняя оценка всей группы - " + groupAvg);
		System.out.println();

		// вывод на консоль среднего балла каждого студента + его 3 имеющиеся оценки для
		// наглядности
		System.out.println("Средняя оценка первого студента - " + group.list[0].avgMark() + " -- И его три оценки - "
				+ group.list[0].mark1 + " " + group.list[0].mark2 + " " + group.list[0].mark3);
		System.out.println("Средняя оценка второго студента - " + group.list[1].avgMark() + " -- И его три оценки - "
				+ group.list[1].mark1 + " " + group.list[1].mark2 + " " + group.list[1].mark3);
		System.out.println("Средняя оценка третьего студента - " + group.list[2].avgMark() + " -- И его три оценки - "
				+ group.list[2].mark1 + " " + group.list[2].mark2 + " " + group.list[2].mark3);
		System.out.println();

		// вывод количства отличников (студенты имеющие средний балл 8, 9, 10)
		System.out.println("Количество студентов имеющих средний балл 8, 9, 10 - " + numberOfBest);
		System.out.println();

		// вывод количества студентов имеющих оценки 2 и ниже
		System.out.println("Количество студентов имеющих оценки 2 и ниже - " + numberOfWorst);
	}
}
