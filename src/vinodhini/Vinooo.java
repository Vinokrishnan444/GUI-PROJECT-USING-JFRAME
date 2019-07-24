/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vinodhini;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author student
 */
@Entity
@Table(name = "VINOOO", catalog = "", schema = "VINO")
@NamedQueries({
    @NamedQuery(name = "Vinooo.findAll", query = "SELECT v FROM Vinooo v"),
    @NamedQuery(name = "Vinooo.findByRollno", query = "SELECT v FROM Vinooo v WHERE v.rollno = :rollno"),
    @NamedQuery(name = "Vinooo.findByName", query = "SELECT v FROM Vinooo v WHERE v.name = :name"),
    @NamedQuery(name = "Vinooo.findByEmail", query = "SELECT v FROM Vinooo v WHERE v.email = :email"),
    @NamedQuery(name = "Vinooo.findByCourse", query = "SELECT v FROM Vinooo v WHERE v.course = :course"),
    @NamedQuery(name = "Vinooo.findByFee", query = "SELECT v FROM Vinooo v WHERE v.fee = :fee"),
    @NamedQuery(name = "Vinooo.findByPaid", query = "SELECT v FROM Vinooo v WHERE v.paid = :paid"),
    @NamedQuery(name = "Vinooo.findByDue", query = "SELECT v FROM Vinooo v WHERE v.due = :due"),
    @NamedQuery(name = "Vinooo.findByAddress", query = "SELECT v FROM Vinooo v WHERE v.address = :address"),
    @NamedQuery(name = "Vinooo.findByCity", query = "SELECT v FROM Vinooo v WHERE v.city = :city"),
    @NamedQuery(name = "Vinooo.findByState", query = "SELECT v FROM Vinooo v WHERE v.state = :state"),
    @NamedQuery(name = "Vinooo.findByCountry", query = "SELECT v FROM Vinooo v WHERE v.country = :country"),
    @NamedQuery(name = "Vinooo.findByContactno", query = "SELECT v FROM Vinooo v WHERE v.contactno = :contactno")})
public class Vinooo implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ROLLNO")
    private Integer rollno;
    @Column(name = "NAME")
    private String name;
    @Column(name = "EMAIL")
    private String email;
    @Column(name = "COURSE")
    private String course;
    @Column(name = "FEE")
    private String fee;
    @Column(name = "PAID")
    private String paid;
    @Column(name = "DUE")
    private String due;
    @Column(name = "ADDRESS")
    private String address;
    @Column(name = "CITY")
    private String city;
    @Column(name = "STATE")
    private String state;
    @Column(name = "COUNTRY")
    private String country;
    @Column(name = "CONTACTNO")
    private String contactno;

    public Vinooo() {
    }

    public Vinooo(Integer rollno) {
        this.rollno = rollno;
    }

    public Integer getRollno() {
        return rollno;
    }

    public void setRollno(Integer rollno) {
        Integer oldRollno = this.rollno;
        this.rollno = rollno;
        changeSupport.firePropertyChange("rollno", oldRollno, rollno);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        String oldName = this.name;
        this.name = name;
        changeSupport.firePropertyChange("name", oldName, name);
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        String oldEmail = this.email;
        this.email = email;
        changeSupport.firePropertyChange("email", oldEmail, email);
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        String oldCourse = this.course;
        this.course = course;
        changeSupport.firePropertyChange("course", oldCourse, course);
    }

    public String getFee() {
        return fee;
    }

    public void setFee(String fee) {
        String oldFee = this.fee;
        this.fee = fee;
        changeSupport.firePropertyChange("fee", oldFee, fee);
    }

    public String getPaid() {
        return paid;
    }

    public void setPaid(String paid) {
        String oldPaid = this.paid;
        this.paid = paid;
        changeSupport.firePropertyChange("paid", oldPaid, paid);
    }

    public String getDue() {
        return due;
    }

    public void setDue(String due) {
        String oldDue = this.due;
        this.due = due;
        changeSupport.firePropertyChange("due", oldDue, due);
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        String oldAddress = this.address;
        this.address = address;
        changeSupport.firePropertyChange("address", oldAddress, address);
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        String oldCity = this.city;
        this.city = city;
        changeSupport.firePropertyChange("city", oldCity, city);
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        String oldState = this.state;
        this.state = state;
        changeSupport.firePropertyChange("state", oldState, state);
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        String oldCountry = this.country;
        this.country = country;
        changeSupport.firePropertyChange("country", oldCountry, country);
    }

    public String getContactno() {
        return contactno;
    }

    public void setContactno(String contactno) {
        String oldContactno = this.contactno;
        this.contactno = contactno;
        changeSupport.firePropertyChange("contactno", oldContactno, contactno);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (rollno != null ? rollno.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Vinooo)) {
            return false;
        }
        Vinooo other = (Vinooo) object;
        if ((this.rollno == null && other.rollno != null) || (this.rollno != null && !this.rollno.equals(other.rollno))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "vinodhini.Vinooo[ rollno=" + rollno + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
