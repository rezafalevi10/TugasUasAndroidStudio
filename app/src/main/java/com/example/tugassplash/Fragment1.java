package com.example.tugassplash;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;


public class Fragment1 extends Fragment {
    CardView videoSatu;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_1, container, false);
        videoSatu = (CardView) view.findViewById(R.id.dua);

        videoSatu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentDetail = new Intent(getActivity(),MovieDetail.class);
                startActivity(intentDetail);
            }
        });

        return view;
    }


}


