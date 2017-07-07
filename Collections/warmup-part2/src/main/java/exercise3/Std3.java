package exercise3;

/**
 * Created by Andreea.Puscasu on 7/7/2017.
 */
public class Std3 extends Student {
    public Std3(String firstName, String lastName) {
        super(firstName, lastName);
    }

    @Override
    public int hashCode() {
        int res2 = this.getFirstName().hashCode() +this.getLastName().hashCode();
        return res2;
    }

    @Override
    public boolean equals(Object obj) {
        Std3 s2 = (Std3) obj;
        if(this.getFirstName().equals(s2.getFirstName())== false){
            return false;
        }
        return  true;
    }
}
