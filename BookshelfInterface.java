
public interface BookshelfInterface <Book> {
	public Book removeBook();
	public boolean addBook(Book newEntry);
	public boolean lendBook(Book Book, String person);
	public int getNumberOfBooks();
	public int copiesAvailable(Book Book);
	
	public boolean isFull();
	public boolean isEmpty();
	public void clear();
	public Book removeEntry(int givenIndex);
	public int getIndexOf(Book Book);
}
