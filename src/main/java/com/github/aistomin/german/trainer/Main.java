package com.github.aistomin.german.trainer;

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
        System.out.println("****************** Words: ******************");
        System.out.println(new SampleDictionary().vocabulary().toJSON().toString());
        System.out.println("********************************************");
    }
}
