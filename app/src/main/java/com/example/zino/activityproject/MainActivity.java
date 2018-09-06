
package com.example.zino.activityproject;

import android.content.Intent;
import android.net.Uri;
import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toolbar;

/*액티비티란?
* - 하나의 화면을 담당하고 컨트롤하는 안드로이드 주요 구성요소 중 하나임
* - 액티비티 자체는 시각적으로 보여지지 않으며,  그 뷰를 조정하는 컨트롤러이다.
* - ex) 만약 회원가입을 이루는 화면이 총 3단계에 걸쳐 진행한다면, 이때 사용되는 액티비티도 3개이다
*
* - Activity 란 이름을 부여한 이유는 스마트폰의 작은 화면을 차지하게 될 즉 활성화되어질 화면이 누구인지를
*   결정짓는다는 의미때문인것 같음..하나의 화면을 두고 액티비티간 쟁탈전을 벌이기 때문
* - 액티비티는 개발자가 원하는 타임에 생성, 소멸 시킬 수 있는게 아니라, 전적으로 시스템이 관리하게 되는데,
*   일반적으로 시스템이 대상을 관리하게 될 경우 생명주기가 존재한다.
*   ex) 자바의 쓰레드
*/
public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void goPrev(View view){
    }

    public void goNext(View view){
        Intent intent=new Intent(MainActivity.this, SecondActivity.class);
        startActivity(intent);
    }

    public void callPhone(View view){
        Intent intent = new Intent(Intent.ACTION_DIAL);
        intent.setData(Uri.parse("tel:02-8888-9999"));
        startActivity(intent);
    }

    public void callMap(View view){
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("geo:0,0?q=제주도"));
        startActivity(intent);
    }

    public void callAddr(View view){
        Intent intent= new Intent(Intent.ACTION_VIEW);
        intent.setData(ContactsContract.Contacts.CONTENT_URI);
        startActivity(intent);
    }
    public void callAudio(View view){
        Intent intent=new Intent();
        intent.setAction(Intent.ACTION_GET_CONTENT);
        intent.setType("audio/*");
        startActivity(Intent.createChooser(intent, "어떤 음악앱을 원하니?"));
    }
    public void callBrowser(View view){
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("http://www.daum.net"));
        startActivity(intent);
    }


}
