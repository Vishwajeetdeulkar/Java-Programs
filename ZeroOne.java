package patterns;

public class ZeroOne {

	public static void main(String[] args) {
		for (int i = 0; i < 7; i++) {
			for (int j = 0; j < 7; j++) {
				if((i+j)%2==0)
					System.out.print("0");
				else
					System.out.print("1");
					
			}
			System.out.println();
		}
	}

}
