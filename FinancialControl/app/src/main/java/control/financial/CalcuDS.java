package control.financial;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class CalcuDS extends AppCompatActivity {

    EditText ValorNominal;
    EditText TaxaDS;
    EditText TempoDS;
    EditText ResultadoDS;
    Button btCalcularDS;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calcu_d_s);

        ValorNominal= (EditText)findViewById(R.id.editTextVN);
        TaxaDS = (EditText)findViewById(R.id.editTextTD);
        TempoDS = (EditText)findViewById(R.id.editTextTempo);
        ResultadoDS = (EditText)findViewById(R.id.editTextResultadoDS);
        btCalcularDS = (Button)findViewById(R.id.buttonDSimples);

        btCalcularDS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Double v1,v2,v3,res;
                v1 = Double.parseDouble(ValorNominal.getText().toString());
                v2 = Double.parseDouble(TaxaDS.getText().toString());
                v3 = Double.parseDouble(TempoDS.getText().toString());
                res = v1 *v2/100 *v3;
                if(res > v1){
                    ResultadoDS.setText("Desconto maior que valor inicial");
                }else{
                ResultadoDS.setText("Valor do Desconto : R$"+res.toString());
            }}
        });
    }
}