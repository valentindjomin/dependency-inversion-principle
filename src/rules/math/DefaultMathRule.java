package rules.math;


import rules.AbstractBusinessRule;
import rules.MathRuleGateway;

public class DefaultMathRule extends AbstractBusinessRule {

    public DefaultMathRule(MathRuleGateway gateway) {
        super(gateway);
    }

    public void execute(Long id) {
        gateway.startTransaction();
        System.out.println("Execution is passed using " + gateway.getClass().toString() + " gateway.");
        gateway.saveComplexNumber(gateway.getComplexNumber(id));
        gateway.endTransaction();
    }
}