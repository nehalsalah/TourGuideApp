package com.example.nehalsalah.tourguide;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;


import java.util.ArrayList;

public class CairoFragment extends Fragment {

    public CairoFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.guide_list, container, false);

        // Create a list of guide
        ArrayList<Guide> CairoList = new ArrayList<>();
        CairoList.add(new Guide(getString(R.string.cairo_0_tittle), getString(R.string.cairo_0_information), getString(R.string.cairo_0_address), R.drawable.fortressofbabylon));
        CairoList.add(new Guide(getString(R.string.cairo_1_tittle), getString(R.string.cairo_1_information), getString(R.string.cairo_1_address), R.drawable.babalfutuh));
        CairoList.add(new Guide(getString(R.string.cairo_2_tittle), getString(R.string.cairo_2_information), getString(R.string.cairo_2_address), R.drawable.cairotower));
        CairoList.add(new Guide(getString(R.string.cairo_3_tittle), getString(R.string.cairo_3_information), getString(R.string.cairo_3_address), R.drawable.salaheldinalayoubycitadel));
        CairoList.add(new Guide(getString(R.string.cairo_4_tittle), getString(R.string.cairo_4_information), getString(R.string.cairo_4_address), R.drawable.khanelkhalili));
        CairoList.add(new Guide(getString(R.string.cairo_5_tittle), getString(R.string.cairo_5_information), getString(R.string.cairo_5_address), R.drawable.alazharmosque));
        CairoList.add(new Guide(getString(R.string.cairo_6_tittle), getString(R.string.cairo_6_information), getString(R.string.cairo_6_address), R.drawable.abdeenpalacemuseum));
        CairoList.add(new Guide(getString(R.string.cairo_7_tittle), getString(R.string.cairo_7_information), getString(R.string.cairo_7_address), R.drawable.greatsphinx));
        CairoList.add(new Guide(getString(R.string.cairo_8_tittle), getString(R.string.cairo_8_information), getString(R.string.cairo_8_address), R.drawable.pyramids));


        // Create an {@link GuideAdapter}, whose data source is a list of {@link Guide}s. The
        // adapter knows how to create list items for each item in the list.
        GuideAdapter adapter = new GuideAdapter(getActivity(), CairoList);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // guide_list.xml layout file.
        ListView listView = (ListView) rootView.findViewById(R.id.guide_list);

        // Make the {@link ListView} use the {@link GuideAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Guide} in the list.
        listView.setAdapter(adapter);

        return rootView;
    }
}

