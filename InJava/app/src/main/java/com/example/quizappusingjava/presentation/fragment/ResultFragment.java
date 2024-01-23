package com.example.quizappusingjava.presentation.fragment;

import android.annotation.SuppressLint;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.quizappusingjava.R;
import com.example.quizappusingjava.databinding.FragmentResultBinding;

public class ResultFragment extends Fragment {

    FragmentResultBinding binding;
    int right, allQuestion;

    public ResultFragment(int right, int allQuestion) {
        this.right = right;
        this.allQuestion = allQuestion;
    }

    @SuppressLint("SetTextI18n")
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentResultBinding.inflate(getLayoutInflater());

        binding.correct.setText(right + " Correct");
        binding.wrong.setText(allQuestion - right + " Wrong");
        binding.score.setText("You got " + right + " out of " + allQuestion);

        binding.exploreBtn.setOnClickListener(v -> {
            getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.frameLayout,
                    new SubFragment()).commit();
        });

        binding.repeat.setOnClickListener(v -> {
            getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.frameLayout,
                    new QuizFragment()).commit();
        });

        return binding.getRoot();
    }
}