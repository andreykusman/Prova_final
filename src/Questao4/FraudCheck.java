package Questao4;

public abstract class FraudCheck {
    protected FraudCheck next;

    public FraudCheck setNext(FraudCheck next) {
        this.next = next;
        return next;
    }

    public void check(Transaction t) {
        if (!execute(t)) {
            System.out.println("Transação BLOQUEADA!");
            return;
        }
        if (next != null) next.check(t);
    }

    protected abstract boolean execute(Transaction t);
}
