package com.angelo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PermutationsString {

    public static List<String> permute(String input) {
        List<String> output;
        if (input.length() <= 1) {
            return Arrays.asList(input);
        } else {
            char lastChar = input.charAt(input.length()-1);
            String chopped = input.replace(input.substring(input.length()-1), "");
            output = permute(chopped);
            output = insertChar(lastChar, output);
        }
        return output;
    }


    public static List<String> insertChar(char newCharacter, List<String> input) {
        List<String> output = new ArrayList<>();
        for (String currentString : input) {
            output.addAll(addChar(newCharacter, currentString));
        }
        return output;
    }

    private static List<String> addChar(char newCharacter, String currentString) {
        List<String> output = new ArrayList<>();
        for (int i = 0; i < currentString.length() + 1; i++) {
            StringBuffer sb = new StringBuffer(currentString);
            output.add(sb.insert(i, newCharacter).toString());
        }
        return output;
    }
}
