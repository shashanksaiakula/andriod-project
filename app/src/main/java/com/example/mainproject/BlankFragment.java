package com.example.mainproject;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class BlankFragment extends Fragment {



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState)
    {
        Log.e("lifeCycle","CreateView");
        return inflater.inflate(R.layout.fragment_blank, container, false);
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        Log.e("lifeCycle","Attach");
    }

    @Override
    public void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.e("lifeCycle","Create");
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Log.e("lifeCycle","ActivityCreate");
    }

    @Override
    public void onViewStateRestored(Bundle savedInstanceState) {
        super.onViewStateRestored(savedInstanceState);
        Log.e("lifeCycle","Restored");
    }

    @Override
    public void onStart() {
        super.onStart();
        Log.e("lifeCycle","start");
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.e("lifeCycle","resume");
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.e("lifeCycle","pause");
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.e("lifeCycle","stop");
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Log.e("lifeCycle","DestoryView");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.e("lifeCycle","Destory");
    }

    @Override
    public void onDetach() {
        super.onDetach();
        Log.e("lifeCycle","Detach");
    }
}