package gov.nasa.jpf.symbc;


public class ExSymExeStrings23 {
	static int field;

  public static void main (String[] args) {
	  String a="aaa";
	  String b = "bbb";
	  String c = "ccc";
	  String d = "ddd";
	  test (a,b, c,d);
	  Debug.printPC("This is the PC at the end:");
	  //a=a.concat(b);
	  
  }
  
  public static void test (String a, String b, String c, String d) {
	  if (a.equals(b)) {
		  System.out.println("aaa");
	  }
	  if (b.equals(c)) {
		  System.out.println("bbb");
	  }
	  if (c.equals(d)) {
		  System.out.println("ccc");
	  }
	  if (d.equals(a)) {
		  System.out.println("ddd");
	  }

  }

}

