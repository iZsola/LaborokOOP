package Interfaces;

import enums.PetType;
import enums.Seriosity;

public interface IPatient {
    public PetType patientType();
    public String diseases();
    public Seriosity seriosityOfCase();
}
