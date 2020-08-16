package pl.edu.wszib.jwd.java_dev.model;

import javax.persistence.*;

@Entity
@Table(name = "kolory")
public class Kolory {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;

    @Column(name = "wybor")
    private boolean wybor;

    //    @NotEmpty(message = "*Pole nie może być puste!. Proszę o wypełnienie pola")
    @Column(name = "kolor")
    private String kolor;

    //    @NotEmpty(message = "*Pole nie może być puste!. Proszę o wypełnienie pola")
    @Column(name = "skladnik_R")
    private Integer skladnik_R;

    //    @NotEmpty(message = "*Pole nie może być puste!. Proszę o wypełnienie pola")
    @Column(name = "skladnik_G")
    private Integer skladnik_G;

    //    @NotEmpty(message = "*Pole nie może być puste!. Proszę o wypełnienie pola")
    @Column(name = "skladnik_B")
    private Integer skladnik_B;

    //    @NotEmpty(message = "*Pole nie może być puste!. Proszę o wypełnienie pola")
    @Column(name = "skladnik_calosc")
    private Integer skladnik_calosc;

 //    @NotEmpty(message = "*Pole nie może być puste!. Proszę o wypełnienie pola")
    @Column(name = "opis")
    private String opis;

    public Kolory() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public boolean isWybor() {
        return wybor;
    }

    public void setWybor(boolean wybor) {
        this.wybor = wybor;
    }

    public String getKolor() {
        return kolor;
    }

    public void setKolor(String kolor) {
        this.kolor = kolor;
    }

    public Integer getSkladnik_R() {
        return skladnik_R;
    }

    public void setSkladnik_R(Integer skladnik_R) {
        this.skladnik_R = skladnik_R;
    }

    public Integer getSkladnik_G() {
        return skladnik_G;
    }

    public void setSkladnik_G(Integer skladnik_G) {
        this.skladnik_G = skladnik_G;
    }

    public Integer getSkladnik_B() {
        return skladnik_B;
    }

    public void setSkladnik_B(Integer skladnik_B) {
        this.skladnik_B = skladnik_B;
    }

    public Integer getSkladnik_calosc() {
        return skladnik_calosc;
    }

    public void setSkladnik_calosc(Integer skladnik_calosc) {
        this.skladnik_calosc = skladnik_calosc;
    }

    public String getOpis() {
        return opis;
    }

    public void setOpis(String opis) {
        this.opis = opis;
    }
}
