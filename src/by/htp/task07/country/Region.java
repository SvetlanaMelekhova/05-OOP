package by.htp.task07.country;

import java.util.List;
import java.util.ArrayList; 


/*Методы: вывести на консоль столицу, количество областей, площадь, областные центры.*/


public class Region {
	
	private String nameOfRegion;
	private List <District> districts;
	private double areaOfLand;
	
	
	public Region () {
		
	}
	
	public Region (String nameOfRegion , double areaOfLand ) {
		this.nameOfRegion = nameOfRegion;
		this.areaOfLand = areaOfLand;
		districts = new ArrayList<District>();
		
	}

	public String getNameOfRegion() {
		return nameOfRegion;
	}

	public void setNameOfRegion(String nameOfRegion) {
		this.nameOfRegion = nameOfRegion;
	}
	
	public double getAreaOfLand() {
		return areaOfLand;
	}

	public void setAreaOfLand(double areaOfLand) {
		this.areaOfLand = areaOfLand;
	}

	public void addDistricts (District district) {
		
		districts.add(district);
	}
	
	public List<District> getDistricts () {
		
		return districts;
		
	}
	
	public void setDistricts(List<District> districts) {
		
		this.districts = districts;
	}
	
	public int sizeDistricts (List<District> districts) {
		
		return districts.size();
		
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(areaOfLand);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((districts == null) ? 0 : districts.hashCode());
		result = prime * result + ((nameOfRegion == null) ? 0 : nameOfRegion.hashCode());
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
		Region other = (Region) obj;
		if (Double.doubleToLongBits(areaOfLand) != Double.doubleToLongBits(other.areaOfLand))
			return false;
		if (districts == null) {
			if (other.districts != null)
				return false;
		} else if (!districts.equals(other.districts))
			return false;
		if (nameOfRegion == null) {
			if (other.nameOfRegion != null)
				return false;
		} else if (!nameOfRegion.equals(other.nameOfRegion))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return  nameOfRegion + districts +areaOfLand ;
	}
	
	
	
	
	
	
	
	

}
