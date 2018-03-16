package com.github.aistomin.german.trainer;

import com.github.aistomin.german.trainer.entities.Noun;
import com.github.aistomin.german.trainer.entities.SimpleWord;
import com.github.aistomin.german.trainer.entities.Verb;
import com.github.aistomin.german.trainer.entities.Word;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by aistomin on 15.03.18.
 * <p>
 * Vocabulary.
 */
public final class Vocabulary {

    /**
     * The words of the vocabulary.
     */
    private final List<Word> words;

    /**
     * Ctor.
     *
     * @param words The words of the vocabulary.
     */
    public Vocabulary(final List<Word> words) {
        this.words = words;
    }

    /**
     * JSON constructor.
     *
     * @param json JSON object.
     * @throws JSONException If parsing error occurred.
     */
    public Vocabulary(final JSONObject json) throws JSONException {
        final JSONArray array = json.getJSONArray("words");
        this.words = new ArrayList<>();
        for (int i = 0; i < array.length(); i++) {
            final JSONObject word = array.getJSONObject(i);
            final String clazz = word.getString("class");
            switch (clazz) {
                case "Noun":
                    this.words.add(new Noun(word));
                    break;
                case "Verb":
                    this.words.add(new Verb(word));
                    break;
                case "SimpleWord":
                    this.words.add(new SimpleWord(word));
                    break;
                default:
                    throw new IllegalStateException("Unknown word class: " + clazz);

            }
        }
    }

    /**
     * Get the words of the vocabulary.
     *
     * @return The words of the vocabulary.
     */
    public List<Word> getWords() {
        return this.words;
    }

    /**
     * Convert to JSON.
     *
     * @return JSON object.
     */
    JSONObject toJSON() throws JSONException {
        final JSONObject json = new JSONObject();
        final JSONArray array = new JSONArray();
        for (final Word word : this.words) {
            array.put(word.toJSON());
        }
        json.put("words", array);
        return json;
    }
}
