package array_list;

import java.util.ArrayList;

public class RemoveElement {

    public static void main(String[] args) {

                ArrayList<String> colour = new ArrayList<>();
                colour.add("red");
                colour.add("green");
                colour.add("blue");
                colour.add("yellow");
                colour.add("pink");

                System.out.println("Elements before removing :"+colour);

                colour.clear();
                System.out.println("Elements after removing :"+colour);


    }
}
