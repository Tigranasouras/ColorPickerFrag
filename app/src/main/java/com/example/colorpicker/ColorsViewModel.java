package com.example.colorpicker;

import android.util.Log;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import java.util.LinkedList;

public class ColorsViewModel extends ViewModel {

    private MutableLiveData<LinkedList<String>>  colorsLL;
    private ColorsViewModel colorViewModel;

    //Add the sms to the view model
    //Add code to check if its a valid hexcode
    //# followed by 6 instances either digits 0-9 or letters A-F
    //^ a perfect use for regex



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
