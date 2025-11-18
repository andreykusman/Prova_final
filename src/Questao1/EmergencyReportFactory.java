package Questao1;

public class EmergencyReportFactory extends ReportFactory {
    @Override
    public Report createReport() {
        return new EmergencyReport();
    }
}
