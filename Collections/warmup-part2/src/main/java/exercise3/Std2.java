package exercise3;

/**
 * Created by Andreea.Puscasu on 7/7/2017.
 */
public class Std2 extends Student {
    public Std2(String firstName, String lastName) {
        super(firstName, lastName);
    }

    @Override
    public int hashCode() {
         int res1 = this.getFirstName().hashCode();
         return res1;
    }

    @Override

    public boolean equals(Object obj) {
        Std2 s1 = (Std2 ) obj;
        if(this.getFirstName().equals(s1.getFirstName())==  false){
            return  false;
        }
        if(this.getLastName().equals(s1.getLastName())== false){
            return  false;
        }
        return true;
    }

}
