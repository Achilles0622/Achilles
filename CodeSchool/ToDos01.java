package CodeSchool;
import java.util.ArrayList;
public class ToDos01 {
    public static void main(String[] args) {

        ArrayList<String> sherlocksToDos = new ArrayList<String>();

        sherlocksToDos.add("visit the crime scene");
        sherlocksToDos.add("play violin");
        sherlocksToDos.add("interview suspects");
        sherlocksToDos.add("solve the case");
        sherlocksToDos.add("apprehend the criminal");

        ArrayList<String> poirotsToDos = new ArrayList<String>();

        poirotsToDos.add("visit the crime scene");
        poirotsToDos.add("interview suspects");
        poirotsToDos.add("let the little grey cells do their work");
        poirotsToDos.add("trim mustache");
        poirotsToDos.add("call all suspects together");
        poirotsToDos.add("reveal the truth of the crime");

        System.out.println("Sherlock's third to-do:");
        System.out.println(sherlocksToDos.get(2));

        System.out.println("\nPoirot's second to-do:");
        System.out.println(poirotsToDos.get(1));

    }
}
