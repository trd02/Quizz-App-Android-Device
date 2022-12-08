package com.example.quizzapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentResultListener;
import androidx.navigation.Navigation;

public class QuizzResults extends Fragment {

    View view;

    private Button startNewQuizz;
    private Button shareSheet;

    private TextView correctAnswer;
    private TextView inCorrectAnswer;

    private String sSelectedTopicName = "";
    private int difficulty;
    private String difficulties = "";

    private TextView finishedQuizz;

    public QuizzResults() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_quizz_results, container, false);

        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        startNewQuizz = view.findViewById(R.id.startNewQuizz);
        correctAnswer = view.findViewById(R.id.correctAnswer);
        inCorrectAnswer = view.findViewById(R.id.inCorrectAnswer);
        shareSheet = view.findViewById(R.id.shareSheet);
        finishedQuizz = view.findViewById(R.id.completedQuizz);

        getParentFragmentManager().setFragmentResultListener("dataFromQuizzActivity", this, new FragmentResultListener() {
            @Override
            public void onFragmentResult(@NonNull String requestKey, @NonNull Bundle result) {
                int getCorrectAnswers = result.getInt("Correct");
                int getInCorrectAnswers = result.getInt("Incorrect");
                correctAnswer.setText("Số câu trả lời đúng" + " " + String.valueOf(getCorrectAnswers));
                inCorrectAnswer.setText("Số câu trả lời sai" + " " + String.valueOf(getInCorrectAnswers));

                sSelectedTopicName = result.getString("sTopicName");
                difficulty = result.getInt("sDifficulty");

                if(difficulty == 1) {difficulties = "Dễ";}
                else  if(difficulty == 2) {difficulties = "Thường";}
                else {difficulties = "Khó";}

                finishedQuizz.setText("Bạn đã hoàn thành Quizz " + sSelectedTopicName + ", độ khó: " + difficulties);

                startNewQuizz.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Navigation.findNavController(view).navigate(R.id.action_quizzResults_to_mainFragment);
                    }
                });

                shareSheet.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent();
                        intent.setAction(Intent.ACTION_SEND);
                        intent.putExtra(Intent.EXTRA_TEXT, "Tôi đã trả lời đúng " + getCorrectAnswers +" câu hỏi từ Quizz " + sSelectedTopicName + ", độ khó: " + difficulties);
                        intent.setType("text/plain");
                        if(intent.resolveActivity(getActivity().getPackageManager()) != null){
                            startActivity(intent);
                        }
                    }
                });
            }
        });

    }
}