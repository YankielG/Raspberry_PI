package pl.edu.wszib.jwd.java_dev.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import pl.edu.wszib.jwd.java_dev.dao.ProfilDao;
import pl.edu.wszib.jwd.java_dev.model.Profil;
import pl.edu.wszib.jwd.java_dev.dao.StartDao;
import pl.edu.wszib.jwd.java_dev.model.Start;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import java.util.Date;

@Controller
@PropertySource("classpath:messages.properties")
public class ProfilController {

    @Autowired
    private ProfilDao profilDao;

    @Autowired
    private StartDao startDao;

    @Autowired
    BCryptPasswordEncoder bCryptPasswordEncoder;

    @GetMapping("opcje/profil")
    public String profil(Model model) {
        model.addAttribute("lista", profilDao.findAll());
        return "profil";
    }


//    @GetMapping("opcje/profil")
//    public ModelMap profil(@PageableDefault(size = 5) Pageable pageable, @RequestParam(name = "id", required = false) Long id, Model model) {
//       if (id != null) {
//           return new ModelMap().addAttribute("lista", profilDao.findAllById(id, pageable));
//        } else {
//            return new ModelMap().addAttribute("lista", profilDao.findAll(pageable));
//        }
////        return new ModelMap().addAttribute("lista", profilDao.findAll(pageable));
//    }

    @GetMapping("opcje/profil/usun/{id}")
    public String usun(@PathVariable Long id) {
        profilDao.deleteById(id);
        return "redirect:/opcje/profil";
    }

    @GetMapping("opcje/profil/czysc")
    public String czysc() {
        profilDao.deleteAll();
        return "redirect:/opcje/profil";
    }

    @GetMapping("opcje/profil/wstaw")
    public String wstaw(Model model) {
        model.addAttribute("profildodaj", new Profil());
        return "profildodaj";
    }

    @PostMapping("profilblad")
    public String profilblad(Model model) {
        model.addAttribute("profildodaj", new Profil());
        return "profilblad";
    }

 @PostMapping("profilsukces")
    public String profilsukces(Model model) {
        model.addAttribute("profildodaj", new Profil());
        return "profilsukces";
    }

 @GetMapping("rejestracja")
    public String rejestracja(Model model) {
        model.addAttribute("profildodaj", new Profil());
        return "rejestracja";
    }

    @GetMapping("przypomnijhaslo")
    public String przypomnijhaslo(Model model) {
//        model.addAttribute("startdodaj", new Start());
//        model.addAttribute("lista", startDao.findAll());
        return "przypomnijhaslo";
    }

    @PostMapping("przypomnijblad")
    public String przypomnijblad(Model model) {
        model.addAttribute("startdodaj", new Start());
        model.addAttribute("lista", startDao.findAll());
        return "przypomnijblad";
    }

    @GetMapping("przypomnijsukces")
    public String przypomnijsukces(Model model) {
        model.addAttribute("startdodaj", new Start());
        model.addAttribute("lista", startDao.findAll());
        return "przypomnijsukces";
    }

    @PostMapping("opcje/profil/zapisz")
    public String zapisz(Profil profil) {
        profil.setHaslo(bCryptPasswordEncoder.encode(profil.getHaslo()));
        profil.setUzytkownikUwagi("Tworzenie");
        profil.setUzytkownikTyp("USER");
//        profil.setUzytkownikid("Nowy_0000");
        profil.setUzytkownikAktywny(true);
        profil.setUzytkownikDataTw(new Date());
        profilDao.save(profil);
        return "redirect:/opcje/profil";
    }

    @PostMapping("rejestracja/zapisz")
    public String rejestracjazapisz(Profil profil) {
        profil.setHaslo(bCryptPasswordEncoder.encode(profil.getHaslo()));
        profil.setUzytkownikUwagi("Rejestracja");
        profil.setUzytkownikTyp("ADMIN");
//        profil.setUzytkownikid("Nowy_0000");
        profil.setUzytkownikAktywny(true);
        profil.setUzytkownikDataTw(new Date());
        profilDao.save(profil);
        return "profilsukces";
    }

    @GetMapping("opcje/profil/edytuj/{id}")
    public String edytuj(@PathVariable Long id, Model model) {
        Profil profil = profilDao.findById(id).get();
        model.addAttribute("profildodaj", profil);
        return "profildodaj";
    }

    @GetMapping("opcje/profil/szczegoly/{id}")
    public String szczegoly(@PathVariable Long id, Model model) {
        Profil profil = profilDao.findById(id).get();
        model.addAttribute("profilszczegoly", profil);
        return "profilszczegoly";
    }

    @GetMapping("opcje/profil/edytujadmin/{id}")
    public String edytujadmin(@PathVariable Long id, Model model) {
        Profil profil = profilDao.findById(id).get();
        model.addAttribute("profildodaj", profil);
        return "profildodajadmin";
    }

    @PostMapping("opcje/profil/admin")
    public String adminzapisz(Profil profil) {
        profil.setUzytkownikDataUp(new Date());
        profilDao.save(profil);
        return "redirect:/opcje/profil";
    }


}
