package Model;

import dao.ReadAndWriteIOFile;

public class Drinks {
    private String name ;
    private double price;
    private String categorize;
    private String describe;
    private int quantity;
    private ReadAndWriteIOFile readAndWriteIOFile = new ReadAndWriteIOFile();

    public Drinks(){

    }

    public Drinks(String name, double price, String categorize, String describe, int quantity) {
        this.name = name;
        this.price = price;
        this.categorize = categorize;
        this.describe = describe;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getCategorize() {
        return categorize;
    }

    public void setCategorize(String categorize) {
        this.categorize = categorize;
    }

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Drinks{" +
                "Tên món='" + name + '\'' +
                ", giá=" + price +
                ", loại sản phẩm='" + categorize + '\'' +
                ", mô tả ='" + describe + '\'' +
                ", số lượng=" + quantity +
                '}';
    }
}
