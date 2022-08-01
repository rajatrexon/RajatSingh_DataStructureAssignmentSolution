package com.gl.main;
import java.util.*;

import com.gl.service.Service;
import com.gl.service.Service2;
public class Main {
public static void main(String[] args) {
	// Service comp = new Service();
	Service2 comp = new Service2();
	
	ArrayList<Integer> array = new ArrayList<>();
	PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the no. of floors in the buildings");
	int size = sc.nextInt();
	int[] array2 = new int[size];
	for(int i=0;i<size;i++) {
		System.out.println("Enter the floor size built on day:"+(i+1));
		int floor = sc.nextInt();
		array.add(floor);
		pq.add(floor);
		array2[i]= floor;
	}
	System.out.println(array);
	System.out.println("The order of construction is as follows:");
	System.out.println();
        comp.comparator(array, pq,array2);
	
}
}
