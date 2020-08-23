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
    @Column(name = "skladnikR")
    private Integer skladnikR;

    //    @NotEmpty(message = "*Pole nie może być puste!. Proszę o wypełnienie pola")
    @Column(name = "skladnikG")
    private Integer skladnikG;

    //    @NotEmpty(message = "*Pole nie może być puste!. Proszę o wypełnienie pola")
    @Column(name = "skladnikB")
    private Integer skladnikB;

    //    @NotEmpty(message = "*Pole nie może być puste!. Proszę o wypełnienie pola")
    @Column(name = "rgb")
    private Integer rgb;

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

    public Integer getSkladnikR() {
        return skladnikR;
    }

    public void setSkladnikR(Integer skladnikR) {
        this.skladnikR = skladnikR;
    }

    public Integer getSkladnikG() {
        return skladnikG;
    }

    public void setSkladnikG(Integer skladnikG) {
        this.skladnikG = skladnikG;
    }

    public Integer getSkladnikB() {
        return skladnikB;
    }

    public void setSkladnikB(Integer skladnikB) {
        this.skladnikB = skladnikB;
    }

    public Integer getRgb() {
        return rgb;
    }

    public void setRgb(Integer rgb) {
        this.rgb = rgb;
    }

    public String getOpis() {
        return opis;
    }

    public void setOpis(String opis) {
        this.opis = opis;
    }
}
