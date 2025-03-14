import java.io.File;
import java.io.FileNotFoundException;
//import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Cafe {
    private ArrayList <String> cofeeMenu;
    public Cafe() {// make a constructor to initalise the declared arraylist
        this.cofeeMenu = new ArrayList<>();
    }

    public ArrayList<String> getCofeeMenu() {
    return cofeeMenu;
    }


    public void loadMenudata(){
       try {
           File file = new File("resources/cofees.txt");
           Scanner scan = new Scanner(file);
           while(scan.hasNextLine()){
               cofeeMenu.add(scan.nextLine());
           }
           scan.close();
       }catch(FileNotFoundException e){
           System.out.println("File not found. Check if cofees.txt exists");
       }

    }
}
