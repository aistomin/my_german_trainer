package com.github.aistomin.german.trainer;

import com.github.aistomin.german.trainer.entities.Gender;
import com.github.aistomin.german.trainer.entities.Noun;
import com.github.aistomin.german.trainer.entities.Verb;
import java.io.File;
import java.util.Arrays;

/**
 * Created by aistomin on 16.03.18.
 * <p>
 * Program that allows to generate dictionary file.
 */
public final class Generator {

    /**
     * Application's entry point.
     *
     * @param args Arguments.
     * @throws Exception If something goes wrong.
     */
    public static void main(final String[] args) throws Exception {
        new DictionaryFile(
            new Vocabulary(
                Arrays.asList(
                    new Noun("Tisch", "Table", Gender.MASCULINE, "Tische"),
                    new Noun("Katze", "Cat", Gender.FEMININE, "Katzen"),
                    new Noun("Mädchen", "Girl", Gender.NEUTER, "Mädchen"),
                    new Verb("gehen", "to go", "ging", "gegangen")
                )
            )
        ).printTo(new File("/Users/andrej/projects/my/dictionary.json"));
    }
}
