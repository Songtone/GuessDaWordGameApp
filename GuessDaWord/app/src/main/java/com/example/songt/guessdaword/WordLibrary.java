package com.example.songt.guessdaword;

/**
 * Created by songt on 2017-12-07.
 */

public class WordLibrary {

    private String mWordLibrary[] = {
            "water","fire","pencil","snow","silence","wind","tree","penguin","guitar","moon"

    };
    private String mRiddleLibrary[] = {
            "I have three lives. Gentle enough to soothe the skin",
            "I am always hungry, I must always be fed",
            "I usually wear a yellow coat i usually have a dark head i make marks wherever i go",
            "I fly when I am born, lie when I'm alive, and run when I am dead.",
            "What is broken, every time it's spoken?",
            "Voiceless it cries, Wingless flutters, Toothless bites, Mouthless mutters.",
            "I grow up big and tall and lose my clothes in the fall.",
            "Flying is but a wish, but I can swim like a fish.",
            "If you pull my strings i don't get mad, i sing. What am I?",
            "Always old, sometimes new. Never sad, sometimes blue. Never empty, sometimes full. Never pushes, always pulls."

    };

    private String mWordClueLibrary [] [] = {
            {"liquid","clear","bottle","wet"},
            {"hot","heat","ignition","burn",},
            {"wood","lead","paper","write"},
            {"white","cold","crystal","precipitate"},
            {"tranquility","mute","peaceful","quiet"},
            {"air","odorless","draft","breeze"},
            {"brown","wood","nature","leaves"},
            {"tuxedo","aquatic","waddle","bird"},
            {"vibration","fretting","acoustic","instrument"},
            {"cheese","tide","night","sky"}

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

}
