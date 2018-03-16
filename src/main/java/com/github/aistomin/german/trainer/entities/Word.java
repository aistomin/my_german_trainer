package com.github.aistomin.german.trainer.entities;

import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by aistomin on 15.03.18.
 * <p>
 * Base class of German words.
 */
public abstract class Word {

    /**
     * Basic German word, without article(s) or form(s). Infinitive form in case
     * of a verb.
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

    /**
     * Convert the word to JSON.
     *
     * @return JSON object.
     * @throws JSONException If some JSON error occurred.
     */
    public JSONObject toJSON() throws JSONException {
        final JSONObject json = new JSONObject();
        json.put("class", getClass().getSimpleName());
        json.put("german", getKey());
        json.put("english", getEnglish());
        return json;
    }
}
