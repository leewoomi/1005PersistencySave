package com.example.a503_08.a1005persistencysave;

import android.content.res.Configuration;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //기기의 방향이나 키보드가 숨는 등의 환경이 변경될 때 호출되는 메소드
    @Override
    public void onConfigurationChanged(
            Configuration newConfig) {
        setContentView(R.layout.activity_main);
        super.onConfigurationChanged(newConfig);
    }
       /* TextView textView = (TextView)findViewById(R.id.textView);
        //방향 확인
        if(newConfig.orientation == Configuration.ORIENTATION_PORTRAIT){
            textView.setText("세로");
        }else {
            textView.setText("가로");
        }*/


}
