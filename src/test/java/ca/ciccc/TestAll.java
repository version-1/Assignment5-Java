package ca.ciccc;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        TestALPriorityQueue.class,
        TestBHPriorityQueue.class,
        TestDLPriorityQueue.class,
})

public class TestAll {
}
