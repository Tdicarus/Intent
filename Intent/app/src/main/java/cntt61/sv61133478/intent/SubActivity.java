package cntt61.sv61133478.intent;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import android.content.Intent;

public class SubActivity extends AppCompatActivity {
    private EditText edtUN, edtPass, edtEmail;
    private Button btnOk;


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub);

        edtUN = (EditText) findViewById(R.id.edtUN);
        edtPass = (EditText) findViewById(R.id.edtPass);
        edtEmail = (EditText) findViewById(R.id.edtEmail);
        btnOk = (Button) findViewById(R.id.btnOk);

        btnOk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String UserName = edtUN.getText().toString().trim();
                String Password = edtPass.getText().toString().trim();
                String Email = edtEmail.getText().toString().trim();
                if (TextUtils.isEmpty(UserName) || TextUtils.isEmpty(Password) || TextUtils.isEmpty(Email)) {
                    Toast.makeText(SubActivity.this, "Vui lòng điền đầy đủ thông tin", Toast.LENGTH_LONG).show();
                    return;
                }
                Intent welcome = new Intent(SubActivity.this, Welcome.class);
                welcome.putExtra("User", UserName);
                startActivity(welcome);
            }
        });
    }
}