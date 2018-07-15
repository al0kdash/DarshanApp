package com.example.aloknath.darshanapp;

import android.content.Context;

import java.util.List;

public class HistoryActivityData {
    public static void initHistory(List<Data> list, Context context){
        list.add(new Data(R.string.history_title ,R.string.history_body));
    }
}
