package com.github.aistomin.german.trainer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by aistomin on 15.03.18.
 * <p>
 * Main class of the application.
 */
public class Main {

    /**
     * Application's entry point.
     *
     * @param args Arguments.
     */
    public static void main(String[] args) {
        final List<Word> words = new ArrayList<Word>();
        words.add(new Noun("Tisch", "Table", Gender.MASCULINE, "Tische"));
        words.add(new Noun("Katze", "Cat", Gender.FEMININE, "Katzen"));
        words.add(new Noun("Mädchen", "Girl", Gender.NEUTER, "Mädchen"));
        System.out.println("****************** Words: ******************");
        for (final Word word : words) {
            System.out.println(word.getEnglish() + ": " + word.toString());
        }
        System.out.println("********************************************");
    }
}
