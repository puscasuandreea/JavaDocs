package ProiectOOP;

/**
 * Created by Andreea.Puscasu on 7/4/2017.
 */
public abstract class Animal {

    public Animal(){
        System.out.println("Animal nou");
    }

    public abstract void mananca(Object ob);
    public abstract void seJoaca();
    public abstract void faceBaie();
    void doarme(){
        System.out.println("Animalul doarme");

    }

}
