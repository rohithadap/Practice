package programPractice;

public class sortArray {
	
	public static void main(String[] args) {
		
		int[] a = {2,12,43,5,22,6,3,0 };
		int temp=0;
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]>a[j]) {
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
			
		}
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]+ " ");
		}
		
		for(int i=1;i<=5;i++) {
			for(int j=4;j>=i;j--) {
				System.out.print(" ");
			}
			
		
		for(int k=1;k<=i;k++) {
			System.out.print("* ");
		}
		System.out.println();
		}
		
		
		String str= "A3B4";
		String num=str.replaceAll("[^0-9]", "");
		String cha= str.replaceAll("[^a-zA-Z]", "");
		System.out.println(num);
		
		System.out.println(cha);
		
		for(int i=0;i<num.length();i++) {
			int aa = Character.getNumericValue(num.charAt(i));
			for(int j=1;j<=aa;j++) {
				System.out.println(cha.charAt(i));
			}
			System.out.println();
		}
		
	}

}
