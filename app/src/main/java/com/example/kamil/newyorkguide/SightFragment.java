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
public class SightFragment extends Fragment {


    public static final String NAME = "Sights";

    View v;
    private RecyclerView sightrv;
    private List<Location> listLocation;

    public SightFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        v = inflater.inflate(R.layout.fragment_sights, container, false);
        sightrv = (RecyclerView) v.findViewById(R.id.sight_rv);
        RecyclerViewAdapter recyclerAdapter = new RecyclerViewAdapter(getContext(), listLocation);
        sightrv.setLayoutManager(new LinearLayoutManager(getActivity()));
        sightrv.setAdapter(recyclerAdapter);
        return v;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        listLocation = new ArrayList<>();

        listLocation.add(new Location(
                getString(R.string.sights_broadway_name),
                getString(R.string.sights_broadway_description),
                getString(R.string.sights_broadway_address),
                getString(R.string.sights_broadway_phone),
                getString(R.string.sights_broadway_schedule),
                getString(R.string.sights_broadway_price),
                R.drawable.broadway));

        listLocation.add(new Location(
                getString(R.string.sights_brooklyn_name),
                getString(R.string.sights_brooklyn_description),
                getString(R.string.sights_brooklyn_address),
                getString(R.string.sights_brooklyn_phone),
                getString(R.string.sights_brooklyn_schedule),
                getString(R.string.sights_brooklyn_price),
                R.drawable.brooklynbridge));

        listLocation.add(new Location(
                getString(R.string.sights_centralpark_name),
                getString(R.string.sights_centralpark_description),
                getString(R.string.sights_centralpark_address),
                getString(R.string.sights_centralpark_phone),
                getString(R.string.sights_centralpark_schedule),
                getString(R.string.sights_centralpark_price),
                R.drawable.centralpark));

        listLocation.add(new Location(
                getString(R.string.sights_empire_name),
                getString(R.string.sights_empire_description),
                getString(R.string.sights_empire_address),
                getString(R.string.sights_empire_phone),
                getString(R.string.sights_empire_schedule),
                getString(R.string.sights_empire_price),
                R.drawable.empirestate));

        listLocation.add(new Location(
                getString(R.string.sights_fifth_name),
                getString(R.string.sights_fifth_description),
                getString(R.string.sights_fifth_address),
                getString(R.string.sights_fifth_phone),
                getString(R.string.sights_fifth_schedule),
                getString(R.string.sights_fifth_price),
                R.drawable.fifthavenue));

        listLocation.add(new Location(
                getString(R.string.sights_rockefeller_name),
                getString(R.string.sights_rockefeller_description),
                getString(R.string.sights_rockefeller_address),
                getString(R.string.sights_rockefeller_phone),
                getString(R.string.sights_rockefeller_schedule),
                getString(R.string.sights_rockefeller_price),
                R.drawable.rockefeller));

        listLocation.add(new Location(
                getString(R.string.sights_statue_name),
                getString(R.string.sights_statue_description),
                getString(R.string.sights_statue_address),
                getString(R.string.sights_statue_phone),
                getString(R.string.sights_statue_schedule),
                getString(R.string.sights_statue_price),
                R.drawable.statue));

        listLocation.add(new Location(
                getString(R.string.sights_timessquare_name),
                getString(R.string.sights_timessquare_description),
                getString(R.string.sights_timessquare_address),
                getString(R.string.sights_timessquare_phone),
                getString(R.string.sights_timessquare_schedule),
                getString(R.string.sights_timessquare_price),
                R.drawable.timesquare));
    }

}

