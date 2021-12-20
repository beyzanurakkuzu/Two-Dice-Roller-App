package com.beyzaakkuzu.twodiceroller;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;


public class MainActivity extends AppCompatActivity {

    private ImageView imageViewDice1;
    private ImageView imageViewDice2;
    private Random random = new Random();
    private Button button;
    final int dice[] = {R.drawable.dice1, R.drawable.dice2, R.drawable.dice3,
            R.drawable.dice4, R.drawable.dice5, R.drawable.dice6};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageViewDice1 =findViewById(R.id.imagedice_1) ;
        imageViewDice2 = findViewById(R.id.image_dice2);
        button=findViewById(R.id.button_dice);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            int num1 = random.nextInt(6);
            int num2 = random.nextInt(6);

            imageViewDice1.setImageResource(dice[num1]);
            imageViewDice2.setImageResource(dice[num2]);
        }
    });
    }
}