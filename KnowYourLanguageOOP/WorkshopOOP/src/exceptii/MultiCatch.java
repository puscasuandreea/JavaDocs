package exceptii;

/**
 * Created by Andreea.Puscasu on 7/4/2017.
 */
public class MultiCatch {
    public static void main(String[] args) {


        try {
            System.out.println("A");
           metoda(5);
            System.out.println("B");

        } catch (MyException | AnotherException e) {
            System.out.println("B");

        }
    }

    public static void metoda(int x) throws MyException, AnotherException{
        if(x > 10){
            throw new MyException();

        }

        if(x > 10){
            throw new AnotherException();

        }
    }


}
