package com.example.aloknath.darshanapp;

import android.content.Context;

import java.util.List;

public class HotelsActivityData {
    public static void initHotelsList(List<Data> list, Context context){
        list.add(new Data(R.drawable.ashok, R.string.ashok_title ,R.string.ashok_body));
        list.add((new Data(R.drawable.indanapalace,R.string.indanapalace_title,R.string.indianapalace_body)));
        list.add(new Data(R.drawable.narainapalace,R.string.narainapalace_title,R.string.narainapalace_body));
        list.add(new Data(R.drawable.radissonblu,R.string.radissonblu_title,R.string.radissonblu_body));
        list.add(new Data(R.drawable.rambagpalace,R.string.rambagpalace_title,R.string.rambagpalace_body));
    }
}
