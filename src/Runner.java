public class Runner {
    public static void main(String[] args){
        Car myCar = new Car(2013, "Toyota", "Prius");
        System.out.println(myCar.toString());
        myCar.drive(10000);
        System.out.println(myCar.toString());

        Rectangle myRectangle = new Rectangle(100, 100);
        System.out.println(myRectangle.getArea());
        System.out.println(myRectangle.getDiagonal());
        System.out.println(myRectangle.isSquare());
    }
}
