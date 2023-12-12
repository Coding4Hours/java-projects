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
