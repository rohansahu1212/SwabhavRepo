package com.monocept.basics;

public class PassByRefTest {
	int score=100;
	
	private static void updateScoreToZero( PassByRefTest ob) {
		ob.score=0;
		
		
	}
	private void updateScoresToZero(int[] ss) {
		for(int i=0;i<ss.length;i++)
			ss[i]=0;
		
	}
	
	public static void main(String[] args) {
		
		PassByRefTest ob=new PassByRefTest();
		ob.updateScoreToZero(ob);
		System.out.println(" value after change of score "+ob.score);
		int [] scores= {100,90,80};
		ob.updateScoresToZero(scores);
		System.out.println("value after change in array");
		for(int s:scores)
			System.out.println(s);
		
		
		
	}

}
