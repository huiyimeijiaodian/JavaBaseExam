package com.hand;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;

public class ExamFour {
	public static void main( String[] args ){
		int[] randoms=new int[50];
		List list=new ArrayList();
		System.out.print("随机生成50个小于100的数,分别为");
		for(int i=0;i<50;i++){
			int myRandom=(int) Math.round(Math.random()*100);
			list.add(myRandom);
			System.out.print(myRandom+",");
		}
//		System.out.println(list.get(0)+","+list.get(49));
		ListIterator myit = list.listIterator();
		Map<Integer,int[]> map=new HashMap<Integer,int[]>();
		while(myit.hasNext()){
			int num=(int) myit.next();
			Integer key=(int) Math.floor(num/10);
//			map.put(key, num);
		}
		System.out.println("\nMap中的数据为:");
		System.out.println("排序后的Map为:");
		
	}
}
