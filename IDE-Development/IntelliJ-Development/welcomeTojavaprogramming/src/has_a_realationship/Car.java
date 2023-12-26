public class Car {
    String color;
    String engineVarient;
    void engine(){
        System.out.println("Car engine");
    }
}
class Kia{
    Car carRef1;
    Kia(Car carRef2){
        this.carRef1 =carRef2;
    }
    void sonet(){
        System.out.print("Kia sonet");
        carRef1.color = "white";
        System.out.print(carRef1.color + ",");
        carRef1.engineVarient ="turbo1.0";
        System.out.print(carRef1.engineVarient + ",");
        carRef1.engine();}

    public static void main(String[] args) {
         Car car = new Car();
         Kia kiamodel = new Kia(car);
         kiamodel.sonet();
        System.out.println("done");
    }
}