package by.exercices.dzmitry.parkhomenka.les05_2.ex1;

import java.util.ArrayList;
import java.util.List;

public class NoteBook {
	private List<Note> notes = new ArrayList<Note>();

	public NoteBook() {
	}

	public List<Note> getNotes() {
		return notes;
	}

	public void add(Note note) {
		notes.add(note);
	}

	public boolean delete(Note note) {
		return notes.remove(note);
	}

	public Note findByContent(String content) {
		for (Note note : notes) {
			if (note.getNote().equals(content)) {
				return note;
			}
		}
		return null;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (this.getClass() != obj.getClass()) {
			return false;
		}
		NoteBook other = (NoteBook) obj;
		if (notes == null) {
			if (other.notes != null)
				return false;
		} else if (!notes.equals(other.notes))
			return false;
		return true;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((notes == null) ? 0 : notes.hashCode());
		return result;
	}

	@Override
	public String toString() {
		String result = null;
		for (Note note : notes) {
			result += note.getNote();
		}
		return result;
	}

}