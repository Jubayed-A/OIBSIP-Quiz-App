package com.example.quizappusingjava.presentation.fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.quizappusingjava.R;
import com.example.quizappusingjava.data.model.HomeModel;
import com.example.quizappusingjava.databinding.FragmentSubBinding;
import com.example.quizappusingjava.presentation.adapter.SubAdapter;

import java.util.ArrayList;

public class SubFragment extends Fragment {

    FragmentSubBinding binding;
    ArrayList<HomeModel> list = new ArrayList<>();
    SubAdapter adapter;
    String title;

    public SubFragment() {

    }

    public SubFragment(String title) {
        this.title = title;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        binding = FragmentSubBinding.inflate(getLayoutInflater());

        LoadData();

        return binding.getRoot();
    }


    private void LoadData() {
        binding.subRecyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        list.clear();

        // Retrieve subcategory names and descriptions from string arrays

        // Accessing general sub-category and description arrays
        String[] generalCategory = getResources().getStringArray(R.array.general_knowledge_sub_categories);
        String[] generalDescription = getResources().getStringArray(R.array.general_knowledge_sub_categories_description);
        // Ensure the General arrays have the same length
        int generalLength = Math.min(generalCategory.length, generalDescription.length);

        // Accessing Science sub-category and description arrays
        String[] scienceCategory = getResources().getStringArray(R.array.science_questions);
        String[] scienceDescription = getResources().getStringArray(R.array.science_descriptions);
        int scienceLength = Math.min(scienceCategory.length, scienceDescription.length);

        // Accessing Technology sub-category and description arrays
        String[] technologyCategory = getResources().getStringArray(R.array.technology_questions);
        String[] technologyDescription = getResources().getStringArray(R.array.technology_descriptions);
        int technologyLength = Math.min(technologyCategory.length, technologyDescription.length);

        // Accessing Entertainment sub-category and description arrays
        String[] entertainmentCategory = getResources().getStringArray(R.array.entertainment_questions);
        String[] entertainmentDescription = getResources().getStringArray(R.array.entertainment_descriptions);
        int entertainmentLength = Math.min(entertainmentCategory.length, entertainmentDescription.length);

        // Accessing Sports sub-category and description arrays
        String[] sportsCategory = getResources().getStringArray(R.array.sports_questions);
        String[] sportsDescription = getResources().getStringArray(R.array.sports_descriptions);
        int sportsLength = Math.min(sportsCategory.length, sportsDescription.length);

        // Accessing Literature sub-category and description arrays
        String[] literatureSubCategory = getResources().getStringArray(R.array.literature_questions);
        String[] literatureDescription = getResources().getStringArray(R.array.literature_descriptions);
        int literatureLength = Math.min(literatureSubCategory.length, literatureDescription.length);

        // Accessing Arts and Culture sub-category and description arrays
        String[] artsAndCultureSubCategory = getResources().getStringArray(R.array.arts_and_culture_questions);
        String[] artsAndCultureDescription = getResources().getStringArray(R.array.arts_and_culture_descriptions);
        int artsAndCultureLength = Math.min(artsAndCultureSubCategory.length, artsAndCultureDescription.length);

        // Accessing Food and Drink sub-category and description arrays
        String[] foodAndDrinkSubCategory = getResources().getStringArray(R.array.food_and_drink_questions);
        String[] foodAndDrinkDescription = getResources().getStringArray(R.array.food_and_drink_descriptions);
        int foodAndDrinkLength = Math.min(foodAndDrinkSubCategory.length, foodAndDrinkDescription.length);

        // Accessing Mathematics sub-category and description arrays
        String[] mathematicsSubCategory = getResources().getStringArray(R.array.mathematics_questions);
        String[] mathematicsDescription = getResources().getStringArray(R.array.mathematics_descriptions);
        int mathematicsLength = Math.min(mathematicsSubCategory.length, mathematicsDescription.length);

        // Accessing Language and Words sub-category and description arrays
        String[] languageAndWordsSubCategory = getResources().getStringArray(R.array.language_and_words_questions);
        String[] languageAndWordsDescription = getResources().getStringArray(R.array.language_and_words_descriptions);
        int languageAndWordsLength = Math.min(languageAndWordsSubCategory.length, languageAndWordsDescription.length);

        // Accessing Nature and Environment sub-category and description arrays
        String[] natureAndEnvironmentSubCategory = getResources().getStringArray(R.array.nature_and_environment_questions);
        String[] natureAndEnvironmentDescription = getResources().getStringArray(R.array.nature_and_environment_descriptions);
        int natureAndEnvironmentLength = Math.min(natureAndEnvironmentSubCategory.length, natureAndEnvironmentDescription.length);

        // Accessing Mythology sub-category and description arrays
        String[] mythologySubCategory = getResources().getStringArray(R.array.mythology_questions);
        String[] mythologyDescription = getResources().getStringArray(R.array.mythology_descriptions);
        int mythologyLength = Math.min(mythologySubCategory.length, mythologyDescription.length);


        switch (title) {
            case "General Knowledge":

                // Load data from string arrays
                for (int i = 0; i < generalLength; i++) {
                    list.add(new HomeModel(generalCategory[i], generalDescription[i]));
                }
                break;
            case "Science":

                // Load data from string arrays
                for (int i = 0; i < scienceLength; i++) {
                    list.add(new HomeModel(scienceCategory[i], scienceDescription[i]));
                }
                break;
            case "Technology":

                // Load data from string arrays
                for (int i = 0; i < technologyLength; i++) {
                    list.add(new HomeModel(technologyCategory[i], technologyDescription[i]));
                }
                break;
            case "Entertainment":

                // Load data from string arrays
                for (int i = 0; i < entertainmentLength; i++) {
                    list.add(new HomeModel(entertainmentCategory[i], entertainmentDescription[i]));
                }
                break;
            case "Sports":

                // Load data from string arrays
                for (int i = 0; i < sportsLength; i++) {
                    list.add(new HomeModel(sportsCategory[i], sportsDescription[i]));
                }
                break;
            case "Literature":

                // Load data from string arrays
                for (int i = 0; i < literatureLength; i++) {
                    list.add(new HomeModel(literatureSubCategory[i], literatureDescription[i]));
                }
                break;
            case "Arts and Culture":

                // Load data from string arrays
                for (int i = 0; i < artsAndCultureLength; i++) {
                    list.add(new HomeModel(artsAndCultureSubCategory[i], artsAndCultureDescription[i]));
                }
                break;
            case "Food and Drink":

                // Load data from string arrays
                for (int i = 0; i < foodAndDrinkLength; i++) {
                    list.add(new HomeModel(foodAndDrinkSubCategory[i], foodAndDrinkDescription[i]));
                }
                break;
            case "Mathematics":

                // Load data from string arrays
                for (int i = 0; i < mathematicsLength; i++) {
                    list.add(new HomeModel(mathematicsSubCategory[i], mathematicsDescription[i]));
                }
                break;
            case "Language and Words":

                // Load data from string arrays
                for (int i = 0; i < languageAndWordsLength; i++) {
                    list.add(new HomeModel(languageAndWordsSubCategory[i], languageAndWordsDescription[i]));
                }
                break;
            case "Nature and Environment":

                // Load data from string arrays
                for (int i = 0; i < natureAndEnvironmentLength; i++) {
                    list.add(new HomeModel(natureAndEnvironmentSubCategory[i], natureAndEnvironmentDescription[i]));
                }
                break;
            case "Mythology":

                // Load data from string arrays
                for (int i = 0; i < mythologyLength; i++) {
                    list.add(new HomeModel(mythologySubCategory[i], mythologyDescription[i]));
                }
                break;
        }


        adapter = new SubAdapter(getContext(), list);
        binding.subRecyclerView.setAdapter(adapter);
    }

}