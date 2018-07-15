package com.example.aloknath.darshanapp;

import android.content.Context;

import java.util.List;

public class FoodActivityData {
    public static void initFoodList(List<Data> list, Context context){
        list.add(new Data(R.drawable.ghewar, R.string.ghewar_title ,R.string.ghewar_body));
        list.add((new Data(R.drawable.dalbatti,R.string.dalbatti_title,R.string.dalbatti_body)));
        list.add(new Data(R.drawable.golgappa,R.string.golgappa_title,R.string.golgappa_body));
        list.add(new Data(R.drawable.pavbhaji,R.string.pavbhaji_title,R.string.pavbhaji_body));
        list.add(new Data(R.drawable.rawatkikachori,R.string.rawatkachori_title,R.string.rawatkachori_body));
    }
}
