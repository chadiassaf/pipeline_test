package com.techprimers.testing;

import org.junit.jupiter.api.*;

class PlayClassTest {

    public PlayClass fB;

    @BeforeEach
    public void setUp() {
        fB = new PlayClass();
    }

    @DisplayName("Play PlayClass with number = 1")
    @Test
    public void testNumber() {
        String PlayClass = fB.play(1);
        Assertions.assertEquals(PlayClass, "1");
    }

    @DisplayName("Play PlayClass with number = 3")
    @Test
    public void testFizz() {
        String PlayClass = fB.play(3);
        Assertions.assertEquals(PlayClass, "Fizz");
    }

    @DisplayName("Play PlayClass with number = 5")
    @Test
    public void testBuzz() {
        String PlayClass = fB.play(5);
        Assertions.assertEquals(PlayClass, "Buzz");
    }

    @DisplayName("Don't Play PlayClass with number = 0")
    @Test
    public void testZero() {

        Assertions.assertThrows(IllegalArgumentException.class,
                () -> fB.play(0));
    }

    @AfterEach
    public void tearDown() {
        fB = null;
    }

}