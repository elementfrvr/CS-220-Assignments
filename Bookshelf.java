
public class Bookshelf <Book> implements BookshelfInterface {
	private int numberOfBooks;
	private final int DEFAULT_CAPACITY= 10;
	private final int MAX_CAPACITY= 60;
	private Book[] bookshelf;
	
	//Constructor
	public Bookshelf()
		{
		bookshelf = (Book[]) new Object [DEFAULT_CAPACITY];
		
		}
	public Bookshelf(int capacity)
	{
		if (capacity <= MAX_CAPACITY)
			bookshelf = (Book[]) new Object [capacity];
		else
			bookshelf = (Book[]) new Object [MAX_CAPACITY];
	}
	//End of constructor
	

	public boolean addBook(Book newEntry) 
	{
		boolean result = true;
		if (isFull())
		{
			result = false;
		}
		else
		{
			bookshelf[numberOfBooks] = newEntry;
			numberOfBooks++;
		}
		return result;
	}

	public Book removeBook()
	{
	Book result = null;
	Book tempBook =bookshelf[numberOfBooks -1];
	if (numberOfBooks >0)
		{
		result = bookshelf[numberOfBooks -1];
		bookshelf[numberOfBooks-1] = null;
		numberOfBooks--;
		}
	return tempBook;
	}

	@Override
	public boolean lendBook(Book Book, String person) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int getNumberOfBooks() {
		return numberOfBooks;
	}

	@Override
	public int copiesAvailable(Book Book) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean isFull() {
		if (numberOfBooks == bookshelf.length)
			return true;
		else
		return false;
	}

	@Override
	public boolean isEmpty() {
		if (numberOfBooks == 0)
			return true;
		else
		return false;
	}

	public void clear() {
		while (!isEmpty())
			removeBook();
	}

	@Override
	public Book removeEntry(int givenIndex) {
		Book tempBook= bookshelf[givenIndex];
		bookshelf[givenIndex] = null;
		return tempBook;
		
	}
	@Override
	public int getIndexOf(Book Book) {
		// TODO Auto-generated method stub
		return 0;
	}

}
