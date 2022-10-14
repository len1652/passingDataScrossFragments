package com.ndphuc.dp.fragmentxulygiaodien;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.ListFragment;

import java.util.ArrayList;

public class FragmentStudentList extends ListFragment {
    ArrayList<SinhVien> arraySinhVien;
    StudentAdapter adapter;
    ITruyenSinhVien truyenSv;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        truyenSv = (ITruyenSinhVien) getActivity();

        arraySinhVien = new ArrayList<>();
        AddArraySv();
        adapter = new StudentAdapter(getActivity(),R.layout.row_student,arraySinhVien);
        setListAdapter(adapter);

        return inflater.inflate(R.layout.fragment_student_list,container,false);

    }

    @Override
    public void onListItemClick(@NonNull ListView l, @NonNull View v, int position, long id) {
        super.onListItemClick(l, v, position, id);
        truyenSv.DataStudent(arraySinhVien.get(position));
    }

    private  void AddArraySv(){
        arraySinhVien.add(new SinhVien("Nguyễn Văn Anh Nguyễn B C", 1999,"Hà Nội","ga@gmail.com"));
        arraySinhVien.add(new SinhVien("Nguyễn Văn B", 1999,"Hà","ga@gmail.com"));
        arraySinhVien.add(new SinhVien("Nguyễn Văn C", 1999,"Nội","ga@gmail.com"));
        arraySinhVien.add(new SinhVien("Nguyễn Văn D", 1999,"Sài Gòn","ga@gmail.com"));
        arraySinhVien.add(new SinhVien("Nguyễn Văn E", 1999,"Hà Nội","ga@gmail.com"));
        arraySinhVien.add(new SinhVien("Nguyễn Văn F", 1999,"Hà Nội","ga@gmail.com"));
        arraySinhVien.add(new SinhVien("Nguyễn Văn G", 1999,"Hà Nội","ga@gmail.com"));
        arraySinhVien.add(new SinhVien("Nguyễn Văn H", 1999,"Hà Nội","ga@gmail.com"));
        arraySinhVien.add(new SinhVien("Nguyễn Văn I", 1999,"Hà Nội","ga@gmail.com"));
        arraySinhVien.add(new SinhVien("Nguyễn Văn K", 1999,"Hà Nội","ga@gmail.com"));
        arraySinhVien.add(new SinhVien("Nguyễn Văn L", 1999,"Hà Nội","ga@gmail.com"));

    }
}
