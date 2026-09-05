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

    public int getPatientId() {
        return patientId;
    }

    public String getDoctorName() {
        return doctorName;
    }

    public String getTreatment() {
        return treatment;
    }

    public String getDate() {
        return date;
    }

    @Override
    public String toString() {

        return "Patient ID: " + patientId
                + " | Doctor: " + doctorName
                + " | Treatment: " + treatment
                + " | Date: " + date;
    }
}