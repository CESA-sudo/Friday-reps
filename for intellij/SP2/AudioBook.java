public class AudioBook extends Title{
    private int durationinMinutes ;
    public AudioBook(String title, String literatureType, int copies, int durationinMinutes) {
        super(title, literatureType, copies);
        this.durationinMinutes = durationinMinutes;
    }

    @Override
    protected double calculatePoints() {
        return (durationinMinutes /2.0) *convertLiteratureType() * copies;
    }
}
