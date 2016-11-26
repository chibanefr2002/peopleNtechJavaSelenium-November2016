package classNobject;

import office.OfficeSpace;

public class House {
	//variables
	public int address = 10;
	public String houseName;
	
	//constructor1
	public House(){
		
	}
	//constructor2
		public House(String houseName){
			this.houseName = houseName;			
		}
	//constructor3
		//public House(String houseName, int address){
			//this.houseName.
	
	//methods
		public void setHouseName(String houseName){
			this.houseName = houseName;
		}
	public void watchTVShows(){
		System.out.println("Watching Game of Thrones");
	}
	public void sleep(){
		System.out.println("People sleeps at bed room");
	}
    public int addHouseSize(int length, int height){
    	int total = length + height;
    	
    	return total;
    }
}
