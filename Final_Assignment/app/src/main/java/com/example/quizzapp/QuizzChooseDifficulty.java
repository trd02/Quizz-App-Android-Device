package com.example.quizzapp;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentResultListener;
import androidx.navigation.Navigation;

public class QuizzChooseDifficulty extends Fragment {


    public QuizzChooseDifficulty() {
        // Required empty public constructor
    }


    View view;

    private String container = "";
    private int selectedDifficulty;

    private Button easy, normal, hard;
    private Button difficultyStart;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_quizz_choose_difficulty, container, false);
        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        getParentFragmentManager().setFragmentResultListener("dataFromMenu", this, new FragmentResultListener() {
            @Override
            public void onFragmentResult(@NonNull String requestKey, @NonNull Bundle result) {
                container = result.getString("selectedTopicName");

                easy = view.findViewById(R.id.easy);
                normal = view.findViewById(R.id.normal);
                hard = view.findViewById(R.id.hard);
                difficultyStart = view.findViewById(R.id.difficultyStart);

                easy.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        selectedDifficulty = 1;

                        easy.setBackgroundResource(R.color.teal_200);
                        normal.setBackgroundResource(R.color.purple_700);
                        hard.setBackgroundResource(R.color.purple_700);
                    }
                });

                normal.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        selectedDifficulty = 2;

                        easy.setBackgroundResource(R.color.purple_700);
                        normal.setBackgroundResource(R.color.teal_200);
                        hard.setBackgroundResource(R.color.purple_700);
                    }
                });

                hard.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        selectedDifficulty = 3;

                        easy.setBackgroundResource(R.color.purple_700);
                        normal.setBackgroundResource(R.color.purple_700);
                        hard.setBackgroundResource(R.color.teal_200);
                    }
                });

                difficultyStart.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Bundle bundle = new Bundle();
                        bundle.putString("selectedTopicName", container);
                        bundle.putInt("selectedDifficulty", selectedDifficulty);
                        getParentFragmentManager().setFragmentResult("dataFromDifficulty", bundle);
                        Navigation.findNavController(view).navigate(R.id.action_quizzChooseDifficulty_to_quizzActivityFragment);
                    }
                });

            }
        });
    }
}