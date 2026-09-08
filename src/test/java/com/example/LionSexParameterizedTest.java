package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class LionSexParameterizedTest {

    private final String sex;
    private final boolean expectedHasMane;

    public LionSexParameterizedTest(String sex, boolean expectedHasMane) {
        this.sex = sex;
        this.expectedHasMane = expectedHasMane;
    }

    @Parameterized.Parameters
    public static Object[][] getTestData() {
        return new Object[][] {
                {"Самец", true},
                {"Самка", false},
        };
    }

    @Test
    public void testLionMane() throws Exception {
        Feline felineMock = org.mockito.Mockito.mock(Feline.class);
        Lion lion = new Lion(sex, felineMock);
        assertEquals(expectedHasMane, lion.doesHaveMane());
    }
}