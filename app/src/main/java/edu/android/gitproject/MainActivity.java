package edu.android.gitproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Button;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    
    private TextView textView;
//    private Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.textView);
        Button button=findViewById(R.id.button);

        textView.setText("안녕하세요");
        
    }
}
