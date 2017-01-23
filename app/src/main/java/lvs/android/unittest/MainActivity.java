package lvs.android.unittest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Calculator calculator = new Calculator();

        Button btnAdd = (Button)findViewById(R.id.btn_add);
        Button btnDiv = (Button)findViewById(R.id.btn_div);
        final EditText etOperandOne = (EditText) findViewById(R.id.et_operand_one);
        final EditText etOperandTwo = (EditText) findViewById(R.id.et_operand_two);
        final TextView tvResult = (TextView)findViewById(R.id.tv_result);


        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Double result = calculator.add( Double.parseDouble(etOperandOne.getText().toString()),
                                Double.parseDouble(etOperandTwo.getText().toString()));
                tvResult.setText(result.toString());
            }
        });

        btnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Double result = calculator.divide( Double.parseDouble(etOperandOne.getText().toString()),
                        Double.parseDouble(etOperandTwo.getText().toString()));
                tvResult.setText(result.toString());
            }
        });
    }
}
