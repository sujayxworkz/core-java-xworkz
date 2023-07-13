class Pant_69Tester{

public static void main(String args[]){

        Pant_69.addPant("jeans");
	    Pant_69.addPant("cotton");
        Pant_69.addPant("jersy");
        Pant_69.addPant("tornJeans");
        Pant_69.addPant("nightPant");
		
		Pant_69.updatePant("jersy","khadi");
		
		Pant_69.getPants();
		
		int newLength = Pant_69.deletePant("cotton");
		System.out.println("The new length is"+newLength);
		Pant_69.getthePantDeleted(newLength);

		String thePant= Pant_69.getPantByName("nightPant");
				System.out.println(thePant);

		
		
}


}