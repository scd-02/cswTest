
public class Q2 {

	public static void bubbleSort(int a[]) {
		for(int i=0;i<a.length;i++) {
			for(int j=1;j<a.length-i;j++) {
				if(a[j-1]>a[j]) {
					int temp=a[j];
					a[j]=a[j-1];
					a[j-1]=temp;
				}
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {5,3,6,8,2,1};
		bubbleSort(a);
		for(int i:a) {
			System.out.println(i);
		}
	}

}
