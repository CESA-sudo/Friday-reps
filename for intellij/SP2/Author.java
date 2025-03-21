import java.util.ArrayList;

public class Author {
    private String name;
    private ArrayList<Title> titles;
    public Author(String name){
        this.name = name;
        this.titles = new ArrayList<>();

    }
    public String getName(){
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public ArrayList<Title> getTitles(){
        return titles;
    }
    public void setTitles( ArrayList<Title> titles){
        this.titles = titles;
    }
    public void addTitle(Title title){
        titles.add(title);
    }
    public float calculateTotalPay(){
        float totalpay =0;
        for(Title title : titles){
            totalpay += title.calculateRoyalty();
        }
        return (float) ((float)(totalpay * 100.0) / 100.0);
    }

}
