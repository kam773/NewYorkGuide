package com.example.kamil.newyorkguide;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class RestaurantFragment extends Fragment {


    public static final String NAME = "Restaurants";

    View v;
    private RecyclerView restaurantrv;
    private List<Location> listLocation;

    public RestaurantFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        v = inflater.inflate(R.layout.fragment_restaurants, container, false);
        restaurantrv = (RecyclerView) v.findViewById(R.id.restaurant_rv);
        RecyclerViewAdapter recyclerAdapter = new RecyclerViewAdapter(getContext(), listLocation);
        restaurantrv.setLayoutManager(new LinearLayoutManager(getActivity()));
        restaurantrv.setAdapter(recyclerAdapter);
        return v;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        listLocation = new ArrayList<>();

        listLocation.add(new Location(
                getString(R.string.restaurants_cull_name),
                getString(R.string.restaurants_cull_description),
                getString(R.string.restaurants_cull_address),
                getString(R.string.restaurants_cull_phone),
                getString(R.string.restaurants_cull_schedule),
                getString(R.string.restaurants_cull_price),
                R.drawable.cullpistol));

        listLocation.add(new Location(
                getString(R.string.restaurants_russ_name),
                getString(R.string.restaurants_russ_description),
                getString(R.string.restaurants_russ_address),
                getString(R.string.restaurants_russ_phone),
                getString(R.string.restaurants_russ_schedule),
                getString(R.string.restaurants_russ_price),
                R.drawable.russdaughters));

        listLocation.add(new Location(
                getString(R.string.restaurants_dominique_name),
                getString(R.string.restaurants_dominique_description),
                getString(R.string.restaurants_dominique_address),
                getString(R.string.restaurants_dominique_phone),
                getString(R.string.restaurants_dominique_schedule),
                getString(R.string.restaurants_dominique_price),
                R.drawable.dominique));

        listLocation.add(new Location(
                getString(R.string.restaurants_dinosaur_name),
                getString(R.string.restaurants_dinosaur_description),
                getString(R.string.restaurants_dinosaur_address),
                getString(R.string.restaurants_dinosaur_phone),
                getString(R.string.restaurants_dinosaur_schedule),
                getString(R.string.restaurants_dinosaur_price),
                R.drawable.dinosaur));

        listLocation.add(new Location(
                getString(R.string.restaurants_five_name),
                getString(R.string.restaurants_five_description),
                getString(R.string.restaurants_five_address),
                getString(R.string.restaurants_five_phone),
                getString(R.string.restaurants_five_schedule),
                getString(R.string.restaurants_five_price),
                R.drawable.fivenapkin));

        listLocation.add(new Location(
                getString(R.string.restaurants_lincoln_name),
                getString(R.string.restaurants_lincoln_description),
                getString(R.string.restaurants_lincoln_address),
                getString(R.string.restaurants_lincoln_phone),
                getString(R.string.restaurants_lincoln_schedule),
                getString(R.string.restaurants_lincoln_price),
                R.drawable.lincolnsteak));

        listLocation.add(new Location(
                getString(R.string.restaurants_katz_name),
                getString(R.string.restaurants_katz_description),
                getString(R.string.restaurants_katz_address),
                getString(R.string.restaurants_katz_phone),
                getString(R.string.restaurants_katz_schedule),
                getString(R.string.restaurants_katz_price),
                R.drawable.katz));

        listLocation.add(new Location(
                getString(R.string.restaurants_tree_name),
                getString(R.string.restaurants_tree_description),
                getString(R.string.restaurants_tree_address),
                getString(R.string.restaurants_tree_phone),
                getString(R.string.restaurants_tree_schedule),
                getString(R.string.restaurants_tree_price),
                R.drawable.treebistro));
    }
}
