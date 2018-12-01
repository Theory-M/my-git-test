package pl.x.theory.my_git_test;

public class Auto {

    private String make;
    private String model;

    public Auto(String make, String model) {
        this.make = make;
        this.model = model;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "Auto{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}
