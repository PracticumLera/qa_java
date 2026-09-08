package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class AlexTest {

    @Mock
    Feline felineMock;

    @Test
    public void testGetFriends() throws Exception {
        Alex alex = new Alex(felineMock);
        List<String> expected = List.of("Марти", "Глория", "Мелман");
        assertEquals(expected, alex.getFriends());
    }

    @Test
    public void testGetPlaceOfLiving() throws Exception {
        Alex alex = new Alex(felineMock);
        assertEquals("Нью-Йоркский зоопарк", alex.getPlaceOfLiving());
    }

    @Test
    public void testGetKittens() throws Exception {
        Alex alex = new Alex(felineMock);
        assertEquals(0, alex.getKittens());
    }

    @Test
    public void testDoesHaveMane() throws Exception {
        Alex alex = new Alex(felineMock);
        assertTrue(alex.doesHaveMane());
    }
}
