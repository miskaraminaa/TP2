package pizza.miskar.ma.pizzarecipes.service;
import java.util.ArrayList;
import java.util.List;
import pizza.miskar.ma.pizzarecipes.classes.Produit;
import pizza.miskar.ma.pizzarecipes.dao.IDao;

public class ProduitService implements IDao<Produit> {
    private static ProduitService instance;
    private List<Produit> produits;

    public ProduitService() {
        produits = new ArrayList<>();

    }

    @Override
    public boolean create(Produit o) {
        return produits.add(o);
    }

    @Override
    public boolean update(Produit o) throws UnsupportedOperationException {
        return false;
    }
    public static void setInstance(ProduitService instance) {
        ProduitService.instance = instance;
    }

    public static ProduitService getInstance() {
        if (instance == null)
            instance = new ProduitService();
        return instance;
    }
    @Override
    public boolean delete(Produit o) {
        return produits.remove(o);
    }

    @Override
    public Produit findById(int id) {
        for(Produit produit : produits){
            if(produit.getId() == id){
                return produit;
            }
        }
        return null;
    }

    @Override
    public List<Produit> findAll() {
        return produits;
    }
}
