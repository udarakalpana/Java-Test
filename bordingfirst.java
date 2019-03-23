import java.util.Scanner;

class algorithms_run{

	public static void main(String args[]){

		int m;
		System.out.println("Please Enter Your Marks Now");
		Scanner reader = new Scanner(System.in);
		m = reader.nextInt();

			
			if(m <= 35){
				System.out.println("W");
			}
			else if (m <= 45){
				System.out.println("S");
			}
			else if (m <= 55){
				System.out.println("C");
			}
			else if (m <= 65){
				System.out.println("B");
			}
			else{
				System.out.println("A");
			}
	

     }

}