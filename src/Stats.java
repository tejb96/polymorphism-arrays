/**
 * Partial implementation of Stats class
 * 
 * @author
 * 
 */
public class Stats {

	private int grades[];
	private int count;

	public Stats() {
		grades = new int[100];
		count = 0;
	}

	/**
	 * 
	 * Sorts the first count elements of grades array with Bubble sort.
	 * 
	 * Bubble sort adapted
	 * from 5.2 Try-this: Sorting an array 
	 * in Java, a beginner's guide 9th ed 
	 * 
	 */
	public void sort() {
		int a, b, t;
		for(a=1; a<count; a++) {
			for(b=count-1;b>=a;b--) {
				if(grades[b-1]>grades[b]) {
					t = grades[b-1];
					grades[b-1] = grades[b];
					grades[b] = t;
				}
			}
			
		}
	}
}
