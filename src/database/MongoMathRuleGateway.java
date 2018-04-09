package database;

import entities.ComplexNumber;
import rules.MathRuleGateway;

public class MongoMathRuleGateway implements MathRuleGateway {
    @Override
    public ComplexNumber getComplexNumber(Long id) {
        return new ComplexNumber(1, 1);
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
