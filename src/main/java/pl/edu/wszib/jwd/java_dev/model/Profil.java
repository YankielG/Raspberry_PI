package pl.edu.wszib.jwd.java_dev.model;

import org.springframework.format.annotation.DateTimeFormat;
import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "profil")
public class Profil {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;

    @Column(name = "wybor")
    private boolean wybor;

    //    @NotEmpty(message = "*Pole nie może być puste!. Proszę o wypełnienie pola")
    @Column(name = "uzytkownik")
    private String uzytkownik;

    //    @NotEmpty(message = "*Pole nie może być puste!. Proszę o wypełnienie pola")
    @Column(name = "imie")
    private String imie;

    //    @NotEmpty(message = "*Pole nie może być puste!. Proszę o wypełnienie pola")
    @Column(name = "nazwisko")
    private String nazwisko;

    //    @NotEmpty(message = "*Pole nie może być puste!. Proszę o wypełnienie pola")
    @Column(name = "email")
    private String email;

    //    @NotEmpty(message = "*Pole nie może być puste!. Proszę o wypełnienie pola")
    @Column(name = "haslo")
    private String haslo;

    //    @NotEmpty(message = "*Pole nie może być puste!. Proszę o wypełnienie pola")
    @Column(name = "uzytkownik_aktywny")
    private Boolean uzytkownik_aktywny;

    //    @NotEmpty(message = "*Pole nie może być puste!. Proszę o wypełnienie pola")
    @Column(name = "uzytkownik_id")
    private Long uzytkownik_id;

    //    @NotEmpty(message = "*Pole nie może być puste!. Proszę o wypełnienie pola")
    @Column(name = "uzytkownik_typ")
    private String uzytkownik_typ;

    //    Data ostatniej edycji
//    @Temporal(TemporalType.DATE)
//    @Column(name = "uzytkownik_d_up", updatable = false, nullable = false)
    @Column(name = "uzytkownik_d_up")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date uzytkownik_data_up;

    //    Data tworzenia uzytkownika
//    @Temporal(TemporalType.DATE)
//    @Column(name = "uzytkownik_d_tw", updatable = false, nullable = false)
    @Column(name = "uzytkownik_d_tw")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
//    @DateTimeFormat(pattern = "yyyy-MM-dd'T'HH:mm")
    private Date uzytkownik_data_tw;
//    private LocalDateTime uzytkownik_data_tw = LocalDateTime.now();
//    private Date uzytkownik_data_tw = new Date();

    //    @NotEmpty(message = "*Pole nie może być puste!. Proszę o wypełnienie pola")
    @Column(name = "uzytkownik_uwagi")
    private String uzytkownik_uwagi;

    //    @NotEmpty(message = "*Pole nie może być puste!. Proszę o wypełnienie pola")
    @Column(name = "opis")
    private String opis;

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

    public String getUzytkownik() {
        return uzytkownik;
    }

    public void setUzytkownik(String uzytkownik) {
        this.uzytkownik = uzytkownik;
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getHaslo() {
        return haslo;
    }

    public void setHaslo(String haslo) {
        this.haslo = haslo;
    }

    public Boolean getUzytkownik_aktywny() {
        return uzytkownik_aktywny;
    }

    public void setUzytkownik_aktywny(Boolean uzytkownik_aktywny) {
        this.uzytkownik_aktywny = uzytkownik_aktywny;
    }

    public Long getUzytkownik_id() {
        return uzytkownik_id;
    }

    public void setUzytkownik_id(Long uzytkownik_id) {
        this.uzytkownik_id = uzytkownik_id;
    }

    public String getUzytkownik_typ() {
        return uzytkownik_typ;
    }

    public void setUzytkownik_typ(String uzytkownik_typ) {
        this.uzytkownik_typ = uzytkownik_typ;
    }

    public Date getUzytkownik_data_up() {
        return uzytkownik_data_up;
    }

    public void setUzytkownik_data_up(Date uzytkownik_data_up) {
        this.uzytkownik_data_up = uzytkownik_data_up;
    }

    public Date getUzytkownik_data_tw() {
        return uzytkownik_data_tw;
    }

    public void setUzytkownik_data_tw(Date uzytkownik_data_tw) {
        this.uzytkownik_data_tw = uzytkownik_data_tw;
    }

    public String getUzytkownik_uwagi() {
        return uzytkownik_uwagi;
    }

    public void setUzytkownik_uwagi(String uzytkownik_uwagi) {
        this.uzytkownik_uwagi = uzytkownik_uwagi;
    }

    public String getOpis() {
        return opis;
    }

    public void setOpis(String opis) {
        this.opis = opis;
    }
}
