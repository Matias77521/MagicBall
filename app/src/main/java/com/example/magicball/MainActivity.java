package com.example.magicfinal;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private ImageButton Ball;
    private TextView respuesta;
    private String [] respuestaArray ={"Es cierto", "Definitivamente es así", "Sin duda", "Sí definitivamente", "Puede confiar en él", "Como yo lo veo, sí",
            "Lo más probable", "Perspectiva buena", "Sí", "Las señales apuntan a sí", "Respuesta confusa intente de nuevo", "Pregunte de nuevo más tarde",
            "Mejor no decirte ahora", "No puedo predecir ahora", "Concéntrate y pregunta de nuevo", "No cuentes con eso",
            "Mi respuesta es no", "Mis fuentes dicen que no", "Outlook no es tan bueno", "Muy dudoso"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout_activity_main);

        //referencia la imagen

        Ball = findViewById(R.id.btn);

        //referencia texto

        respuesta = findViewById(R.id.respuestavista);

        //proceso
        Ball.setOnClickListener(this);

        Toast.makeText(MainActivity.this, "Consulta tu suerte", Toast.LENGTH_SHORT).show();



    }

    @Override
    public void onClick{
        //creacion metodo switch
        switch (v.getId()){
            case R.ide.btn:

                int rand = new Random().nextInt(respuestaArray.length);
                respuesta.setText(respuestaArray[rand]);

                break;

        }
    }
}