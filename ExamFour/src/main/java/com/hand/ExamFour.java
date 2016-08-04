package com.hand;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ExamFour {
	public static void main(String[] args) {
		int temp;
		System.out.print("随机生成50个小于100的数,分别为：");
		List<Integer> ilist=new ArrayList<Integer>();
		List<Integer> tplist;
		Map<Integer, List<Integer>> imap=new HashMap<Integer, List<Integer>>();
		//生成50个<100的随机数，打印并存到List中
		for (int i = 0; i < 50; i++) {
			temp=(int) Math.round(100*Math.random());
			ilist.add(temp);
			System.out.print(temp+",");
		}
		System.out.println("");
		int tpkey;
		//初始化HashMap，使每一个Value都分配到内存空间
		for (int i = 0; i < 10; i++) {
			tplist=new ArrayList<Integer>();
			imap.put(i, tplist);
		}
		//将随机数的十位作为Key值，将这个随机数装到对应的List中
		for (int i = 0; i < ilist.size(); i++) {
			tpkey=ilist.get(i)/10;
			tplist=imap.get(tpkey);
			if(tplist==null){
				continue;
			}
			tplist.add(ilist.get(i));
		}
		//输出
		System.out.println("Map 中的数据为:"+imap);
		//为每一个Key对应的List排序，调用sort()
		for (int i = 0; i < imap.size(); i++) {
			tplist=imap.get(i);
			sort(tplist);
		}
		//再输出
		System.out.println("排序后的 Map 为:"+imap);
	}
	
	public static void sort(List<Integer> list){
		int size=list.size();
		int tp[]=new int[size];
		//int tp2[]=new int[size];
		//将List拷贝为一个int数组，方便排序
		for(int i=0;i<size;i++){
			tp[i]=list.get(i);
		}
		int temp;
		//冒泡排序
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size-1-i; j++) {
				if(tp[j]>tp[j+1]){
					temp=tp[j];
					tp[j]=tp[j+1];
					tp[j+1]=temp;
				}
			}
		}
		//注释起来的是选择排序
//		int min;
//		for (int i = 0; i < size; i++) {
//			min=i;
//			for (int j = 0; j < size; j++) {
//				if(tp[min]>tp[j]){
//					min=j;
//				}
//			}
//			tp2[i]=tp[min];
//			tp[min]=200;
//		}
		//将原List清空，将排好序的数据重新存进去
		list.clear();
		for (int i = 0; i < size; i++) {
			list.add(tp[i]);
		}
	}
}
