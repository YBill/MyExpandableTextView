package com.myexpandabletextview;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void handleSimple(View view) {
        gotoAct(SimpleActivity.class);
    }

    public void handleList(View view) {
        gotoAct(ListActivity.class);
    }

    private void gotoAct(Class cls) {
        Intent intent = new Intent(this, cls);
        startActivity(intent);
    }

}
