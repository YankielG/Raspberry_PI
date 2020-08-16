package pl.edu.wszib.jwd.java_dev.model;

import javax.persistence.*;

@Entity
@Table(name = "status")
public class Status {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;

    @Column(name = "wybor")
    private boolean wybor;

    //    @NotEmpty(message = "*Pole nie może być puste!. Proszę o wypełnienie pola")
    @Column(name = "nazwa")
    private String nazwa;

    //    @NotEmpty(message = "*Pole nie może być puste!. Proszę o wypełnienie pola")
    @Column(name = "od_led")

    private int od_led;
    //    @NotEmpty(message = "*Pole nie może być puste!. Proszę o wypełnienie pola")
    @Column(name = "do_led")
    private int do_led;

    //    @NotEmpty(message = "*Pole nie może być puste!. Proszę o wypełnienie pola")
    @Column(name = "kolor")
    private String kolor;

    //    @NotEmpty(message = "*Pole nie może być puste!. Proszę o wypełnienie pola")
    @Column(name = "skladnik_calosc")
    private String skladnik_calosc;

    //    @NotEmpty(message = "*Pole nie może być puste!. Proszę o wypełnienie pola")
    @Column(name = "opis")
    private String opis;

    //    @NotEmpty(message = "*Pole nie może być puste!. Proszę o wypełnienie pola")
    @Column(name = "komentarz")
    private String komentarz;

    public Status() {
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

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
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

    public String getKolor() {
        return kolor;
    }

    public void setKolor(String kolor) {
        this.kolor = kolor;
    }

    public String getSkladnik_calosc() {
        return skladnik_calosc;
    }

    public void setSkladnik_calosc(String skladnik_calosc) {
        this.skladnik_calosc = skladnik_calosc;
    }

    public String getOpis() {
        return opis;
    }

    public void setOpis(String opis) {
        this.opis = opis;
    }

    public String getKomentarz() {
        return komentarz;
    }

    public void setKomentarz(String komentarz) {
        this.komentarz = komentarz;
    }
}
