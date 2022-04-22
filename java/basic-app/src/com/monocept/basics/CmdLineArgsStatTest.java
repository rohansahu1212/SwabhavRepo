package com.monocept.basics;

public class CmdLineArgsStatTest {
	public static void main(String[] args) throws Exception {
		/*
		 * 12 13 14 15 11 2 19 45 49 32
		 */
		int maxNum, minNum, sum = 0;
		Double avg = 0.0;
		if (args.length > 0) {
			maxNum = Integer.parseInt(args[0]);
			minNum = Integer.parseInt(args[0]);

			for (String i : args) {
				int iter = Integer.parseInt(i);

				if (maxNum < iter)
					maxNum = iter;

				if (minNum > iter)
					minNum = iter;

				sum = sum + iter;

				avg = sum / Double.valueOf(args.length);

			}
			System.out.println("Max number is " + maxNum);
			System.out.println("Min number is " + minNum);
			System.out.println("Sum of Array is " + sum);
			System.out.println("Average is " + avg);
		}
		else
			System.out.println("Array is empty");
	}
}
