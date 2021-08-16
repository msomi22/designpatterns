package day.six;

import java.util.*;

public class LinkedInTest1 {

	public static void main(String[] args) {
		String[] a = {"Test1","Test2","Test3"};
		Integer[] a2 = {10,50,100};
		Boolean[] a3 = {true, false, false, true};

		List<String> l1 = anyItemmap(new ArrayList<>(), a);
		List<Integer> l2 = anyItemmap(new ArrayList<>(), a2);
		List<Boolean> l3 = anyItemmap(new ArrayList<>(), a3);
		System.out.println(l1);
		System.out.println(l2);
		System.out.println(l3);
		item(a);
		Building building = new Building();
		Office office = new Office();
		build(building);
		build(office);
		List<Building> buildings = new ArrayList<>();
		printBuilding(buildings);
		List<Office> offices = new ArrayList<>();
		printBuilding(offices);
		
		List<House> houses = new ArrayList<>();
		addHouseToList(buildings);
		addHouseToList(houses);
		

	}
	//out variables
	static void addHouseToList(List<? super House> buildings) {
		buildings.add(new House());
		System.out.println();
	}
	
	static void build(Building building) {
		System.out.println("contructing a new " + building.toString());
	}
	
	//in variables
	static void printBuilding(List<? extends Building> buildings) {
		for(int i=0;i<buildings.size(); i++) {
			System.out.println(i + ": " + buildings.get(i).toString());
		}
	}

	private static <T> List<T> anyItemmap(List<T> list, T[] a) {
		for (T obj : a) {
			list.add(obj);
		}
		return list;
	}

	// varargs
	static void item(String... items) {
       for(int i=0;i<items.length;i++) {
    	   System.out.println("item " + items[i]);
       }
	}

}

