 package com.hyun222.tistory.runningclub;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

 public class MainActivity extends AppCompatActivity {

    Button m_btn;
    ImageView imageView;
    int i = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        m_btn = findViewById(R.id.button);
        imageView = findViewById(R.id.imageView);

        m_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (i==0){
                    imageView.setImageResource(R.drawable.bbangdol_laying);
                    i++;
                }
                else if(i==1)
                {
                    imageView.setImageResource(R.drawable.bbangdol_seating);
                    i++;
                }
                else if(i==2)
                {
                    imageView.setImageResource(R.drawable.bbangdol_standing);
                    i=0;
                }
            }
        });
    }
}