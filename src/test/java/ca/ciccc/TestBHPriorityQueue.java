package ca.ciccc;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class TestBHPriorityQueue {

    @Parameterized.Parameters(name = "{index}: @ca.ciccc.TestALPriority.isEmpty()")
    public static Collection<Object[]> data() {
        BHPriorityQueue notEmpty = new BHPriorityQueue<String, Integer>();
        notEmpty.enqueue("hoge", 1);
        return Arrays.asList(new Object[][] {
             { new BHPriorityQueue<String, Integer>(), true },
             { notEmpty, false }
        });
    }

    @Parameterized.Parameter
    public BHPriorityQueue inputs;

    @Parameterized.Parameter(1)
    public boolean expected;

    @Test
    public void testToString() {
        Assert.assertEquals(expected, inputs.isEmpty());
    }
}

