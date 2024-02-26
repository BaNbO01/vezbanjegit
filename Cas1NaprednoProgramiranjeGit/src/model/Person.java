package model;

import java.util.Objects;

public class Person {
	private String ime;
	private String prezime;
	private int godina;
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
	public int getGodina() {
		return godina;
	}
	public void setGodina(int godina) {
		this.godina = godina;
	}
	public Person(String ime, String prezime, int godina) {
		this.ime = ime;
		this.prezime = prezime;
		this.godina = godina;
	}
	public Person() {
	}
	@Override
	public String toString() {
		return "Person [ime=" + ime + ", prezime=" + prezime + ", godina=" + godina + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(godina, ime, prezime);
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
		return godina == other.godina && Objects.equals(ime, other.ime) && Objects.equals(prezime, other.prezime);
	}
	
	
}
