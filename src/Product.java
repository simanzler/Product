public class Product {
    public String name;
    public String desc;
    public String ID;
    public double cost;
    public Product(String name, String desc, String ID, double cost){
        this.name = name;
        this.desc = desc;
        this.ID = ID;
        this.cost = cost;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public String toCSV() {
        return name + ", " + desc + ", " + ID + ", " + cost;
    }
}