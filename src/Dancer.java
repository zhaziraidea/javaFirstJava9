public class Dancer extends Person {

    private String groupName;

    public Dancer(String name, String designation, String groupName) {
        super(name, designation);
        this.groupName = groupName;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public void dancing() {
        System.out.println("dancer is dancing");
    }

    @Override
    public void learn() {
        System.out.println("dancer learning");
    }

    @Override
    public void walk() {
        System.out.println("dancer walking");
    }

    @Override
    public void eat() {
        System.out.println("dancer eating");
    }

    @Override
    public String toString() {
        return "Dancer{" +
                "name='" + getName() + '\'' +
                "designation='" + getDesignation() + '\'' +
                "groupName='" + groupName + '\'' +
                '}';
    }
}
