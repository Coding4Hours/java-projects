public class netjstech {

 public static void main(String[] args) {
	  String str1 = "An";
	  String str2 = "example";
	  String str3 = "string";
	  
	  // joining with space
	  String finalStr = String.join(" ", str1, str2, str3);
	  System.out.println("str - " + finalStr);
	  // joining with hyphen
	  finalStr = String.join("-", str1, str2, str3);
	  System.out.println("str - " + finalStr);	
 }
}
