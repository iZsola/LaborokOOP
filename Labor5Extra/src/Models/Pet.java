package Models;

import Interfaces.IPatient;
import enums.Taxonomy;

import java.util.ArrayList;

abstract class Pet implements IPatient {
    //region fields
    public static int numPets=0;
    protected ArrayList<String> diseases=new ArrayList<>();
    private int petId;
    private MyDate birthDate;
    private Taxonomy taxonomy;
    private boolean healthy;
    private String petName;
    private double currentWeight;

    //endregion

    public Pet(MyDate date, String name, double weight)
    {
        numPets++;
        this.birthDate=date;
        this.petName=name;
        this.currentWeight=weight;
    }

    //region properties

    public int getPetId() {
        return petId;
    }

    public MyDate getBirthDate() {
        return birthDate;
    }

    public Taxonomy getTaxonomy() {
        return taxonomy;
    }

    public boolean isHealthy() {
        return healthy;
    }

    public String getPetName() {
        return petName;
    }

    public double getCurrentWeight() {
        return currentWeight;
    }


    public void setPetId(int petId) {
        this.petId = petId;
    }

    public void setBirthDate(MyDate birthDate) {
        this.birthDate = birthDate;
    }

    public void setTaxonomy(Taxonomy taxonomy) {
        this.taxonomy = taxonomy;
    }

    public void setHealthy(boolean healthy) {
        this.healthy = healthy;
    }

    public void setPetName(String petName) {
        this.petName = petName;
    }

    public void setCurrentWeight(double currentWeight) {
        this.currentWeight = currentWeight;
    }

    public static int getNumPets()
    {
        return numPets;
    }

    public String diseases()
    {
        StringBuffer result = new StringBuffer();
        for (String s : diseases)
        {
            result.append(s + ",");
        }
        if (result.length()>0)
        {
            result.deleteCharAt(result.length()-1);
        }
        return result.toString();
    }
    //endregion

    //region methods
    public abstract String speak();
    public String toString()
    {
        StringBuffer result = new StringBuffer();
        result.append(this.petName + ", " + this.birthDate.DateToString() + ", " + this.currentWeight);
        return result.toString();
    }

    public void addDisease(String disease)
    {
        this.diseases.add(disease);
        this.healthy=false;
    }

    public void unexpectedIllnessOccurred()
    {

    }
    //endregion

}
