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
	
	public void add(int grade) {
		grades[count] = grade;
		count++;
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
	
	public double getMean() {
		int sum = 0;
		for (int i = 0; i < count; i++) {
			sum += grades[i];
		}
		double mean =(double) sum/count;
		return mean;
	}
	
	public double getMedian() {
		sort();
		double median = 0;
		int index3 = (count-1)/2;		 
		if(count  % 2 != 0) {
			median = (double)grades[index3];
		}
		else {
			median = (double)(grades[count/2-1]+ grades[count/2])/2;
		}
		return median;
	}
	public String toString() {
		String stats = "Values: ";
		sort();
		for (int i = 0; i < count; i++) {
			stats += grades[i];
			
		}
		stats += "\nMean= " + getMean() + "\nMedian= " + getMedian();
		return stats;
	}
}
