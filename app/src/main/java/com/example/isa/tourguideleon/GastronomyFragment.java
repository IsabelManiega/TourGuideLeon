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
public class GastronomyFragment extends Fragment {


    public GastronomyFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.word_list, container, false);


        // Create a list of words
        final ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("The botillo is a meat product made with pieces cut from the cutting of the pig, seasoned and embedded in the blind of the pig that is then smoked and semi-cured.", "Botillo", R.drawable.botillo,R.drawable.mapa_ponferrada));
        words.add(new Word("It is a typical sweet of the city of Astorga (Leon, autonomous community of Castile and Leon, in Spain).", "Mantecadas de Astorga", R.drawable.matecadas,R.drawable.mapa_astorga));
        words.add(new Word("It is a type of dehydrated meat, similar to ham but made by curing beef, equine and less frequently, of goat and even rabbit, ox or hare.", "Cecina", R.drawable.cecina,R.drawable.mapa_cecina));
        words.add(new Word("It consists basically of the elements of the field, soup, cabbage, chickpeas and seven meats.", "Cocido Maragato", R.drawable.cocido,R.drawable.mapa_cocido));

        // Create an {@link WordAdapter}, whose data source is a list of {@link Word}s. The
        // adapter knows how to create list items for each item in the list.
        WordAdapter adapter = new WordAdapter(getActivity(), words, R.color.category_gastronomy);

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
