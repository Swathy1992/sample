package samp;

public class Test2 implements inf1 {
public static void main(String[] args) {
	inf1 i=new Test2();
	i.meth("swaaa");
}

@Override
public void meth(String s) {
	// TODO Auto-generated method stub
	System.out.println("meeeee");
	
}
}
@FunctionalInterface // an interface with one abstarct method
interface  inf1{
void meth(String s);

default void meth1(String s){
	System.out.println("default"+s);
}
static void meth2(String s1){
	System.out.println("static"+s1);
}
}
