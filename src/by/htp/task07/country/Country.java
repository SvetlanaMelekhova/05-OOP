package by.htp.task07.country;

import java.util.List;
import java.util.ArrayList;

public class Country {
	
	private String nameOfCountry;
	private List <Region> regions;
	
	public Country () {
		
	}
	
	public Country (String nameOfCountry) {
		this.nameOfCountry = nameOfCountry;
		regions = new ArrayList <Region>();
	}

	public String getNameOfCountry() {
		return nameOfCountry;
	}

	public void setNameOfCountry(String nameOfCountry) {
		this.nameOfCountry = nameOfCountry;
	}
	
	public void addRegions (Region region) {
		
		regions.add(region);
	}
	
	public List<Region> getRegions () {
		
		return regions;
	}
	
	public int sizeRegions (List <Region> regions) {
		
		return regions.size();
		
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nameOfCountry == null) ? 0 : nameOfCountry.hashCode());
		result = prime * result + ((regions == null) ? 0 : regions.hashCode());
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
		Country other = (Country) obj;
		if (nameOfCountry == null) {
			if (other.nameOfCountry != null)
				return false;
		} else if (!nameOfCountry.equals(other.nameOfCountry))
			return false;
		if (regions == null) {
			if (other.regions != null)
				return false;
		} else if (!regions.equals(other.regions))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return  nameOfCountry +  regions ;
	}
	
	

}
