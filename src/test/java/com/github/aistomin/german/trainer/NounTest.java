package com.github.aistomin.german.trainer;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by aistomin on 15.03.18.
 * <p>
 * Test for {@link Noun}
 */
public final class NounTest {

    /**
     * Check that masculine noun instance can be created and all the fields are
     * readable.
     */
    @Test
    public void testMasculineNoun() {
        final String key = "Tisch";
        final String english = "Table";
        final String plural = "Tische";
        final Noun table = new Noun(key, english, Gender.MASCULINE, plural);
        Assert.assertEquals(key, table.getKey());
        Assert.assertEquals(english, table.getEnglish());
        Assert.assertEquals("der", table.getGender().getDefiniteArticle());
        Assert.assertEquals("ein", table.getGender().getIndefiniteArticle());
        Assert.assertEquals(plural, table.getPlural());
        Assert.assertEquals(
            "der Tisch; ein Tisch; die Tische", table.toString()
        );
    }

    /**
     * Check that feminine noun instance can be created and all the fields are
     * readable.
     */
    @Test
    public void testFeminineNoun() {
        final String key = "Katze";
        final String english = "Cat";
        final String plural = "Katzen";
        final Noun cat = new Noun(key, english, Gender.FEMININE, plural);
        Assert.assertEquals(key, cat.getKey());
        Assert.assertEquals(english, cat.getEnglish());
        Assert.assertEquals("die", cat.getGender().getDefiniteArticle());
        Assert.assertEquals("eine", cat.getGender().getIndefiniteArticle());
        Assert.assertEquals(plural, cat.getPlural());
        Assert.assertEquals(
            "die Katze; eine Katze; die Katzen", cat.toString()
        );
    }

    /**
     * Check that neuter noun instance can be created and all the fields are
     * readable.
     */
    @Test
    public void testNeuterNoun() {
        final String key = "Mädchen";
        final String english = "Girl";
        final String plural = "Mädchen";
        final Noun girl = new Noun(key, english, Gender.NEUTER, plural);
        Assert.assertEquals(key, girl.getKey());
        Assert.assertEquals(english, girl.getEnglish());
        Assert.assertEquals("das", girl.getGender().getDefiniteArticle());
        Assert.assertEquals("ein", girl.getGender().getIndefiniteArticle());
        Assert.assertEquals(plural, girl.getPlural());
        Assert.assertEquals(
            "das Mädchen; ein Mädchen; die Mädchen", girl.toString()
        );
    }
}