package com.example.quizzapp;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import com.google.android.material.bottomnavigation.BottomNavigationView;


public class MainFragment extends Fragment {

    String selectedTopicName = "";
    View view;
    private BottomNavigationView bottomNavigationView;

    public MainFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_main, container, false);
        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        //Change selected button scrollview
        ImageView dialy = view.findViewById(R.id.diaLy);
        ImageView hoahoc = view.findViewById(R.id.hoaHoc);
        ImageView vutru = view.findViewById(R.id.vuTru);
        ImageView dongvat = view.findViewById(R.id.dongVat);
        ImageView thienvan = view.findViewById(R.id.thienVan);
        ImageView sinhhoc = view.findViewById(R.id.sinhHoc);

        dialy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                selectedTopicName = "Địa Lý";

                Bundle bundle = new Bundle();
                bundle.putString("selectedTopicName", selectedTopicName);
                getParentFragmentManager().setFragmentResult("dataFromMenu", bundle);

                //Khởi chạy fragment tiếp theo
                Navigation.findNavController(view).navigate(R.id.action_mainFragment_to_quizzChooseDifficulty);

            }
        });

        hoahoc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                selectedTopicName = "Hoá Học";

                Bundle bundle = new Bundle();
                bundle.putString("selectedTopicName", selectedTopicName);
                getParentFragmentManager().setFragmentResult("dataFromMenu", bundle);

                //Khởi chạy fragment tiếp theo
                Navigation.findNavController(view).navigate(R.id.action_mainFragment_to_quizzChooseDifficulty);

            }
        });

        vutru.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                selectedTopicName = "Vũ Trụ";

                Bundle bundle = new Bundle();
                bundle.putString("selectedTopicName", selectedTopicName);
                getParentFragmentManager().setFragmentResult("dataFromMenu", bundle);

                //Khởi chạy fragment tiếp theo
                Navigation.findNavController(view).navigate(R.id.action_mainFragment_to_quizzChooseDifficulty);

            }
        });

        dongvat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                selectedTopicName = "Động Vật";

                Bundle bundle = new Bundle();
                bundle.putString("selectedTopicName", selectedTopicName);
                getParentFragmentManager().setFragmentResult("dataFromMenu", bundle);

                //Khởi chạy fragment tiếp theo
                Navigation.findNavController(view).navigate(R.id.action_mainFragment_to_quizzChooseDifficulty);

            }
        });

        thienvan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                selectedTopicName = "Thiên Văn";

                Bundle bundle = new Bundle();
                bundle.putString("selectedTopicName", selectedTopicName);
                getParentFragmentManager().setFragmentResult("dataFromMenu", bundle);

                //Khởi chạy fragment tiếp theo
                Navigation.findNavController(view).navigate(R.id.action_mainFragment_to_quizzChooseDifficulty);

            }
        });

        sinhhoc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                selectedTopicName = "Sinh Học";

                Bundle bundle = new Bundle();
                bundle.putString("selectedTopicName", selectedTopicName);
                getParentFragmentManager().setFragmentResult("dataFromMenu", bundle);

                //Khởi chạy fragment tiếp theo
                Navigation.findNavController(view).navigate(R.id.action_mainFragment_to_quizzChooseDifficulty);

            }
        });

    }
}