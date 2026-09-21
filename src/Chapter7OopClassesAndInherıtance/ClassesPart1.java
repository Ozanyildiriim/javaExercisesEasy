package Chapter7OopClassesAndInherıtance;

public class ClassesPart1 {
    public static void main(String[] args) {
        Car car = new Car();
        car.setMaker("Porsche");
        car.setModel("Carrera");
        car.setDoors(2);
        car.setColor("Red");
        car.setConvertible(true);
        System.out.println("maker = " +car.getMake());
        System.out.println("model = " + car.getModel());

        car.describeCar();

        Car targa = new Car();
        targa.setMaker("Porsche");
        targa.setModel("Targa");
        targa.setDoors(2);
        targa.setColor("Red");
        targa.setConvertible(true);

        targa.describeCar();


    }

}
