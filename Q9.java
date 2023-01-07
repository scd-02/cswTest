
public class Q9 {
	
	public static boolean checkPal(String s) {
		int l=0,h=s.length();
		while(l<=h) {
			if(s.charAt(l)!=s.charAt(h)) {
				return false;
			}
			l++;h--;
		}
		return true;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Hello    aba abba ji";
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)!=' ') {
				int j=i;
				while(s.charAt(i)!=' ') {
					i++;
				}
				boolean status=checkPal(s.substring(j,i));
			}
			
			
		}
	}

}
