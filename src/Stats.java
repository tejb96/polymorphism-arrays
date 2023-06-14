/**
 * Partial implementation of Stats class
 * This class represents a collection of grades and provides methods to perform statistical calculations.
 * 
 * @author Tej
 * 
 */
public class Stats {

	private int grades[];
	private int count;
	
	/**
	 * Constructs a new Stats object with an initial capacity of 100 grades,.
	 */
	public Stats() {
		grades = new int[100];
		count = 0;
	}
	
	/**
	 * Adds a grade to the collection.
	 * 
	 * @param grade The grade to be added.
	 */
	public void add(int grade) {
		if(count<grades.length) {
			grades[count] = grade;
			count++;
		}
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
	
	/**
	 * Calculates the mean of the grades.
	 * 
	 * @return The mean of the grades.
	 */
	public double getMean() {
		double mean;
		if(count==0) {mean = 0;}
		else {
			int sum = 0;
			for (int i = 0; i < count; i++) {
				sum += grades[i];
			}
			mean =(double) sum/count;
		}
		
		return mean;
	}
	
	/**
	 * Calculates the median of the grades.
	 * 
	 * @return The median of the grades.
	 */
	public double getMedian() {
		sort();
		double median = 0;	 
		if(count  % 2 != 0) {
			median = (double)grades[(count-1)/2];
		}
		else if(count == 0) {return median;}
		else {
			median = (double)(grades[count/2-1]+ grades[count/2])/2;
		}
		return median;
	}
	
	/**
	 * Creates a string representation of the grades, mean, and median.
	 * 
	 * @return The string representation of the grades, mean, and median.
	 */
	public String toString() {
		String stats = "Values: ";
		sort();
		for (int i = 0; i < count; i++) {
			stats += grades[i];
			if (i<count) {
				stats += " ";
			}
			
		}
		stats += "\nMean= " + getMean() + "\nMedian= " + getMedian();
		return stats;
	}
}
