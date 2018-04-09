package rules.math;


import entities.ComplexNumber;
import rules.AbstractBusinessRule;
import rules.MathRuleGateway;

public class SubtractionRule extends AbstractBusinessRule {

    public SubtractionRule(MathRuleGateway gateway) {
        super(gateway);
    }

    public void execute(Long id) {
        gateway.startTransaction();
        System.out.println("Execution is passed using " + gateway.getClass().toString() + " gateway.");
        ComplexNumber complexNumber = getSubtractedComplexNumber(id);
        gateway.saveComplexNumber(complexNumber);
        gateway.endTransaction();
    }

    private ComplexNumber getSubtractedComplexNumber(Long id) {
        return new ComplexNumber(gateway.getComplexNumber(id).getRe() - 1, gateway.getComplexNumber(id).getIm() - 1);
    }
}
