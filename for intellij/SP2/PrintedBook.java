public class PrintedBook extends Title{
    private int pages;
    public PrintedBook(String title, String literatureType, int copies,int pages) {
        super(title, literatureType, copies);
        this.pages = pages;
    }2

    @Override
    protected double calculatePoints() {
        return (pages) * convertLiteratureType() * copies;
    }
}
