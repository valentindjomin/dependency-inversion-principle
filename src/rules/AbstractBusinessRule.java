package rules;


public class AbstractBusinessRule {
    protected MathRuleGateway gateway;

    public AbstractBusinessRule(MathRuleGateway gateway) {
        this.gateway = gateway;
    }

    public void execute(Long id){

    }
}
