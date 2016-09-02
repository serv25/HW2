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
            LinearLayout box = new LinearLayout(this);
            box.setOrientation(LinearLayout.HORIZONTAL);
            box.setBackgroundColor(Color.parseColor("#ffffff"));
            LinearLayout.LayoutParams box1LayoutParams = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT,
                    LinearLayout.LayoutParams.WRAP_CONTENT);
            box1LayoutParams.setMargins(5, 5, 5, 5);
            box.setLayoutParams(box1LayoutParams);

            ImageView img = new ImageView(this);
            img.setImageResource(R.drawable.andr);

            TextView text = new TextView(this);
            text.setTextSize(20);
            LinearLayout.LayoutParams textParams = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT,
                    LinearLayout.LayoutParams.MATCH_PARENT);
            textParams.setMargins(0, 20, 0, 0);
            text.setLayoutParams(textParams);
            text.setText("Java ");

            box.addView(img);
            box.addView(text);
            leftLayout.addView(box);
        }
        mainLayout.addView(leftLayout, 0);
    }
}
