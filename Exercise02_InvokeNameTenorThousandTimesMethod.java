/**
 * 
 */
package slideDeckExercises;

/**
 * 
 */
public class Exercise02_InvokeNameTenorThousandTimesMethod {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		invokeNameANumberOfTimes(10);
		invokeNameANumberOfTimes(1000);
	}

	/**
	 * This Method prints my name to the console 'numberOfIterations' times
	 * @param numberOfIterations - amount of times user would like to print my name to the console
	 */
	public static void invokeNameANumberOfTimes(int numberOfIterations) {
		for (int i = 0; i < numberOfIterations; i++) {
			System.out.println("David O'Hanlon");
		}
	}
}
