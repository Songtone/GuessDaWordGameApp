package com.example.songt.guessdaword;

/**
 * Created by songt on 2017-12-07.
 */

public class WordLibrary {

    private String mWordLibrary[] = {
            "water","fire","pencil","snow","silence","wind",

    };
    private String mRiddleLibrary[] = {
            "Three lives have I. Gentle enough to soothe the skin",
            "I am always hungry, I must always be fed",
            "I usually wear a yellow coat i usually have a dark head i make marks wherever i go",
            "I fly when I am born, lie when I'm alive, and run when I am dead.",
            "What is broken, every time it's spoken?",
            "Voiceless it cries, Wingless flutters, Toothless bites, Mouthless mutters.",

    };

    private String mWordClueLibrary [] [] = {
            {"drink","thirsty","liquid","clear","bottle","wet"},
            {"hot","combustion","heat","ignition","burn","inflammable"},
            {"wood","lead","paper","pointy","eraser","write"},
            {"unique","light","white","cold","crystal","precipitate"},
            {"hush","tranquility","secrecy","mute","peaceful","quiet"},
            {"air","invisible","odorless","blow","draft","breeze"}

    };

    public String getWord(int a){
        String word = mWordLibrary[a];
        return word;
    }
    public String getRiddle(int a){
        String riddle = mRiddleLibrary[a];
        return riddle;
    }
    public int getWordLibraryLength(){
        int length = mWordLibrary.length;
        return length;
    }

    public String getClue1(int a){
        String clue1 = mWordClueLibrary[a][0];
        return clue1;
    }
    public String getClue2(int a){
        String clue2 = mWordClueLibrary[a][1];
        return clue2;
    }
    public String getClue3(int a){
        String clue3 = mWordClueLibrary[a][2];
        return clue3;
    }
    public String getClue4(int a){
        String clue4 = mWordClueLibrary[a][3];
        return clue4;
    }
    public String getClue5(int a){
        String clue5 = mWordClueLibrary[a][4];
        return clue5;
    }
    public String getClue6(int a){
        String clue6 = mWordClueLibrary[a][5];
        return clue6;
    }

}
