import java.util.*;
class InsertionSort{
	void insertion(int a[]){
		int n=a.length;
		int element= a[n-1];
		
		for(int i=n-2; i>=0; i--){
			if(a[i]>element){
				a[i+1]= a[i];
				print(a);
			}else{
				a[i+1]=a[i];
				print(a);
				break;
			}
		if(a[i+1]> element && i==0){
				a[i]=element;
				print(a);
			}
		
		}
		
	}
	void print(int a[]){
		for(int i: a){
			System.out.print(i+ " ");
		}
		System.out.println();
	}
	public static void main(String args[]){
		Scanner sc= new Scanner(System.in);
		InsertionSort is=new InsertionSort();
		int size=sc.nextInt();
		int arr1[]= new int[size];
		for(int i=0;i<size;i++){
			
			arr1[i]=sc.nextInt();
		}
			is.insertion(arr1);
			
		
		
	}

}