package com.codurance.katalyst.kickstart;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

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
    public void one_move____simple_junit_test() {
        assertEquals("0:1:N", rover.execute("M"));
    }

    @Test
    public void two_moves____simple_junit_test() {
        assertEquals("0:2:N", rover.execute("MM"));
    }

    @Test
    public void one_right_rotation____simple_junit_test() {
        assertEquals("0:0:E", rover.execute("R"));
    }

    @Test
    public void two_right_rotations____simple_junit_test() {
        assertEquals("0:0:S", rover.execute("RR"));
    }

    @Test
    public void one_left_rotation____simple_junit_test() {
        assertEquals("0:0:W", rover.execute("L"));
    }

    @Test
    public void two_left_rotations____simple_junit_test() {
        assertEquals("0:0:S", rover.execute("LL"));
    }

    @Test
    public void complete_movements_command____simple_junit_test() {
        assertEquals("2:3:N", rover.execute("MMRMMLM"));
    }

    @Test
    public void complete_movements_with_borderY_limits_command____simple_junit_test() {
        assertEquals("0:0:N", rover.execute("MMMMMMMMMM"));
    }

    @Test
    public void complete_movements_with_borderX_limits_command____simple_junit_test() {
        assertEquals("0:0:E", rover.execute("RMMMMMMMMMM"));
    }
}