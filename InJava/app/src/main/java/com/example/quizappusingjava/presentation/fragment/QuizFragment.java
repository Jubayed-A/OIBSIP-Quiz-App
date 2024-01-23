package com.example.quizappusingjava.presentation.fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.quizappusingjava.R;
import com.example.quizappusingjava.data.model.HomeModel;
import com.example.quizappusingjava.data.model.QuizModel;
import com.example.quizappusingjava.databinding.FragmentQuizBinding;

import java.util.ArrayList;
import java.util.Objects;

public class QuizFragment extends Fragment {
    private int position = 0, right = 0, wrong = 0;
    private static String answer = null;
    FragmentQuizBinding binding;
    ArrayList<QuizModel> list = new ArrayList<>();
    int allQuestion;
    String listSize, positionNo;
    QuizModel quizModel;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentQuizBinding.inflate(getLayoutInflater());

        LoadQuestion();
        EnableOption();
        ClearOption();
        binding.nextBtn.setOnClickListener(v -> {
            position++;
            LoadQuestion();
            EnableOption();
            ClearOption();
            checkNext();
        });

        return binding.getRoot();
    }

    private void checkNext() {
        if (position == allQuestion){
            getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.frameLayout,
                    new ResultFragment(right, allQuestion)).commit();
            list.clear();
            position = 0;
        }
    }

    private void ClearOption() {
        binding.option1.setBackgroundResource(R.drawable.bg_sub_item);
        binding.option1.setTextColor(getContext().getColor(R.color.black));
        binding.option2.setBackgroundResource(R.drawable.bg_sub_item);
        binding.option2.setTextColor(getContext().getColor(R.color.black));
        binding.option3.setBackgroundResource(R.drawable.bg_sub_item);
        binding.option3.setTextColor(getContext().getColor(R.color.black));
        binding.option4.setBackgroundResource(R.drawable.bg_sub_item);
        binding.option4.setTextColor(getContext().getColor(R.color.black));
        binding.nextBtn.setBackgroundResource(R.drawable.disable_btn);
    }

    private void EnableOption() {
        binding.option1.setEnabled(true);
        binding.option2.setEnabled(true);
        binding.option3.setEnabled(true);
        binding.option4.setEnabled(true);
        binding.nextBtn.setEnabled(false);
    }

    private void LoadQuestion() {
        list.add(new QuizModel("Question 1", "Op1","Op2","Op3","Op4","Op2"));
        list.add(new QuizModel("Question 2", "Op1","Op2","Op3","Op4","Op1"));
        list.add(new QuizModel("Question 3", "Op1","Op2","Op3","Op4","Op3"));
        list.add(new QuizModel("Question 4", "Op1","Op2","Op3","Op4","Op2"));
        list.add(new QuizModel("Question 5", "Op1","Op2","Op3","Op4","Op4"));
        allQuestion = 5;
        listSize = String.valueOf(allQuestion);
        binding.totalQuestionNum.setText("/" + listSize);

        if (position != allQuestion){
            positionNo = String.valueOf(position + 1);
            binding.CurrentQuestionNum.setText(positionNo);
        } else {
            positionNo = String.valueOf(position);
            binding.CurrentQuestionNum.setText(positionNo);
        }

        quizModel = list.get(position);
        answer = quizModel.getCorrectAns();

        binding.questionName.setText(quizModel.getQuestion());
        binding.option1.setText(quizModel.getOp1());
        binding.option2.setText(quizModel.getOp2());
        binding.option3.setText(quizModel.getOp3());
        binding.option4.setText(quizModel.getOp4());
        
        optionCheckUp();


    }

    private void optionCheckUp() {

        binding.option1.setOnClickListener(v -> {
            if (Objects.equals(quizModel.getOp1(),quizModel.getCorrectAns())){
                right++;
                binding.option1.setBackgroundResource(R.drawable.right_bg);
                binding.option1.setTextColor(getContext().getColor(R.color.white));
            } else {
                showRightAns();
                binding.option1.setBackgroundResource(R.drawable.wrong_bg);
                binding.option1.setTextColor(getContext().getColor(R.color.white));
            }
            DisableOption();
            binding.nextBtn.setBackgroundResource(R.drawable.bg_item_home);
        });

        binding.option2.setOnClickListener(v -> {
            if (Objects.equals(quizModel.getOp2(),quizModel.getCorrectAns())){
                right++;
                binding.option2.setBackgroundResource(R.drawable.right_bg);
                binding.option2.setTextColor(getContext().getColor(R.color.white));
            } else {
                showRightAns();
                binding.option2.setBackgroundResource(R.drawable.wrong_bg);
                binding.option2.setTextColor(getContext().getColor(R.color.white));
            }
            DisableOption();
            binding.nextBtn.setBackgroundResource(R.drawable.bg_item_home);
        });

        binding.option3.setOnClickListener(v -> {
            if (Objects.equals(quizModel.getOp3(),quizModel.getCorrectAns())){
                right++;
                binding.option3.setBackgroundResource(R.drawable.right_bg);
                binding.option3.setTextColor(getContext().getColor(R.color.white));
            } else {
                showRightAns();
                binding.option3.setBackgroundResource(R.drawable.wrong_bg);
                binding.option3.setTextColor(getContext().getColor(R.color.white));
            }
            DisableOption();
            binding.nextBtn.setBackgroundResource(R.drawable.bg_item_home);
        });

        binding.option4.setOnClickListener(v -> {
            if (Objects.equals(quizModel.getOp4(),quizModel.getCorrectAns())){
                right++;
                binding.option4.setBackgroundResource(R.drawable.right_bg);
                binding.option4.setTextColor(getContext().getColor(R.color.white));
            } else {
                showRightAns();
                binding.option4.setBackgroundResource(R.drawable.wrong_bg);
                binding.option4.setTextColor(getContext().getColor(R.color.white));
            }
            DisableOption();
            binding.nextBtn.setBackgroundResource(R.drawable.bg_item_home);
        });

    }

    private void DisableOption() {
        binding.option1.setEnabled(false);
        binding.option2.setEnabled(false);
        binding.option3.setEnabled(false);
        binding.option4.setEnabled(false);
        binding.nextBtn.setEnabled(true);
    }

    private void showRightAns() {

        if (Objects.equals(quizModel.getOp1(),quizModel.getCorrectAns())){
            binding.option1.setBackgroundResource(R.drawable.right_bg);
            binding.option1.setTextColor(getContext().getColor(R.color.white));
        } else if (Objects.equals(quizModel.getOp2(),quizModel.getCorrectAns())){
            binding.option2.setBackgroundResource(R.drawable.right_bg);
            binding.option2.setTextColor(getContext().getColor(R.color.white));
        } else if (Objects.equals(quizModel.getOp3(),quizModel.getCorrectAns())){
            binding.option3.setBackgroundResource(R.drawable.right_bg);
            binding.option3.setTextColor(getContext().getColor(R.color.white));
        } else if (Objects.equals(quizModel.getOp4(),quizModel.getCorrectAns())){
            binding.option4.setBackgroundResource(R.drawable.right_bg);
            binding.option4.setTextColor(getContext().getColor(R.color.white));
        }

    }
}