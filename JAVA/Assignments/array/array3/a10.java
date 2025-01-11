import java.util.*;

class a10{
	public static void main(String[] args){
		int[] arr = {1,2,3,4,5,6};
	
			int product=1;

		for(int i=0;i<arr.length;i++){
			boolean isPrime=true;
			
		     if(arr[i]>1){
			     for(int j=2;j<=Math.sqrt(arr[i]);j++){
				     if(arr[i]%j==0){
					     isPrime=false;
					     break;
				     }
			     }

			     if(isPrime){
				     product*=arr[i];
			     }

		     }
		     }


			     System.out.println("product is " + product);
	}
}
