import Shapes.Square;
import Shapes.Rectangle;
import Utils.Math;
public class Driver{
public static void main(String[] args){
Square area = new Square(10);
Rectangle recarea = new Rectangle(2,50);
System.out.println(area.getArea());
System.out.println(recarea.getArea());
System.out.println(Math.factorial((int)15.6));
System.out.println(Math.factorial1((int)15.6));
}
}
