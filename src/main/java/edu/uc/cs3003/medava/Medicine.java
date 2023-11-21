package edu.uc.cs3003.medava;

public abstract class Medicine implements Shippable {
    
    public abstract MedicineSchedule getSchedule();
    private String mMedicineName; // Declaring the field

    public Medicine(String medicineName) {
        mMedicineName = medicineName; // Setting the field's value in the constructor
    }

    public String getMedicineName() {
        return mMedicineName;
    }

    public boolean isTemperatureRangeAcceptable(Double lowTemperature, Double highTemperature) {
        if (this.minimumTemperature() <= lowTemperature &&
                highTemperature <= this.maximumTemperature()) {
            return true;
        }
        return false;
    }

    public double minimumTemperature() {
        return 0.0;
    }

    public double maximumTemperature() {
        return 100.0;
    }
    
}