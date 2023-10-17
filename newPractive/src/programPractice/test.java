package programPractice;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class test {
	public static void main(String[] args) {
		
//		// reverse string
//		String ss = "Rohit Hadap";
//		String s="";
//		System.out.println(ss.length());
//		for(int i=ss.length()-1;i>=0;i--) {
//			s=s+ss.charAt(i);
//		}
//		System.out.println(s);
		
//		//reverse String at same position
//		
//		String str="Rohit Kishor Hadap";
//		String [] split = str.split(" ");
//		String temp="";
//		for(int i=0;i<split.length;i++) {
//			String original="";
//			for(int j=split[i].length()-1;j>=0;j--) {
//				original = original + split[i].charAt(j);
//			}
//			temp = temp + original+" ";
//		}
//		System.out.println(temp);
		
//		//Add numbers present inside the Stirng
//		String s = "60fdf5ffrf80frfr4fr5";
//		 String ss=""; 
//		 for(int i=0;i<s.length();i++) {
//			 if( Character.isDigit(s.charAt(i))==true){
//				 ss= ss+s.charAt(i);
//			 }
//		 }
//		 int aa = Integer.parseInt(ss);
//		 int add=0,num=0;
//		 while(aa>0) {
//			 num = aa%10;
//			 add = add + num;
//			 aa = aa/10;
//		 }
//		 System.out.println(add);
		 
//		 //remove number from string
//		String str1= "d342jin56342ok";
//		String s = str1.replaceAll("[^a-zA-Z]", ""); 
//		System.out.println(s);
//		
//		//remove character from String 
//		String aa="sd324fdg56";
//		String ss = aa.replaceAll("[^0-9]", "");
//		System.out.println(ss);
		
		
//		//print the number present inside the array in assending order without repeating numbers
//		int a[] = {5,3,6,1}; int b[] = {3,5,6,1,4};
//		Arrays.sort(a);
//		Arrays.sort(b);
//		Set<Integer> s1 = new HashSet<>();
//		//int c = a.length+b.length;
//		for(int i=0;i<a.length;i++) {
//			s1.add(a[i]);
//		}
//		for(int j=0;j<b.length;j++) {
//			s1.add(b[j]);
//		}
//		for(int v : s1) {
//			System.out.println(v);
//		}
		
		//find the duplicate character inside the string
		
		String s="fsdifnawlkn";
//		Set<Character> set = new HashSet<>();
//		for(int i=0;i<s.length();i++) {
//			set.add(s.charAt(i));
//		}
//		for(Character f :set) {
//			System.out.println(f);
//		}
		
		StringBuilder str = new StringBuilder();
		s.chars().distinct().forEach(e -> str.append((char)e));
		System.out.println(str);
		
		StringBuilder str1 = new StringBuilder();
		for(int i=0;i<s.length();i++) {
			char ch = s.charAt(i);
			int idx = s.indexOf(ch, i+1);
			if(idx==-1) {
				str1.append(ch);
			}
		}
		System.out.println(str1);
	}

}
