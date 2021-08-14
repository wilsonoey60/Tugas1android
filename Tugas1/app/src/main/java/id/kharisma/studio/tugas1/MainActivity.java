package id.kharisma.studio.tugas1;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final EditText nama = findViewById(R.id.pengguna);
        final EditText kunci = findViewById(R.id.sandi);
        final Button masukakun = findViewById(R.id.Masuk);
        final Button batalkan = findViewById(R.id.Batal);
        masukakun.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Code here executes on main thread after user presses button
                if(nama.getText().toString().equals("kitbuls") && kunci.getText().toString().equals("HeyName!")){
                    Intent navigasi = new Intent(MainActivity.this, InformasiData.class);
                    startActivity(navigasi);
                }else{
                    Toast keterangan = Toast.makeText(getApplicationContext(),"Username atau Password Anda Salah",Toast.LENGTH_SHORT);
                    keterangan.show();
                }
            }
        });
        batalkan.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Code here executes on main thread after user presses button
                moveTaskToBack(true);
                System.exit(1);
            }
        });
    }


}