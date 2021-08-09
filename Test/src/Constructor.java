	/*More in inheritance concept
 *  example we have class A and we have variables
 * class A
 * {
 * int i;
 * float f;
 * }
 * Now want to create object of A --> we need a main method --> in order to call main method needs PARAMETERS --> we need pass initial parameters we pass in string args[]
 * parameters can be any int, float, char, string --> we take "STRING" which accepts all values --> how many values we use not sure so we take "args"
 * the main will return nothing so we write "VOID" -->main method can be "static" --> WHY IT SHOULD BE STATIC? 
 * ANS: To call any method in java we need object --> we can create object once execution starts -> main is start point --> we cant call main without object and cant create object without main -> dead lock
 * to solve this--> we call STAIIC method -->" we don't need object to call main you just need class name" --> lets make it public so add public
 * 				public static void main (String args[]) 
 * 				{
 * 				}
 * How to create object of A --> create a reference like "obj" -->specify key word called "NEW"
 * NEW --> provide space, used to create object -> now have to specify how much space required also --> which is given by ""CONSTRUCTOR""
 * Constructor: every class will have a constructor even though we dont mention it. 
 * 				its a member method, need brackets --> ()
 * 				which will have same name as class name--> A example
 * 				Will never return anything so mention "public"
 * 				Used to allocate memory
 * class A
 * {
 * 		int i;
 * 		float f;
 *  	public A() --> constructor, even if u dont define constructor it will be there inside your class --> hence are called ""Default Constructor""
 * } 
 * public static void main (String args[]) 
 * {
 * 	A obj = new. A();
 * }
 * Constructor can also be use to provide initial values for the variables Example
 * class A
 * {
 * 		int i; --> initial value will be 0
 * 		float f; --> will be 0.0
 * but want to provide initial values for variable apart from 0 we can do using constructor
 * 		public A();
 * 			{
 * 				i =5;
 * 				f=5.5f;
 * 			}
 * }
 * YOU CAN'T CALL THE CONSTRUCTOR FOR SAME INSTANCE --> EVERY TIME YOU CREATE OBJECT CONSTRUCTOR WILL BE CALLED AUTOMATICALLY
 * WE CAN HAVE DIFFERENT TYPES OF CONSTRUCTORS IN same CLASS BUT WITH DIFFERENT PARAMETERS --> ""CONTRUCTOR OVERLOADING""
 * class A
 * {
 * 		int i; --> initial value will be 0
 * 		float f; --> will be 0.0
 * 		public A();
 * 			{
 * 				i =5;
 * 				f=5.5f;
 * 				syso ("Hi");
 * 			}
 * 		public A(int k)
 *			{
 *				i=k;
 *				syso("Hello");
 *			}
 * }
 * How do you call the other constructor --> in object you should as below
 * public static void main (String args[]) 
 * {
 * 	A obj = new A(); --> this will print "Hi" cause we are calling a default constructor
 *  A obj = new A(6); --> to call other constructor you need to pass a value --> prints "Hello"
 *  we can also have two parameters in constructor,example:
 *  public A(int k, float j)
 *  {
 *  }
 *  then you have to pass two parameters in object
 *  A obj = new A(6, 5.6f); --> will call the constructor
 * }
 * Example of calculator below
 */

class Calci
	{
		int num1;
		int num2;
		int result;
		public Calci()
		{
			num1 = 5;
			num2 = 3; // now if u run code o/p will be accordingly - changed initial value to 5 or 3 from 0
			System.out.println("hello"); // can also print statements in constructor --> need not call constructor,its called automatically
		}
//can have two constructors in same class
//DEFAULT CONSTRUCTOR		
		public Calci(int n) // instead of assigning value as above we can pass any value as line 101
		{
			num1=n;
			num2=n;
		}
//PARAMETERISED CONSTRUCTOR
		public Calci(double d)
		{
			num1 = (int) d; //num1 is integer so cast it with int
			num2 = (int) d;
		}
		public Calci(double t, int r)
		{
			num1 = (int) t;
			num2 = r;
		}
	}

public class Constructor {

	public static void main(String[] args) 
	{
//		Calci obj = new Calci(); // Constructor --> will call constructor for class calci
//   	Calci obj = new Calci(7); //7 will be assigned to n in second constructor & while creating object if you assign value it will call that constructor which takes that value
// i want o pass a value like 7.5 then
//		Calci obj = new Calci(9.5); // --> can create one more constructor like 3rd above
		// o/p is 7 --> POINT HERE IS YOU CAN PASS ANY PARAMETER
//can pass two values also
		Calci obj = new Calci(7.5, 8);
		System.out.println(obj.num2); //O/p will be 0  --> instead i want constructor which assign value --> in class calci above
	}

}
