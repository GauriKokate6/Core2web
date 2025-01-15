import java.util.*;

class a3{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("enter size of an array:");
		int size=sc.nextInt();
		
		int arr[] = new int[size];
		System.out.println("enter key");
		int key=sc.nextInt();
		for(int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();
		}
		int count=0;
		for(int i=0;i<arr.length;i++){
			if(arr[i]==key){
				count++;
			}
		}
                
		if(count>2){
			for(int i=0;i<arr.length;i++){
				if(key==arr[i]){
					arr[i]=key*key*key;
				}
			}
		}

		

		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]);
		}
	}
}
