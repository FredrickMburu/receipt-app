package com.example.receipt;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button milkButton, flourButton, breadButton, sugarButton;
    TextView milkPrice, milkVat, milkActualPrice;
    TextView sugarPrice, sugarVat, sugarActualPrice;
    TextView breadPrice, breadVat, breadActualPrice;
    TextView flourPrice, flourVat, flourActualPrice;
    TextView grandTotal, discount, netPay;
    int count_f = 0;
    int count_m = 0;
    int count_s = 0;
    int count_b = 0;
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

         grandTotal = findViewById(R.id.grandTotal);
         discount = findViewById(R.id.discount);
         netPay = findViewById(R.id.netPay);

        flourButton.setOnClickListener(view -> {
            count_f++;
             if (count_f < 5){
                float vat_f;
                float price_f;

                flour = flour + 600;
                vat_f = (float) (0.16 * flour);
                price_f = flour - vat_f;

                flourActualPrice.setText(String.valueOf((int) price_f));
                flourVat.setText(String.valueOf((int) vat_f));
                flourPrice.setText(String.valueOf((int) flour));
                allCalculations();
            }
        });

        milkButton.setOnClickListener(view -> {
            count_m++;
            if (count_m < 5){
                float vat_m;
                float price_m;

                milk = milk + 700;
                vat_m = (float) (0.16 * milk);
                price_m = milk - vat_m;

                milkActualPrice.setText(String.valueOf((int) price_m));
                milkVat.setText(String.valueOf((int) vat_m));
                milkPrice.setText(String.valueOf((int) milk));
                allCalculations();
            }
        });

        breadButton.setOnClickListener(view -> {
            count_b++;
            if (count_b < 5){
                float vat_b;
                float price_b;

                bread = bread + 300;
                vat_b = (float) (0.16 * bread);
                price_b = bread - vat_b;

                breadActualPrice.setText(String.valueOf((int) price_b));
                breadVat.setText(String.valueOf((int) vat_b));
                breadPrice.setText(String.valueOf((int) bread));
                allCalculations();
            }
        });

        sugarButton.setOnClickListener(view -> {
            count_s++;
            if (count_s < 5){
                float vat_s;
                float price_s;

                sugar = sugar + 1000;
                vat_s = (float) (0.16 * sugar);
                price_s = flour - vat_s;

                sugarActualPrice.setText(String.valueOf((int) price_s));
                sugarVat.setText(String.valueOf((int) vat_s));
                sugarPrice.setText(String.valueOf((int) sugar));
                allCalculations();

            }
        });

    }
    public void allCalculations(){
        float calculateTotal = flour + milk + bread + sugar;
        float discountBtn;
        float netPAY;
        if (calculateTotal < 10000){
            discountBtn = 0.0F;
            netPAY = calculateTotal;
        }else {
            discountBtn = calculateTotal * 0.15F;
            netPAY = calculateTotal - discountBtn;
        }
        grandTotal.setText(String.valueOf((float) calculateTotal));
        discount.setText(String.valueOf((float) discountBtn));
        netPay.setText(String.valueOf((float) netPAY));

    }
}