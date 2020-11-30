package Day3011;

public class Main {
    public static void main(String[] args) {
        LoanConsumer sasha = new LoanConsumer("Sasha", 17, 18000);
        LoanConsumer masha = new LoanConsumer("Masha", 18, 20000);
        LoanConsumer tasha = new LoanConsumer("Tasha", 35, 30000);
        LoanConsumer katja = new LoanConsumer("Katja", 55, 40000);
        LoanConsumer anja = new LoanConsumer("Anja", 71, 50000);
        LoanConsumer[] loanConsumers = new LoanConsumer[]{sasha, masha, tasha, katja, anja};

        LoanIssuer fedor = new LoanIssuer("Fedor", true, true);
        LoanIssuer petr = new LoanIssuer("Petr", true, false);
        LoanIssuer vasily = new LoanIssuer("Vasily", false, true);
        LoanIssuer diana = new LoanIssuer("Diana", false, false);
        LoanIssuer[] loanIssuers = new LoanIssuer[]{fedor, petr, vasily, diana};

        for (int i = 0; i < loanIssuers.length; i++) {
            for (int j = 0; j < loanConsumers.length; j++) {
                if (loanIssuers[i].toIssue(loanConsumers[j])) {
                    System.out.println("Employee " + loanIssuers[i].getName() +
                            " issues a loan to " + loanConsumers[j].getName());
                } else System.out.println("Employee " + loanIssuers[i].getName() + " does not issue a loan to "
                        + loanConsumers[j].getName());
             }
        }
    }
}
