import java.util.Scanner;

public class Q25 {
	
	public static void countCurr(int amount,int curr[]) {
		int total=0;
		for(int i=curr.length-1;i>=0;i--) {
			if(amount/curr[i]>=1) {
				System.out.println(curr[i]+" : "+amount/curr[i]);
				total++;
				amount=amount%curr[i];
			}
		}
		System.out.println("Total Currency used: "+total);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int curr []= {1,2,5,10,20,50,100,200,500,2000};
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter amount: ");
		int rs=sc.nextInt();
		countCurr(rs,curr);
		
		int count=0;
		while(rs!=0) {
			int i=curr.length-1;
			while(rs<curr[i]) {
				i--;
			}
			rs=rs-curr[i];
			count++;
			
		}
		System.out.println("No of currency used: "+count);
		sc.close();
	}

}
