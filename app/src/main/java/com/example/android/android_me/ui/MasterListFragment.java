package com.example.android.android_me.ui;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;

import com.example.android.android_me.R;
import com.example.android.android_me.data.AndroidImageAssets;

import java.util.List;

/**
 * Created by userhk on 15/06/17.
 */

public class MasterListFragment extends Fragment {

    public MasterListFragment(){

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_master_list,container,false);

        final GridView gridView = (GridView) rootView.findViewById(R.id.fragment_master_list_layout_gridview);

        List<Integer> imageList = AndroidImageAssets.getAll();

        MasterListAdapter ma = new MasterListAdapter(getContext(),imageList);
        gridView.setAdapter(ma);

        return rootView;
    }
}
