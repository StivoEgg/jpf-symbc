package gov.nasa.jpf.symbc;


public class ExSymExeStrings40 {
	static int field;

  public static void main (String[] args) {
	  String a="aaa";
	  String b = "bbb";
	  String c = "ccc";
	  String d = "ddd";
	  test (a,b, 1);
	  Debug.printPC("This is the PC at the end:");
	  //a=a.concat(b);
	  
  }
  
  public static void test (String a, String b, int x) {
	  if (a.endsWith("hello")) {
		  System.out.println("abc");
	  }
	  if (a.indexOf("el") == 2) {
		  System.out.println("boo");
	  }

  }

}

