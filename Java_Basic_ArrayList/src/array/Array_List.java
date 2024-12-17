package array;

import java.util.ArrayList;

public class Array_List {

    public static void main(String[] args) {

        //array
        int[] numbers = {1, 2, 3, 4, 5};
        //array list
        ArrayList<String> name = new ArrayList<>();

        System.out.println(name.size());

        name.add ("Ali");
        name.add ("Ahmet");
        name.add ("Ayse");
        name.add ("Fatma");

        System.out.println(name);
        name.remove(1);
        System.out.println(name);

        System.out.println(name.size());

        for (int i = 0; i < name.size(); i++) {
            System.out.println(name.get(i));
        }
        name.clear();
        System.out.println(name.size());

    }
}
