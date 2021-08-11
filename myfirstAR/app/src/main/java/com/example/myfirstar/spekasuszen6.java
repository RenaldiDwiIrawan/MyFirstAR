package com.example.myfirstar;

        import androidx.appcompat.app.AppCompatActivity;

        import android.content.Intent;
        import android.os.Bundle;
        import android.widget.Button;

public class spekasuszen6 extends AppCompatActivity {
    private Button btnarzenf6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spekasuszen6);
        btnarzenf6 = findViewById(R.id.btnarzen6);



        btnarzenf6.setOnClickListener(v ->{
            Intent arasuszenf6 = new Intent(spekasuszen6.this, ARzenfone6.class);
            startActivity(arasuszenf6);
        });


    }
}
