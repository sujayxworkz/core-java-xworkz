class TicketBookingTester{

          public static void main(String args[]){
		  
		  
		   TicketBooking ticketbook = new TicketBooking();
		  
		    ticketbook.setBookingId(214);
			ticketbook.setNoOfSeats(2);
			ticketbook.setSource("mysore");
			ticketbook.setDestination("solapur");
			ticketbook.setDate("25-12-2023");
			ticketbook.setTimings("13:30pm");
			ticketbook.setPnrStatus(245315875L);
			ticketbook.setPrice(654.21);
			ticketbook.setClassType("sleeper");
			ticketbook.setBookingType("online");
			
System.out.println(ticketbook.getBookingId()+" "+ticketbook.getNoOfSeats()+" "+ticketbook.getSource()+" "+ticketbook.getDestination()+" "+ticketbook.getDate()+" "+ticketbook.getTimings()+" "+ticketbook.getPnrStatus()+" "+ticketbook.getPrice()+" "+ticketbook.getClassType()+" "+ticketbook.getBookingType());
		  
		  
		  }

}