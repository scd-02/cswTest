
public class Q8 {

	public static String search(String a[],String str) {
		String found="";
		for(int i=0;i<a.length;i++) {
			if(a[i].equals(str)) {
				found +=i+" ";
			}
		}
		return found;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s[] = {"Sourav","gg","ss","gg","bs","gg"};
		System.out.println(search(s,"gg"));
	}

}
