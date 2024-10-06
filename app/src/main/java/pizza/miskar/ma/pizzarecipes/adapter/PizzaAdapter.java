package pizza.miskar.ma.pizzarecipes.adapter;

import android.app.Activity;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import pizza.miskar.ma.pizzarecipes.R;
import pizza.miskar.ma.pizzarecipes.classes.Produit;

public class PizzaAdapter extends BaseAdapter {

    private List<Produit> produit;
    private LayoutInflater inflater;

    public PizzaAdapter(List<Produit> produit, Activity activity) {
        this.produit = produit;
        this.inflater = (LayoutInflater) activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return produit.size();
    }

    @Override
    public Object getItem(int position) {
        return produit.get(position);
    }


    @Override
    public long getItemId(int position) {
        return produit.get(position).getId();
    }


    @Override
    public View getView(int position, View convertView, ViewGroup viewGroup) {
        if(convertView == null)
            convertView = inflater.inflate(R.layout.item, null) ;

        TextView id = convertView.findViewById(R.id.id) ;
        TextView nom = convertView.findViewById(R.id.nom) ;
        TextView duree = convertView.findViewById(R.id.duree) ;
        ImageView image = convertView.findViewById(R.id.photo) ;
        ImageView clock = convertView.findViewById(R.id.clock);
        ImageView man = convertView.findViewById(R.id.man);
        TextView nbrIngredients = convertView.findViewById(R.id.nbrIngred) ;

        id.setText(produit.get(position).getId()+"");
        nom.setText(produit.get(position).getNom());
        man.setImageResource(R.mipmap.pizza);
        duree.setText(produit.get(position).getDuree()+"");
        image.setImageResource(produit.get(position).getPhoto());
        clock.setImageResource(R.mipmap.clock);
        nbrIngredients.setText(produit.get(position).getNbrIngredients()+"");
        return convertView ;
    }
}
