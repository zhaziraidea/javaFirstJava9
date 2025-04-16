public class Dog extends Animal{

    public Dog(String name, double weight, String paroda) {
        super(name, weight, paroda);
    }
//    @Override
//    public void makeSound(){
//        System.out.println("gaf gaf");
//    }

    @Override
    public void makeSound() {
//        super.makeSound();
        System.out.println("gaf gaf");
    }
}
