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
        String[] generalCategory = getResources().getStringArray(R.array.general_sub_category);
        String[] generalDescription = getResources().getStringArray(R.array.general_sub_category_description);
        // Ensure the General arrays have the same length
        int generalLength = Math.min(generalCategory.length, generalDescription.length);

        // Accessing Science sub-category and description arrays
        String[] scienceCategory = getResources().getStringArray(R.array.Science_sub_category);
        String[] scienceDescription = getResources().getStringArray(R.array.Science_sub_category_description);
        int scienceLength = Math.min(scienceCategory.length, scienceDescription.length);

        // Accessing Technology sub-category and description arrays
        String[] technologyCategory = getResources().getStringArray(R.array.Technology_sub_category);
        String[] technologyDescription = getResources().getStringArray(R.array.Technology_sub_category_description);
        int technologyLength = Math.min(technologyCategory.length, technologyDescription.length);

        // Accessing Entertainment sub-category and description arrays
        String[] entertainmentCategory = getResources().getStringArray(R.array.Entertainment_sub_category);
        String[] entertainmentDescription = getResources().getStringArray(R.array.Entertainment_sub_category_description);
        int entertainmentLength = Math.min(entertainmentCategory.length, entertainmentDescription.length);

        // Accessing Sports sub-category and description arrays
        String[] sportsCategory = getResources().getStringArray(R.array.Sports_sub_category);
        String[] sportsDescription = getResources().getStringArray(R.array.Sports_sub_category_description);
        int sportsLength = Math.min(sportsCategory.length, sportsDescription.length);

        // Accessing Literature sub-category and description arrays
        String[] literatureSubCategory = getResources().getStringArray(R.array.Literature_sub_category);
        String[] literatureDescription = getResources().getStringArray(R.array.Literature_sub_category_description);
        int literatureLength = Math.min(literatureSubCategory.length, literatureDescription.length);

        // Accessing Arts and Culture sub-category and description arrays
        String[] artsAndCultureSubCategory = getResources().getStringArray(R.array.Arts_and_Culture_sub_category);
        String[] artsAndCultureDescription = getResources().getStringArray(R.array.Arts_and_Culture_sub_category_description);
        int artsAndCultureLength = Math.min(artsAndCultureSubCategory.length, artsAndCultureDescription.length);

        // Accessing Food and Drink sub-category and description arrays
        String[] foodAndDrinkSubCategory = getResources().getStringArray(R.array.Food_and_Drink_sub_category);
        String[] foodAndDrinkDescription = getResources().getStringArray(R.array.Food_and_Drink_sub_category_description);
        int foodAndDrinkLength = Math.min(foodAndDrinkSubCategory.length, foodAndDrinkDescription.length);

        // Accessing Mathematics sub-category and description arrays
        String[] mathematicsSubCategory = getResources().getStringArray(R.array.Mathematics_sub_category);
        String[] mathematicsDescription = getResources().getStringArray(R.array.Mathematics_sub_category_description);
        int mathematicsLength = Math.min(mathematicsSubCategory.length, mathematicsDescription.length);

        // Accessing Language and Words sub-category and description arrays
        String[] languageAndWordsSubCategory = getResources().getStringArray(R.array.Language_and_Words_sub_category);
        String[] languageAndWordsDescription = getResources().getStringArray(R.array.Language_and_Words_sub_category_description);
        int languageAndWordsLength = Math.min(languageAndWordsSubCategory.length, languageAndWordsDescription.length);

        // Accessing Nature and Environment sub-category and description arrays
        String[] natureAndEnvironmentSubCategory = getResources().getStringArray(R.array.Nature_and_Environment_sub_category);
        String[] natureAndEnvironmentDescription = getResources().getStringArray(R.array.Nature_and_Environment_sub_category_description);
        int natureAndEnvironmentLength = Math.min(natureAndEnvironmentSubCategory.length, natureAndEnvironmentDescription.length);

        // Accessing Mythology sub-category and description arrays
        String[] mythologySubCategory = getResources().getStringArray(R.array.Mythology_sub_category);
        String[] mythologyDescription = getResources().getStringArray(R.array.Mythology_sub_category_description);
        int mythologyLength = Math.min(mythologySubCategory.length, mythologyDescription.length);


        switch (title) {
            case "General Knowledge Category":

                // Load data from string arrays
                for (int i = 0; i < generalLength; i++) {
                    list.add(new HomeModel(generalCategory[i], generalDescription[i]));
                }
                break;
            case "Science Category":

                // Load data from string arrays
                for (int i = 0; i < scienceLength; i++) {
                    list.add(new HomeModel(scienceCategory[i], scienceDescription[i]));
                }
                break;
            case "Technology Category":

                // Load data from string arrays
                for (int i = 0; i < technologyLength; i++) {
                    list.add(new HomeModel(technologyCategory[i], technologyDescription[i]));
                }
                break;
            case "Entertainment Category":

                // Load data from string arrays
                for (int i = 0; i < entertainmentLength; i++) {
                    list.add(new HomeModel(entertainmentCategory[i], entertainmentDescription[i]));
                }
                break;
            case "Sports Category":

                // Load data from string arrays
                for (int i = 0; i < sportsLength; i++) {
                    list.add(new HomeModel(sportsCategory[i], sportsDescription[i]));
                }
                break;
            case "Literature Category":

                // Load data from string arrays
                for (int i = 0; i < literatureLength; i++) {
                    list.add(new HomeModel(literatureSubCategory[i], literatureDescription[i]));
                }
                break;
            case "Arts and Culture Category":

                // Load data from string arrays
                for (int i = 0; i < artsAndCultureLength; i++) {
                    list.add(new HomeModel(artsAndCultureSubCategory[i], artsAndCultureDescription[i]));
                }
                break;
            case "Food and Drink Category":

                // Load data from string arrays
                for (int i = 0; i < foodAndDrinkLength; i++) {
                    list.add(new HomeModel(foodAndDrinkSubCategory[i], foodAndDrinkDescription[i]));
                }
                break;
            case "Mathematics Category":

                // Load data from string arrays
                for (int i = 0; i < mathematicsLength; i++) {
                    list.add(new HomeModel(mathematicsSubCategory[i], mathematicsDescription[i]));
                }
                break;
            case "Language and Words Category":

                // Load data from string arrays
                for (int i = 0; i < languageAndWordsLength; i++) {
                    list.add(new HomeModel(languageAndWordsSubCategory[i], languageAndWordsDescription[i]));
                }
                break;
            case "Nature and Environment Category":

                // Load data from string arrays
                for (int i = 0; i < natureAndEnvironmentLength; i++) {
                    list.add(new HomeModel(natureAndEnvironmentSubCategory[i], natureAndEnvironmentDescription[i]));
                }
                break;
            case "Mythology Category":

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