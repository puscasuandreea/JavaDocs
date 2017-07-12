package ro.teamnet.zerotohero.reflection;

import ro.teamnet.zerotohero.reflection.demoobjects.*;
import ro.teamnet.zerotohero.reflection.demoobjects.Number;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.Collection;

/**
 * TODO
 * in order to resolve the exercises below, you will have to create
 * all the needed clasees, with their members and methods
 * (in ro.teamnet.zerotohero.reflection.demoobjects package)
 */
public class ClassReflectionDemoMain {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        // get the class for a String object, and print it
        Class cls = "ob".getClass();
        System.out.println(cls);

        // get the class of an Enum, and print it
        Class cls1 = Enum.class;
        System.out.println(cls1);
        // get the class of a collection, and print it
        Class cls2 = Collection.class;
        System.out.println(cls2);

        //get the class of a primitive type, and print it
        Class cls3 = boolean.class;
        System.out.println(cls3);

            //T get and print the class for a field of primitive type
        FieldClass fc = new FieldClass("camp gasit");
        Class cls5 = fc.getClass();
        try {
            System.out.println(cls5.getField("x").getType());
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }


        // get and print the class for a primitive type, using the wrapper class

            Class cls6 = Integer.TYPE;
            System.out.println(cls6.getCanonicalName());

        // get the class for a specified class name
        try {
            Class cls7 = Class.forName("ro.teamnet.zerotohero.reflection.demoobjects.StringClass");
            System.out.println(cls7);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }


        // get the superclass of a class, and print it
            Class cls8 = Grandparent.class.getSuperclass();
            System.out.println(cls8);

        // get the superclass of the superclass above, and print it
        Class cls9 = Parent.class.getSuperclass().getSuperclass();
        System.out.println(cls9);

        // get and print the declared classes within some other class
        Class cls10[] = ClassOuter.class.getDeclaredClasses();
        for(Class c: cls10){
            System.out.println(c);
        }

        // print the number of constructors of a class
        int num = Number.class.getDeclaredConstructors().length;
        System.out.println(num);


        // get and invoke a public constructor of a class
        Cons c2 = new Cons();
        Class cl = c2.getClass();


        try {
            Constructor c = cl.getConstructor(int.class);
            try {
                System.out.println("invok e" + c.newInstance(3));
            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (InvocationTargetException e) {
                e.printStackTrace();
            }
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }



        //get and print the class of one private field
        FieldPrivate fp = new FieldPrivate();
        Field privateStringField = FieldPrivate.class.getDeclaredField("str");
        privateStringField.setAccessible(true);
        String fieldValue = (String)privateStringField.get(fp);
        System.out.println("fieldValue=" + fieldValue);

        // set and print the value of one private field for an object
        privateStringField.set(fp,"stri");
        System.out.println((String)privateStringField.get(fp));

        // get and print only the public fields class
        Field[] fields = FieldPrivate.class.getFields();
        System.out.println(fields[0].get(fieldValue));


        //TODO get and invoke one public method of a class

        

        //TODO get and invoke one inherited method of a class
       
		
		//TODO invoke a method of a class the classic way for ten times, and print the timestamp (System.currentTimeMillis())
		//TODO invoke a method of a class by Reflection for 100 times, and print the timestamp
		//what do you observe?
		
    }
}
