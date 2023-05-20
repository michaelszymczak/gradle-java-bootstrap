package com.michaelszymczak.foo;

import org.openjdk.jcstress.annotations.Actor;
import org.openjdk.jcstress.annotations.JCStressTest;
import org.openjdk.jcstress.annotations.Outcome;
import org.openjdk.jcstress.annotations.State;
import org.openjdk.jcstress.infra.results.II_Result;

import static org.openjdk.jcstress.annotations.Expect.ACCEPTABLE;
import static org.openjdk.jcstress.annotations.Expect.ACCEPTABLE_INTERESTING;

@JCStressTest
@Outcome(id = {"1, 2", "2, 1"}, expect = ACCEPTABLE, desc = "Sequential")
@Outcome(id = "1, 1",           expect = ACCEPTABLE_INTERESTING,  desc = "Missed update")
@State
public class NonAtomicIncrement
{
/*
  Results across all configurations:

  RESULT      SAMPLES     FREQ       EXPECT  DESCRIPTION
    1, 1  203,056,338   56.22%  Interesting  Missed update
    1, 2   93,445,271   25.87%   Acceptable  Sequential
    2, 1   64,681,927   17.91%   Acceptable  Sequential
 */

    private int value;

    @Actor
    public void actor1(II_Result r) {
        r.r1 = ++value;
    }

    @Actor
    public void actor2(II_Result r) {
        r.r2 = ++value;
    }
}
