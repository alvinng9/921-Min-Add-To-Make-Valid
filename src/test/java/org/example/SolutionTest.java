package org.example;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void minAddToMakeValidTest() {
        Solution solution = new Solution();
        assertEquals(1, solution.minAddToMakeValid("())"));
        assertEquals(3, solution.minAddToMakeValid(")))"));
    }

}