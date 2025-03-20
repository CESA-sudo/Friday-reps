import java.util.ArrayList;

public class LibraryRoyaltyCalculator {
    public static void main(String[] args) {

        Author author = new Author("Olga Ravn");
        author.addTitle(new AudioBook("Celstial (Audible) ","SKØN",140,192));
        author.addTitle(new PrintedBook("Celestial ","SKØN",140,166));
        author.addTitle(new PrintedBook("Alive", "LYRIK",180,60));

        System.out.println(author.getName() +": " + author.calculateTotalPay() +"kr");
    }
}