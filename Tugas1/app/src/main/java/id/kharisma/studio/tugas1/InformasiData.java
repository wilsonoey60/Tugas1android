package id.kharisma.studio.tugas1;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class InformasiData extends AppCompatActivity {
    AlertDialog.Builder notifikasi;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_informasi_data);
        final Button button = findViewById(R.id.button);
        final Button button1 = findViewById(R.id.button1);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Code here executes on main thread after user presses button
                Intent navigasi = new Intent(InformasiData.this, MainActivity.class);
                startActivity(navigasi);
            }
        });
        button1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {showDialog();}
        });
    }
    public void showDialog () {
        notifikasi = new AlertDialog.Builder(this);
        notifikasi.setMessage("Apakah yakin ingin keluar dari program ini?");
        notifikasi.setPositiveButton("YES", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                moveTaskToBack(true);
                System.exit(1);
            }
        });
        notifikasi.setNegativeButton("NO", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {dialog.dismiss();}
        });
        notifikasi.show();
    }
}