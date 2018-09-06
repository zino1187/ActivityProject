package com.example.zino.activityproject;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class SecondActivity extends AppCompatActivity{
    /*Intent 란 메세지 객체로서, 앱구성 요소( Activity, Service, Broadcast Reciever, Content Provider)간 통신을 담당한다

    주 사용 사례
    * 1) 액티비티를 시작
    * 2) 서비스 시작
    * 3) 브로드케스 전달
    * */
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.second);
    }

    public void goPrev(View view){
        this.finish();
    }
    public void goNext(View view){
        Intent intent=new Intent(SecondActivity.this, ThirdActivity.class);
        startActivity(intent);
    }

}

