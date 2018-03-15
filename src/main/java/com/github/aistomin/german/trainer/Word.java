package com.github.aistomin.german.trainer;

/**
 * Created by aistomin on 15.03.18.
 * <p>
 * Base class of German words.
 */
public abstract class Word {

    /**
     * Basic German word, without article(s) or form(s).
     */
    private final String key;

    /**
     * English translation of the word.
     */
    private final String english;

    /**
     * Ctor.
     *
     * @param key     Basic German word, without article(s) or form(s).
     * @param english English translation of the word.
     */
    Word(final String key, final String english) {
        this.key = key;
        this.english = english;
    }

    /**
     * Get german word, without article(s) or form(s).
     *
     * @return Word.
     */
    public String getKey() {
        return key;
    }

    /**
     * Get english translation of the word.
     *
     * @return English word.
     */
    public String getEnglish() {
        return english;
    }
}
