package rules.math;


import entities.ComplexNumber;
import rules.AbstractBusinessRule;
import rules.MathRuleGateway;

public class MultiplicationRule extends AbstractBusinessRule {

    public MultiplicationRule(MathRuleGateway gateway) {
        super(gateway);
    }

    public void execute(Long id) {
        gateway.startTransaction();
        System.out.println("Execution is passed using " + gateway.getClass().toString() + " gateway.");
        ComplexNumber complexNumber = getMultipliedComplexNumber(id);
        gateway.saveComplexNumber(complexNumber);
        gateway.endTransaction();
    }

    private ComplexNumber getMultipliedComplexNumber(Long id) {
        return new ComplexNumber(gateway.getComplexNumber(id).getRe() * 10, gateway.getComplexNumber(id).getIm() * 10);
    }
}
