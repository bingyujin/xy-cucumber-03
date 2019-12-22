package features.addtwo;

import com.qz.xy.add.Calculator;
import io.cucumber.java.zh_cn.假如;
import io.cucumber.java.zh_cn.当;
import io.cucumber.java.zh_cn.那么;
import org.hamcrest.Matchers;
import org.junit.Assert;

public class CalculatorSteps {
    private Calculator calculator;
    private int result;

    @假如("x等于{int}和y等于{int}")
    public void x等于和y等于(int a, int b) {
        // Write code here that turns the phrase above into concrete actions
        //throw new cucumber.api.PendingException();
        this.calculator = new Calculator(a,b);
    }

    @当("调用相加方法")
    public void 调用相加方法() {
        // Write code here that turns the phrase above into concrete actions
        //throw new cucumber.api.PendingException();
        result = this.calculator.add();
    }

    @那么("结果将等于{int}")
    public void 结果将等于(int expectValue) {
        // Write code here that turns the phrase above into concrete actions
        //throw new cucumber.api.PendingException();
        Assert.assertThat(result, Matchers.equalTo(expectValue));
    }

}
