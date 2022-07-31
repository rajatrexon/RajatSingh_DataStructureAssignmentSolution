package com.gl.service;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class Service {
	public void comparator(ArrayList<Integer> array, PriorityQueue<Integer> pq) {
		int i = 0;
		if (array.isEmpty() || array.size()<0) {
			return;
		}
		else if (pq.peek() != array.get(i)) {
			int j = 0;
			
			int ele1 = array.get(j);
			int ele2 = (array.get(j) + 1);
			int index = array.indexOf(ele2);
			try {
			array.add(index+1 , ele1);
			}catch(Exception e) {
				array.add(ele1);
			}
			System.out.println("day"  + ":");
			System.out.println();
			
			array.remove(0);
			comparator(array, pq);
		} else {
			int k = 0;
			System.out.println("day :");
			try {
			while (pq.peek() == array.get(k)) {
				System.out.print(array.remove(k)+" ");
				pq.poll();
			}
			}catch(Exception e) {
				System.out.println();
			}
			System.out.println();
			comparator(array, pq);
		}
	}

}
