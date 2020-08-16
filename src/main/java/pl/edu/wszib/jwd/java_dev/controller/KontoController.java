package pl.edu.wszib.jwd.java_dev.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import pl.edu.wszib.jwd.java_dev.dao.KontoDao;
import pl.edu.wszib.jwd.java_dev.model.Konto;

@Controller
@PropertySource("classpath:messages.properties")
public class KontoController {

    @Autowired
    private KontoDao kontoDao;

    @GetMapping("opcje/konto")
    public String konto(Model model) {
        model.addAttribute("lista", kontoDao.findAll());
        return "konto";
    }

    //    @GetMapping("opcje/konto")
//    public ModelMap konto(@PageableDefault(size = 5) Pageable pageable, @RequestParam(name = "id", required = false) Long id, Model model) {
////       if (id != null) {
////           return new ModelMap().addAttribute("lista", kontoDao.findAllById(id, pageable));
////        } else {
////            return new ModelMap().addAttribute("lista", kontoDao.findAll(pageable));
////        }
//        return new ModelMap().addAttribute("lista", kontoDao.findAll(pageable));
//    }

    @GetMapping("opcje/konto/usun/{id}")
    public String usun(@PathVariable Long id) {
        kontoDao.deleteById(id);
        return "redirect:/opcje/konto";
    }

    @GetMapping("opcje/konto/czysc")
    public String czysc() {
        kontoDao.deleteAll();
        return "redirect:/opcje/konto";
    }

    @GetMapping("opcje/konto/wstaw")
    public String wstaw(Model model) {
        model.addAttribute("kontododaj", new Konto());
        return "kontododaj";
    }

    @PostMapping("opcje/konto/zapisz")
    public String zapisz(Konto konto) {
//        konto.setUzytkownik_prawa();
        kontoDao.save(konto);
        return "redirect:/opcje/konto";
    }

    @GetMapping("opcje/konto/edytuj/{id}")
    public String edytuj(@PathVariable Long id, Model model) {
        Konto konto = kontoDao.findById(id).get();
        model.addAttribute("kontododaj", konto);
        return "kontododaj";
    }

    @GetMapping("opcje/konto/szczegoly/{id}")
    public String szczegoly(@PathVariable Long id, Model model) {
        Konto konto = kontoDao.findById(id).get();
        model.addAttribute("kontoszczegoly", konto);
        return "kontoszczegoly";
    }
}
