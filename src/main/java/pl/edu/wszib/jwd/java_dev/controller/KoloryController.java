package pl.edu.wszib.jwd.java_dev.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import pl.edu.wszib.jwd.java_dev.WS2812;
import pl.edu.wszib.jwd.java_dev.dao.KoloryDao;
import pl.edu.wszib.jwd.java_dev.model.Kolory;

import java.awt.*;

@Controller
@PropertySource("classpath:messages.properties")
public class KoloryController {

    @Autowired
    private KoloryDao koloryDao;

    @GetMapping("opcje/kolory")
    public String kolory(Model model) {
        model.addAttribute("lista", koloryDao.findAll());
        return "kolory";
    }

//    @GetMapping("opcje/kolory")
//    public ModelMap kolory(@PageableDefault(size = 5) Pageable pageable, @RequestParam(name = "id", required = false) Long id, Model model) {
////       if (id != null) {
////           return new ModelMap().addAttribute("lista", koloryDao.findAllById(id, pageable));
////        } else {
////            return new ModelMap().addAttribute("lista", koloryDao.findAll(pageable));
////        }
//        return new ModelMap().addAttribute("lista", koloryDao.findAll(pageable));
//    }

    @GetMapping("opcje/kolory/usun/{id}")
    public String usun(@PathVariable Long id) {
        koloryDao.deleteById(id);
        return "redirect:/opcje/kolory";
    }

    @GetMapping("opcje/kolory/czysc")
    public String czysc() {
        koloryDao.deleteAll();
        return "redirect:/opcje/kolory";
    }

    @GetMapping("opcje/kolory/wstaw")
    public String wstaw(Model model) {
        model.addAttribute("kolorydodaj", new Kolory());
        return "kolorydodaj";
    }

    @PostMapping("opcje/kolory/zapisz")
    public String zapisz(Kolory kolory) {
        koloryDao.save(kolory);
        return "redirect:/opcje/kolory";
    }

    @GetMapping("opcje/kolory/edytuj/{id}")
    public String edytuj(@PathVariable Long id, Model model) {
        Kolory kolory = koloryDao.findById(id).get();
        model.addAttribute("kolorydodaj", kolory);
        return "kolorydodaj";
    }

    @GetMapping("opcje/kolory/szczegoly/{id}")
    public String szczegoly(@PathVariable Long id, Model model) {
        Kolory kolory = koloryDao.findById(id).get();
        model.addAttribute("koloryszczegoly", kolory);
        return "koloryszczegoly";
    }
}
