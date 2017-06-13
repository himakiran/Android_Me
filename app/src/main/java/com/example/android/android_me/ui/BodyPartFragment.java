package com.example.android.android_me.ui;

import android.media.Image;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.android.android_me.R;
import com.example.android.android_me.data.AndroidImageAssets;

import java.util.zip.Inflater;

/**
 * Created by userhk on 14/06/17.
 */

public class BodyPartFragment extends Fragment {

    // Mandatory empty constructor
    public BodyPartFragment(){

    }

    // inflate the corresponding layout file

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        View rootView = inflater.inflate(R.layout.fragment_body_part,container,false);
        ImageView imgView = (ImageView) rootView.findViewById(R.id.body_part_image_view);
        imgView.setImageResource(AndroidImageAssets.getHeads().get(0));
        return rootView;
    }


}
