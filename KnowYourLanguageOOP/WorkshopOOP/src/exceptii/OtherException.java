package exceptii;

/**
 * Created by Andreea.Puscasu on 7/4/2017.
 */
public class OtherException {
    public static void main(String[] args) {
        try(MyResource  mr = new MyResource()){
            System.out.println("MyResource creata intr-un tr-catch cu resurse");
        } catch (Exception e){
            e.printStackTrace();
        }
        System.out.println("in afara blocului try-catch");

    }
    static class MyResource implements AutoCloseable{
        public void close() throws Exception{
            System.out.println("Inchiderea resursei");
        }
    }
}
