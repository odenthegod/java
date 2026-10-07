abstract class Shape{
    abstract void draw();
}
interface Borderable{
    void setborder(int width);
}
class rectangle extends Shape implements Borderable{
    @Override 
    void draw(){
        System.out.println("drawing a rectangle");
    }
    @Override 
    public void setborder(int width){
        System.out.println("thickness of the border is "+ width);
    }
}
public class implement{
    public static void main(String[] args) {
        rectangle r=new rectangle();
        r.draw();
        r.setborder(5);

        System.out.println("--using polymorphism--");
        Shape s=new rectangle();
        s.draw();

        Borderable b=new rectangle();
        b.setborder(4);

    }
}
//notes
//abstract classes , partial abstraction
//interface , full abstraction
//a class can extend only one abstract class but multiple interface
//abstract classes have both abstract method and with regular body
//interface have default , static and abstract methods
//abstract have variable like int , String
//interface have public static final (constants);
//no object from abstract classes
//method from interface , must mention public