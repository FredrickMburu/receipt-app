package com.example.receipt;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button milkButton, flourButton, breadButton, sugarButton;
    Button grandtotalButton, discount, netPayButton;
    TextView milkPrice, milkVat, milkActualPrice;
    TextView sugarPrice, sugarVat, sugarActualPrice;
    TextView breadPrice, breadVat, breadActualPrice;
    TextView flourPrice, flourVat, flourActualPrice;

    Item milk = new Item(300.0F);
    Item sugar = new Item(300.0f);
    Item flour = new Item(300.0f);
    Item bread = new Item(300.0f);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         milkButton = findViewById(R.id.milk_button);
         milkPrice = findViewById(R.id.milkPrice);
         milkVat = findViewById(R.id.milkVat);
         milkActualPrice = findViewById(R.id.milkActualPrice);

         sugarButton = findViewById(R.id.sugar_button);
         sugarPrice =findViewById(R.id.sugarPrice);
         sugarVat = findViewById(R.id.sugarVat);
         sugarActualPrice = findViewById(R.id.sugarActualPrice);

         breadButton = findViewById(R.id.bread_button);
         breadPrice =findViewById(R.id.breadPrice);
         breadVat = findViewById(R.id.breadVat);
         breadActualPrice = findViewById(R.id.breadActualPrice);

         flourButton = findViewById(R.id.flour_button);
         flourPrice =findViewById(R.id.flourPrice);
         flourVat = findViewById(R.id.flourVat);
         flourActualPrice = findViewById(R.id.flourActualPrice);

         milkButton.setOnClickListener(
                 v -> {
                     if (milk.count < 4)
                     {
                         milk.incrementCount();
                         milkPrice.setText(String.valueOf(milk.grossAmount));
                         milkVat.setText(String.valueOf(milk.vat));
                         milkActualPrice.setText(String.valueOf(milk.actualPrice));
                     }
                     else
                         Toast.makeText(this, "You can Only buy 4 Litres", Toast.LENGTH_SHORT).show();
                 }
         );
         sugarButton.setOnClickListener(
                 v -> {
                     if (sugar.count < 4)
                     {
                         sugar.incrementCount();
                         sugarPrice.setText(String.valueOf(sugar.grossAmount));
                         sugarVat.setText(String.valueOf(sugar.vat));
                         sugarActualPrice.setText(String.valueOf(sugar.actualPrice));
                     }
                     else
                         Toast.makeText(this, "You can Only buy 4 packets", Toast.LENGTH_SHORT).show();
                 }
         );
         flourButton.setOnClickListener(
                 v -> {
                     if (flour.count < 4)
                     {
                         flour.incrementCount();
                         flourPrice.setText(String.valueOf(flour.grossAmount));
                         flourVat.setText(String.valueOf(flour.vat));
                         flourActualPrice.setText(String.valueOf(flour.actualPrice));
                     }
                     else
                         Toast.makeText(this, "You can Only buy 4 packets", Toast.LENGTH_SHORT).show();
                 }
         );
         breadButton.setOnClickListener(
                 v -> {
                     if (bread.count < 4)
                     {
                         bread.incrementCount();
                         breadPrice.setText(String.valueOf(bread.grossAmount));
                         breadVat.setText(String.valueOf(bread.vat));
                         breadActualPrice.setText(String.valueOf(bread.actualPrice));
                     }
                     else
                         Toast.makeText(this, "You can Only buy 4 loaves", Toast.LENGTH_SHORT).show();
                 }
         );
    }
}