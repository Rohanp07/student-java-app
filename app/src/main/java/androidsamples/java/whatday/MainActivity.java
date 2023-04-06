package androidsamples.java.whatday;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    Button button= (Button) findViewById(R.id.btn_check);
    button.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {

        EditText dateText = findViewById(R.id.editDate);
        String dateValue = dateText.getText().toString();

        EditText monthText = findViewById(R.id.editMonth);
        String monthValue = monthText.getText().toString();

        EditText yearText = findViewById(R.id.editYear);
        String yearValue = yearText.getText().toString();

        DateModel.initialize(yearValue, monthValue, dateValue);

        TextView textDisplay = (TextView)findViewById(R.id.txt_display);
        textDisplay.setText(DateModel.getMessage());
      }
    });
  }





}