public class Custom_Exception {
	  public static void main(String[] args) {
		  try {
			  Exception se = new Exception();
			  System.out.println(se);
			}
			catch (Exception e) {
			  System.out.println("sorry, error" + e);
			}
			finally {
			  System.out.println("maybe worked");
			}
	  }
	}
