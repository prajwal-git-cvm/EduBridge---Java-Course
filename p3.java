

//OOPS
// inheritance , ploymor 1) over laod / overrding
//, encap abst
// same name of a method with diff parameter
// with in the class
public class p3  {
	  void add(String s )
	  {
		  System.out.println("Sting");
	  }
	  void add(int a )
	  {
		  System.out.println("integer");
	  }
	  
	public static void main(String[] args) {
		p3  tt = new p3();
		tt.add("sdfasdf");
		tt.add(3);
		
	}
}