package session_4.task12.erp;
import java.util.Set;

public class Patient extends User{
    private int personalIdNumber;

    private Set<InsurancePolicy> insurances;

    private Set<ClinicalRecord> clinicalRecords;
}