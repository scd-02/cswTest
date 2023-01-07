
public class Q6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Hello Amit Jena Sir!";
		char []arr=new char[12];
		s.getChars(0, s.length()-8, arr, 0);
		for(int i:arr) {
			System.out.print((char)i+"");
		}
	}

}
