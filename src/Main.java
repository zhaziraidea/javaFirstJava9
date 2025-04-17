//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Programmer pr = new Programmer("Zhaz", "AAA", "Peaksoft");
        System.out.println(pr);
        pr.coding();
        pr.walk();
        pr.eat();
        pr.learn();

        Dancer dancer = new Dancer("Zhazi", "BBB", "Biykech");
        System.out.println(dancer);
        dancer.eat();
        dancer.walk();
        dancer.dancing();
        dancer.learn();

        Singer singer = new Singer("Zhazira", "ddd", "Abs");
        System.out.println(singer);
        singer.eat();
        singer.walk();
        singer.singing();
        singer.learn();
    }
}