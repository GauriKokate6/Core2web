class c10{
	public static void main(String[] args){
		int x=1;
		for(int i=1;i<=3;i++){
			
			if(i%2==0){
				for(char j=65;j<=67;j++){
					System.out.print(j++ + " ");
				}
				System.out.println();
			}
			else{
				for(int j=1;j<=3;j++){
					System.out.print(x++ + " ");
				}
				System.out.println();
			}
		}
	}
}


