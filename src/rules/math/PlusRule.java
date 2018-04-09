package rules.math;

import entities.ComplexNumber;
import rules.AbstractBusinessRule;
import rules.MathRuleGateway;

public class PlusRule extends AbstractBusinessRule {

    public PlusRule(MathRuleGateway gateway) {
        super(gateway);
    }

    public void execute(Long id) {
        gateway.startTransaction();
        System.out.println("Execution is passed using " + gateway.getClass().toString() + " gateway.");
        ComplexNumber complexNumber = getDoubledComplexNumber(id);
        gateway.saveComplexNumber(complexNumber);
        gateway.endTransaction();
    }

    private ComplexNumber getDoubledComplexNumber(Long id) {
        return new ComplexNumber(gateway.getComplexNumber(id).getRe() * 2, gateway.getComplexNumber(id).getIm() * 2);
    }


}