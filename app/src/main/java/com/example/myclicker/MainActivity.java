package com.example.myclicker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }
    public void goToSo (View view) {
        goToUrl ( "https://www.youtube.com/watch?v=dQw4w9WgXcQ");
    }

    public void goToSu (View view) {
        goToUrl ( "https://steamuserimages-a.akamaihd.net/ugc/1022823759368616012/877521E9F3AA7F8AFA2936C36D4E6C87C84D375C/?imw=512&&ima=fit&impolicy=Letterbox&imcolor=%23000000&letterbox=false");
    }

    private void goToUrl (String url) {
        Uri uriUrl = Uri.parse(url);
        Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
        startActivity(launchBrowser);
    }
}