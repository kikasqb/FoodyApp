package com.example.fullstack.appfoody.view;

import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Base64;
import android.util.Log;
import android.widget.TextView;

import com.example.fullstack.appfoody.R;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class SlashGreenActivity extends AppCompatActivity {
    TextView txtVesion, txtFullName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_flashgreen);
        txtVesion = (TextView) findViewById(R.id.txtVesion);
        txtFullName = (TextView) findViewById(R.id.txtFullName);
        txtFullName.setText(R.string.fullname);
        try {
            PackageInfo bPackageInfo = getPackageManager().getPackageInfo(getPackageName(), 0);
            txtVesion.setText(getString(R.string.vesion) + " " + bPackageInfo.versionName);
            Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                @Override
                public void run() {
                    Intent intent = new Intent(SlashGreenActivity.this, LoginActivity.class);
                    startActivity(intent);
                }
            }, 2000);


        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
        }
    }


}
