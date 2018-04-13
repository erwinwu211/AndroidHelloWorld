package jp.ac.titech.itpro.sdl.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView text_view;
    private TextView plaintext;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button1 = findViewById(R.id.button);
        text_view= findViewById(R.id.textView);
        plaintext= findViewById(R.id.editText);

        button1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                text_view.setText(plaintext.getText());
            }
        });

    };
}
