package org.tcs;

public class AscendingOrder {
public static void main(String[] args) {
	int a[] = new int[] {400,100,300,200};
	
	for (int i = 0; i < a.length; i++) {
		for (int j = i+1; j < a.length; j++) {
			if(a[i]>a[j]) {
				int x = a[i];
				a[i]=a[j];
				a[j]=x;
			}
		}
	}
	for (int i : a) {
		System.out.println(i);
	}
}
}
