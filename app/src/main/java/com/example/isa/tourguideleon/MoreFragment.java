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
public class MoreFragment extends Fragment {


    public MoreFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.word_list, container, false);


        // Create a list of words
        final ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("The interest of the Holy Week of Leon is that the processions are carried out in a very quiet and traditional way.", "Semana Santa", R.drawable.semanasanta,R.drawable.mapa_catedral));
        words.add(new Word("The dawn of Holy Thursday welcomes the celebration of the pagan procession of the Burial of Genarín.", "Genarín", R.drawable.genarin,R.drawable.mapa_humedo));
        words.add(new Word("This feast commemorates the Christian victory in the Battle of Clavijo and the liberation of the legendary \"Tribute of the hundred maidens\".", "Cantaderas", R.drawable.cantaderas,R.drawable.mapa_catedral));
        words.add(new Word("It is denominated pennants of Leon to the banners or banners preserved in the old Region of Leon.", "Pendones", R.drawable.pendones, R.drawable.mapa_pendones));
        words.add(new Word("Cars pulled with oxen or donkeys adorned with all kinds of products of the area to celebrate the patron of the city.", "Carros Engalanados", R.drawable.carros,R.drawable.mapa_pendones));
        words.add(new Word("Celebrations of the summer.", "San Juan y San Pedro", R.drawable.fiestas,R.drawable.mapa_marcos));

        // Create an {@link WordAdapter}, whose data source is a list of {@link Word}s. The
        // adapter knows how to create list items for each item in the list.
        WordAdapter adapter = new WordAdapter(getActivity(), words, R.color.category_more);

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