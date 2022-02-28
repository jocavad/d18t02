package pkgRep;

import java.util.ArrayList;
import java.util.List;

/**
 * Hello world!
 *
 */
public class Rep<T> 
{
	private List<T> lst = new ArrayList<>();
	
	public void printRep() {
		System.out.println("report");
		for (T t : lst) {
			System.out.println(t);
		}
	}
	
	public void addToList(T el) {
		lst.add(el);
	}
	
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }
}
