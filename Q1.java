import java.util.Scanner;

public class Q1 {

	public static int total(int a[]) {
		int total=0;
		for(int i=0;i<a.length;i++) {
			total +=a[i];
		}
		return total;
	}
	public static int perc(int a[]) {
		int total=0;
		for(int i=0;i<a.length;i++) {
			total +=a[i];
		}
		return (total/a.length);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no of Student: ");
		int n=sc.nextInt();
		int marks[]=new int[n];
		for(int i=0;i<n;i++) {
			marks[i]=sc.nextInt();
		}
		System.out.println("Total: "+total(marks));
		System.out.println("Percentage:"+perc(marks));
		sc.close();
	}

}
