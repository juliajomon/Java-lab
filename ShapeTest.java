abstract class Shape{
    int numberOfSides(){

    }
}
class Rectangle extends Shape{
    @Override
    int numberOfSides(){
       return 4;
    }
}

class Triangle extends Shape{
    @Override
    int numberOfSides(){
        return 3;
    }
}

class Hexagon extends Shape{
    @Override
    int numberOfSides(){
        return 6;
    }
}

class ShapeTest{
    public static void main (String[] args){
        Rectangle rectangle = new Rectangle();
        Triangle triangle = new Triangle();
        Hexagon hexagon = new Hexagon();

        System.out.println("Number of sides in Rectangle: " + rectangle.numberOfSides());
        System.out.println("Number of sides in Rectangle: "+ triangle.numberOfSides());
        System.out.println("Number of sides in Rectangle: "+ hexagon.numberOfSides());
    }
}
