package arrays;

import java.util.Scanner;

public class Main{
	
	
    //1.searching an Element
    public void searchElement(){
        String a[]={"Apple","Ball","Cat"};

        String str="Ball";
        boolean flag=false;

        for(int i=0;i<a.length;i++){
            if(a[i]==str){
                flag=true;
                System.out.println("Element Found at"+i);
                break;
            }

        }


        if(!flag){
            System.out.println("Element Not Found");
        }
    }

    //2.Largest Element in an array

    public void LargestElem(){
        int a[]={1,10,2,3,4,0};

        int max=a[0];
        
        for(int i=0;i<a.length;i++) {
        	if(max<a[i]) {
        		max=a[i];
        	}
        }
        
        System.out.println(max);

    }
    
    //3.sorting
    public void SortArray() {
    	int a[]= {9,2,1,10,55,22,4};
    	
    	for(int i=0;i<a.length-1;i++) {
    		for(int j=0;j<a.length-1-i;j++) {
    			if(a[j]>a[j+1]) {
    				int temp=a[j];
    				a[j]=a[j+1];
    				a[j+1]=temp;
    			}
    		}
    	}
    	
    	for(int i=0;i<a.length;i++) {
    		System.out.print(a[i]+" ");
    	}
    	
    }
    
    //4.remove duplicate elements
    
    public void remDupli() {
    	int a[]= {1,2,2,3,3,4,5};
    	
    	int b[]=new int[a.length];
    	
    	int c=0;
    	
    	for(int i=0;i<a.length;i++) {
    		
    		boolean flag =false;
    		
    		for(int j=0;j<c;j++) {
    			if(a[i]==b[j]) {
    				
    				
    				flag=true;
    				
    				break;
    			}
    			
    		}
    		
    		if(!flag) {
    			b[c]=a[i];
    			c++;
    		}
    	}
    	
    	
    	
    	for(int i=0;i<c;i++) {
    		System.out.print(b[i]+" ");
    	}
    	
    }
    
    
    //Merge An Array
    
    public void MergeArray() {
    	
    	int a[] = {1,2,3};
    	int b[]= {5,6,7};
    	
    	int c[]=new int[a.length+b.length];
    	
    	for(int i=0;i<a.length;i++) {
    		c[i]=a[i];
    	}
    	
    	for(int i=0;i<a.length;i++) {
    		c[a.length+i]=b[i];
    	}
    	
    	for(int i=0;i<c.length;i++) {
    		System.out.print(c[i]+" ");
    	}
    	
    }
    
    public void ArrEqual() {
    	int a[]= {1,2,3};
    	int b[]= {1,2,3};
    	
    	boolean flag=false;
    	
    	if(a.length!=b.length) {
    		System.out.println("Not Equal");
    		
    	}else {
    		for(int i=0;i<a.length;i++) {
    			
    			if(a[i]==b[i]) {
    				flag=true;
    				break;
    			}
    			
    		}
    		
    		if(flag) {
    			System.out.println("Equal");
    		}
    		
    		
    	}
    	
    	
    }
    
    
    public void removeOcc() {
    	int a[]= {1,2,3,4,3,5,3};
    	
    	int key=3;
    	
    	for(int i=0;i<a.length;i++) {
    		if(a[i]!=key) {
    			System.out.print(a[i]+"  ");
    		}
    	}
    }
    
    public void commonElem() {
    	int a[]= {1,2,3,4,6,7};
    	int b[]= {6,7,1,3,6,4};
    	
    	for(int i=0;i<a.length;i++) {
    		for(int j=0;j<b.length;j++) {
    			if(a[i]==b[j]) {
    				System.out.print(a[i]+" ");
    			}
    		}
    	}
    }
    
    
    public void CopyA() {
    	int a[]= {1,2,3,46,7};
    	
    	int b[]=new int[a.length];
    	
    	
    	for(int i=0;i<a.length;i++) {
    		b[i]=a[i];
    	}
    	
    	for(int i=0;i<a.length;i++) {
    		System.out.print(b[i]+" ");
    	}
    	
    }

    public static void main(String[] args){
        Main m=new Main();
        m.CopyA();
        
       


    }
}
