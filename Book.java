class Book {
    static String title ;
    static String author ;
    static int pageCount;
    static String genre ;
    static int publicationYear ;

    public static void main(String[] args) {
	 String title = "To Kill a Mockingbird";
     String author = "Harper Lee";
     int pageCount = 336;
     String genre = "Fiction";
     int publicationYear = 1960;
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Page Count: " + pageCount);
        System.out.println("Genre: " + genre);
        System.out.println("Publication Year: " + publicationYear);
    }
}