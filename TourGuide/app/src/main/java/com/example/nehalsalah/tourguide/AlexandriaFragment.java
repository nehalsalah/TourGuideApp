package com.example.nehalsalah.tourguide;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class AlexandriaFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.guide_list, container, false);

        // Create a list of guide
        ArrayList<Guide> AlexList = new ArrayList<>();
        AlexList.add(new Guide(getString(R.string.Alexandria_0_title), getString(R.string.Alexandria_0_information), getString(R.string.Alexandria_0_address), R.drawable.bibliothecaalexandrina));
        AlexList.add(new Guide(getString(R.string.Alexandria_1_title), getString(R.string.Alexandria_1_information), getString(R.string.Alexandria_1_address), R.drawable.abualabbasalmursimosque));
        AlexList.add(new Guide(getString(R.string.Alexandria_2_title), getString(R.string.Alexandria_2_information), getString(R.string.Alexandria_2_address), R.drawable.alexandriaoperahouse));
        AlexList.add(new Guide(getString(R.string.Alexandria_3_title), getString(R.string.Alexandria_3_information), getString(R.string.Alexandria_3_address), R.drawable.citadelofqaitbay));
        AlexList.add(new Guide(getString(R.string.Alexandria_4_title), getString(R.string.Alexandria_4_information), getString(R.string.Alexandria_4_address), R.drawable.fourseasonsalexandria));
        AlexList.add(new Guide(getString(R.string.Alexandria_5_title), getString(R.string.Alexandria_5_information), getString(R.string.Alexandria_5_address), R.drawable.montazahpalace));
        AlexList.add(new Guide(getString(R.string.Alexandria_6_title), getString(R.string.Alexandria_6_information), getString(R.string.Alexandria_6_address), R.drawable.graecoromanmuseum));

        // Create an {@link GuideAdapter}, whose data source is a list of {@link Guide}s. The
        // adapter knows how to create list items for each item in the list.
        GuideAdapter adapter = new GuideAdapter(getActivity(), AlexList);

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

