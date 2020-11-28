package by.htp.task07.country;

import java.util.ArrayList;
import java.util.List;

public class District {
	
	private String nameOfDistrict;
	private List<City> cities;
	
	public District () {
		
	}
	
	public District (String nameOfDistrict) {
		
		this.nameOfDistrict = nameOfDistrict;
		cities = new ArrayList <City>();
	}

	public String getNameOfDistrict() {
		return nameOfDistrict;
	}

	public void setNameOfDistrict(String nameOfDistrict) {
		this.nameOfDistrict = nameOfDistrict;
	}
	
	public List<City> getCities() {
		return cities;
	}

	public void setCities(List<City> cities) {
		this.cities = cities;
	}

	public void addCity(City city) {
		cities.add(city);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cities == null) ? 0 : cities.hashCode());
		result = prime * result + ((nameOfDistrict == null) ? 0 : nameOfDistrict.hashCode());
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
		District other = (District) obj;
		if (cities == null) {
			if (other.cities != null)
				return false;
		} else if (!cities.equals(other.cities))
			return false;
		if (nameOfDistrict == null) {
			if (other.nameOfDistrict != null)
				return false;
		} else if (!nameOfDistrict.equals(other.nameOfDistrict))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "District " + nameOfDistrict ;
	}
	
	
	
	

}
