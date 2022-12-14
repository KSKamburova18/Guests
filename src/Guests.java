public class Guests {

    String name;
    String ucn;
    int maritalStatus;
    int nights;
    double beds;
    String city;

    public Guests(String name, String ucn, int maritalStatus, int nights, double beds, String city) {
        this.name = name;
        this.ucn = ucn;
        this.maritalStatus = maritalStatus;
        this.nights = nights;
        this.beds = beds;
        this.city = city;
    }

    public Guests() {

    }

    @Override
    public String toString() {
        return "HotelGuests{" +
                "name='" + name + '\'' +
                ", ucn='" + ucn + '\'' +
                ", maritalStatus=" + maritalStatus +
                ", nights=" + nights +
                ", beds=" + beds +
                ", city='" + city + '\'' +
                '}';
    }
}