package com.codeo.obj;

public class Building {
	int noOfWindows;//0==>3
	String color;//null==>blue=>Orange
	double carpetArea;//0.0
	
	//3,"blue",2345.65
	//3,"orange",2345.65
	public Building(int noOfWindow, String color, double carpetArea) {
		//0<==3
		noOfWindows = noOfWindow;
		//null<==Blue<==Orange
		this.color = color;
		this.carpetArea = carpetArea;
	}

	public Building() {
	System.out.println("Default constructor call: ");
	}

	public static void main(String[] args) {
	    Building building=new Building();
		//50 Buildings ==> 50*3==> 150
		Building building1=new Building(3,"blue",2345.65);
		System.out.println(building1.noOfWindows+" "+building1.color+" "+building1.carpetArea);
		Building building2=new Building(3,"orange",2345.65);
		System.out.println(building2.noOfWindows+" "+building2.color+" "+building2.carpetArea);
		Building building3=new Building(4,"green",2345.65);
		Building building4=new Building(8,"white",2345.65);
	}

	

}
