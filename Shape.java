public class Shape {
    void draw(){
        System.out.println("I am drawing");
    }
      public static void main(String[]args){
            Shape obj4 = new Circle();
            Shape obj1= new Rectangle();
            Shape obj2 = new Triangle();
            obj4.draw();
            obj1.draw();
            obj2.draw();
        }
    }



    class Circle extends Shape{
        void draw(){
            System.out.println("I am drawing a Circle");
        }
    }
    class Rectangle extends Shape{
        void draw(){
            System.out.println("I am drawing a Rectangle");
        }
    }
    class Triangle extends Shape{
        void draw(){
            System.out.println("I am drawing a Triangle");
        }
    }
    
      