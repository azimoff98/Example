package az.azerconnect.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class Subscriber {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String name;
    private String surname;
    @Column(unique = true)
    private String passportNumber;
    @OneToOne(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "subscriber_details_id", referencedColumnName = "id")
    private SubscriberDetails subscriberDetails;
    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "subscriber_id")
    private List<SubscriberProperty> properties;

    public Subscriber() {
    }

    public Subscriber(String name, String surname, String passportNumber, SubscriberDetails subscriberDetails, List<SubscriberProperty> properties) {
        this.name = name;
        this.surname = surname;
        this.passportNumber = passportNumber;
        this.subscriberDetails = subscriberDetails;
        this.properties = properties;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPassportNumber() {
        return passportNumber;
    }

    public void setPassportNumber(String passportNumber) {
        this.passportNumber = passportNumber;
    }

    public SubscriberDetails getSubscriberDetails() {
        return subscriberDetails;
    }

    public void setSubscriberDetails(SubscriberDetails subscriberDetails) {
        this.subscriberDetails = subscriberDetails;
    }

    public List<SubscriberProperty> getProperties() {
        return properties;
    }

    public void setProperties(List<SubscriberProperty> properties) {
        this.properties = properties;
    }

    @Override
    public String toString() {
        return "Subscriber{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", passportNumber='" + passportNumber + '\'' +
                ", subscriberDetails=" + subscriberDetails +
                ", properties=" + properties +
                '}';
    }
}
