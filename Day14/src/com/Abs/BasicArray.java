package com.Abs;


public class BasicArray {
	
	public void LargestElement() {
		int a[]= {90,22,102,44};
		
		int max=a[0];
		int min=a[0];
		
		for(int i=0;i<a.length;i++) {
			if(max<a[i]) {
				max=a[i];
			}else if(min>a[i]) {
				min=a[i];
			}
		}
		
		System.out.println("Maximum:"+max);
		System.out.println("Minimum:"+min);
		
	}
	
	public void sumAverage() {
		int a[]= {4,1,2,3};
		
		int sum=0;
		
		int average=0;
		
		for(int i=0;i<a.length;i++) {
			sum=sum+a[i];
		}
		
		System.out.println("Sum:"+sum);
		System.out.println("Average:"+sum/a.length);
		
	}
	
	public void rev() {
		int a[]= {9,2,1,4,5};
		
		for(int i=a.length-1;i>=0;i--) {
			System.out.print(a[i]+" ");
		}
		
	}
	
	public void countEO() {
		int a[]= {1,2,3,4,5,6,7};
		
		int eCount=0;
		int oCount=0;
		
		for(int i=0;i<a.length;i++) {
			
			if(a[i]%2==0) {
				eCount++;
			}else {
				oCount++;
			}
			
		}
		System.out.println();
		System.out.println("Even Count:"+eCount);
		System.out.println("Odd Count:"+oCount);
		
	}

	public static void main(String[] args) {
		BasicArray b=new BasicArray();
		b.LargestElement();
		b.sumAverage();
		b.rev();
		b.countEO();
	}
	
}
