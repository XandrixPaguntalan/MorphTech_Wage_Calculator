package mcm.edu.ph.wage_calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button buttoncalcu;

        buttoncalcu = findViewById(R.id.buttoncalcu);

        buttoncalcu.setOnClickListener(this);
    }
    @Override
    public void onClick(View v){
        
        EditText edithours;
        TextView result1, result2, result3, result4;

        edithours = findViewById(R.id.edithours);
        result1 = findViewById(R.id.result1);
        result2 = findViewById(R.id.result2);
        result3 = findViewById(R.id.result3);
        result4 = findViewById(R.id.result4);

        Double Hours = 0.0;
        Double wage = 0.0;
        Double rendered = 0.0;
        Double hrsot = 0.0;
        Double wageot = 0.0;

        Hours = Double.parseDouble(edithours.getText().toString());


        if (Hours < 9){
            wage = (Hours * 100);
            rendered = Hours;
            hrsot = 0.0;
            wageot = 0.0;

            result1.setText(Double.toString(wage));
            result2.setText(Double.toString(rendered));
            result3.setText(Double.toString(hrsot));
            result4.setText(Double.toString(wageot));

        }
        else if(Hours >= 9){
            rendered = Hours;
            hrsot = (Hours - 8.0);
            wageot = (hrsot * 130);
            wage = (hrsot * 130)+(800);

            result1.setText(Double.toString(wage));
            result2.setText(Double.toString(rendered));
            result3.setText(Double.toString(hrsot));
            result4.setText(Double.toString(wageot));
        }
    }
}