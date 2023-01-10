package good;

public class ex03 {

	public static void main(String[] args) {
		
		int addtotal = 0;
		int oldtotal = 0;
				
		for(int i = 1; i <= 100; i++) {
			if(i % 2 == 0) {
				addtotal = addtotal + i;
			}
			else {
				oldtotal = oldtotal + i;
			}
		}
		System.out.println("짝수의 합은 " + addtotal);
		System.out.println("홀수의 합은 " + oldtotal);
	}
	

}
