package cntt61.sv61133478.intent;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.TextView;
import android.content.Intent;
import android.view.View;

public class Welcome extends AppCompatActivity {
    private TextView tvUserName;
    private Button btnquiz1, btnquiz2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.welcome);

        tvUserName = (TextView) findViewById(R.id.tvUserName);
        btnquiz1 = (Button) findViewById(R.id.btnquiz1);
        btnquiz2 = (Button) findViewById(R.id.btnquiz2);

        Intent i = getIntent();
        String UserName = i.getStringExtra("User");
        tvUserName.setText(UserName);

        btnquiz1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent iQuiz1 = new Intent(Welcome.this, MainActivity.class);
                startActivity(iQuiz1);
            }
        });

        btnquiz2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent iQuiz2 = new Intent(Welcome.this, MainActivity.class);
                startActivity(iQuiz2);
            }
        });


    }
}