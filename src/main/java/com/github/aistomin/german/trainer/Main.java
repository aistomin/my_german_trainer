package com.github.aistomin.german.trainer;

import com.github.aistomin.german.trainer.entities.Gender;
import com.github.aistomin.german.trainer.entities.Noun;
import com.github.aistomin.german.trainer.entities.Verb;
import com.github.aistomin.german.trainer.entities.Word;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.json.JSONException;

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
     * @throws Exception If something goes wrong.
     */
    public static void main(String[] args) throws Exception {
        final Vocabulary vocabulary = new Vocabulary(
            Arrays.asList(
                new Noun("Tisch", "Table", Gender.MASCULINE, "Tische"),
                new Noun("Katze", "Cat", Gender.FEMININE, "Katzen"),
                new Noun("Mädchen", "Girl", Gender.NEUTER, "Mädchen"),
                new Verb("gehen", "to go", "ging", "gegangen")
            )
        );
        System.out.println("****************** Words: ******************");
        System.out.println(vocabulary.toJSON().toString());
        System.out.println("********************************************");
    }
}
