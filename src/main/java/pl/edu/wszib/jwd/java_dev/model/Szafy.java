package pl.edu.wszib.jwd.java_dev.model;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "szafy")
public class Szafy {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;

    @Column(name = "wybor")
    private boolean wybor;

    //    @NotEmpty(message = "*Pole nie może być puste!. Proszę o wypełnienie pola")
    @Column(name = "szafa")
    private String szafa;

    //    @NotEmpty(message = "*Pole nie może być puste!. Proszę o wypełnienie pola")
    @Column(name = "od_led")

    private int od_led;
    //    @NotEmpty(message = "*Pole nie może być puste!. Proszę o wypełnienie pola")
    @Column(name = "do_led")
    private int do_led;

    //    @NotEmpty(message = "*Pole nie może być puste!. Proszę o wypełnienie pola")
    @Column(name = "opis")
    private String opis;

    public Szafy() {
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

    public String getSzafa() {
        return szafa;
    }

    public void setSzafa(String szafa) {
        this.szafa = szafa;
    }

    public int getOd_led() {
        return od_led;
    }

    public void setOd_led(int od_led) {
        this.od_led = od_led;
    }

    public int getDo_led() {
        return do_led;
    }

    public void setDo_led(int do_led) {
        this.do_led = do_led;
    }

    public String getOpis() {
        return opis;
    }

    public void setOpis(String opis) {
        this.opis = opis;
    }
}
