package com.String.problems;

public class StringReverse {
public static void main(String[] args) {
	String p = "Prashant";
String h =	reveseString(p);
System.out.println(h);
reveseString2(p.toCharArray());
	
}

public static String reveseString(String s) {
	char[]ch = s.toCharArray();
	
	String m = " ";
	for(int i = ch.length-1;i>=0;i--) {
		m = m+ch[i];
	}
	
	return m;
}

//new method

public static void reveseString2(char[] ch) {
	
	String dd = " ";
	int left = 0;
	int right =ch.length-1;
	while(left<right) {
		char temp = ch[left];
		ch[left] = ch[right];
		ch[right] = temp;
		left++;
		right--;
	}
	for(int i=0;i<ch.length;i++) {
		dd = dd+String.valueOf(ch[i]);
	}
	System.out.println(dd);
}


}
