package lesson9;

/**
 * Created by Valik on 20.02.2018.
 */
public class Company {
    private String name;
    private String countryFounded;

    protected String code;

    public Company(String name, String countryFounded) {
        this.name = name;
        this.countryFounded = countryFounded;
    }

    public int someField;

    public String getName() {
        return name;
    }

    public String getCountryFounded() {
        return countryFounded;
    }

    public void setCountryFounded(String countryFounded) {
        this.countryFounded = countryFounded;
    }
}