package com.example.aloknath.darshanapp;

import android.content.Context;

import java.util.List;

public class SightsActivityData {
    public static void initSightsList(List<Data> list, Context context) {
        list.add(new Data(R.drawable.amerfort,R.string.amber_title,R.string.amber_body));
        list.add(new Data(R.drawable.birlamandir,R.string.birlamandir_title,R.string.birlamandir_body));
        list.add(new Data(R.drawable.galtajitemple,R.string.galataji_title,R.string.galataji_body));
        list.add(new Data(R.drawable.hawamahal,R.string.hawamahal_title,R.string.hawalmahal_body));
        list.add(new Data(R.drawable.jantarmantar,R.string.jantarmantar_title,R.string.jantarmantar_body));
    }
}
