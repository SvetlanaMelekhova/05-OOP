package by.htp.task07.country;
/*Создать объект класса Государство, используя классы Область, Район, Город. Методы: вывести на консоль столицу, количество областей, площадь, областные центры.*/

public class Main {

	public static void main(String[] args) {
		
		City city1 = new City ("Minsk", true , true);
		City city2 = new City ("Gomel", true, false);
		City city3 = new City ("Grodno", true, false);
		City city4 = new City ("Mogilev", true, false);
		City city5 = new City ("Kostyukovichi", false, false);
		City city6 = new City ("Brest", true, false);
		City city7 = new City ("Baranovichi", false, false);
		City city8 = new City ("Vitebsk", true, false);
		City city9 = new City ("Verhnedvinsk", false, false);
		City city10 = new City ("Svetlogorsk", false, false);
		City city11 = new City ("Borisov", false, false);
		
		District district1 = new District ("Minskiy");
		District district2 = new District ("Gomel'skiy");
		District district3 = new District ("Grodnenskiy");
		District district4 = new District ("Mogilevskiy");
		District district5 = new District ("Kostyukovichskiy");
		District district6 = new District ("Brestskiy");
		District district7 = new District ("Baranovichskiy");
		District district8 = new District ("Vitebskiy");
		District district9 = new District ("Verhnedvinskiy");
		District district10 = new District ("Svetlogorskiy");
		District district11 = new District ("Borisovskiy");
		
		district1.addCity(city1);
		district2.addCity(city2);
		district3.addCity(city3);
		district4.addCity(city4);
		district5.addCity(city5);
		district6.addCity(city6);
		district7.addCity(city7);
		district8.addCity(city8);
		district9.addCity(city9);
		district10.addCity(city10);
		district11.addCity(city11);
		
		Region region1 = new Region ("Brestskaya", 32.786);
		Region region2 = new Region ("Vitebskaya", 40.051);
		Region region3 = new Region ("Gomel'skaya", 40.372);
		Region region4 = new Region ("Grodnenskaya", 25.127);
		Region region5 = new Region ("Minskaya", 39.854);
		Region region6 = new Region ("Mogilevskaya", 29.068);
		
		region1.addDistricts(district6);
		region1.addDistricts(district7);
		
		region2.addDistricts(district8);
		region2.addDistricts(district9);
		
		region3.addDistricts(district2);
		region3.addDistricts(district10);
		
		region4.addDistricts(district3);
		
		region5.addDistricts(district1);
		region5.addDistricts(district11);
		
		region6.addDistricts(district4);
		region6.addDistricts(district5);
		
		View print = new View ();
		
		//print.viewDistricts(region1);
		
		Country country = new Country ("Republic of Belarus");
		
		country.addRegions(region1);
		country.addRegions(region2);
		country.addRegions(region3);
		country.addRegions(region4);
		country.addRegions(region5);
		country.addRegions(region6);
		
		//print.viewRegions(country);
		
		CountryLogic logic = new CountryLogic ();
		
		//System.out.println(logic.findCapital(country));
		//System.out.println(logic.findRegional(country));
		//System.out.println(logic.areaOfLand(country));
		
		print.viewInformationAboutCountry(country, logic);
	}

}
