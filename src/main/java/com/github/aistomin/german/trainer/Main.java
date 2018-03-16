package com.github.aistomin.german.trainer;

import com.github.aistomin.german.trainer.entities.Gender;
import com.github.aistomin.german.trainer.entities.Noun;
import com.github.aistomin.german.trainer.entities.Verb;
import com.github.aistomin.german.trainer.entities.Word;
import java.util.ArrayList;
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
     * @throws JSONException If JSON exception occurred.
     */
    public static void main(String[] args) throws JSONException {
        final List<Word> words = new ArrayList<>();
        words.add(new Noun("Tisch", "Table", Gender.MASCULINE, "Tische"));
        words.add(new Noun("Katze", "Cat", Gender.FEMININE, "Katzen"));
        words.add(new Noun("Mädchen", "Girl", Gender.NEUTER, "Mädchen"));
        words.add(new Verb("gehen", "to go", "ging", "gegangen"));
        final Vocabulary vocabulary = new Vocabulary(words);
        System.out.println("****************** Words: ******************");
        System.out.println(vocabulary.toJSON().toString());
        System.out.println("********************************************");
    }
}
