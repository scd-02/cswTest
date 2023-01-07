import java.util.Scanner;

public class Q3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		// TODO Auto-generated method stub
		
		int a[][][]=new int [3][2][3];
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				int total=0;
				for(int k=0;k<a[i][j].length;k++) {
					System.out.println("Enter mark of sub "+(k+1)+" of Student "+(j+1)+" of Department "+(i+1)+" :");
					a[i][j][k]=sc.nextInt();
					total +=a[i][j][k];
					
				}
				System.out.println("Total: "+total);
			}
		}
		sc.close();
	}

}
