package com.step3;
//변수는 몇 개 필요
//변수의 타입은?
//for문 안에 if문? 5에 fizz, 7에 buzz
//조건을 따질 때 fizz를 먼저 따져야 하는지, 
//fizzbuzz(5와 7의 공배수) 먼저 따져야 하는지?  
//예로 35는 5로 나누어 나머지가 0일 경우, fizz를 출력하므로
//원하는 결과가 아니다.     -> 공배수를 먼저 따져놔야 함. 
//조건을 따질때도 순서가 결과에 영향이 있다. 
class FizzBuzz{
}
public class FizzBuzzGame {

	public static void main(String[] args) {
		int i = 0;
		for(i=1; i<=1000; i++) {
			if(i%7 == 0 & i%5 == 0) {
				System.out.println("fizzbuzz");
			}
			else if(i%5 == 0) {
				System.out.println("fizz");
			}
			else if(i%7 == 0) {
				System.out.println("buzz");
			}else {
				System.out.println(i);
			}
		}
	}
}
