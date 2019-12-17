package leetcode_28;

import org.junit.Test;

import static org.junit.Assert.*;

public class KMPTest {

    @Test
    public void search() {
        KMP test = new KMP("ababc");
        assertEquals(4, test.search("cabaababac"));
    }
}