/*
 * Given an array of n positive integers. Write a program to find the sum of maximum sum subsequence of the given array such that the intgers in the subsequence are sorted in increasing order. 
 * For example, if input is {1, 101, 2, 3, 100, 4, 5}, then output should be 106 (1 + 2 + 3 + 100), if the input array is {3, 4, 5, 10}, then output should be 22 (3 + 4 + 5 + 10) and if the input array is {10, 5, 4, 3}, then output should be 10
 */
public class maxSumIncrease {
	public static int getSum(int[] array) {
		int[] sum = new int[array.length];
		sum[0] = array[0];
		int output = Integer.MIN_VALUE;
		for(int i = 1; i < array.length; i++) {
			int max = Integer.MIN_VALUE;
			for(int j = i - 1; j >= 0; j--) {
				if(array[j] < array[i]) {
					int num = sum[j];
					max = Math.max(max, num);
				}
			}
			sum[i] = max + array[i];
			output = Math.max(sum[i], output);
		}
		return output;
	}
}
