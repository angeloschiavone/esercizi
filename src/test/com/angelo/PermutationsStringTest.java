package com.angelo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class PermutationsStringTest {

    @Test
    void permute() {
        List<String> result = PermutationsString.permute("abcde");
        System.out.println(result);
    }

    @Test
    void insertChar() {
        char newCharacter = 'c';
        List<String> lista = Arrays.asList("ab");
        List<String> output = PermutationsString.insertChar(newCharacter, lista);
        for (String sb :output) {
            System.out.println(sb);
        }
    }

    @Test
    void insertCharEmpty() {
        char newCharacter = 'c';
        List<String> lista = new ArrayList<>();
        List<String> output = PermutationsString.insertChar(newCharacter, lista);
        for (String sb :output) {
            System.out.println(sb);
        }
    }
}