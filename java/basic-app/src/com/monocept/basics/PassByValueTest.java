package com.monocept.basics;

public class PassByValueTest {
	
	
	private void updateScoreToZero(int s) {
		s=0;
		
		
	}
	private void updateScoresToZero(int[] ss) {
		for(int i=0;i<ss.length;i++)
			ss[i]=0;
		
	}
	
	public static void main(String[] args) {
		int score=100;
		PassByValueTest ob=new PassByValueTest();
		ob.updateScoreToZero(score);
		System.out.println(" value after change of score "+score);
		int [] scores= {100,90,80};
		ob.updateScoresToZero(scores);
		System.out.println("value after change in array");
		for(int s:scores)
			System.out.println(s);
		
		
		
	}

}
