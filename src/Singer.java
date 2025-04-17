public class Singer extends Person {

    private String bandName;

    public Singer(String name, String designation, String bandName) {
        super(name, designation);
        this.bandName = bandName;
    }

    public String getBandName() {
        return bandName;
    }

    public void setBandName(String bandName) {
        this.bandName = bandName;
    }

    public void singing() {
        System.out.println("singer is singing");
    }

    public void playGuitar() {
        System.out.println("singer is playing a guitar");
    }

    @Override
    public void learn() {
        System.out.println("singer is learning");
    }

    @Override
    public void walk() {
        System.out.println("singer is walking");
    }

    @Override
    public void eat() {
        System.out.println("singer is eating");
    }

    @Override
    public String toString() {
        return "Singer{" +
                "name='" + getName() + '\'' +
                "designation='" + getDesignation() + '\'' +
                "bandName='" + bandName + '\'' +
                '}';
    }
}
