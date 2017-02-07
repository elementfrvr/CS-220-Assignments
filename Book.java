public class Book {
	public String title;
	public int year;
	
	public Book(String title, int year) {
		this.title = title;
		this.year = year;
	}
	
	public boolean equals(Book other) {
		return title == other.title && this.year == other.year;
	}
}