import java.util.Arrays;

public class Atividadearrays {
	public static void main(String[] args) {
		
		int[] a = new int [300];
		Arrays.fill(a, 300);
		
		int x = 0;
		int y = 0;
		
		while(x <= 299) {
			System.out.println("posição" +x+ " : " + a[x]);
			x++;
		}
		
		for (int c = 0; c < 300; c++) {
			System.out.println("posição" +x+ " : " + a[c]);
		}
	
		do {
			System.out.println("numero " + a[y]);
			y++;
		}while (y <300);
		
		
		
		
	}
	
}
		
		
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

