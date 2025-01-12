import java.util.*;
  

class a4{
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		System.out.println("enter size:");
		int size=sc.nextInt();
		int[] arr=new int[size];
		System.out.println("enter array elements:");
		for(int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();
		}
                boolean isDup=false;
		for(int i=0;i<arr.length-1;i++){
			for(int j=i+1;j<arr.length;j++){
				if(arr[i]==arr[j]){
					System.out.println("first duplicate found at the index:" + j);
					isDup=true;
					break;
				}
			}

			if(isDup){
				break;
			}
		}
	}
}
