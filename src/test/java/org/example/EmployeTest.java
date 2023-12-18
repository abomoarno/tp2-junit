package org.example;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class EmployeTest {

    @Test
    public void testToString() {

        Employe employe = new Employe(
                "ARNO",
                30,
                2500.0,
                0
        );

        Assert.assertEquals("ARNO - 30 - 2500.0 - 0", employe.toString());

    }
}