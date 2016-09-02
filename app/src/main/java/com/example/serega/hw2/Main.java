package com.example.serega.hw2;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class Main extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        LinearLayout mainLayout = (LinearLayout) findViewById(R.id.mainLayout);


        LinearLayout leftLayout = new LinearLayout(this);
        leftLayout.setOrientation(LinearLayout.VERTICAL);
        leftLayout.setBackgroundColor(Color.parseColor("#73bf10"));
        LinearLayout.LayoutParams leftLayoutParams = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT,
                LinearLayout.LayoutParams.MATCH_PARENT);
        leftLayoutParams.setMargins(20, 20, 20, 20);
        leftLayout.setLayoutParams(leftLayoutParams);

        for (int i = 0; i < 3; i++) {
            LinearLayout box1 = new LinearLayout(this);
            box1.setOrientation(LinearLayout.HORIZONTAL);
            box1.setBackgroundColor(Color.parseColor("#ffffff"));
            LinearLayout.LayoutParams box1LayoutParams = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT,
                    LinearLayout.LayoutParams.WRAP_CONTENT);
            box1LayoutParams.setMargins(5, 5, 5, 5);
            box1.setLayoutParams(box1LayoutParams);

            ImageView img1 = new ImageView(this);
            img1.setImageResource(R.drawable.andr);

            TextView text1 = new TextView(this);
            text1.setTextSize(20);
            LinearLayout.LayoutParams textParams = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT,
                    LinearLayout.LayoutParams.MATCH_PARENT);
            textParams.setMargins(0, 20, 0, 0);
            text1.setLayoutParams(textParams);
            text1.setText("Java ");

            box1.addView(img1);
            box1.addView(text1);
            leftLayout.addView(box1);
        }
        mainLayout.addView(leftLayout, 0);
    }
}
