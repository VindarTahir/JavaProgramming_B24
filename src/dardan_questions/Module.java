package dardan_questions;

import java.util.ArrayList;
import java.util.Collections;

public class Module{

    ArrayList<File> files;


    public Module(){
        ArrayList<File> files = new ArrayList<>();
    }

    public void addFile(ArrayList<File> file1){
        Collections.addAll(file1);
    }

    public static void main(String[] args) {

        Quiz quiz1 = new Quiz("Static", 15, 25);
        System.out.println(quiz1.toString());

        File file1 = new File("Safari", 1.27);
        Module module1 = new Module();

        ArrayList<File> file2 = new ArrayList<>();
        file2.add(file1);
        module1.addFile(file2);

        System.out.println(module1);

    }

}
