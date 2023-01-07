import java.util.Scanner;

public class Q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter size of jagged Array: ");
		int n=sc.nextInt();
		int ja[][]=new int[n][];
		for(int i=0;i<n;i++) {
			System.out.println("Enter size of 1D array of jagged array index "+i+" : ");
			int m=sc.nextInt();
			ja[i]=new int[m];
		}
		for(int i=0;i<ja.length;i++) {
			System.out.print("Enter elements: ");
			for(int j=0;j<ja[i].length;j++) {
				
				ja[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<ja.length;i++) {
			for(int j=0;j<ja[i].length;j++) {
				System.out.print(ja[i][j]);	
			}
			System.out.println();
		}
		sc.close();
	}

}
