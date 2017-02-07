
public class Bookshelf <T> implements BookshelfInterface {
	private int numberOfBooks;
	private final int DEFAULT_CAPACITY= 10;
	private final int MAX_CAPACITY= 60;
	private T[] bookshelf;
	
	//Constructor
	public Bookshelf()
		{
		bookshelf = (T[]) new Object [DEFAULT_CAPACITY];
		
		}
	public Bookshelf(int capacity)
	{
		if (capacity <= MAX_CAPACITY)
			bookshelf = (T[]) new Object [capacity];
		else
			bookshelf = (T[]) new Object [MAX_CAPACITY];
	}
	//End of constructor
	

	public boolean addBook(T newEntry) 
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

	public T removeBook()
	{
	T result = null;
	T tempBook =bookshelf[numberOfBooks -1];
	if (numberOfBooks >0)
		{
		result = bookshelf[numberOfBooks -1];
		bookshelf[numberOfBooks-1] = null;
		numberOfBooks--;
		}
	return tempBook;
	}

	@Override
	public boolean lendBook(T book, String person) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int getNumberOfBooks() {
		return numberOfBooks;
	}

	@Override
	public int copiesAvailable(T book) {
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
	public T removeEntry(int givenIndex) {
		T tempBook= bookshelf[givenIndex];
		bookshelf[givenIndex] = null;
		return tempBook;
		
	}
	@Override
	public int getIndexOf(T book) {
		// TODO Auto-generated method stub
		return 0;
	}

}
