 package com.hyun222.tistory.runningclub;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

 public class MainActivity extends AppCompatActivity {

    Button m_btn;
    TextView m_text[] = new TextView[6];
    int arr_textview_id[] = {R.id.textView1, R.id.textView2, R.id.textView3, R.id.textView4, R.id.textView5, R.id.textView6};
    Integer arr_random_num[] = new Integer[6];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        for(int i = 0; i <arr_textview_id.length; i++){
            final int index;
            index = i;
            m_text[index] = findViewById(arr_textview_id[index]);
        }

        m_btn = findViewById(R.id.button);

        m_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random random = new Random();
                for (int i = 0; i < arr_random_num.length; i++){
                    arr_random_num[i] = random.nextInt(45) + 1;
                    m_text[i].setText(Integer.toString(arr_random_num[i]));
                }
            }
        });
    }
}