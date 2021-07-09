package com.platzi.functional._12_currying;

import java.util.*;

public class Optionals {

    public static void main(String[] args) {
        List<String> names = getNames();
        if(names != null){

        }
        Optional<List<String>> optionalNames = getOptionalNames();
        if (optionalNames.isPresent()){

        }
        optionalNames.ifPresent(namesValue -> namesValue.forEach(System.out::println));

        Optional<String> valuablePlayer = optionalValuablePlayer();

        String valuablePlayerName = valuablePlayer.orElseGet(() -> "no Player");
    }

    static List<String> getNames(){
        List<String> list = new LinkedList<>();

        return Collections.emptyList();
    }

    static String mostValuablePlayer(){
        //return "";
        return null;
    }

    static int mostExpensiveItem(){
        return -1;
    }

    static Optional<List<String>> getOptionalNames(){

        List<String> nameList = new LinkedList<>();
        //Obtencion de nombres
        return Optional.of(nameList);

    }

    static Optional<String> optionalValuablePlayer(){
        //return Optional.ofNullable();
        try{
            return Optional.of("Sinuhe");
        }catch (Exception e){
            e.printStackTrace();
        }
        return Optional.empty();
    }
}
