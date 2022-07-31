package com.gl.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;

public class Service2 {
	public void comparator(ArrayList<Integer> array, PriorityQueue<Integer> pq, int[] array2) {
		PriorityQueue<Integer> pq2 = new PriorityQueue<>();
		for(int i = 0; i<array2.length;i++) {
		if(pq.peek()== array2[i]) {
			System.out.println("day" + (i+1) + ":" + pq.peek());
			while (pq.peek() != array.get(0)) {

				int ele1 = array.get(0);
				int ele2 = (array.get(0) + 1);
				int index = array.indexOf(ele2);
				try {
					array.add(index + 1, ele1);
				} catch (Exception e) {
					array.add(ele1);
				}
				
				array.remove(0);
				

			}
			pq2.add(array.remove(0));
			
			System.out.println(array);
			pq2.add(array.get(0));
			pq.remove();
			System.out.println(pq2);
			try {
				int j = i;
			while(array.get(0)<array2[j] && array.get(0)>=pq2.peek()) {
				System.out.print(array.remove(0));
				pq.remove();
				j++;
			}
			}catch(Exception e) {
				System.out.println();
			}
			System.out.println();
		
	}
		else {
			System.out.println("day " +(i+1)+":");
			
		}
	}
	}
}
