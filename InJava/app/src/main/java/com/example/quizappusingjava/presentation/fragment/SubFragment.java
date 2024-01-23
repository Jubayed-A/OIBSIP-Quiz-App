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

    public SubFragment(){

    }

    public SubFragment(String title){
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

        switch (title) {
            case "Category 1":
                list.add(new HomeModel("Sub1 Category 1", "Description 1"));
                list.add(new HomeModel("Sub1 Category 2", "Description 2"));
                list.add(new HomeModel("Sub1 Category 3", "Description 3"));
                list.add(new HomeModel("Sub1 Category 4", "Description 4"));
                list.add(new HomeModel("Sub1 Category 5", "Description 5"));
                break;
            case "Category 2":
                list.add(new HomeModel("Sub2 Category 1", "Description 1"));
                list.add(new HomeModel("Sub2 Category 2", "Description 2"));
                list.add(new HomeModel("Sub2 Category 3", "Description 3"));
                list.add(new HomeModel("Sub2 Category 4", "Description 4"));
                list.add(new HomeModel("Sub2 Category 5", "Description 5"));
                break;
            case "Category 3":
                list.add(new HomeModel("Sub3 Category 1", "Description 1"));
                list.add(new HomeModel("Sub3 Category 2", "Description 2"));
                list.add(new HomeModel("Sub3 Category 3", "Description 3"));
                list.add(new HomeModel("Sub3 Category 4", "Description 4"));
                list.add(new HomeModel("Sub3 Category 5", "Description 5"));
                break;
            case "Category 4":
                list.add(new HomeModel("Sub4 Category 1", "Description 1"));
                list.add(new HomeModel("Sub4 Category 2", "Description 2"));
                list.add(new HomeModel("Sub4 Category 3", "Description 3"));
                list.add(new HomeModel("Sub4 Category 4", "Description 4"));
                list.add(new HomeModel("Sub4 Category 5", "Description 5"));
                break;
            case "Category 5":
                list.add(new HomeModel("Sub5 Category 1", "Description 1"));
                list.add(new HomeModel("Sub5 Category 2", "Description 2"));
                list.add(new HomeModel("Sub5 Category 3", "Description 3"));
                list.add(new HomeModel("Sub5 Category 4", "Description 4"));
                list.add(new HomeModel("Sub5 Category 5", "Description 5"));
                break;
        }

        adapter = new SubAdapter(getContext(), list);
        binding.subRecyclerView.setAdapter(adapter);
    }
}