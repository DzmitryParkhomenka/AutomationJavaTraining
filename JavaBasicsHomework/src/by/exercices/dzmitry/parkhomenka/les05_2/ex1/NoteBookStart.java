package by.exercices.dzmitry.parkhomenka.les05_2.ex1;

import java.util.List;

public class NoteBookStart {
	public static void main(String[] args) {
		NoteBook myNoteBook = new NoteBook();
		myNoteBook.add(new Note("content1", new Data(1, 1, 2001)));
		myNoteBook.add(new Note("content2", new Data(2, 2, 2001)));
		myNoteBook.add(new Note("content3", new Data(3, 3, 2001)));

		Note findNote = myNoteBook.findByContent("content2");
		if (findNote != null) {
			print(findNote);
		}
		print(myNoteBook);
	}

	public static void print(NoteBook noteBook) {
		List<Note> printNotes = noteBook.getNotes();
		System.out.println("Notebook: ");
		for (int i = 0; i < printNotes.size(); i++) {
			Note note = printNotes.get(i);
			print(note);
		}
	}

	public static void print(Note note) {
		System.out.println("Note : " + note.getNote() + "[" + note.getData().getDay() + "/" + note.getData().getMonth()
				+ "/" + note.getData().getYear() + "].");
	}
}
