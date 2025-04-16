import java.sql.SQLOutput;

public class Animal {
    private String name;
    private double weight;
    private String paroda;

    //constructor without param
//    public Animal(){
//    }

    public Animal(String name, double weight, String paroda){
        this.name = name;
        this.weight = weight;
        this.paroda = paroda;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getParoda() {
        return paroda;
    }

    public void setParoda(String paroda) {
        this.paroda = paroda;
    }

    public void makeSound(){
        System.out.println("Animals make sound");
    }
//    @Override
//    public String toString(){
//        return " Animal: " +
//                " name: " + name +
//                " weight: " + weight +
//                " paroda: " + paroda;
//    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                ", paroda='" + paroda + '\'' +
                '}';
    }
}
