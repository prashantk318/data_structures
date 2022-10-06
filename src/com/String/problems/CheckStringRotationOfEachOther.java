package com.String.problems;

public class CheckStringRotationOfEachOther {
public static void main(String[] args) {
	
	String s = "IndiaVsEngland";
	String p = "EnglandIndiaVs";
	boolean m = rotationOfEachOther(s, p);
	System.out.println(m);
	boolean ss = rotationOfStringwithoutCacatenation(s, p);
	System.out.println(ss);
	
}

public static boolean rotationOfEachOther(String s, String rotation) {
	if(s.length() != rotation.length()) {
		return false;
	}
	String concate = s + s;
	if(concate.indexOf(rotation) != -1) {
		return true;
	}
	return false;
}

public  static boolean rotationOfStringwithoutCacatenation(String m, String r) {
	if(m.length() !=r.length()) {
		return false;
	}
	if(m==null || r==null)
		return false;
	
	int index = r.indexOf(m.charAt(0));
	if(index >-1) {
		if(m.equalsIgnoreCase(r))
			return true;
		int finalmIndex = r.length() -index;
		return m.charAt(finalmIndex)==r.charAt(0)&& m.substring(finalmIndex).equals(r.substring(0,index));
	}
	return false;
}
}
