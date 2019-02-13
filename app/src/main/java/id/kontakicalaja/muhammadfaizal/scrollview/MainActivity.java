package id.kontakicalaja.muhammadfaizal.scrollview;

import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    TextView txtInstagram, txtGithub, txtWa, txtRating, txtShare, txtPolicy;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ActionBar ab = getSupportActionBar();
        ab.hide();

        setContentView(R.layout.activity_main);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);

        txtInstagram = findViewById(R.id.txtInstagram);
        txtInstagram.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("http://www.instagram.com/mf.faizal_"));
                startActivity(intent);
            }
        });

        txtGithub = findViewById(R.id.txtGithub);
        txtGithub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("http://www.github.com/hyfaiz"));
                startActivity(intent);
            }
        });

        txtWa = findViewById(R.id.txtWa);
        txtWa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("https://api.whatsapp.com/send?phone=6282123730387&text=Assalamualaikum%20Kak"));
                startActivity(intent);
            }
        });

        txtRating = findViewById(R.id.txtRating);
        txtRating.setOnClickListener(this);

        txtShare = findViewById(R.id.txtShare);
        txtShare.setOnClickListener(this);

        txtPolicy = findViewById(R.id.txtPolicy);
        txtPolicy.setOnClickListener(this);
    }

    private void NextPage() {startActivity(new Intent(getApplicationContext(),ActivityKedua.class));}

    public void onClick(View v){
        if(v == txtInstagram ) {
            NextPage();
        }
        else if (v == txtGithub) {
            NextPage();
        }
        else if (v == txtWa) {
            NextPage();
        }
        else if (v == txtRating) {
            NextPage();
        }
        else if(v == txtShare) {
            NextPage();
        }
        else if(v == txtPolicy) {
            NextPage();
        }
    }

    @Override
    public void onBackPressed() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setCancelable(false);
        builder.setMessage("Apakah anda yakin ingin keluar ?");
        builder.setPositiveButton("Ya, Saya yakin", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                finish();
            }
        });
        builder.setNegativeButton("Tidak", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        });
        AlertDialog alert = builder.create();
        alert.show();
    }
}
