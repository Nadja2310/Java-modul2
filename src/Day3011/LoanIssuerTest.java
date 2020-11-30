package Day3011;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LoanIssuerTest {

    @Test
    void toIssueConsumer_age17_annuelincome18000_false() {
        LoanConsumer sasha = new LoanConsumer("Sasha", 17, 18000);

        LoanIssuer fedor = new LoanIssuer("Fedor", true, true);
        LoanIssuer petr = new LoanIssuer("Petr", true, false);
        LoanIssuer vasily = new LoanIssuer("Vasily", false, true);
        LoanIssuer diana = new LoanIssuer("Diana", false, false);
        LoanIssuer[] loanIssuers = new LoanIssuer[]{fedor, petr, vasily, diana};
        for (int i = 0; i < loanIssuers.length; i++) {
            assertEquals(false, loanIssuers[i].toIssue(sasha));

        }
    }

    @Test
    void toIssueConsumer_Issuer_isLazy_true() {
        LoanConsumer masha = new LoanConsumer("Masha", 18, 20000);
        LoanConsumer tasha = new LoanConsumer("Tasha", 35, 30000);
        LoanConsumer katja = new LoanConsumer("Katja", 55, 40000);
        LoanConsumer anja = new LoanConsumer("Anja", 71, 50000);
        LoanConsumer[] loanConsumers = new LoanConsumer[]{masha, tasha, katja, anja};
        LoanIssuer fedor = new LoanIssuer("Fedor", true, true);
        LoanIssuer petr = new LoanIssuer("Petr", true, false);

        LoanIssuer[] loanIssuers = new LoanIssuer[]{fedor, petr};
        for (int i = 0; i < loanIssuers.length; i++) {
            for (int j = 0; j < loanConsumers.length; j++) {
                assertEquals(true, loanIssuers[i].toIssue(loanConsumers[j]));
            }
        }
    }

    @Test
    void toIssueConsumer_Issuer_isNotLazy_and_isKind_Consumer_AgeUnder70_true() {
        LoanConsumer masha = new LoanConsumer("Masha", 18, 20000);
        LoanConsumer tasha = new LoanConsumer("Tasha", 35, 30000);
        LoanConsumer katja = new LoanConsumer("Katja", 55, 40000);

        LoanConsumer[] loanConsumers = new LoanConsumer[]{masha, tasha, katja};
        LoanIssuer fedor = new LoanIssuer("Fedor", false, true);

        for (int j = 0; j < loanConsumers.length; j++) {
                assertEquals(true, fedor.toIssue(loanConsumers[j]));
        }
    }

    @Test
    void toIssueConsumer_Issuer_isNotLazy_and_isKind_Consumer_Age70_orOlder_false() {
           LoanConsumer tasha = new LoanConsumer("Tasha", 70, 30000);
        LoanConsumer katja = new LoanConsumer("Katja", 74, 40000);

        LoanConsumer[] loanConsumers = new LoanConsumer[]{tasha, katja};
        LoanIssuer fedor = new LoanIssuer("Fedor", false, true);

        for (int j = 0; j < loanConsumers.length; j++) {
            assertEquals(false, fedor.toIssue(loanConsumers[j]));
        }
    }
    @Test
    void toIssueConsumer_Issuer_isNotLazy_and_isNotKind_Consumer_AgeUnder50_true() {
        LoanConsumer masha = new LoanConsumer("Masha", 18, 20000);
        LoanConsumer tasha = new LoanConsumer("Tasha", 35, 30000);

        LoanConsumer[] loanConsumers = new LoanConsumer[]{masha, tasha};
        LoanIssuer petr = new LoanIssuer("Petr", false, false);

        for (int j = 0; j < loanConsumers.length; j++) {
            assertEquals(true, petr.toIssue(loanConsumers[j]));
        }
    }

    @Test
    void toIssueConsumer_Issuer_isNotLazy_and_isNotKind_Consumer_Age50_orOlder_false() {
        LoanConsumer masha = new LoanConsumer("Masha", 50, 28000);
        LoanConsumer tasha = new LoanConsumer("Tasha", 55, 38000);

        LoanConsumer[] loanConsumers = new LoanConsumer[]{masha, tasha};
        LoanIssuer petr = new LoanIssuer("Petr", false, false);

        for (int j = 0; j < loanConsumers.length; j++) {
            assertEquals(false, petr.toIssue(loanConsumers[j]));
        }
    }
}