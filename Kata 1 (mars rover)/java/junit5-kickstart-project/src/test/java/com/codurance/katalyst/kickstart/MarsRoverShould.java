package com.codurance.katalyst.kickstart;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MarsRoverShould {

    private MarsRover rover;


    @BeforeEach
    public void setUp() {
        rover = new MarsRover();
    }

    /**
     * This method demonstrates a very basic unit test
     */
    @Test
    public void one_move____simple_junit_test() { assertEquals("0:1:N", rover.Execute("M"));
    }

    @Test
    public void two_moves____simple_junit_test() {
        assertEquals("0:2:N", rover.Execute("MM"));
    }

    @Test
    public void one_right_rotation____simple_junit_test() {
        assertEquals("0:0:E", rover.Execute("R"));
    }

    @Test
    public void two_right_rotations____simple_junit_test() {
        assertEquals("0:0:S", rover.Execute("RR"));
    }

    @Test
    public void one_left_rotation____simple_junit_test() {
        assertEquals("0:0:W", rover.Execute("L"));
    }

    @Test
    public void two_left_rotations____simple_junit_test() {
        assertEquals("0:0:S", rover.Execute("LL"));
    }

    @Test
    public void complete_movements_command____simple_junit_test() { assertEquals("2:3:N", rover.Execute("MMRMMLM"));
    }
}