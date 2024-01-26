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
import java.util.List;
import java.util.Objects;

public class QuizFragment extends Fragment {
    private int position = 0;
    private int right = 0;
    FragmentQuizBinding binding;
    ArrayList<QuizModel> list = new ArrayList<>();
    int allQuestion;
    String listSize, positionNo;
    QuizModel quizModel;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
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
        if (position == allQuestion) {
            getParentFragmentManager().beginTransaction().replace(R.id.frameLayout,
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
     list.add(new QuizModel("Question 1", "Op1", "Op2", "Op3", "Op4", "Op2"));
        list.add(new QuizModel("Question 2", "Op1", "Op2", "Op3", "Op4", "Op1"));
        list.add(new QuizModel("Question 3", "Op1", "Op2", "Op3", "Op4", "Op3"));
        list.add(new QuizModel("Question 4", "Op1", "Op2", "Op3", "Op4", "Op2"));
        list.add(new QuizModel("Question 5", "Op1", "Op2", "Op3", "Op4", "Op4"));

//        // Load questions
//        String[] questions = getResources().getStringArray(R.array.world_geography_10_questions);
//        String[] questions2 = getResources().getStringArray(R.array.history_civilization_questions);
//        String[] questions3 = getResources().getStringArray(R.array.science_technology_questions);
//        String[] questions4 = getResources().getStringArray(R.array.current_affairs_questions);
//        String[] questions5 = getResources().getStringArray(R.array.general_science_questions);
//        String[] questions6 = getResources().getStringArray(R.array.famous_personalities_questions);
//
//        // Check if position is within bounds
//
//        // Load options for each question
//        String[] options1 = getResources().getStringArray(R.array.option1_world_geography_question);
//        String[] options2 = getResources().getStringArray(R.array.option2_world_geography_question);
//        String[] options3 = getResources().getStringArray(R.array.option3_world_geography_question);
//        String[] options4 = getResources().getStringArray(R.array.option4_world_geography_question);
//
//        // Load correct answers for each question
//        String[] correctOptions = getResources().getStringArray(R.array.world_geography_correctOptions);
//
//
//        // Create QuizModel objects
//        List<QuizModel> list = new ArrayList<>();
//        for (int i = 0; i < questions.length; i++) {
//            // Assuming options1.length == options2.length == ... (same number of options for each question)
//            list.add(new QuizModel(questions[i], options1[i], options2[i], options3[i], options4[i], correctOptions[i]));
//        }

        // Use the 'list' containing QuizModel objects as needed
        allQuestion = 5;
        listSize = String.valueOf(allQuestion);
        binding.totalQuestionNum.setText("/" + listSize);

        if (position != allQuestion) {
            positionNo = String.valueOf(position + 1);
            binding.CurrentQuestionNum.setText(positionNo);
        } else {
            positionNo = String.valueOf(position);
            binding.CurrentQuestionNum.setText(positionNo);
        }

        quizModel = list.get(position);

        binding.questionName.setText(quizModel.getQuestion());
        binding.option1.setText(quizModel.getOp1());
        binding.option2.setText(quizModel.getOp2());
        binding.option3.setText(quizModel.getOp3());
        binding.option4.setText(quizModel.getOp4());

        optionCheckUp();


    }

//    private void LoadQuestion() {
//        // Arrays of questions, options, and correct answers for different sections
//        String[][] questionsArray = {
//                getResources().getStringArray(R.array.world_geography_10_questions),
//                getResources().getStringArray(R.array.history_civilization_questions),
//                getResources().getStringArray(R.array.science_technology_questions),
//                getResources().getStringArray(R.array.current_affairs_questions),
//                getResources().getStringArray(R.array.general_science_questions),
//                getResources().getStringArray(R.array.famous_personalities_questions)
//        };
//
//        String[][] options1Array = {
//                getResources().getStringArray(R.array.option1_world_geography_question),
//                getResources().getStringArray(R.array.history_civilization_option1),
//                getResources().getStringArray(R.array.science_technology_option1),
//                getResources().getStringArray(R.array.current_affairs_option1),
//                getResources().getStringArray(R.array.general_science_option1),
//                getResources().getStringArray(R.array.famous_personalities_option1)
//        };
//
//        String[][] options2Array = {
//                getResources().getStringArray(R.array.option2_world_geography_question),
//                getResources().getStringArray(R.array.history_civilization_option2),
//                getResources().getStringArray(R.array.science_technology_option2),
//                getResources().getStringArray(R.array.current_affairs_option2),
//                getResources().getStringArray(R.array.general_science_option2),
//                getResources().getStringArray(R.array.famous_personalities_option2)
//        };
//
//        String[][] options3Array = {
//                getResources().getStringArray(R.array.option3_world_geography_question),
//                getResources().getStringArray(R.array.history_civilization_option3),
//                getResources().getStringArray(R.array.science_technology_option3),
//                getResources().getStringArray(R.array.current_affairs_option3),
//                getResources().getStringArray(R.array.general_science_option3),
//                getResources().getStringArray(R.array.famous_personalities_option4)
//        };
//
//        String[][] options4Array = {
//                getResources().getStringArray(R.array.option4_world_geography_question),
//                getResources().getStringArray(R.array.history_civilization_option4),
//                getResources().getStringArray(R.array.science_technology_option4),
//                getResources().getStringArray(R.array.current_affairs_option4),
//                getResources().getStringArray(R.array.general_science_option4),
//                getResources().getStringArray(R.array.famous_personalities_option4)
//        };
//
//        String[][] correctOptionsArray = {
//                getResources().getStringArray(R.array.world_geography_correctOptions),
//                getResources().getStringArray(R.array.history_civilization_correct_answers),
//                getResources().getStringArray(R.array.science_technology_correct_answers),
//                getResources().getStringArray(R.array.current_affairs_correct_answers),
//                getResources().getStringArray(R.array.general_science_correct_answers),
//                getResources().getStringArray(R.array.famous_personalities_correct_answers)
//        };
//
//        // Check if the position is within the bounds of available sections
//        if (position >= 0 && position < questionsArray.length) {
//            String[] questions = questionsArray[position];
//            String[] options1 = options1Array[position];
//            String[] options2 = options2Array[position];
//            String[] options3 = options3Array[position];
//            String[] options4 = options4Array[position];
//            String[] correctOptions = correctOptionsArray[position];
//
//            allQuestion = questions.length;
//            listSize = String.valueOf(allQuestion);
//            binding.totalQuestionNum.setText("/" + listSize);
//
//            positionNo = String.valueOf(position + 1);
//            binding.CurrentQuestionNum.setText(positionNo);
//
//            quizModel = new QuizModel(questions[position], options1[position], options2[position],
//                    options3[position], options4[position], correctOptions[position]);
//
//            answer = quizModel.getCorrectAns();
//
//            binding.questionName.setText(quizModel.getQuestion());
//            binding.option1.setText(quizModel.getOp1());
//            binding.option2.setText(quizModel.getOp2());
//            binding.option3.setText(quizModel.getOp3());
//            binding.option4.setText(quizModel.getOp4());
//
//            optionCheckUp();
//        }
//    }


    private void optionCheckUp() {

        binding.option1.setOnClickListener(v -> {
            if (Objects.equals(quizModel.getOp1(), quizModel.getCorrectAns())) {
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
            if (Objects.equals(quizModel.getOp2(), quizModel.getCorrectAns())) {
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
            if (Objects.equals(quizModel.getOp3(), quizModel.getCorrectAns())) {
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
            if (Objects.equals(quizModel.getOp4(), quizModel.getCorrectAns())) {
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

        if (Objects.equals(quizModel.getOp1(), quizModel.getCorrectAns())) {
            binding.option1.setBackgroundResource(R.drawable.right_bg);
            binding.option1.setTextColor(getContext().getColor(R.color.white));
        } else if (Objects.equals(quizModel.getOp2(), quizModel.getCorrectAns())) {
            binding.option2.setBackgroundResource(R.drawable.right_bg);
            binding.option2.setTextColor(getContext().getColor(R.color.white));
        } else if (Objects.equals(quizModel.getOp3(), quizModel.getCorrectAns())) {
            binding.option3.setBackgroundResource(R.drawable.right_bg);
            binding.option3.setTextColor(getContext().getColor(R.color.white));
        } else if (Objects.equals(quizModel.getOp4(), quizModel.getCorrectAns())) {
            binding.option4.setBackgroundResource(R.drawable.right_bg);
            binding.option4.setTextColor(getContext().getColor(R.color.white));
        }

    }
}