package database;

import entities.ComplexNumber;
import rules.MathRuleGateway;

public class PostgreMathRuleGateway implements MathRuleGateway {

    @Override
    public ComplexNumber getComplexNumber(Long id) {
        return new ComplexNumber(0, 0);
    }

    @Override
    public void startTransaction() {
    }

    @Override
    public void saveComplexNumber(ComplexNumber complexNumber) {
        System.out.println(complexNumber);
    }

    @Override
    public void endTransaction() {

    }
}