/**
 * 
 */
package kevin.java.arrays;

/**
 * @author kevingates
 *
 */
public class Arrays {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		intArray();
		stringArray();
	}
	
	public static void intArray() {
		int[] number = {1, 2, 3, 4,5,6};
		int k=0;
		while (k<6) {
			System.out.println("number="+number[k]);
			k++;
		}
	}
	
	public static void stringArray() {
		String[] string = {"billgates", "Jeff", "Mark"};
		int k=0;
		while (k<3) {
			System.out.println("string="+string[k]);
			k++;
		}
	}
}
