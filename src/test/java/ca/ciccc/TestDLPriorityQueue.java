package ca.ciccc;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class TestDLPriorityQueue {

    @Parameterized.Parameters(name = "{index}: @ca.ciccc.TestALPriority.isEmpty()")
    public static Collection<Object[]> data() {
        DLPriorityQueue notEmpty = new DLPriorityQueue<String, Integer>();
        notEmpty.enqueue("hoge", 1);
        return Arrays.asList(new Object[][] {
             { new DLPriorityQueue<String, Integer>(), true },
             { notEmpty, false }
        });
    }

    @Parameterized.Parameter
    public DLPriorityQueue inputs;

    @Parameterized.Parameter(1)
    public boolean expected;

    @Test
    public void testToString() {
        Assert.assertEquals(expected, inputs.isEmpty());
    }
}

