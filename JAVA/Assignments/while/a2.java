class a2{
	public static void main(String[] args){
		int start=150;
		int end=198;
		while(start<end){
			if((start*start)%2!=0){
				System.out.println(start);
			}
			start++;
		}
	}
}
