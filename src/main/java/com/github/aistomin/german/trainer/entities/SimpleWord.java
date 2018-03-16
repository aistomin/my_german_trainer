package com.github.aistomin.german.trainer.entities;

import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by aistomin on 16.03.18.
 * <p>
 * Simple german word where we are not interested in it's forms: like
 * adjectives, for example.
 */
public final class SimpleWord extends Word {

    /**
     * Ctor.
     *
     * @param key     Basic German word, without article(s) or form(s).
     * @param english English translation of the word.
     */
    public SimpleWord(final String key, final String english) {
        super(key, english);
    }

    /**
     * JSON ctor.
     *
     * @param json JSON object.
     * @throws JSONException If parsing error occurred.
     */
    public SimpleWord(final JSONObject json) throws JSONException {
        super(json);
    }
}
