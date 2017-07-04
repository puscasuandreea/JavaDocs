package ProiectOOP;

/**
 * Created by Andreea.Puscasu on 7/4/2017.
 */
public class AnimalZooFeroce extends  Animal {
    @Override
    public void mananca(Object ob) {
        if(ob instanceof AngajatZoo){
            throw new AnimalManancaOmException("Nu mananca AngajatZoo")
        }else
            System.out.println("AnimalZooFeroce mananca");
    }

    @Override
    public void seJoaca() {
        System.out.println("AnimalZooFeroce se joaca");
    }

    @Override
    public void faceBaie() {
        System.out.println("AnimalZooFeroce face baie");
    }

    @Override
    void doarme() {
        super.doarme();
        System.out.println("Animal feroce vaneaza");
    }

}
