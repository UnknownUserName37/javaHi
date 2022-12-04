import org.junit.Assert;
import org.junit.Test;

public class AnotherOneFunc {
    @Test
    public  void  test2mark() {
        var mark = getMarkResult(-1);
        Assert.assertEquals("no mark result", mark);
    }

    @Test
    public void test2with0mark() {
        var mark = getMarkResult(0);
        Assert.assertEquals("2", mark);
    }

    @Test
    public void test2with20mark() {
        var mark = getMarkResult(20);
        Assert.assertEquals("2", mark);
    }

    @Test
    public void test2with35mark() {
        var pipca = getMarkResult(35);
        Assert.assertEquals("2", pipca);
    }
    @Test
    public void test3with36mark() {
        var yes = getMarkResult(36);
        Assert.assertEquals("3", yes);
    }

    @Test
    public void test3with40mark() {
        var tetris = getMarkResult(40);
        Assert.assertEquals("3", tetris);
    }

    @Test
    public void test3with56mark() {
        var pipchuanckiy = getMarkResult(56);
        Assert.assertEquals("3", pipchuanckiy);
    }

    @Test //negativeTest
    public void test4with56() {
        var min = getMarkResult(56);
        Assert.assertEquals("3", min);

    }

    @Test
    public void test4with72boundary() {
        var mark = getMarkResult(72);
        Assert.assertEquals("4", mark);
    }

    @Test
    public void test4with78mark() {
        var mamka = getMarkResult(78);
        Assert.assertEquals("5", mamka);
    }

    @Test
    public void test5with100mark() {
        var mark = getMarkResult(100);
        Assert.assertEquals("5", mark);
    }


    private String getMarkResult(Integer mark)

    {

        if(mark>=0 && mark <=35) return "2";

        if(mark>35 && mark <=56) return "3";

        if(mark>56 && mark<71) return "4";

        if(mark>72 && mark<100) return "5";

        return "no mark result";

    }
}
