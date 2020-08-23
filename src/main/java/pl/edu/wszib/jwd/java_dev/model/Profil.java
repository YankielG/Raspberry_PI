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
    @Column(name = "uzytkownikAktywny")
    private Boolean uzytkownikAktywny;

    //    @NotEmpty(message = "*Pole nie może być puste!. Proszę o wypełnienie pola")
    @Column(name = "uzytkownikId")
    private Long uzytkownikId;

    //    @NotEmpty(message = "*Pole nie może być puste!. Proszę o wypełnienie pola")
    @Column(name = "uzytkownikTyp")
    private String uzytkownikTyp;

    //    Data ostatniej edycji
//    @Temporal(TemporalType.DATE)
//    @Column(name = "uzytkownik_d_up", updatable = false, nullable = false)
    @Column(name = "uzytkownikDataUp")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date uzytkownikDataUp;

    //    Data tworzenia uzytkownika
//    @Temporal(TemporalType.DATE)
//    @Column(name = "uzytkownikDataTw", updatable = false, nullable = false)
    //    @DateTimeFormat(pattern = "yyyy-MM-dd'T'HH:mm")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @Column(name = "uzytkownikDataTw")
    private Date uzytkownikDataTw;
//    private LocalDateTime uzytkownikDataTw = LocalDateTime.now();
//    private Date uzytkownikDataTw = new Date();

    //    @NotEmpty(message = "*Pole nie może być puste!. Proszę o wypełnienie pola")
    @Column(name = "uzytkownikUwagi")
    private String uzytkownikUwagi;

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

    public Boolean getUzytkownikAktywny() {
        return uzytkownikAktywny;
    }

    public void setUzytkownikAktywny(Boolean uzytkownikAktywny) {
        this.uzytkownikAktywny = uzytkownikAktywny;
    }

    public Long getUzytkownikId() {
        return uzytkownikId;
    }

    public void setUzytkownikId(Long uzytkownikId) {
        this.uzytkownikId = uzytkownikId;
    }

    public String getUzytkownikTyp() {
        return uzytkownikTyp;
    }

    public void setUzytkownikTyp(String uzytkownikTyp) {
        this.uzytkownikTyp = uzytkownikTyp;
    }

    public Date getUzytkownikDataUp() {
        return uzytkownikDataUp;
    }

    public void setUzytkownikDataUp(Date uzytkownikDataUp) {
        this.uzytkownikDataUp = uzytkownikDataUp;
    }

    public Date getUzytkownikDataTw() {
        return uzytkownikDataTw;
    }

    public void setUzytkownikDataTw(Date uzytkownikDataTw) {
        this.uzytkownikDataTw = uzytkownikDataTw;
    }

    public String getUzytkownikUwagi() {
        return uzytkownikUwagi;
    }

    public void setUzytkownikUwagi(String uzytkownikUwagi) {
        this.uzytkownikUwagi = uzytkownikUwagi;
    }

    public String getOpis() {
        return opis;
    }

    public void setOpis(String opis) {
        this.opis = opis;
    }
}
