package control.financial;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class Menu extends AppCompatActivity {
    private Button botao01,botao02,botao03;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        botao01 = (Button) findViewById(R.id.btJurosSimples);
        botao02 = (Button) findViewById(R.id.btJurosComposto);
        botao03 = (Button) findViewById(R.id.btDescontoSimples);


        botao01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                botao01Activity();
            }
        });

        botao02.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                botao02Activity();
            }
        });

        botao03.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                botao03Activity();
            }
        });




    }

    private void botao01Activity() {

        startActivity(new Intent(Menu.this, CalcuJS.class));
    }


    private void botao02Activity() {
        startActivity(new Intent(Menu.this, CalcuJC.class));

    }

    private void botao03Activity() {

        startActivity(new Intent(Menu.this, CalcuDS.class));
    }




}