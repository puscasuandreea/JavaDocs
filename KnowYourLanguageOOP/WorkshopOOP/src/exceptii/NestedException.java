package exceptii;

/**
 * Created by Andreea.Puscasu on 7/4/2017.
 */
public class NestedException {

    public static void metoda() throws MyException {
        int v [] = new int[5];
        try {
            v[6] = 8;

        }catch (Exception e){
            throw new MyException();
        }

    }

    public static void main(String [] args) {

        try{
            metoda();
        }catch (Exception e){
            System.out.println("Exceptia este tratata!");
        }
    }

}
