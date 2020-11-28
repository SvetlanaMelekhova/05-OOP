package by.htp.task07.country;

/*Создать объект класса Государство, используя классы Область, Район, Город. Методы: вывести на консоль столицу, количество областей, площадь, областные центры.*/

import java.util.List;

public class View {
	
	
	public void viewCity (City city) {
		
		System.out.println ("Город: " + city);
	}
	
	public void viewDistricts (Region region ) {
		
		List <District> districts;
		districts = region.getDistricts();
		
		for (District district : districts) {
			
			System.out.println (district.toString());
		}
		
	}
	
	public void viewRegions (Country country) {
		
		List <Region> regions;
		regions = country.getRegions();
		
		for (Region region : regions ) {
			
			System.out.printf ("%8s %-12s %-12s %-12s", "Region: " ,region.getNameOfRegion() ,"; AreaOfSquare: " , region.getAreaOfLand());
			System.out.println();
		}
	}
	
	public void viewInformationAboutCountry (Country country, CountryLogic logic) {
		
		List <Region> regions;
		regions = country.getRegions();
		
		System.out.println ("This country is " + country.getNameOfCountry()+ ".");
		System.out.println (logic.findCapital(country) + " is a capital of " + country.getNameOfCountry() + ".");
		System.out.println ("Number of Regions is " + regions.size() + ".");
		System.out.println ("The country covers a total area of " + logic.areaOfLand(country) + " square kilometres.");
		System.out.println ("Regional centers: " + logic.findRegional(country) + ".");
	}
	
	

}
