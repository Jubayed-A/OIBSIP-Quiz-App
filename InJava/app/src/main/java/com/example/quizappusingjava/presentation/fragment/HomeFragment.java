package com.example.quizappusingjava.presentation.fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.quizappusingjava.R;
import com.example.quizappusingjava.data.model.HomeModel;
import com.example.quizappusingjava.databinding.FragmentHomeBinding;
import com.example.quizappusingjava.presentation.adapter.HomeAdapter;

import java.util.ArrayList;

public class HomeFragment extends Fragment {

    FragmentHomeBinding binding;
    ArrayList<HomeModel> list = new ArrayList<>();
    HomeAdapter adapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        binding = FragmentHomeBinding.inflate(getLayoutInflater());

        LoadData();


        return binding.getRoot();
    }

    private void LoadData() {

        binding.homeRecyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        list.clear();
        list.add(new HomeModel("Category 1", "Description 1"));
        list.add(new HomeModel("Category 2", "Description 2"));
        list.add(new HomeModel("Category 3", "Description 3"));
        list.add(new HomeModel("Category 4", "Description 4"));
        list.add(new HomeModel("Category 5", "Description 5"));

        adapter = new HomeAdapter(getContext(), list);
        binding.homeRecyclerView.setAdapter(adapter);
    }
}