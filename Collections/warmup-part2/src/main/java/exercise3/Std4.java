package exercise3;

/**
 * Created by Andreea.Puscasu on 7/7/2017.
 */
public class Std4 extends Student {
    public Std4(String firstName, String lastName) {
        super(firstName, lastName);
    }

    @Override
    public int hashCode() {
        int res3 = this.getFirstName().hashCode()+this.getLastName().hashCode();
        return  res3;
    }

    @Override
    public boolean equals(Object obj) {
       Std4 s3 = (Std4) obj;
       if(this.getLastName().equals(s3.getLastName())==false){
           return  false;
       }
       if(this.getFirstName().equals(s3.getFirstName()) == false){
           return  false;
       }
       return true;
    }
}
