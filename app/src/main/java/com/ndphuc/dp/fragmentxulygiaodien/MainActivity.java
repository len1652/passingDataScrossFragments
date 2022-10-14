package com.ndphuc.dp.fragmentxulygiaodien;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements ITruyenSinhVien{



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void DataStudent(SinhVien sinhVien) {
        fragmentStudentInfo fragmentStudentinfo= (fragmentStudentInfo)
                getSupportFragmentManager().findFragmentById(R.id.fragmentInfo);
        if(fragmentStudentinfo!=null &&fragmentStudentinfo.isInLayout()){
            fragmentStudentinfo.SetInfo(sinhVien);
        }else{
            Intent intent = new Intent(MainActivity.this,StudentInfomation.class);
            intent.putExtra("thongTinSinhVien",sinhVien);
            startActivity(intent);
        }
    }
}