package com.example.app_dzy328.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.app_dzy328.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class AddresslistFragment extends Fragment {


    public AddresslistFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_addresslist, container, false);
    }

}
