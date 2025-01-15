import java.util.*;

class a2{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("enter size:");
		int size=sc.nextInt();
		int[] arr= new int[size];
		for(int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();
		}

		
		int count=0;
		int sum=0;
		for(int i=0;i<arr.length;i++){
		boolean isPrime=true;
		if(arr[i]<=1){
			isPrime=false;
		}
		else{
		for(int j=2;j<=arr[i]/2;i++){
			if(arr[i]%j==0){
				isPrime=false;
				break;
			}
		}
		}
		if(isPrime){
			count++;
			sum+=arr[i];
		}
		}
		System.out.println("sum is: " + sum); 
		System.out.println("count is:" +count);

	}
}

