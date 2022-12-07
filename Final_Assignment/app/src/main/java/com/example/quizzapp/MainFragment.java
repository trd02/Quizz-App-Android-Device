package com.example.quizzapp;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

/**
 * A simple {@link Fragment} subclass.
 * create an instance of this fragment.
 */

public class MainFragment extends Fragment {

    String selectedTopicName = "";
    View view;

    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public MainFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment BlankFragment.
     */
    // TODO: Rename and change types and number of parameters

    public static MainFragment newInstance(String param1, String param2) {
        MainFragment fragment = new MainFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

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
        view = inflater.inflate(R.layout.fragment_main, container, false);
        return view;
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
                selectedTopicName = "Thiên  Văn";

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
        Button startButton = view.findViewById(R.id.startQuizzBtn);
        startButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(selectedTopicName.isEmpty()){
                    Toast.makeText(getActivity(), "Pls select topic", Toast.LENGTH_SHORT).show();
                }
                else {
                    //Đóng gói dữ liệu từ fragment hiện tại
                    Bundle bundle = new Bundle();
                    bundle.putString("selectedTopicName", selectedTopicName);
                    getParentFragmentManager().setFragmentResult("dataFromMenu", bundle);

                    //Khởi chạy fragment tiếp theo
                    navController.navigate(R.id.action_mainFragment_to_quizzChooseDifficulty);
                }
            }
        });
    }
}