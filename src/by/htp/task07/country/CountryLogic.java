package by.htp.task07.country;

import java.util.ArrayList;
import java.util.List;

/*Создать объект класса Государство, используя классы Область, Район, Город. Методы: вывести на консоль столицу, количество областей, площадь, областные центры.*/

public class CountryLogic {

	public CountryLogic() {

	}

	public City findCapital(Country country) {

		for (Region region : country.getRegions()) {
			for (District district : region.getDistricts()) {
				for (City city : district.getCities()) {
					if (city.isCapital()) {
						return city;
					}
				}
			}
		}

		return null;
	}
	   public List<City> findRegional(Country country) {
	        List<City> cities = new ArrayList<>();

	        for(Region region : country.getRegions()) {
	            for(District district : region.getDistricts()) {
	                for(City city : district.getCities()) {
	                    if(city.isRegionCenter()) {
	                        cities.add(city);
	                    }
	                }
	            }
	        }
	        return cities;
	    }

	    public double areaOfLand(Country country) {
	    	
	        double square = 0;
	        List <Region> regions = country.getRegions();

	        for(Region region : regions) {
	        	
	            square = square + region.getAreaOfLand();
	        }
	        
	        return square;
	    }

}
