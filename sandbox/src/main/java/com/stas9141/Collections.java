package com.stas9141;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Collections {

    public static void main (String[] arg){
        String [] langs = {"java","php","c#"};

        //sozdaem spisok s type of elemets <String>

        List<String> languages = Arrays.asList("java","php","c#");

        //iteraciya po elementam spiska
        for(String l : languages){
        //for(int i=0; i<langs.length; i++){
            System.out.println("I want to learn " + l );   //langs[i]);
        }

    }
}
