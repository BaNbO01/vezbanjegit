package model;

import java.util.Objects;

public class Person {
	private String ime;
	private String prezime;
	private int age;
	public String getIme() {
		return ime;
	}
	public void setIme(String ime) {
		this.ime = ime;
	}
	public String getPrezime() {
		return prezime;
	}
	public void setPrezime(String prezime) {
		this.prezime = prezime;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Person(String ime, String prezime, int age) {
		this.ime = ime;
		this.prezime = prezime;
		this.age = age;
	}
	public Person() {
	}
	@Override
	public String toString() {
		return "Person [ime=" + ime + ", prezime=" + prezime + ", age=" + age + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(age, ime, prezime);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		return age == other.age && Objects.equals(ime, other.ime) && Objects.equals(prezime, other.prezime);
	}
	
	
}
