package util;

import rules.AbstractBusinessRule;
import rules.math.DivisionRule;
import rules.math.MultiplicationRule;
import rules.math.PlusRule;
import rules.math.SubtractionRule;
import rules.math.DefaultMathRule;
import rules.Rule;
import database.MongoMathRuleGateway;

public class BusinessRuleFactory {


    public static AbstractBusinessRule getRule(Rule rule) {
        switch (rule) {
            case PLUS_RULE:
                return new PlusRule(new MongoMathRuleGateway());
            case SUBTRACTION_RULE:
                return new SubtractionRule(new MongoMathRuleGateway());
            case MULTIPLICATION_RULE:
                return new MultiplicationRule(new MongoMathRuleGateway());
            case DIVISION_RULE:
                return new DivisionRule(new MongoMathRuleGateway());
            default:
                return new DefaultMathRule(new MongoMathRuleGateway());
        }
    }
}
