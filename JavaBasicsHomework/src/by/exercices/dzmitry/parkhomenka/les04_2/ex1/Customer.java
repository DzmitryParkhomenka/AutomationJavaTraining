package by.exercices.dzmitry.parkhomenka.les04_2.ex1;

public class Customer {
	private int id;
	private String cardNumber;
	private String bankNumber;
	private String surname;
	private String name;
	private String patron;
	private String address;


	public Customer() {
		id = 0;
		cardNumber = "";
		bankNumber = "";
		surname = "";
		name = "";
		patron = "";
		address = "";
	}

	public Customer(int _id, String _cardNumber, String _bankNumber, String _surname, String _name, String _patron,
			String _address) {
		id = _id;
		cardNumber = _cardNumber;
		bankNumber = _bankNumber;
		surname = _surname;
		name = _name;
		patron = _patron;
		address = _address;
	}

	@Override
	public String toString() {
		return "Id - " + this.id + "\nCard Number - " + this.cardNumber + "\nBank Number - " + this.bankNumber + "\nSurname - "
				+ this.surname + "\nName - " + this.name + "\nPatron - " + this.patron + "\nAddress - " + this.address;
	}
	
	public void show(Customer cust) {
		System.out.println(cust.toString());
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((address == null) ? 0 : address.hashCode());
		result = prime * result + ((bankNumber == null) ? 0 : bankNumber.hashCode());
		result = prime * result + ((cardNumber == null) ? 0 : cardNumber.hashCode());
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((patron == null) ? 0 : patron.hashCode());
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
		Customer other = (Customer) obj;
		if (address == null) {
			if (other.address != null)
				return false;
		} else if (!address.equals(other.address))
			return false;
		if (bankNumber == null) {
			if (other.bankNumber != null)
				return false;
		} else if (!bankNumber.equals(other.bankNumber))
			return false;
		if (cardNumber == null) {
			if (other.cardNumber != null)
				return false;
		} else if (!cardNumber.equals(other.cardNumber))
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
		if (surname == null) {
			if (other.surname != null)
				return false;
		} else if (!surname.equals(other.surname))
			return false;
		return true;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}

	public String getBankNumber() {
		return bankNumber;
	}

	public void setBankNumber(String bankNumber) {
		this.bankNumber = bankNumber;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPatron() {
		return patron;
	}

	public void setPatron(String patron) {
		this.patron = patron;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
}
