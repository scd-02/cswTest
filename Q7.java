
public class Q7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="ggg sss   ssgg  gg  ggg    ";
		
		String splitArr[]=s.split("\\s+",0);
		
		for(String i:splitArr) {
			System.out.print(i+" ");
		}
	}

}
