package com.exception.test;

public class BugTest {
	public static void main(String[] args) {
		try {
			int firstno = Integer.parseInt(args[0]);
			int secondno = Integer.parseInt(args[1]);
			int result = firstno / secondno;

			System.out.println("Result is " + result);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Array out of bound");

		} catch (NumberFormatException e) {
			System.out.println("number format exception");
		}
		catch(ArithmeticException e)
		{
			System.out.println("arthimetic exception");
		}
		catch(Exception e) {
			System.out.println(e);
		}
		System.out.println("end of program");

	}

}
