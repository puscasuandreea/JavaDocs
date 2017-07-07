package exercise0;

import javax.swing.text.html.HTMLDocument;
import java.util.HashMap;
import java.util.Iterator;

/**
 * Created by Radu.Hoaghe on 4/20/2015.
 *
 * Exercise 0: Iterate over the keys of a Map using keySet method (this method returns a Set of all the map keys) and
 *          print all its elements.
 */
public class Exercise0 {

    public Exercise0() {

    }

    public void iterateThroughMap() {

        //  Exercise #0 a) Create a Map (HashMap) and add elements to it (using put() method)
        HashMap<Integer, String> map = new HashMap<Integer, String>();
        map.put(1, "RED");
        map.put(2, "GREEN");
        map.put(3, "BLUE");
        map.put(4, "WHITE");


        //  Exercise #0 a) Hint: Don't forget to specify the types of the key and value when creating the Map

        //  Exercise #0 b) Iterate over the Map using keySet() method and print all its elements

        for (int k : map.keySet()) {
            System.out.println("Print the elements: " + k + " " + map.get(k));


        }


        //  Exercise #0 b) The elements could be printed like this: [key1=value1, key2=value2, ...]
        System.out.println(map.toString());
    }

    public static void main(String[] args) {
        Exercise0 exercise0 = new Exercise0();
        exercise0.iterateThroughMap();

    }
}

