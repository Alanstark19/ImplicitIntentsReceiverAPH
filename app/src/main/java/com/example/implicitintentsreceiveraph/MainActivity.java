package com.example.implicitintentsreceiveraph;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //obteniendo el intente que disparó esta activity
        Intent intent = getIntent();
        //obteniendo los datos guardados en el intent y asignandolos a un objeto uri
        Uri uri = intent.getData();
        //validando si se guardo algo en el uri
        if(uri!=null){
            //parseando el uri a string
            String uri_string = "URI: "+uri.toString();
            //objeto editText para asignale la cadena del url + la leyenda URI
            TextView textView = findViewById(R.id.text_uri_message);
            //se le asigna el uri parseado a string al TextView
            textView.setText(uri_string);
        }//fin de la validación del uri
    }//fin del método on Create()
}//fin de la clase