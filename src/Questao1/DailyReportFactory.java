package Questao1;

public class DailyReportFactory extends ReportFactory {
    @Override
    public Report createReport() {
        return new DailyReport();
    }
}
