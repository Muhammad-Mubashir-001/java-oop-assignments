// Code to implement inhertance and method overloading.
public class Employee {
    int age;
    String name;
    
    void setAgeandName(int age, String name){
        this.age = age;
        this.name= name;
    }
    
    
    void work(){
        System.out.println("I am an Employee");
        System.out.println(",My name is "+name+" and I am "+age+"years old");
    }
    public static void main(String[]args){
        Employee obj = new Employee();
        Manager obj1 = new Manager();
        Developer obj2 = new Developer();
        Designer obj3 = new Designer();
        obj.setAgeandName(20,"Ali");
        obj.work();
        obj1.setAgeandName(20,"Usman");
        obj1.work();
        obj2.setAgeandName(20,"Ahmed");
        obj2.work();
        obj3.setAgeandName(20,"Hasham");
        obj3.work();
    }
}

    class Manager extends Employee{
        void work(){
            System.out.println("I am a Manager");
            System.out.println(",My name is "+name+" and I am "+age+"years old");
        }
    }
    class Developer extends Employee{
        void work(){
            System.out.println("I am a  Developer");
            System.out.println(",My name is "+name+" and I am "+age+"years old");
        }
    }
class  Designer extends Employee{
    void work(){
        System.out.println("I am a Designer");
        System.out.println(",My name is "+name+" and I am "+age+"years old");
    }
}

        
    

