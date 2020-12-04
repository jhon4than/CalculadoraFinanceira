package control.financial;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class CalcuJC extends AppCompatActivity {

    EditText CapitalJC;
    EditText TaxaJC;
    EditText TempoJC;
    EditText ResultadoJC;
    Button btCalcularJC;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calcu_j_c);

        CapitalJC = (EditText)findViewById(R.id.txtCapitalJC);
        TaxaJC = (EditText)findViewById(R.id.txtTaxaJurosJC);
        TempoJC = (EditText)findViewById(R.id.txtTempoJC);
        ResultadoJC = (EditText)findViewById(R.id.txtResultadoJC);
        btCalcularJC = (Button)findViewById(R.id.buttonCalcularJC);


        btCalcularJC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Double capital,taxa,mes,montante;
                String a ="";
                capital = Double.parseDouble(CapitalJC.getText().toString());
                taxa = Double.parseDouble(TaxaJC.getText().toString());
                mes = Double.parseDouble(TempoJC.getText().toString());
                taxa = taxa/100;
                montante = capital *(1+taxa);

                for (int i = 1; i <= mes ; ++ i){
                    montante +=(montante * taxa);
                    a += "Mês " + i + " : "+ montante + "\n";
                }

                ResultadoJC.setText(a);

            }
        });
    }
}

