package com.example.colorpicker;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import java.util.LinkedList;

public class ColorsViewModel extends ViewModel {

    private MutableLiveData<LinkedList<String>>  colorsLL;
    private ColorsViewModel colorViewModel;


    public ColorsViewModel(){
        colorsLL = new MutableLiveData<>();
    }

    public void setColors(LinkedList<String> l){
        colorsLL.setValue(l);

    }

    public LinkedList<String> getcolors(){
        return colorsLL.getValue();
    }


    public void addcolor(String c){
        LinkedList<String> l = getcolors();
        l.add(c);
        colorsLL.setValue(l);
    }

}
