package com.github.totoCastaldi.calculator;

import com.google.inject.AbstractModule;
import com.google.inject.Guice;
import com.google.inject.Injector;
import org.rapidoid.web.Rapidoid;

/**
 * Created by toto on 01/04/16.
 */
public class Main {

    public static Injector injector;

    public static void main(String[] args) {
        injector = Guice.createInjector(new AbstractModule() {
            @Override
            protected void configure() {

            }
        });

        Rapidoid.run(args);
    }
}
