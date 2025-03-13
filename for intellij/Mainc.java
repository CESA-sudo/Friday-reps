import java.util.Calendar;

public class Mainc {
    public static void main(String[] args) {
    Cafe cafe = new Cafe();
    cafe.loadMenudata();
    System.out.println("Here is our Cafe Menu:");
    for (String cofee : cafe.getCofeeMenu()){
        System.out.println(cofee);
    }
    }

}

