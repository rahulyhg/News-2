package com.example.prans.news.fragment;


import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * A simple {@link Fragment} subclass.
 */
public class SportsFragment extends MainFragment {


    public SportsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        String QueryUrl = "https://newsapi.org/v2/top-headlines?sources=espn-cric-info,bbc-sport,talksport,the-sport-bible,espn,four-four-two&apiKey=35c1bde1d45d4cc192403695ee31a59f";
        return super.onCreateView(inflater, container, QueryUrl);
    }
}
