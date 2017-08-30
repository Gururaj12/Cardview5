package varuntej.wexos.com.cardview5;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button button1,button2,button3,button4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button1= (Button) findViewById(R.id.btn);
        button1= (Button) findViewById(R.id.btn2);
        button1= (Button) findViewById(R.id.btn3);
        button1= (Button) findViewById(R.id.btn4);
        button1.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

    }
}
