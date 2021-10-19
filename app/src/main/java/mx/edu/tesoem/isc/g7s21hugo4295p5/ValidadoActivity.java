package mx.edu.tesoem.isc.g7s21hugo4295p5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class ValidadoActivity extends AppCompatActivity {

    TextView lblsaludo, lblnumero;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_validado);

        lblsaludo = findViewById(R.id.lblsaludo);
        lblnumero = findViewById(R.id.lblnumero);

        Bundle parametros = getIntent().getExtras();

        lblsaludo.setText("Bienvenido " + parametros.getString("usuario"));
        lblnumero.setText("valor numerioco " + parametros.getInt("numero"));
    }
}