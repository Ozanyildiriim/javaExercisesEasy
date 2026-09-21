package Chapter7OopClassesAndInherıtance;

public class Car {


    private String maker = "Tesla";
    private String model = "Model X";
    private String color = "Gray";
    private int doors = 2;
    private boolean convertible = true;

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getDoors() {
        return doors;
    }

    public boolean isConvertible() {
        return convertible;
    }

    public String getMake(){
        return maker;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public void setConvertible(boolean convertible) {
        this.convertible = convertible;
    }

    public void setMaker(String maker){
        if (maker == null) maker = "Unkown";
        String lowercaseMake = maker.toLowerCase();
        switch (lowercaseMake){
            case "holden", "porsche","tesla" -> this.maker = maker;
            default -> {
                this.maker = "Unsupported";
            }
        }
    }

    public void describeCar(){
        System.out.println(doors + "-Door " +
                color + " " +
                maker + " " +
                model + " " +
                (convertible ? "Convertible" : ""));
    }
}
