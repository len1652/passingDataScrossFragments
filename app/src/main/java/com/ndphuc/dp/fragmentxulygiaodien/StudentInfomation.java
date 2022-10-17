package com.ndphuc.dp.fragmentxulygiaodien;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class StudentInfomation extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_infomation);

        Intent intent = getIntent();

        SinhVien sinhVien = (SinhVien) intent.getSerializableExtra("thongTinSinhVien");
        FragmentManager fragmentManager = getSupportFragmentManager();
        Bundle bundle = new Bundle();
        bundle.putSerializable("data", sinhVien);
        fragmentManager.beginTransaction().add(R.id.fragmentChiTiet, fragmentStudentInfo.class, bundle).commit();
    }
}