package com.example.nehalsalah.tourguide;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * {@link GuideAdapter} is an {@link ArrayAdapter} that can provide the layout for each list item
 * based on a data source, which is a list of {@link Guide} objects.
 */
public class GuideAdapter extends ArrayAdapter<Guide> {

    /**
     * Create a new {@link GuideAdapter} object.
     *
     * @param context is the current context (i.e. Activity) that the adapter is being created in.
     * @param guide   is the list of {@link Guide}s to be displayed.
     */
    public GuideAdapter(Context context, ArrayList<Guide> guide) {
        super(context, 0, guide);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if an existing view is being reused, otherwise inflate the view
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        // Get the {@link Guide} object located at this position in the list
        Guide currentGuide = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID Monument_text_view.
        TextView MonumentTextView = (TextView) convertView.findViewById(R.id.Monument_text_view);
        // Get the Monument name from the current guide object and set this text on
        // the Monument Text View.
        MonumentTextView.setText(currentGuide.getMonument());

        // Find the TextView in the list_item.xml layout with the ID infromation_text_view.
        TextView infromationTextView = (TextView) convertView.findViewById(R.id.information_text_view);
        // Get the infromation from the currentGuide object and set this text on
        // the infromationTextView.
        infromationTextView.setText(currentGuide.getInfromation());

        // Find the TextView in the list_item.xml layout with the ID address_text_view.
        TextView addressTextView = (TextView) convertView.findViewById(R.id.address_text_view);
        // Get the address from the currentGuide object and set this text on
        // the addressTextView.
        addressTextView.setText(currentGuide.getAddress());

        // Find the ImageView in the list_item.xml layout with the ID image.
        ImageView imageView = (ImageView) convertView.findViewById(R.id.image);
        imageView.setImageResource(currentGuide.getImageResourceId());

        return convertView;
    }
}