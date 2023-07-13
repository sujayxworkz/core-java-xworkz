class McDonald {
	public static int search(String foodName){
		if(foodName=="Peri Peri Chicken"){
			System.out.println(foodName);
			return 499;
		}
		if(foodName=="Chicken Strips"){
			System.out.println(foodName);
			return 299;
		}
		if(foodName=="Classic Chicken Roll"){
			System.out.println(foodName);
			return 176;
		}
		if(foodName=="Farmhouse Pizza"){
			return 479;
		}
		if(foodName=="Non Veg Loaded"){
			return 169;
		}
		if(foodName=="margherita Pizza"){
			return 259;
		}
		if(foodName=="Samosa"){
			return 50;
		}
		if(foodName=="Sandwich"){
			return 100;
		}
		if(foodName=="Momos"){
			return 150;
		}
		if(foodName=="Chicken Biriyani"){
			return 200;
		}
		if(foodName=="Mutton Biriyani"){
			return 300;
		}
		if(foodName=="Chilly Chicken"){
			return 250;
		}
		if(foodName=="Chicken 65"){
			return 245;
		}
		if(foodName=="Chicken Lollypop"){
			return 250;
		}
		if(foodName=="Parota"){
			return 300;
		}
		if(foodName=="Thandoori"){
			return 234;
		}
		if(foodName=="Chapathi"){
			return 243;
		}
		if(foodName=="Curd Rice"){
			return 242;
		}
		if(foodName=="Tomato Rice"){
			return 323;
		}
		if(foodName=="Khaju Masala"){
			return 432;
		}
		if(foodName=="Panneer Masala"){
			return 234;
		}
		if(foodName=="Mashroom masala"){
			return 545;
		}
		if(foodName=="Egg rice"){
			return 343;
		}
		if(foodName=="Omlette"){
			return 234;
		}
		if(foodName=="Prons"){
			return 543;
		}
		if(foodName=="Gobi"){
			return 234;
		}
		return 0;
	}
	public static int search(String foodName,int quantity){
		if(foodName=="Peri Peri Chicken"){
			System.out.println(foodName);
			return 499*quantity;
		}
		if(foodName=="Chicken Strips"){
			System.out.println(foodName);
			return 299*quantity;
		}
		if(foodName=="Classic Chicken Roll"){
			System.out.println(foodName);
			return 176*quantity;
		}
		if(foodName=="Farmhouse Pizza"){
			return 479*quantity;
		}
		if(foodName=="Non Veg Loaded"){
			return 169*quantity;
		}
		if(foodName=="margherita Pizza"){
			return 259*quantity;
		}
		if(foodName=="Samosa"){
			return 50*quantity;
		}
		if(foodName=="Sandwich"){
			return 100*quantity;
		}
		if(foodName=="Momos"){
			return 150*quantity;
		}
		if(foodName=="Chicken Biriyani"){
			return 200*quantity;
		}
		if(foodName=="Mutton Biriyani"){
			return 300*quantity;
		}
		if(foodName=="Chilly Chicken"){
			return 250*quantity;
		}
		if(foodName=="Chicken 65"){
			return 245*quantity;
		}
		if(foodName=="Chicken Lollypop"){
			return 250*quantity;
		}
		if(foodName=="Parota"){
			return 300*quantity;
		}
		if(foodName=="Thandoori"){
			return 234*quantity;
		}
		if(foodName=="Chapathi"){
			return 243*quantity;
		}
		if(foodName=="Curd Rice"){
			return 242*quantity;
		}
		if(foodName=="Tomato Rice"){
			return 323*quantity;
		}
		if(foodName=="Khaju Masala"){
			return 432*quantity;
		}
		if(foodName=="Panneer Masala"){
			return 234*quantity;
		}
		if(foodName=="Mashroom masala"){
			return 545*quantity;
		}
		if(foodName=="Egg rice"){
			return 343*quantity;
		}
		if(foodName=="Omlette"){
			return 234*quantity;
		}
		if(foodName=="Prons"){
			return 543*quantity;
		}
		if(foodName=="Gobi"){
			return 234*quantity;
		}
		return 0;
	}
}