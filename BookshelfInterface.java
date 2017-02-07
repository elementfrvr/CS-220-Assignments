
public interface BookshelfInterface <T> {
	public T removeBook();
	public boolean addBook(T newEntry);
	public boolean lendBook(T book, String person);
	public int getNumberOfBooks();
	public int copiesAvailable(T book);
	
	public boolean isFull();
	public boolean isEmpty();
	public void clear();
	public T removeEntry(int givenIndex);
	public int getIndexOf(T book);
}
