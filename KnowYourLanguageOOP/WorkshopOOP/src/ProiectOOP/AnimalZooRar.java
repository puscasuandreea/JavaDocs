package ProiectOOP;

/**
 * Created by Andreea.Puscasu on 7/4/2017.
 */
public class AnimalZooRar extends Animal{
    private String numele;
    private String numeleTariiDeOrigine;

    public String getNumele() {
        return numele;
    }

    public void setNumele(String numele) {
        this.numele = numele;
    }

    public String getNumeleTariiDeOrigine() {
        return numeleTariiDeOrigine;
    }

    public void setNumeleTariiDeOrigine(String numeleTariiDeOrigine) {
        this.numeleTariiDeOrigine = numeleTariiDeOrigine;
    }
    public AnimalZooRar(String numele, String numeleTariiDeOrigine){
        this.numele = numele;
        this.numeleTariiDeOrigine = numeleTariiDeOrigine;
    }

    @Override
    public void faceBaie() {
        System.out.println("AnimalulZooRar face baie");

    }

    @Override
    public void seJoaca() {
        System.out.println("AnimalulZooRar se joaca");
        super.doarme();
    }

    @Override
    public void mananca(Object ob) {
        if(ob instanceof AngajatZoo){
            throw  new AnimalManancaOmException("Nu mananca pe AngajatZoo");

        }else{
            System.out.println("AnimalZooRar mananca");
        }
    }
}
