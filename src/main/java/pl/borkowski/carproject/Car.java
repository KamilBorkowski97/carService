package pl.borkowski.carproject;

public class Car {

    private long id;
    private String model;
    private String mark;

    public Car(){

    }

    public Car(long id, String mark, String model) {
        this.id = id;
        this.mark = mark;
        this.model = model;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

}