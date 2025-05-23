//2.b. Develop a Java program to make a Performance Test on StringBuffer and StringBuilder for appending the string ‘AIET’ for 10000 times both in the StringBuffer and StringBuilder. Justify  your answer which one is better. 

package string_fucntions;

public class PerformanceTest {

	public static void main(String[] args) {
		 int iterations = 10000;
	        String appendString = "AIET";

	        // Test with StringBuffer
	        StringBuffer stringBuffer = new StringBuffer();
	        long startTimeBuffer = System.nanoTime();

	        for (int i = 0; i < iterations; i++) {
	            stringBuffer.append(appendString);
	        }

	        long endTimeBuffer = System.nanoTime();
	        long durationBuffer = endTimeBuffer - startTimeBuffer;

	        // Test with StringBuilder
	        StringBuilder stringBuilder = new StringBuilder();
	        long startTimeBuilder = System.nanoTime();

	        for (int i = 0; i < iterations; i++) {
	            stringBuilder.append(appendString);
	        }

	        long endTimeBuilder = System.nanoTime();
	        long durationBuilder = endTimeBuilder - startTimeBuilder;

	        // Output results
	        System.out.println("Time taken by StringBuffer: " + durationBuffer + " nanoseconds");
	        System.out.println("Time taken by StringBuilder: " + durationBuilder + " nanoseconds");

	        // Justification
	        if (durationBuilder < durationBuffer) {
	            System.out.println("\nStringBuilder is faster than StringBuffer for appending strings.");
	        } else {
	            System.out.println("\nStringBuffer is faster or equal in speed compared to StringBuilder.");
	        }
	}

}
