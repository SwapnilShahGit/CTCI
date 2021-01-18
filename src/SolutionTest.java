import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

    @Test
    void testIsUniqueDataStructure() {
        assertTrue(Solution.isUniqueDataStructure("hi"));
        assertFalse(Solution.isUniqueDataStructure("hii"));
        assertTrue(Solution.isUniqueDataStructure("Hh"));
    }

    @Test
    void isUniqueNoDataStructure() {
        assertTrue(Solution.isUniqueNoDataStructure("hi"));
        assertFalse(Solution.isUniqueNoDataStructure("hii"));
        assertTrue(Solution.isUniqueDataStructure("Hh"));
    }

    @Test
    void isPermutationDataStructure() {
        assertTrue(Solution.isPermutationDataStructure("hi", "ih"));
        assertFalse(Solution.isPermutationDataStructure("hi", "no"));
    }

    @Test
    void testUrlify() {
        assertEquals("Mr%20John%20Smith", Solution.urlify("Mr John Smith     "));
    }
}