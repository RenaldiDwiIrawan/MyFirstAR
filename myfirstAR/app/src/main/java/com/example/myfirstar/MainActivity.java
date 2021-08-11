package com.example.myfirstar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.GridLayout;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    private Button btnmenu_asus, btnmenu_samsung, btnmenu_iphone, btnmenu_oneplus, btnmenu_huawei, btnmenu_vivo;
    GridLayout gridLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gridLayout = (GridLayout) findViewById(R.id.maingrid);
        setSingleEvent (gridLayout);
        btnmenu_samsung = findViewById(R.id.btnmenu_samsung);
        btnmenu_vivo = findViewById(R.id.btnmenu_vivo);
        btnmenu_asus = findViewById(R.id.btnmenu_asus);
        btnmenu_iphone = findViewById(R.id.btnmenu_iphone);
        btnmenu_oneplus = findViewById(R.id.btnmenu_oneplus);
        btnmenu_huawei = findViewById(R.id.btnmenu_huawei);


        btnmenu_samsung.setOnClickListener(v -> {
            Intent samsungIntent = new Intent(MainActivity.this, menuSamsung.class);
            startActivity(samsungIntent);
        });
        btnmenu_vivo.setOnClickListener(v -> {
            Intent vivoIntent = new Intent(MainActivity.this, menuVivo.class);
            startActivity(vivoIntent);
        });
        btnmenu_asus.setOnClickListener(v -> {
            Intent asusIntent = new Intent(MainActivity.this, menuAsus.class);
            startActivity(asusIntent);
        });
        btnmenu_iphone.setOnClickListener(v -> {
            Intent iphoneIntent = new Intent(MainActivity.this, menuApple.class);
            startActivity(iphoneIntent);
        });
        btnmenu_oneplus.setOnClickListener(v -> {
            Intent oneplusIntent = new Intent(MainActivity.this, menuOneplus.class);
            startActivity(oneplusIntent);
        });
        btnmenu_huawei.setOnClickListener(v -> {
            Intent huaweiIntent = new Intent(MainActivity.this, menuHuawei.class);
            startActivity(huaweiIntent);
        });
    }

    private void setSingleEvent(GridLayout gridLayout) {
        for (int i = 0; i <gridLayout.getChildCount(); i++){
            CardView cardView = (CardView) gridLayout.getChildAt(i);
            final int finalI = i;
            cardView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Toast.makeText(MainActivity.this, "Clicked at index"+ finalI, Toast.LENGTH_SHORT).show();
                }
            });
        }
    }
}
