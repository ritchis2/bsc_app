package com.example.bsc_app;

import android.content.Intent;
import android.view.View;
import android.widget.Button;

public class fragment1 {

    private Button button;

    button = (Button) findViewById(R.id.next1);
        button.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            nextFragment1();
        }
    });
}

    public void nextFragment1() {
        Intent intent = new Intent(this, fragment2.xml);
        startActivity(intent);
    }
}
