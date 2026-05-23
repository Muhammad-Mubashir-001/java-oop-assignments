
public class Addition {
    int a,b,c;
    double x,y;
    void addtion (int a , int b){
        System.out.println("The addition of a and b is :"+(a+b));
    }
    void addition (int a,int b,int c){
        System.out.println("The addition of a and b and c is : "+(a+b+c));
    }
    void addition (double x, double y){
        System.out.println("The addition of x and y is :"+(x+y));
    }
    public static void main(String[]args){
        Addition obj = new Addition();
        obj.addition(5,5);
        obj.addition(5,5,5);
        obj.addition(5.5,5.5);
    }
}