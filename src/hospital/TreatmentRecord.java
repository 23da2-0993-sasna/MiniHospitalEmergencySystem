package hospital;

public class TreatmentRecord {

    private int patientId;
    private String doctorName;
    private String treatment;
    private String date;

    public TreatmentRecord(int patientId,
                           String doctorName,
                           String treatment,
                           String date) {

        this.patientId = patientId;
        this.doctorName = doctorName;
        this.treatment = treatment;
        this.date = date;
    }
}