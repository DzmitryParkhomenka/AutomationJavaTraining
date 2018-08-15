package by.exercices.dzmitry.parkhomenka.les03_2.ex2;

public class Group {
	// массив типа Student для хранения ссылок на обьекты класса Student
	Student[] list = new Student[3];

	// определение средней оценки по всей группе
	public int avgGroup(Student[] list) {
		int[] avgGrMark = new int[3];
		for (int i = 0; i < list.length; i++) {
			avgGrMark[i] = list[i].avgMark();
		}
		int avg;
		avg = (avgGrMark[0] + avgGrMark[1] + avgGrMark[2]) / 3;
		return avg;
	}
}