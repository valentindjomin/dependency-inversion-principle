package rules;


import entities.ComplexNumber;

public interface MathRuleGateway {

    ComplexNumber getComplexNumber(Long id);

    void startTransaction();

    void saveComplexNumber(ComplexNumber complexNumber);

    void endTransaction();
}