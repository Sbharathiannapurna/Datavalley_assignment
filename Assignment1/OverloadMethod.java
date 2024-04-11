package Assignment1;
class Addition
{
	void add(int a,int b)
	{
		System.out.println(a+b);
	}
	void add(double a,double b,double c)
	{
		System.out.println(a+b+c);
	}
	void add(String a,String b)
	{
		System.out.println(a+b);
	}
}
public class OverloadMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Addition add1=new Addition();
add1.add(10, 20);
add1.add("Annapurna", "s");
add1.add(10.1, 20.2, 30.3);
	}

}
