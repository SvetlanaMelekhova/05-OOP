package by.htp.task07.country;

/*Создать объект класса Государство, используя классы Область, Район, Город. Методы: вывести на консоль столицу, количество областей, площадь, областные центры.*/

public class City {
	
	private String nameOfCity;
	private boolean regionCenter = false;
	private boolean capital = false;
	
	public City () {
	}
	
	public City (String nameOfCity , boolean regionCenter , boolean capital ) {
		this.nameOfCity = nameOfCity;
		this.regionCenter = regionCenter;
		this.capital = capital;
	}

	public String getNameOfCity() {
		return nameOfCity;
	}

	public void setNameOfCity(String nameOfCity) {
		this.nameOfCity = nameOfCity;
	}
	
	public boolean isRegionCenter() {
		return regionCenter;
	}

	public void setRegionCenter(boolean regionCenter) {
		this.regionCenter = regionCenter;
	}

	public boolean isCapital() {
		return capital;
	}

	public void setCapital(boolean capital) {
		this.capital = capital;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (capital ? 1231 : 1237);
		result = prime * result + ((nameOfCity == null) ? 0 : nameOfCity.hashCode());
		result = prime * result + (regionCenter ? 1231 : 1237);
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
		City other = (City) obj;
		if (capital != other.capital)
			return false;
		if (nameOfCity == null) {
			if (other.nameOfCity != null)
				return false;
		} else if (!nameOfCity.equals(other.nameOfCity))
			return false;
		if (regionCenter != other.regionCenter)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return nameOfCity ;
	}

	
	
	
	

}
