package HinhChuNhat;

public class HinhChuNhat {
    double width;
    double longs;

    public HinhChuNhat(double width, double longs) {
        this.width = width;
        this.longs = longs;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLongs() {
        return longs;
    }

    public void setLongs(double longs) {
        this.longs = longs;
    }
    public double getArea(){
        return this.longs*this.width;
    }
    public double getarea(){
        return (this.longs+this.width)*2;
    }

    @Override
    public String toString() {
        return "TinhDienTich{" +
                "width=" + width +
                ", longs=" + longs +
                '}';
    }
}
