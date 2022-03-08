package web.models;

public class Car {
    String  model;
    int productionYear;
    String color;

    public Car(String model, int productionYear, String color) {
        this.model = model;
        this.productionYear = productionYear;
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public void setProductionYear(int productionYear) {
        this.productionYear = productionYear;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", productionYear=" + productionYear +
                ", color='" + color + '\'' +
                '}';
    }
}
