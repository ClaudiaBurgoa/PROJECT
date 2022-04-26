package practical2;

	 class Temp{
			private Temp (int data) {
				System.out.println("Constructor called");
			}
			
			protected static Temp create (int data) {
				Temp obj = new Temp(data);
				return obj;
				
			}
			public void myMethod() {
				System.out.println("Method called");
			}
		 }
		public class Test{
			public static void main(String[] args) {
				Temp obj = Temp.create(20);
				obj.myMethod();
			}
		}
	
	
	
	
	
	

	
//	private String function(String Temp, int data) 
//	{
//	return ("GFG");	
//	}
//	private String function(int data, String Temp) 
//	{
//	return ("GeeksForGeeks");	
//	}
//	public static void main(String[]args) {
//		Test obj=new Test();
//		System.out.println(obj.function(4,"GFG"));
//	}

