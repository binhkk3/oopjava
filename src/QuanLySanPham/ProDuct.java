package QuanLySanPham;

public class ProDuct {

        String code;
        String name;
        String Category;
        String unit = "usd";
        float price;

    public ProDuct(String code, String name, String category, String unit, float price) {
        this.code = code;
        this.name = name;
        Category = category;
        this.unit = unit;
        this.price = price;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return Category;
    }

    public void setCategory(String category) {
        Category = category;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "ProDuct{" +
                "code='" + code + '\'' +
                ", name='" + name + '\'' +
                ", Category='" + Category + '\'' +
                ", unit='" + unit + '\'' +
                ", price=" + price +
                '}';
    }
}
