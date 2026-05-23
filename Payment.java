// Program that implies method overriding in the scenario of online payment store
public class Payment {
    void makePayment(){
        System.out.println("You are using our online Payment app.");
    }
    public static void main (String[]args){
        // Dynamic methid dispatch is used for object creation.
        Payment obj ;
        obj = new Creditcard();
        obj.makePayment();
        obj = new Depitcard();
        obj.makePayment();
        obj = new EasyPaisa();
        obj.makePayment();
    }
}
class Creditcard extends Payment{
    @Override
    void makePayment(){
        System.out.println("Thank you for using Credit card.");
    }
}
class Depitcard extends Payment{
    @Override
        void makePayment(){
            System.out.println("Thank you for using Depit card.");
        }
    }
class EasyPaisa extends Payment{
    @Override
    void makePayment(){
        System.out.println("Thank you for using EasyPaisa.");
    }
}
    
