package Day3011;

public class LoanIssuer {
    private String name;
    private boolean isLazy;
    private boolean isKind;

    public LoanIssuer(String name, boolean isLazy, boolean isKind) {
        this.name = name;
        this.isLazy = isLazy;
        this.isKind = isKind;
    }

    public String getName() {
        return name;
    }

    public boolean isLazy() {
        return isLazy;
    }

    public boolean isKind() {
        return isKind;
    }

    public boolean toIssue(LoanConsumer loanConsumer) {
        if (loanConsumer.getAge() < 18 || loanConsumer.getAnnualIncome() < 20000) {
            return false;
        } else if (isLazy) return true;
        else if (!isLazy && isKind && loanConsumer.getAge() < 70) return true;
        else if (!isLazy && !isKind && loanConsumer.getAge() < 50) return true;
        return false;
    }
}
