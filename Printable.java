package Project3;

/**
 * The printable interface represents an entity that generates file data.
 * Classes that implement this interface should provide an implementation 
 * for the getFileData() method.
 */
public interface Printable {
	
	/**
	 * Generates file data
	 * @return A string containing the file data.
	 */
	String getFileData();
	
}
