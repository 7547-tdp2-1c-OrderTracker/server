package fi.uba.ar.soldme.fi.uba.ar.soldme.domain;

/**
 * Created by plucadei on 24/3/16.
 */
public class Client {
    private String name;
    private String lastName;
    private String cuit;
    private String email;
    private String lon;
    private String lat;

    public Client(String name, String lastName, String cuit, String email, String lon, String lat){
        this.name=name;
        this.lastName=lastName;
        this.cuit=cuit;
        this.email=email;
        this.lon= lon;
        this.lat= lat;
    }
    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }
}
