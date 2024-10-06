package pizza.miskar.ma.pizzarecipes.dao;

import java.util.List;

import pizza.miskar.ma.pizzarecipes.classes.Produit;

public interface IDao <T>{
    boolean create (T o);
    boolean update (T o);
    boolean delete (T o);

    boolean delete(Produit p);

    T findById (int id);
    List<T> findAll ();
}