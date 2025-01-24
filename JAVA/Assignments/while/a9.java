class a9{
	public static void main(String[] args){
		int num=123456789;
		int temp=0;
		int odd=0;
		int even=0;
		while(num!=0){
			temp=num%10;
			if(temp%2!=0){
		              odd++;
			}
			else{
				even++;
			}
			num/=10;
		}
		System.out.println("odd count: " +odd);
		System.out.println("even count: " +even);

	}
}


