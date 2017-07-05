package exercise.exercise3;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.TreeSet;

/**
 * Created by Radu.Hoaghe on 04/20/2015.
 *
 * Exercise 3: Fill three Set implementations that you know (Hint: they were described during
 *             the earlier presentation) with the List<String> that is given to this class by
 *             its constructor.
 *
 *             Check out the elements that the list mentioned above contains and then, add them
 *             to your three Sets. After this check out the elements of your Sets. What do you
 *             remark? What could be the reason?
 *
 *             Finally, add to the one of the three Sets some elements
 *             that already exist in the Set (e.g add("that") and add("collection"))
 *
 *             To run your implementation, run the Exercise3Test class.
 */
public class Exercise3 {
    HashSet<String > hs = new HashSet<String>();
    LinkedHashSet<String> lhs = new LinkedHashSet<String>();
    TreeSet<String> ts = new TreeSet<String>();
    // List containing some elements that need to be added into the Set
    private List<String> listToAdd;

    public Exercise3(List<String> l) {
        listToAdd = l;
    }

    public void addElementsToSets(){

        System.out.println("The elements that will be added to the Sets: ");
        // TODO Exercise #3 a) Check the content of the elements you will add into the Set
         for(String e : listToAdd){
             System.out.println(e);
         }


        // TODO Exercise #3 b) add the elements from listToAdd to the Sets
        hs.addAll(listToAdd);
        lhs.addAll(listToAdd);
        ts.addAll(listToAdd);

        // TODO Exercise #3 c) Check the content of the Sets
        System.out.println("\nThe elements contained in the first Set: ");
        System.out.println(hs);

        System.out.println("\nThe elements contained in the second Set: ");
        System.out.println(lhs);

        System.out.println("\nThe elements contained in the third Set: ");
        System.out.println(ts);


        System.out.println("\nThe elements contained in the TreeSet after inserting two duplicates: ");

        // TODO Exercise #3 d) Add to the TreeSet two elements that already exist in the Set
        // TODO Exercise #3 d) and print again the TreeSet. What do you see?
        ts.add("that");
        ts.add("collection");
        System.out.println(ts);
    }
}
