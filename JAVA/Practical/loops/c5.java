class c5{
	public static void main(String[] args){
		int num=12345678;
		while(num/10!=0){
			if((num%10)%2!=0){
				System.out.print(num%10 + "\t");
				
			}
			  num=num/10;
		}
	}
}
