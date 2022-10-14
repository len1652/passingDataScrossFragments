package com.ndphuc.dp.fragmentxulygiaodien;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;


public class fragmentStudentInfo extends Fragment{
    TextView txtHoTen,txtNamSinh,txtDiaChi,txtEmail;
    View view;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_student_info,container,false);
        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        txtHoTen = view.findViewById(R.id.txtNameInfo);
        txtNamSinh = view.findViewById(R.id.txtNsInfo);
        txtDiaChi = view.findViewById(R.id.txtDiaChiInfo);
        txtEmail = view.findViewById(R.id.txtMalInfo);
    }

    public void SetInfo(SinhVien sv){
        txtHoTen.setText(sv.getHoTen());
        txtNamSinh.setText(String.valueOf(sv.getNamSinh()));
        txtDiaChi.setText(sv.getDiaChi());
        txtEmail.setText(sv.getEmail());

//        Toast.makeText(getActivity(), txtHoTen.getText().toString(), Toast.LENGTH_SHORT).show();
        Log.e("Name", sv.getHoTen());
    }
}