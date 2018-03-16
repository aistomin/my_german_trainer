package com.github.aistomin.german.trainer.entities;

import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by aistomin on 15.03.18.
 * <p>
 * German noun.
 */
public final class Noun extends Word {

    /**
     * The gender of the noun.
     */
    private final Gender gender;

    /**
     * The plural for of the noun.
     */
    private final String plural;

    /**
     * Ctor.
     *
     * @param key     Basic German word, without article(s) or form(s).
     * @param english English translation of the word.
     * @param gender  The gender of the noun.
     * @param plural  The plural for of the noun.
     */
    public Noun(
        final String key, final String english, final Gender gender,
        final String plural
    ) {
        super(key, english);
        this.gender = gender;
        this.plural = plural;
    }

    /**
     * JSON ctor.
     *
     * @param json JSON object.
     * @throws JSONException If parsing error occurred.
     */
    public Noun(final JSONObject json) throws JSONException {
        this(
            json.getString("german"),
            json.getString("english"),
            Gender.valueOf(json.getString("gender")),
            json.getString("plural")
        );
    }

    /**
     * Get the gender of the noun.
     *
     * @return The gender of the noun.
     */
    public Gender getGender() {
        return gender;
    }

    /**
     * Get the plural for of the noun.
     *
     * @return The plural for of the noun.
     */
    public String getPlural() {
        return plural;
    }

    @Override
    public JSONObject toJSON() throws JSONException {
        final JSONObject json = super.toJSON();
        json.put("gender", this.gender.name());
        json.put("plural", this.plural);
        return json;
    }

    @Override
    public String toString() {
        return String.format(
            Locale.getDefault(),
            "%s %s; %s %s; die %s",
            gender.getDefiniteArticle(),
            getKey(),
            gender.getIndefiniteArticle(),
            getKey(),
            plural
        );
    }
}
