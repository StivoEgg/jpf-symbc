package gov.nasa.jpf.symbc;


public class ExSymExeStrings18 {
	static int field;

  public static void main (String[] args) {
	  String a="aaa";
	  String b = "bbb";
	  test (a,b);
	  Debug.printPC("This is the PC at the end:");
	  //a=a.concat(b);
	  
  }
  
  public static void test (String a, String b) {
	  if (a.endsWith("a")) {
		  System.out.println("bbb");
	  }

  }

}

