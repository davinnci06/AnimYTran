package com.example.animytran;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Es el enlace entre el elemento real y el lógico
        TextView tV1 = findViewById(R.id.tV1);
        TextView tV2 = findViewById(R.id.tV2);
        Button btn1 = findViewById(R.id.btn1);
        TextView tV3 = findViewById(R.id.tV3);
        ImageView iV2 = findViewById(R.id.iV2);

        //Debo crear la animación y cargarle lo que hice en fade_out
        Animation anim_out = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_out);
        Animation anim_in = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in);
        Animation anim_rota = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.rotation);
        Animation anim_trans = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.translation);
        Animation anim_scale = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.scale);

        //Debo iniciar la animación al elemento
        tV1.startAnimation(anim_out);
        tV2.startAnimation(anim_in);
        btn1.startAnimation(anim_rota);
        tV3.startAnimation(anim_trans);
        iV2.startAnimation(anim_scale);

    }
}