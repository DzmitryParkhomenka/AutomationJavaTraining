package by.exercices.dzmitry.parkhomenka.les04_2.ex1;

public class Student {
	private int id;
	private int phoneNumber;
	private int course;
	private String surname;
	private String name;
	private String patron;
	private String birthDate;
	private String address;
	private String faculty;

	public Student() {
		id = 0;
		phoneNumber = 0;
		course = 0;
		surname = "";
		name = "";
		patron = "";
		birthDate = "";
		address = "";
		faculty = "";
	}

	public Student(int _id, int _phoneNumber, int _course, String _surname, String _name, String _patron,
			String _birthDate, String _address, String _faculty) {
		id = _id;
		phoneNumber = _phoneNumber;
		course = _course;
		surname = _surname;
		name = _name;
		patron = _patron;
		birthDate = _birthDate;
		address = _address;
		faculty = _faculty;
	}

	@Override
	public String toString() {
		return "Id - " + this.id + "\nPhone - " + this.phoneNumber + "\nCourse - " + this.course + "\nSurname - "
				+ this.surname + "\nName - " + this.name + "\nPatron - " + this.patron + "\nDate of birth - "
				+ this.birthDate + "\nAddress - " + this.address + "\nFaculty - " + this.faculty;
	}
	
	public void show(Student std) {
		System.out.println(std.toString());
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((address == null) ? 0 : address.hashCode());
		result = prime * result + ((birthDate == null) ? 0 : birthDate.hashCode());
		result = prime * result + course;
		result = prime * result + ((faculty == null) ? 0 : faculty.hashCode());
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((patron == null) ? 0 : patron.hashCode());
		result = prime * result + phoneNumber;
		result = prime * result + ((surname == null) ? 0 : surname.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (address == null) {
			if (other.address != null)
				return false;
		} else if (!address.equals(other.address))
			return false;
		if (birthDate == null) {
			if (other.birthDate != null)
				return false;
		} else if (!birthDate.equals(other.birthDate))
			return false;
		if (course != other.course)
			return false;
		if (faculty == null) {
			if (other.faculty != null)
				return false;
		} else if (!faculty.equals(other.faculty))
			return false;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (patron == null) {
			if (other.patron != null)
				return false;
		} else if (!patron.equals(other.patron))
			return false;
		if (phoneNumber != other.phoneNumber)
			return false;
		if (surname == null) {
			if (other.surname != null)
				return false;
		} else if (!surname.equals(other.surname))
			return false;
		return true;
	}

	public void setId(int _id) {
		this.id = _id;
	}

	public int getId() {
		return id;
	}

	public void setPhoneNumber(int _phoneNumber) {
		this.phoneNumber = _phoneNumber;
	}

	public int getPhoneNumber() {
		return phoneNumber;
	}

	public void setCourse(int _course) {
		this.course = _course;
	}

	public int getCourse() {
		return course;
	}

	public void setSurname(String _surname) {
		this.surname = _surname;
	}

	public String getSurname() {
		return surname;
	}

	public void setName(String _name) {
		this.name = _name;
	}

	public String getName() {
		return name;
	}

	public void setPatron(String _patron) {
		this.patron = _patron;
	}

	public String getPatron() {
		return patron;
	}

	public void setBirthDate(String _birthDate) {
		this.birthDate = _birthDate;
	}

	public String getBirthDate() {
		return birthDate;
	}

	public void setAddress(String _address) {
		this.address = _address;
	}

	public String getAddress() {
		return address;
	}

	public void setFaculty(String _faculty) {
		this.faculty = _faculty;
	}

	public String getFaculty() {
		return faculty;
	}

}
