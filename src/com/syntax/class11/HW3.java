package com.syntax.class11;

public class HW3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Create an array of countries
		 * While retrieving all values from an array print capital for wach country
		 */
	//1st way-easiest
		String[] countries= {"USA", "Ukraine", "Canada"};
		String[] capitals= {"DC", "Kyiv", "Ottawa"};
		
		for(int v=0; v<countries.length; v++) {
			System.out.println("The capital of "+countries[v]+ " is "+capitals[v]);
		}
		
		System.out.println("----------------");
		//2nd way =safest way
		String capital;
		
		for(String country:countries) {
			
			switch(country) {
			
			case "USA":
				capital="DC";
				break;
			case "Ukraine":
				capital="Kiev";
				break;
			case "Canada":
			capital="Ottawa";
				break;
				default:
				capital="I do not know";
				
				
			}
			System.out.println("Capital of the "+country+ " is "+capital);
			
		}
	}

}
