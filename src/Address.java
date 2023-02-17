import java.util.Locale;

public class Address {
    private String aptNumber;
    private String city;
    private String state;
    private String zipCode;
    private String houseNum;
    private String street;

    public Address(Address location){
        aptNumber = location.getAptNumber();
        city = location.getCity();
        state = location.getState();
        zipCode = location.getZipCode();
        houseNum = location.getHouseNum();
        street = location.getStreet();
    }
    public Address(String housingNum, String streetName, String aptNum, String cityName, String state, String zipCode){
        houseNum = housingNum;
        street = streetName;
        aptNumber = aptNum;
        city = cityName;
        this.state = state;
        this.zipCode = zipCode;
    }
    public Address(String housingNum, String streetName, String city, String state, String zipCode){
        houseNum = housingNum;
        street = streetName;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
    }
    public Address(String address){
        houseNum = address.substring(0, address.indexOf(" "));
        if(address.toLowerCase().contains("apt")){
            street = address.substring(address.indexOf(" ") + 1, address.toLowerCase().indexOf("apt") - 1);
            aptNumber = address.substring(address.toLowerCase().indexOf("apt"), address.indexOf(","))
        } else {
            street = address.substring(address.indexOf(" ") + 1, address.indexOf(","));
        }
        address = address.substring(address.indexOf(",") + 1);
        city = address.substring(0, address.indexOf(","));
        address = address.substring(address.indexOf(",") + 1);
        state = address.substring(address.indexOf(",") + 1)
    }
    // GETTER/SETTER METHODS
    public String getAptNumber() {
        return aptNumber;
    }
    public void setAptNumber(String aptNumber) {
        this.aptNumber = aptNumber;
    }
    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public String getState() {
        return state;
    }
    public void setState(String state) {
        this.state = state;
    }
    public String getZipCode() {
        return zipCode;
    }
    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }
    public String getHouseNum() {
        return houseNum;
    }
    public void setHouseNum(String houseNum) {
        this.houseNum = houseNum;
    }
    public String getStreet() {
        return street;
    }
    public void setStreet(String street) {
        this.street = street;
    }

    // CLASS METHODS
    public String toString(){
        if(aptNumber != null){
            return houseNum + " " + street + " " + aptNumber + ", " + city + ", " + state + " " + zipCode;
        } else {
            return houseNum + " " + street + ", " + city + ", " + state + " " + zipCode;
        }
    }
}
