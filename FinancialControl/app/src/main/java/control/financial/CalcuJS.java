package control.financial;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class CalcuJS extends AppCompatActivity {
    EditText Capital;
    EditText Taxa;
    EditText Tempo;
    EditText Resultado;
    Button btCalcular;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calcu_j_s);


        Capital = (EditText)findViewById(R.id.txtCapital);
        Taxa = (EditText)findViewById(R.id.txtTaxa);
        Tempo = (EditText)findViewById(R.id.txtTempo);
        Resultado = (EditText)findViewById(R.id.editTextTextPersonResultado);
        btCalcular = (Button)findViewById(R.id.buttonCalcular);


        btCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Double v1,v2,v3,res;
                v1 = Double.parseDouble(Capital.getText().toString());
                v2 = Double.parseDouble(Taxa.getText().toString());
                v3 = Double.parseDouble(Tempo.getText().toString());
                res = v1 * v2/100 * v3;
                Resultado.setText("Juros é de : R$"+res.toString());
            }
        });
    }

}