package exercise3;

import javafx.beans.binding.MapBinding;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Created by Andreea.Puscasu on 7/7/2017.
 */
public class MainClass {

    public static <V> void print(Map<V, BigDecimal> map) {
        Iterator it = map.entrySet().iterator();
        while(it.hasNext()){
            V elem = (V) it.next();
            System.out.println(elem.toString());

        }
    }

    public static void main(String[] args) {


        Map<Std1, BigDecimal> map1 = new HashMap<Std1, BigDecimal>();
        Map<Std2,BigDecimal> map2 = new HashMap<Std2, BigDecimal>();
        Map<Std3,BigDecimal> map3 = new HashMap<Std3, BigDecimal>();
        Map<Std4,BigDecimal> map4 = new HashMap<Std4, BigDecimal>();


        map1.put(new Std1("Andrei","Popa"),new BigDecimal(22.0));
        map1.put(new Std1("Andrei","Popaaaaa"),new BigDecimal(22.0));
        map1.put(new Std1("Gabriel","Tanase"),new BigDecimal(23.0));
        map2.put(new Std2("Ionut","Dumitrescu"), new BigDecimal(21.00));
        map2.put(new Std2("Ionut","Dumitrescu"), new BigDecimal(26.00));
        map2.put(new Std2("Ioana","Iliescu"), new BigDecimal(21.00));
        map3.put(new Std3("Denisa","Ionescu"), new BigDecimal(23.00));
        map3.put(new Std3("Roxana","Stamate"), new BigDecimal(23.00));
        map3.put(new Std3("Ioana","Ionescu"), new BigDecimal(23.00));
        map4.put(new Std4("Gabriela","Matei"), new BigDecimal(29.00));
        map4.put(new Std4("Gabi","Matache"), new BigDecimal(27.00));
        map4.put(new Std4("Gabriela","Matei"), new BigDecimal(25.00));

        print(map1);
        print(map2);
        print(map3);
        print(map4);

        }



    }

