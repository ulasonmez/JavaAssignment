import java.util.Arrays;
public class main {
    //1st
	public static void displayArray(int[] Array,String a) {
		for(int i=0;i<Array.length-1;i++) {
			System.out.print(Array[i]+a);
		}
		System.out.print(Array[Array.length-1]);
	}
	//2nd
	public static double getFirstItem(double[] Array) {
		return Array[0];
	}
	//3rd
	public static double getLastItem(double[] Array) {
		return Array[Array.length-1];
	}
	//4th
	public static int[] getAllButLast(int[] Array) {
		int[] myArray = new int[Array.length-1];
		for(int i=0;i<Array.length-1;i++) {
			myArray[i] = Array[i];
		}
		return myArray;
	}
	//5th
	public static int countLessThan(int[] Array,int A) {
		int count = 0;
		for(int i=0;i<Array.length;i++) {
			if(Array[i]<A) {
				count++;
			}
		}
		return count;
	}
	//6th
	public static int countBetween(int[] Array,int A, int B) {
		int count = 0;
		for(int i = 0;i<Array.length;i++) {
			if(Array[i]>=A && Array[i]<=B) {
				count++;
			}
		}
		return count;
	}
	//7th
	public static double[] swapByIndex(double[] Array,int A,int B) {
		double temp;
		temp = Array[A];
		Array[A] = Array[B];
		Array[B] = temp;
		return Array;
	}
	//8th
	public static int[] getLessThan(int[] Array,int A) {
		int[] myArray = new int[Array.length-1];
		int a=0;
		for(int i =0;i<Array.length;i++) {
			if(Array[i]<A) {
				myArray[a++] =Array[i];
			}
		}
		return myArray;
	}
	//9th
	public static int[] getBetween(int[] Array,int A,int B) {
		int len = 0;
		for(int i=0;i<Array.length;i++) {
			if(Array[i] != 0) {
				len++;
			}
		}
		int[] myArray = new int[len];
		int a = 0;
		for(int i=0;i<Array.length;i++) {
			if(Array[i]>=A && Array[i] <= B) {
				myArray[a] = Array[i];
				a++;
			}
		}
		return myArray;
	}
	//10th
	public static boolean isSorted(int[] Array) {
		for(int i =0;i<Array.length-1;i++) {
			if(Array[i]<Array[i+1]) {
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		int[] myArray = {1, 22, 333, 400, 5005, 9};
		int[] dizi = {31,30,29,28,27};
		double[] myArray2 = {1.0, 2.2, 33.3, 40.0, 50.05, 9.0};
	System.out.println(Arrays.toString(getAllButLast(myArray)));
	}
}
