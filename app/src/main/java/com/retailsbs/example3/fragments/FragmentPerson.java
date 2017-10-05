package com.retailsbs.example3.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.retailsbs.example3.R;

/**
 * Created by Trabajo on 04-10-2017.
 */

public class FragmentPerson extends Fragment {

    private LinearLayout mLayout;
    private String mRut, mName;
    private TextView mTxtRut, mTxtName;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        mLayout = (LinearLayout) inflater.inflate(R.layout.fragment_person, container, false);

        mTxtName = (TextView) mLayout.findViewById(R.id.txt_name);
        mTxtRut = (TextView) mLayout.findViewById(R.id.txt_rut);

        mRut = "18.192.374-1";
        mName = "Pablo Ignacio Hidalgo Bustos";

        mTxtRut.setText(mRut);
        mTxtName.setText(mName);

        return mLayout;
    }
}