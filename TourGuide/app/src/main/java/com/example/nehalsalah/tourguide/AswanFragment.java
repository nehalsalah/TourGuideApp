package com.example.nehalsalah.tourguide;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class AswanFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.guide_list, container, false);

        // Create a list of guide
        ArrayList<Guide> AswanList = new ArrayList<>();
        AswanList.add(new Guide(getString(R.string.Aswan_0_title), getString(R.string.Aswan_0_information), getString(R.string.Aswan_0_address), R.drawable.aswandam));
        AswanList.add(new Guide(getString(R.string.Aswan_1_title), getString(R.string.Aswan_1_information), getString(R.string.Aswan_1_address), R.drawable.templeofkomombo));
        AswanList.add(new Guide(getString(R.string.Aswan_2_title), getString(R.string.Aswan_2_information), getString(R.string.Aswan_2_address), R.drawable.mausoleumofagakhan));
        AswanList.add(new Guide(getString(R.string.Aswan_3_title), getString(R.string.Aswan_3_information), getString(R.string.Aswan_3_address), R.drawable.nubianmuseum));
        AswanList.add(new Guide(getString(R.string.Aswan_4_title), getString(R.string.Aswan_4_information), getString(R.string.Aswan_4_address), R.drawable.monasteryofstsimeon));
        AswanList.add(new Guide(getString(R.string.Aswan_5_title), getString(R.string.Aswan_5_information), getString(R.string.Aswan_5_address), R.drawable.elephantineislandresort));

        // Create an {@link GuideAdapter}, whose data source is a list of {@link Guide}s. The
        // adapter knows how to create list items for each item in the list.
        GuideAdapter adapter = new GuideAdapter(getActivity(), AswanList);

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
