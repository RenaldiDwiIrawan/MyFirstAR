package com.example.myfirstar;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageButton;

public class menuAsus extends AppCompatActivity {
private ImageButton imgzenfone6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_asus);
        imgzenfone6 = findViewById(R.id.imgzenfone6);

                imgzenfone6.setOnClickListener(v ->{
                    Intent zenfone6Intent = new Intent(menuAsus.this, spekasuszen6.class);
                    startActivity(zenfone6Intent);
                });
    }
}
