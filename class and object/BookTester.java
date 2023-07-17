class BookTester{


        public static void main(String args[]){
		
		Books book = new Books();
		  book.name = "classmate";
		  		  book.size = "king";
		  book.price = 49.9;
		    book.gainKnowledge();
			System.out.println("The book name is"+book.name);
             			System.out.println("The book size is"+book.size);
									System.out.println("The book price is"+book.price);


				Books book1 = new Books();
		  book1.name = "signature";
		  		  book1.size = "small";
		  book1.price = 40;
		    book1.gainKnowledge();
			System.out.println("The book name is"+book1.name);
             			System.out.println("The book size is"+book1.size);
									System.out.println("The book price is"+book1.price);

		
		}




}