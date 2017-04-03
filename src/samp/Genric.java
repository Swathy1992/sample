package samp;

public class Genric {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mygen<String> obj=new Mygen<String>();
		obj.add("heloooo");
	//	obj.add(3333); compile time error
		System.out.println(obj.get());

	}

}


// T type indicate it can refer to any datatypes

class Mygen<T>{
	T ob;
	public void add(T ob)
		{
			this.ob=ob;
		}
		public T get()
			{
				return ob;
		
			}
}