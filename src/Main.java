import rules.Rule;
import util.BusinessRuleFactory;

public class Main {

    public static final String RUN_PROGRAM_WITHOUT_PARAMETERS = "This program should be run without parameters";


    public static void main(String[] args) {

        if (args.length != 0) {
            System.out.println(RUN_PROGRAM_WITHOUT_PARAMETERS);
            return;
        }

        BusinessRuleFactory.getRule(Rule.PLUS_RULE).execute(123L);

    }
}


