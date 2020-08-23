package pl.edu.wszib.jwd.java_dev.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import pl.edu.wszib.jwd.java_dev.dao.JasnoscDao;
import pl.edu.wszib.jwd.java_dev.model.Jasnosc;

@Controller
@PropertySource("classpath:messages.properties")
public class JasnoscController {

    @Autowired
    private JasnoscDao jasnoscDao;

    @GetMapping("opcje/jasnosc")
    public String jasnosc(Model model) {
        model.addAttribute("lista", jasnoscDao.findAll());
        return "jasnosc";
    }

//    @GetMapping("opcje/jasnosc")
//    public ModelMap jasnosc(@PageableDefault(size = 5) Pageable pageable, @RequestParam(name = "id", required = false) Long id, Model model) {
////       if (id != null) {
////           return new ModelMap().addAttribute("lista", jasnoscDao.findAllById(id, pageable));
////        } else {
////            return new ModelMap().addAttribute("lista", jasnoscDao.findAll(pageable));
////        }
//        return new ModelMap().addAttribute("lista", jasnoscDao.findAll(pageable));
//    }

    @GetMapping("opcje/jasnosc/usun/{id}")
    public String usun(@PathVariable Long id) {
        jasnoscDao.deleteById(id);
        return "redirect:/opcje/jasnosc";
    }

    @GetMapping("opcje/jasnosc/czysc")
    public String czysc() {
        jasnoscDao.deleteAll();
        return "redirect:/opcje/jasnosc";
    }

    @GetMapping("opcje/jasnosc/wstaw")
    public String wstaw(Model model) {
        model.addAttribute("jasnoscdodaj", new Jasnosc());
        return "jasnoscdodaj";
    }

    @PostMapping("opcje/jasnosc/zapisz")
    public String zapisz(Jasnosc jasnosc) {
        jasnoscDao.save(jasnosc);
        return "redirect:/opcje/jasnosc";
    }

    @GetMapping("opcje/jasnosc/edytuj/{id}")
    public String edytuj(@PathVariable Long id, Model model) {
        Jasnosc jasnosc = jasnoscDao.findById(id).get();
        model.addAttribute("jasnoscdodaj", jasnosc);
        return "jasnoscdodaj";
    }

    @GetMapping("opcje/jasnosc/szczegoly/{id}")
    public String szczegoly(@PathVariable Long id, Model model) {
        Jasnosc jasnosc = jasnoscDao.findById(id).get();
        model.addAttribute("jasnoscszczegoly", jasnosc);
        return "jasnoscszczegoly";
    }
}
