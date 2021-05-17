package com.example.magicball;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends Activity implements View.OnClickListener {
    private ImageButton Ball;
    private TextView respuesta;
    private String [] respuestaArray ={"SERA EL CAMPEON!!", "Sera eliminado en fase de grupos", "Tendra el segundo puesto", "Tendra el tercer puesto", "Tendra el cuarto puesto", "Sera eliminado en octavos de final",
            "Sera eliminado en cuartos de final", "Sera eliminado en semifinales"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //referencia la imagen

        Ball = findViewById(R.id.btn);

        //referencia texto

        respuesta = findViewById(R.id.respuestavista);

        //proceso
        Ball.setOnClickListener(this);

        Toast.makeText(com.example.magicball.MainActivity.this, "Averigua como le ira a tu pais en el mundial. Ingrese Pais:", Toast.LENGTH_SHORT).show();



    }

    @Override
    public void onClick(View v){
        //creacion metodo switch
        switch (v.getId()){
            case R.id.btn:

                int rand = new Random().nextInt(respuestaArray.length);
                respuesta.setText(respuestaArray[rand]);

                break;

        }
    }

    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {

    }
}