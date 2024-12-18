class c3{
	public static void main(String[] args){
		int i=0;
		for(;;){
			if(i>10 && i%2==0){
				break;
			}
			System.out.println(i++);
		}
	}
}
