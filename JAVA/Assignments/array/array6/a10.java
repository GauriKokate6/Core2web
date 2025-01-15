import java.util.*;

class a10{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("enter array size:");
		int size=sc.nextInt();
		int[] arr=new int[size];
		System.out.println("enter array elements:");
		for(int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();
		}
	        if(size<3){
			System.out.println("size should be more than 2");
			return;
		}

		int fl=arr[0];
		int sl=arr[0];
		int tl=arr[0];

		for(int i=0;i<arr.length;i++){
			if(arr[i]>fl){
				tl=sl;
				sl=fl;
				fl=arr[i];
			}
			if(arr[i]>sl && arr[i]!=fl){
				tl=sl;
				sl=arr[i];
			}

			if(arr[i]>tl && arr[i]!=fl && arr[i]!=sl){
				tl=arr[i];
			}
		}
		System.out.println("thirde last element is : " + tl);
	}
}
