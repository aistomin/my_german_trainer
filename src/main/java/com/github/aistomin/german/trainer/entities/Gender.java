package com.github.aistomin.german.trainer.entities;

/**
 * Created by aistomin on 15.03.18.
 * <p>
 * The gender of the noun.
 */
public enum Gender {

    /**
     * The masculine gender.
     */
    MASCULINE("der", "ein"),

    /**
     * The feminine gender.
     */
    FEMININE("die", "eine"),

    /**
     * The neutral gender.
     */
    NEUTER("das", "ein");

    /**
     * The definite article of the gender(Nominative case).
     */
    private final String definiteArticle;

    /**
     * The indefinite article of the gender(Nominative case).
     */
    private final String indefiniteArticle;

    /**
     * Ctor.
     *
     * @param definiteArticle   The article of the gender(Nominative case).
     * @param indefiniteArticle The indefinite article of the gender(Nominative case).
     */
    Gender(final String definiteArticle, final String indefiniteArticle) {
        this.definiteArticle = definiteArticle;
        this.indefiniteArticle = indefiniteArticle;
    }

    /**
     * Get the definite article of the gender(Nominative case).
     *
     * @return The definite article of the gender(Nominative case).
     */
    public String getDefiniteArticle() {
        return definiteArticle;
    }

    /**
     * Get the indefinite article of the gender(Nominative case).
     *
     * @return The indefinite article of the gender(Nominative case).
     */
    public String getIndefiniteArticle() {
        return indefiniteArticle;
    }
}
