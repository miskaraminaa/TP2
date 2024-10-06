package pizza.miskar.ma.pizzarecipes.classes;

public class Produit {

    private int id ;
    private String nom ;
    private int nbrIngredients ;
    private int photo ;
    private String duree ;
    private String detailsIngred ;
    private String description ;
    private String preparation ;
    private static int comp ;



    public Produit(){

    }
    public Produit(int id) {
        this.id = ++comp;
    }
    public Produit(String nom , int nbrIngredients, int photo , String duree, String detailsIngred,String description ,String preparation ) {
        this.id = ++comp;
        this.preparation = preparation;
        this.description = description;
        this.detailsIngred = detailsIngred;
        this.duree = duree;
        this.photo = photo;
        this.nbrIngredients = nbrIngredients;
        this.nom = nom;
    }



    public String getNom() {
        return nom;
    }

    public int getId() {
        return id;
    }

    public int getNbrIngredients() {
        return nbrIngredients;
    }

    public int getPhoto() {
        return photo;
    }

    public String getDuree() {
        return duree;
    }

    public String getDetailsIngred() {
        return detailsIngred;
    }

    public String getDescription() {
        return description;
    }

    public String getPreparation() {
        return preparation;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setPreparation(String preparation) {
        this.preparation = preparation;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setDuree(String  duree) {
        this.duree = duree;
    }

    public void setPhoto(int photo) {
        this.photo = photo;
    }

    public void setNbrIngredients(int nbrIngredients) {
        this.nbrIngredients = nbrIngredients;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setDetailsIngred(String detailsIngred) {
        this.detailsIngred = detailsIngred;
    }


    @Override
    public String toString() {
        return "Produit{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", nbrIngredients=" + nbrIngredients +
                ", photo=" + photo +
                ", duree=" + duree +
                ", detailsIngred='" + detailsIngred + '\'' +
                ", description='" + description + '\'' +
                ", preparation='" + preparation + '\'' +
                '}';
    }


}
