package com.example.quizzapp;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentResultListener;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import org.w3c.dom.Text;

/**
 * A simple {@link Fragment} subclass.
 * create an instance of this fragment.
 */
public class QuizzActivityFragment extends Fragment {


    View view; //Vì fragment phải ánh xạ lại chính nó.
    public QuizzActivityFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        //Lấy dữ liệu từ MainFragment và thay đổi Name Topic
        getParentFragmentManager().setFragmentResultListener("dataFromMenu", this, new FragmentResultListener() {
            @Override
            public void onFragmentResult(@NonNull String requestKey, @NonNull Bundle result) {
                String data = result.getString("selectedTopicName");
                TextView selectedTopicName = view.findViewById(R.id.topicName);
                selectedTopicName.setText(data);
            }
        });
        view = inflater.inflate(R.layout.fragment_quizz_activity, container, false);
        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

    }
}