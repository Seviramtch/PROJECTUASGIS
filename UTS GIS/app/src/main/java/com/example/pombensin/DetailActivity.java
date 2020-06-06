package com.example.pombensin;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

public class DetailActivity extends AppCompatActivity implements View.OnClickListener {
    TextView nama1, alamat1;
    Button btninfo;
    ImageView gambar1;
    public static String id,nama,alamat,gambar;
    public static Double Latitude, Longitude;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        nama1 = findViewById(R.id.tv_nama);
        alamat1 = findViewById(R.id.tv_alamat);
        btninfo = findViewById(R.id.btn_info);
        gambar1 = findViewById(R.id.img_pom);

        nama1.setText(nama);
        alamat1.setText(alamat);
        Picasso.get().load(gambar).into(gambar1);


    }

    @Override
    public void onClick(View v) {

    }
}
