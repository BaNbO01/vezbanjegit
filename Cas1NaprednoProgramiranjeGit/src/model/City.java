package model;

import java.util.Objects;

public class City {
	private String naziv;
	private String zipcode;
	public City(String naziv, String zipcode) {
		super();
		this.naziv = naziv;
		this.zipcode = zipcode;
	}
	public City() {
		super();
	}
	public String getNaziv() {
		return naziv;
	}
	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}
	public String getZipcode() {
		return zipcode;
	}
	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}
	@Override
	public String toString() {
		return "City [naziv=" + naziv + ", zipcode=" + zipcode + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(naziv, zipcode);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		City other = (City) obj;
		return Objects.equals(naziv, other.naziv) && Objects.equals(zipcode, other.zipcode);
	}
	
	
}
