class c4{
	public static void main(String[] args){
		float per=80f;

		if(per>=85){
			System.out.println("medical");
		}
		else if(per<85 && per>70){
			System.out.println("engineering");
		}
		else if(per<=70 && per>60){
			System.out.println("pharmacy or bachelor in science");
		}
		else{
			System.out.println("repeat");

		}
	}
}
