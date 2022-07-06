package mishra.sidharth;

public class Routes
{
    private String city1;
    private  String city2;
    private String flightno;
    private String price;
    private String time;


    public Routes(){}
    public Routes(String city1, String city2, String flightno, String price, String time)
    {
        this.city1 = city1;
        this.city2 = city2;
        this.flightno = flightno;
        this.price = price;
        this.time = time;
    }


    public String getCity1() {
        return city1;
    }

    public void setCity1(String city1) {
        this.city1 = city1;
    }

    public String getCity2() {
        return city2;
    }

    public void setCity2(String city2) {
        this.city2 = city2;
    }

    public String getFlightno() {
        return flightno;
    }

    public void setFlightno(String flightno) {
        this.flightno = flightno;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }



    @Override
    public String toString()
    {
        return
                (String.format("%20s %20s %25s %30s %30s",city1, city2,flightno,price,time));
    }


}
