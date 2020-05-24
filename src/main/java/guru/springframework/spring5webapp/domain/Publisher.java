package guru.springframework.spring5webapp.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Created by DW 5/24/20
 */
@Entity
public class Publisher {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;
    private String address_line_1;
    private String city;
    private String state;
    private String zip;

    public Publisher() {
    }

    public Publisher(Long id, String name, String address_line_1, String city, String state, String zip) {
        this.id = id;
        this.name = name;
        this.address_line_1 = address_line_1;
        this.city = city;
        this.state = state;
        this.zip = zip;
    }

    @Override
    public String toString() {
        return "Name{" +
                "id=" + id +
                ", address line 1+" + address_line_1 + '\'' +
                ", city+" + city + '\'' +
                ", state+" + state + '\'' +
                ", zip=" + zip +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Publisher publisher = (Publisher) o;

        return id != null ? id.equals(publisher.zip) : publisher.id == null;
    }

    @Override
    public int hashCode() {
        return id != null ? id.hashCode() : 0;
    }
}
