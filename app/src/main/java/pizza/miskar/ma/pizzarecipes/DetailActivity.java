package pizza.miskar.ma.pizzarecipes;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

import pizza.miskar.ma.pizzarecipes.classes.Produit;
import pizza.miskar.ma.pizzarecipes.service.ProduitService;

public class DetailActivity extends AppCompatActivity {
    private ProduitService ps ;
    private TextView nom, ingredients, description;
    private ImageView photo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_detail);

        Intent intent = getIntent();
        int id = Integer.parseInt(intent.getStringExtra("id"));
        ps = ProduitService.getInstance();
        Produit p = ps.findById(id);
        System.out.println(p);

        photo = findViewById(R.id.photo);
        nom = findViewById(R.id.nom);
        description = findViewById(R.id.description);
        ingredients = findViewById(R.id.ingredients);

        photo.setImageResource(p.getPhoto());
        nom.setText(p.getNom());
        description.setText(p.getDescription());
        ingredients.setText(p.getDetailsIngred());
    }
}