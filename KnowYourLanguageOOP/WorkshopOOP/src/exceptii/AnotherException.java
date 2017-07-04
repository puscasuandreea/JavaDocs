package exceptii;

/**
 * Created by Andreea.Puscasu on 7/4/2017.
 */
public class AnotherException extends Throwable {

        public static void main(String[] args) {
            try{
                throw new MyException();
            }catch (MyException e){
                System.out.println("");
                System.out.println(e);
            }
        }
    }


