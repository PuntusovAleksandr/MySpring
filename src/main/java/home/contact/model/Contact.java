package home.contact.model;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by Aleksandr on 07.03.2015.
 */
public class Contact {
    private String firstName;
    private String lastName;
    private LocalDate birthDate;
    private Set<Hobby> hobbies;
    private Set<Place> places;
    private int idContact;
    private Set<Contact> friends;

    public Contact(){}

    public Contact(String firstName, String lastName, LocalDate birthDate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public Set<Hobby> getHobbies() {
        if (hobbies == null) hobbies = new HashSet<Hobby>();
        return hobbies;
    }

    public void setHobbies(Set<Hobby> hobbies) {
        this.hobbies = hobbies;
    }

    public Set<Place> getPlaces() {
        if (places == null) places = new HashSet<Place>();
        return places;
    }

    public void setPlaces(Set<Place> places) {
        this.places = places;
    }

    public int getIdContact() {
        return idContact;
    }

    public void setIdContact(int idContact) {
        this.idContact = idContact;
    }

    public Set<Contact> getFriends() {
        if (friends == null) friends = new HashSet<Contact>();
        return friends;
    }

    public void setFriends(Set<Contact> friends) {
        this.friends = friends;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", birthDate=" + birthDate +
                ", hobbies=" + hobbies +
                ", places=" + places +
                ", idContact=" + idContact +
                ", friends=" + friends +
                '}';
    }
}
