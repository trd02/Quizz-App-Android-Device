package com.example.quizzapp;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.strictmode.TargetFragmentUsageViolation;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;

/**
 * A simple {@link Fragment} subclass.
 * create an instance of this fragment.
 */

public class MainFragment extends Fragment {

    private String selectedTopicName = "";
    public MainFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_main, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        NavController navController = Navigation.findNavController(view);

        //Change selected button scrollview
        Button dialy = view.findViewById(R.id.diaLy);
        Button hoahoc = view.findViewById(R.id.hoaHoc);
        Button vutru = view.findViewById(R.id.vuTru);
        Button dongvat = view.findViewById(R.id.dongVat);
        Button thienvan = view.findViewById(R.id.thienVan);
        Button sinhhoc = view.findViewById(R.id.sinhHoc);

        dialy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                selectedTopicName = "Địa Lý";

                dialy.setBackgroundResource(R.color.teal_200);
                hoahoc.setBackgroundResource(R.color.purple_700);
                vutru.setBackgroundResource(R.color.purple_700);
                dongvat.setBackgroundResource(R.color.purple_700);
                thienvan.setBackgroundResource(R.color.purple_700);
                sinhhoc.setBackgroundResource(R.color.purple_700);
            }
        });

        hoahoc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                selectedTopicName = "Hoá Học";

                hoahoc.setBackgroundResource(R.color.teal_200);
                dialy.setBackgroundResource(R.color.purple_700);
                vutru.setBackgroundResource(R.color.purple_700);
                dongvat.setBackgroundResource(R.color.purple_700);
                thienvan.setBackgroundResource(R.color.purple_700);
                sinhhoc.setBackgroundResource(R.color.purple_700);
            }
        });

        vutru.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                selectedTopicName = "Vũ Trụ";

                vutru.setBackgroundResource(R.color.teal_200);
                dialy.setBackgroundResource(R.color.purple_700);
                hoahoc.setBackgroundResource(R.color.purple_700);
                dongvat.setBackgroundResource(R.color.purple_700);
                thienvan.setBackgroundResource(R.color.purple_700);
                sinhhoc.setBackgroundResource(R.color.purple_700);
            }
        });

        dongvat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                selectedTopicName = "Động Vật";

                dongvat.setBackgroundResource(R.color.teal_200);
                dialy.setBackgroundResource(R.color.purple_700);
                vutru.setBackgroundResource(R.color.purple_700);
                hoahoc.setBackgroundResource(R.color.purple_700);
                thienvan.setBackgroundResource(R.color.purple_700);
                sinhhoc.setBackgroundResource(R.color.purple_700);
            }
        });

        thienvan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                selectedTopicName = "Thiên Văn";

                thienvan.setBackgroundResource(R.color.teal_200);
                dialy.setBackgroundResource(R.color.purple_700);
                vutru.setBackgroundResource(R.color.purple_700);
                dongvat.setBackgroundResource(R.color.purple_700);
                hoahoc.setBackgroundResource(R.color.purple_700);
                sinhhoc.setBackgroundResource(R.color.purple_700);
            }
        });

        sinhhoc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                selectedTopicName = "Sinh Học";

                sinhhoc.setBackgroundResource(R.color.teal_200);
                dialy.setBackgroundResource(R.color.purple_700);
                vutru.setBackgroundResource(R.color.purple_700);
                dongvat.setBackgroundResource(R.color.purple_700);
                hoahoc.setBackgroundResource(R.color.purple_700);
                thienvan.setBackgroundResource(R.color.purple_700);
            }
        });

        //Move to fragment2
        Button button = view.findViewById(R.id.startQuizzBtn);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //Đóng gói dữ liệu từ fragment hiện tại
                Bundle bundle = new Bundle();
                bundle.putString("selectedTopicName", selectedTopicName);
                getParentFragmentManager().setFragmentResult("dataFromMenu", bundle);
                //Khởi chạy fragment tiếp theo
                navController.navigate(R.id.action_mainFragment_to_quizzActivityFragment);
            }
        });
    }
}