
public class StaticVar {
    
static int a = 10; // static variable
int x = 10;   //instance vatriable
void method(){
int b = 10; // local variable
System.out.println(a+ " " +b+" "+x);
++a;
++b;
    
}
    void method1(){
int b = 10; // local variable
System.out.println(a+ " " +b+ " "+x);
++a;
++b;
++x;        
}
public static void main (String [] args)
{
    StaticVar ref = new StaticVar ();
    StaticVar ref1 = new StaticVar ();
    
ref.method();
ref.method();
ref1.method1();   
ref1.method1();  
ref.method();    
}
}
