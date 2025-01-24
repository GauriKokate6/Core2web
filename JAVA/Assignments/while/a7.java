class a7{
	public static void main(String[] args){
		int num=93079898;
		int count=0;
		int temp=0;
		while(num!=0){
			temp=num%10;
			count++;
			num/=10;
		}
		System.out.println(count);
	}
}
