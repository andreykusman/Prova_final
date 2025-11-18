package Questao1;

public abstract class ReportFactory {
    public abstract Report createReport();

    public void generate() {
        Report r = createReport();
        r.generate();
    }
}
