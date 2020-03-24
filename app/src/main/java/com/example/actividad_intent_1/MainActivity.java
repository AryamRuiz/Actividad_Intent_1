package com.example.actividad_intent_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;
import android.widget.Button;
import android.content.Intent;

public class MainActivity extends AppCompatActivity {
    static boolean primera = true;
    EditText nombre,correo,telefono;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btnEnviar=(Button)findViewById(R.id.btnEnviar);
        nombre =(EditText)findViewById(R.id.edtNombre);
        telefono=(EditText)findViewById(R.id.edtTelefono);
        correo = (EditText)findViewById(R.id.edtCorreo);



        btnEnviar.setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), Main2Activity.class);
                i.putExtra("NOMBRE",nombre.getText().toString());
                i.putExtra("TELEFONO",telefono.getText().toString());
                i.putExtra("CORREO",correo.getText().toString());
                startActivity(i);
            }
        });
    }
}
