package Lesson7Dec;

import org.junit.*;

public class MyClassTest extends Assert {
    private MyClass mc;

   @Before
    public void setup(){
        mc = new MyClass();
    }

    // public void <имя тестируемого метода>_<ситуация>_<ожидаемое поведение>
    @Test
    public void sum_bothEqualsZero_resultEqualsZero(){
        int res = mc.sum(0,0);
        assertEquals(0,res);
    }
    @Test
    public void sum_bothPositive_resultEqualsSum(){
        int res = mc.sum(5,7);
        assertEquals(12,res);
    }
    @Test
    public void sum_bothNegative_resultEqualsSum(){
        int res = mc.sum(-5,-7);
        assertEquals(-12,res);
    }
    @Test
    public void sum_firstPositiveSecondNegative_resultEqualsSum(){
        int res = mc.sum(5,-7);
        assertEquals(-2,res);
    }
    @Test
    public void sum_firstNegativeSecondPositive_resultEqualsSum(){
        int res = mc.sum(-5,7);
        assertEquals(2,res);
    }
}
