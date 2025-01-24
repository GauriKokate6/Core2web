class a4{
	public static void main(String[] args){
		int start=1;
		int end=6;

		while(start<=end){
			if(start%2==0){
			System.out.println((char)(64+start));
			}
			else{
				System.out.println(start);
			}
			start++;
		}
		
	}
}
