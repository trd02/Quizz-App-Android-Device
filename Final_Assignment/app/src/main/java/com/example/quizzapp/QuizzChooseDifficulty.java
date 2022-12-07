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

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link QuizzChooseDifficulty#newInstance} factory method to
 * create an instance of this fragment.
 */
public class QuizzChooseDifficulty extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public QuizzChooseDifficulty() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment QuizzChooseDifficulty.
     */
    // TODO: Rename and change types and number of parameters
    public static QuizzChooseDifficulty newInstance(String param1, String param2) {
        QuizzChooseDifficulty fragment = new QuizzChooseDifficulty();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    View view;

    private String container = "";
    private int selectedDifficulty;

    private Button easy, normal, hard;
    private Button difficultyStart;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

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