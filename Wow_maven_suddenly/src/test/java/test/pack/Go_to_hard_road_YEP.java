package test.pack;

import com.sun.source.tree.AssertTree;
import org.junit.Assert;
import org.junit.Test;

public class Go_to_hard_road_YEP {
    @Test
    public void testNormalWeight() {
        var actualresult = getIMTResult(180f, 75f);
        Assert.assertEquals("нормальной массе тела", actualresult);
    }

    @Test
    public void imt16Test() {
        var actualresult = getIMTResult(190f, 50f);
        Assert.assertEquals("выраженному дефициту массы тела", actualresult);
    }

    @Test
    public void test0Weight() {
        var actualresult = getIMTResult(0f, 998f);
        Assert.assertEquals("указан некорректный рост", actualresult);
    }

    @Test
    public void TestWithoutWeight() {
        var actualResult = getIMTResult(0f, 65f);
        Assert.assertEquals("указан некорректный рост", actualResult);
    }


    private String getIMTResult(Float heightCm, Float weightKg) {

        var userIndex = Math.round(weightKg / Math.pow((heightCm / 100), 2));

        String userResult = null;

        if (userIndex <= 16) {

            userResult = "выраженному дефициту массы тела";

        } else if (userIndex > 16 && userIndex < 19)  {

            userResult = "недостаточной массе тела";

        } else if (userIndex > 19 && userIndex < 25) {

            userResult = "нормальной массе тела";

        } else if (userIndex > 25) {

            userResult = "избыточной массе тела";

        }

        if (heightCm.equals(0.0f)) userResult="указан некорректный рост"; //для фикса убрать + в +=
        return userResult;

    }
}
