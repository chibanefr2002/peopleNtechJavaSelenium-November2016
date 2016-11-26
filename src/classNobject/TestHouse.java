package classNobject;

import office.OfficeSpace;

public class TestHouse {
	public static void main(String[] args){
		//myHouse.setHouseName("Whitehouse");
		House myHouse = new House("Whitehouse");
		System.out.println(myHouse.houseName);
		myHouse.watchTVShows();
		myHouse.sleep();
		int totalSize = myHouse.addHouseSize(1120,15);
		System.out.println(totalSize);
		OfficeSpace os = new OfficeSpace();
	    os.officeLocation();
	}

}
