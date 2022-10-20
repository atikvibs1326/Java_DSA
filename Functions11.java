package com.functions;
public class Functions11{
	public static void main(String[] args) {
		int arr[]= {3,1,4,5,6,8};
		int arr_size=arr.length;
		if(istriplet(arr,arr_size)==true) {
			System.out.println("Is a triplet");
		}else {
			System.out.println("is not a triplet");
		}
			
		
		

	}
	static boolean istriplet(int ar[],int n) {
		for(int i=0;i<n;i++) {
			
			for(int j=i+1;j<n;j++) {
				
				for(int k=j+1;k<n;k++) {
					int x,y,z;
					x=ar[i]*ar[i];
					y=ar[j]*ar[j];
					z=ar[k]*ar[k];
					
					if(x==y+z || y==x+z || z==x+y) {
						return true;
					}
						
				}
			}
		}
		
		return false;
		
	}

}
