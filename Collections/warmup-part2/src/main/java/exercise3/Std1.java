package exercise3;

/**
 * Created by Andreea.Puscasu on 7/7/2017.
 */
public class Std1 extends Student {

    public Std1(String firstName, String lastName) {
        super(firstName, lastName);
    }

    @Override
    public int hashCode() {
        int res = this.getFirstName().hashCode();

        return res;
    }

    @Override
    public boolean equals(Object obj) {
        Std1 s =(Std1)  obj;
        if(this.getFirstName().equals(s.getFirstName()) == false) {
            return false;
        }

        return true;

    }
}
