public class StringComparison {

	 public static void main(String[] args) {
	  String str = "This is a test string";
	  String str1 = new String("This");
	  System.out.println("String for comparison -- " + str.substring(0, 4));
	  // Should be true	
	  System.out.println("This".equals(str.substring(0, 4)));
	  // will be false, equals is case sensitive
	  System.out.println("this".equals(str.substring(0, 4)));
	  
	  // returns true, case is ignored
	  System.out.println("this".equalsIgnoreCase(str.substring(0, 4)));
	  // returns true
	  System.out.println("this".equalsIgnoreCase(str1));
	 }
	}

class StringComparison1 {
	  public static void main(String[] args) {
	    String str1 = "run";
	    String str2 = new String("run");
	    String str3 = "gun";
	    String str4 = "sun";
	    
	    //equal so returns 0
	    System.out.println(str1.compareTo(str2));
	    // Comparison with in a condition
	    // that's how generally used 
	    if(str1.compareTo(str2) == 0){
	      System.out.println("str1 is equal to str2");
	    }else{
	      System.out.println("str1 is not equal to str2");
	    }
	      
	    //str1 > str3 so returns positive integer
	    System.out.println(str1.compareTo(str3));
	    // with condition
	    if(str1.compareTo(str3) > 0){
	      System.out.println("str1 is greater than str3");
	    }else{
	      System.out.println("str1 is less than str3");
	    }
	    
	    // str1 < str4 so returns negative integer
	    System.out.println(str1.compareTo(str4));       
	  }
	}
class StringComparison2 {

	 public static void main(String[] args) {
	  String str = "This is a test string";
	  // Should be true
	  System.out.println(str.startsWith("This"));
	  // test start at index 10, so returns true
	  System.out.println(str.startsWith("test", 10));
	  
	  // returns false
	  System.out.println(str.endsWith("test"));
	  // returns true
	  System.out.println(str.endsWith("test string"));
	  // returns true
	  System.out.println(str.endsWith("string")); 
	 }
	}
class StringComparison3 {

	 public static void main(String[] args) {
	  String str1 = "This is an example string";
	  String str2 = new String("example");
	  String str3 = "Example";
	  // returns true
	  System.out.println(str1.regionMatches(11, str2, 0, str2.length()));
	  // returns false
	  System.out.println(str1.regionMatches(11, str3, 0, str3.length()));
	  // returns true as case is ignored
	  System.out.println(str1.regionMatches(true, 11, str3, 0, str3.length()));
	 }
	}
