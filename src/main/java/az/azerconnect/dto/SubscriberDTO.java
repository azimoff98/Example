package az.azerconnect.dto;


import java.util.List;

public class SubscriberDTO {
    private String name;
    private String surname;
    private String passportNumber;
    private SubscriberDetailsDTO subscriberDetailsDTO;
    private List<SubscriberPropertyDTO> properties;

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

    public SubscriberDetailsDTO getSubscriberDetailsDTO() {
        return subscriberDetailsDTO;
    }

    public void setSubscriberDetailsDTO(SubscriberDetailsDTO subscriberDetailsDTO) {
        this.subscriberDetailsDTO = subscriberDetailsDTO;
    }

    public List<SubscriberPropertyDTO> getProperties() {
        return properties;
    }

    public void setProperties(List<SubscriberPropertyDTO> properties) {
        this.properties = properties;
    }

    @Override
    public String toString() {
        return "SubscriberDTO{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", passportNumber='" + passportNumber + '\'' +
                ", subscriberDetailsDTO=" + subscriberDetailsDTO +
                ", properties=" + properties +
                '}';
    }
}
