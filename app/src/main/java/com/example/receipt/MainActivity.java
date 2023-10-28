package com.example.receipt;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button milkButton, flourButton, breadButton, sugarButton;
    Button grandtotalButton, discount, netPayButton;
    TextView milkPrice, milkVat, milkActualPrice;
    TextView sugarPrice, sugarVat, sugarActualPrice;
    TextView breadPrice, breadVat, breadActualPrice;
    TextView flourPrice, flourVat, flourActualPrice;
    int count = 0;
    float flour = 0;
    float milk = 0;
    float sugar = 0;
    float bread = 0;
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


        flourButton.setOnClickListener(view -> {
            count++;
            while(count < 4){
                float vat_f;
                float price_f;

                flour = flour + 420;
                vat_f= (float) (0.16 * flour);
                price_f = flour - vat_f;

                flourActualPrice.setText((int) price_f);
                flourVat.setText((int) vat_f);
                flourPrice.setText((int) flour);
            }
        });

        milkButton.setOnClickListener(view -> {
            count++;
            while(count < 4){
                float vat_m;
                float price_m;

                milk = milk + 520;
                vat_m = (float) (0.16 * flour);
                price_m = milk - vat_m;

                milkActualPrice.setText((int) price_m);
                milkVat.setText((int) vat_m);
                milkPrice.setText((int) milk);
            }
        });

        breadButton.setOnClickListener(view -> {
            count++;
            while(count < 4){
                float vat_b;
                float price_b;

                bread = bread + 250;
                vat_b = (float) (0.16 * flour);
                price_b = bread - vat_b;

                breadActualPrice.setText((int) price_b);
                breadVat.setText((int) vat_b);
                breadPrice.setText((int) bread);
            }
        });

        sugarButton.setOnClickListener(view -> {
            count++;
            while(count < 4){
                float vat_s;
                float price_s;

                sugar = sugar + 1000;
                vat_s = (float) (0.16 * sugar);
                price_s = flour - vat_s;

                sugarActualPrice.setText((int) price_s);
                sugarVat.setText((int) vat_s);
                sugarPrice.setText((int) sugar);
            }
        });



    }
}