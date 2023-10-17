package programPractice;


public class practice {
	
	public static void main(String[] args) {
		
		//leap year
		
		int year = 1900;
		if(year%4==0 || (year%100==0 && year%400==0)) {
			System.out.println("it is a leap year");
		}else {
			System.out.println("not a leap year");
		}
		
		
		String s="$12343.245";
		int a = s.indexOf(".");
		String str = s.substring(1, a);
		System.out.println(str);
		
		// fibonacci series 
		
		int x=0, y=1 , c=0;
		for(int i =0 ; i<10 ;i++) {
			c = x+y;
			System.out.print(c+" ");
			x=y;
			y=c;
		}
		
		//Armstromg Number
		int num = 370;
		int temp=num;
		int aa=0;
		int o=0;
			while(num>0) {
				aa=num%10;
				o= o+ aa*aa*aa;
				num = num/10;
			}
		if(temp==o) {
			System.out.println("it is an Armstrong number");
		}else {
			System.out.println("not an Armstrong number");
		}
		
		//factorial
		
		int t=5;
		int r=1;
		for(int i =1 ; i<=t ;i++ ) {
			r=r*i;
		}
		System.out.println(r);
	}

}
