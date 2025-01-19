package array_list;

import java.util.ArrayList;

public class Colour_List {
    public static void main(String[] args) {

        //array list
        ArrayList<String> colours = new ArrayList<>();
        colours.add("Red");
        colours.add("Green");
        colours.add("Blue");
        colours.add("Orange");
        colours.add("Violet");
        colours.add("Yellow");
        System.out.println("colours in the array list are: ");
        for (int i = 0; i < colours.size(); i++) {
            System.out.println(colours.get(i));
        }


    }
}
