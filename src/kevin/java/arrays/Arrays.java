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
		doubleArray();
		Employee employee = new Employee("","",1);
	}
	
	public static void intArray() {
		System.out.println("-----------int Array-----------");
		int[] number = {1, 2, 3, 4,5,6};
		int k=0;
		while (k<6) {
			System.out.println("number="+number[k]);
			k++;
		}
	}
	
	public static void stringArray() {
		System.out.println("-----------string Array-----------");
		String[] string = {"billgates", "Jeff", "Mark"};
		int k=0;
		while (k<3) {
			System.out.println("string="+string[k]);
			k++;
		}
	}
	
	public static void doubleArray() {
		System.out.println("-----------double Array-----------");
		double[] dataDouble = {1.9, 2.9, 3.4, 3.5};
		int k=0;
		while (k<dataDouble.length) {
			System.out.println("string="+dataDouble[k]);
			k++;
		}
	}	
}
