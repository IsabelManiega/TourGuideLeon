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
public class MonumentsFragment extends Fragment {
    public MonumentsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.word_list, container, false);


        // Create a list of words
        final ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("The Cathedral of León is undoubtedly one of the most beautiful Gothic cathedrals in Spain", "Cathedral", R.drawable.catedral,R.drawable.mapa_catedral));
        words.add(new Word("The Botine house is a modernist style building designed by the Spanish architect Antoni Gaudí between 1891 and 1894", "Palacio de botines", R.drawable.botines,R.drawable.mapa_botines));
        words.add(new Word("The palace of the Guzmanes is a Renaissance palace of the sixteenth century.", "Palacio de Guzmanes", R.drawable.palacio,R.drawable.mapa_palacio));
        words.add(new Word("The Royal Collegiate Basilica of San Isidoro is one of the most outstanding Romanesque architectural ensembles in Spain.", "Basílica de San Isidoro", R.drawable.sanisidoro,R.drawable.mapa_sanisidoro));
        words.add(new Word("One of the most important monuments of the Spanish Renaissance.", "San Marcos", R.drawable.marcos,R.drawable.mapa_marcos));
        words.add(new Word("The Museum of Contemporary Art of Castilla y León, also known by its initials MUSAC.", "Musac", R.drawable.musac,R.drawable.mapa_musac));

        // Create an {@link WordAdapter}, whose data source is a list of {@link Word}s. The
        // adapter knows how to create list items for each item in the list.
        WordAdapter adapter = new WordAdapter(getActivity(), words, R.color.category_monuments);

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
