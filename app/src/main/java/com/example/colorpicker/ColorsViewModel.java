package com.example.colorpicker;

import android.util.Log;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import java.util.LinkedList;

public class ColorsViewModel extends ViewModel {

    private MutableLiveData<LinkedList<String>>  colorsLL;
    private ColorsViewModel colorViewModel;


    public ColorsViewModel(){
        colorsLL = new MutableLiveData<>();
        LinkedList<String> l = new LinkedList<>();
        colorsLL.setValue(l);
    }

    public MutableLiveData<LinkedList<String>> getColors(){
        return colorsLL;
    }

    public void setColors(LinkedList<String> l){
        colorsLL.setValue(l);

    }

    public LinkedList<String> getcolors(){
        return colorsLL.getValue();
    }


    public void addColor(String c){
        LinkedList<String> l = getcolors();
        l.add(c);
        Log.i("Colors", l.toString());
        colorsLL.setValue(l);
    }

}
