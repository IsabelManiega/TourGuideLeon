package com.example.isa.tourguideleon;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class TapasFragment extends Fragment {


    public TapasFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.word_list, container, false);

        // Create a list of words
        final ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("Differents bars where they give us with free consumption something to eat.", "Tapeo", R.drawable.tapas,R.drawable.mapa_humedo));
        words.add(new Word("Mainly the Plaza de San Martin where we find many bars where you can tapear.", "Barrio Húmedo", R.drawable.humedo,R.drawable.mapa_humedo));
        words.add(new Word("Mainly the Plaza de Torres de Omaña where we find many bars where you can tapas.", "Barrio Romántico", R.drawable.romantico,R.drawable.mapa_romantico));

        // Create an {@link WordAdapter}, whose data source is a list of {@link Word}s. The
        // adapter knows how to create list items for each item in the list.
        WordAdapter adapter = new WordAdapter(getActivity(), words, R.color.category_tapas);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // word_list.xml layout file.
        ListView listView = (ListView) rootView.findViewById(R.id.list);

        // Make the {@link ListView} use the {@link WordAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Word} in the list.
        listView.setAdapter(adapter);

        return rootView;
    }
}