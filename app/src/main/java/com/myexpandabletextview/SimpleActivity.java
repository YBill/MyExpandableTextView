package com.myexpandabletextview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class SimpleActivity extends AppCompatActivity {

    private ExpandableTextView expandableTextView;
    private ExpandableTextView expandableTextView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_simple);
        expandableTextView = findViewById(R.id.expand_text_view);
        expandableTextView2 = findViewById(R.id.expand_text_view2);
        expandableTextView.setText(getString(R.string.dummy_text1));
        expandableTextView2.setText(getString(R.string.dummy_text1));
    }

}
