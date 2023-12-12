import java.util.StringJoiner;

public class StringJoinerDemo {
 public static void main(String[] args) {
  String str1 = "An";
  String str2 = "example";
  String str3 = "string";
  // providing delimiter
  StringJoiner sj = new StringJoiner(":");
  // adding strings that are to be joined
  sj.add(str1).add(str2).add(str3);
  System.out.println(sj.toString());
 }
}

class StringJoinerDemo2 {
 public static void main(String[] args) {
  StringJoiner sj = new StringJoiner(":", "[", "]");
  System.out.println("StringJoiner- " + sj.toString());
  sj.setEmptyValue("No element is added yet");
  System.out.println("StringJoiner- " + sj.toString());
  sj.add("Adding").add("Values").add("Now");
  System.out.println("StringJoiner- " + sj.toString());
 }
}

class StringJoinerDemo3 {
 public static void main(String[] args) {
  StringJoiner sj1 = new StringJoiner(":", "[", "]");
  sj1.add("This").add("is").add("First").add("String");
  System.out.println("Length of sj1- " + sj1.length());
  StringJoiner sj2 = new StringJoiner("-", "{", "}");
  sj2.add("Second").add("String");
  System.out.println("Length of sj2- " + sj2.length());
  sj1 = sj1.merge(sj2);
  System.out.println("Merged String- " + sj1.toString());
  System.out.println("Length of Merged String- " + sj1.length());
 }
}
