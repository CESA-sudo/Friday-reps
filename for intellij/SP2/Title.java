public abstract class Title {
    private String title;
    private int literatureTypePoints;
    protected String literatureType;
    protected int copies;// how many books
    protected double rate = 0.067574; // rate at which authors are paid in 2025

    public Title(String title,String literatureType,  int copies){
        this.title = title;
        this.copies = copies;
        this.literatureType = literatureType;
    }
    public  double calculateRoyalty(){
        return calculatePoints() * rate; // pints * rate to get royalty pr book
    }

    protected abstract double calculatePoints();
    protected double convertLiteratureType(){
         switch (literatureType){
             case  "BI":
             case "TE":
                 return 3.0;
             case "LYRIK": return 6.0;
             case "SKØN" : return 1.7;
             case "FAG" : return 1.0;
             default: return 0.0;
         }

    }

}
