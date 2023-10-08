package n2exercici1;


import org.hamcrest.FeatureMatcher;
import org.hamcrest.Matcher;

public class main {


        public static Matcher<String> length(Matcher<? super Integer> matcher) {
            return new FeatureMatcher<String, Integer>(matcher,
                    "a String of length that", "length") {
                @Override
                protected Integer featureValueOf(String actual) {
                    return actual.length();
                }
            };
        }

    }

