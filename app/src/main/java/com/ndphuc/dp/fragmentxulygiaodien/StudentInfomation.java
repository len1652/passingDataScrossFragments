package com.ndphuc.dp.fragmentxulygiaodien;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

public class StudentInfomation extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_infomation);

        Intent intent = getIntent();

        SinhVien sinhVien = (SinhVien) intent.getSerializableExtra("thongTinSinhVien");

        fragmentStudentInfo studentInfo = (fragmentStudentInfo)
                getSupportFragmentManager().findFragmentById(R.id.fragmentChiTiet);

        studentInfo.SetInfo(sinhVien);


    }
}