package com.example.kamil.newyorkguide;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class MuseumFragment extends Fragment {

    public static final String NAME = "Museums";

    View v;
    private RecyclerView museumrv;
    private List<Location> listLocation;

    public MuseumFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        v = inflater.inflate(R.layout.fragment_museums, container, false);
        museumrv = (RecyclerView) v.findViewById(R.id.museum_rv);
        RecyclerViewAdapter recyclerAdapter = new RecyclerViewAdapter(getContext(), listLocation);
        museumrv.setLayoutManager(new LinearLayoutManager(getActivity()));
        museumrv.setAdapter(recyclerAdapter);
        return v;

    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        listLocation = new ArrayList<>();

        listLocation.add(new Location(
                getString(R.string.museums_cloisters_name),
                getString(R.string.museums_cloisters_description),
                getString(R.string.museums_cloisters_address),
                getString(R.string.museums_cloisters_phone),
                getString(R.string.museums_cloisters_schedule),
                getString(R.string.museums_cloisters_price),
                R.drawable.metcloisters));

        listLocation.add(new Location(
                getString(R.string.museums_library_name),
                getString(R.string.museums_library_description),
                getString(R.string.museums_library_address),
                getString(R.string.museums_library_phone),
                getString(R.string.museums_library_schedule),
                getString(R.string.museums_library_price),
                R.drawable.nylibrary));

        listLocation.add(new Location(
                getString(R.string.museums_modernart_name),
                getString(R.string.museums_modernart_description),
                getString(R.string.museums_modernart_address),
                getString(R.string.museums_modernart_phone),
                getString(R.string.museums_modernart_schedule),
                getString(R.string.museums_modernart_price),
                R.drawable.momany));

        listLocation.add(new Location(
                getString(R.string.museums_national_name),
                getString(R.string.museums_national_description),
                getString(R.string.museums_national_address),
                getString(R.string.museums_national_phone),
                getString(R.string.museums_national_schedule),
                getString(R.string.museums_national_price),
                R.drawable.national911museum));

        listLocation.add(new Location(
                getString(R.string.museums_frick_name),
                getString(R.string.museums_frick_description),
                getString(R.string.museums_frick_address),
                getString(R.string.museums_frick_phone),
                getString(R.string.museums_frick_schedule),
                getString(R.string.museums_frick_price),
                R.drawable.frickcollection));

        listLocation.add(new Location(
                getString(R.string.museums_merchants_name),
                getString(R.string.museums_merchants_description),
                getString(R.string.museums_merchants_address),
                getString(R.string.museums_merchants_phone),
                getString(R.string.museums_merchants_schedule),
                getString(R.string.museums_merchants_price),
                R.drawable.merchantsmuseum));

        listLocation.add(new Location(
                getString(R.string.museums_metropolitan_name),
                getString(R.string.museums_metropolitan_description),
                getString(R.string.museums_metropolitan_address),
                getString(R.string.museums_metropolitan_phone),
                getString(R.string.museums_metropolitan_schedule),
                getString(R.string.museums_metropolitan_price),
                R.drawable.metropolitanmoa));

        listLocation.add(new Location(
                getString(R.string.museums_ellisisland_name),
                getString(R.string.museums_ellisisland_description),
                getString(R.string.museums_ellisisland_address),
                getString(R.string.museums_ellisisland_phone),
                getString(R.string.museums_ellisisland_schedule),
                getString(R.string.museums_ellisisland_price),
                R.drawable.ellisisland));
    }
}
