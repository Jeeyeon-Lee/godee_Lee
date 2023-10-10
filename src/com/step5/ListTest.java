package com.step5;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class ListTest {

	public static void main(String[] args) {
		List<String> names = new ArrayList<>();
		//<> 다이아몬드 연산자, 제네릭
		names.add("키위1");
		names.add("토마토1");
		names.add("포도1");
		for(String name : names) {
			System.out.println(name);
		}
		
		names = new Vector<>(); //FILO(first in last out)
		names.add("키위");
		names.add("토마토");
		names.add("포도");
		for(int i=0;i<names.size();i++) {
			System.out.println(names.get(i));
		}
	}

}
