package pl.edu.wszib.jwd.java_dev.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import pl.edu.wszib.jwd.java_dev.dao.TasmaDao;
import pl.edu.wszib.jwd.java_dev.model.Tasma;

@Controller
@PropertySource("classpath:messages.properties")
public class TasmaController {

    @Autowired
    private TasmaDao tasmaDao;

    @GetMapping("opcje/tasma")
    public String tasma(Model model) {
        model.addAttribute("lista", tasmaDao.findAll());
        return "tasma";
    }

    //    @GetMapping("opcje/tasma")
//    public ModelMap tasma(@PageableDefault(size = 5) Pageable pageable, @RequestParam(name = "id", required = false) Long id, Model model) {
////       if (id != null) {
////           return new ModelMap().addAttribute("lista", tasmaDao.findAllById(id, pageable));
////        } else {
////            return new ModelMap().addAttribute("lista", tasmaDao.findAll(pageable));
////        }
//        return new ModelMap().addAttribute("lista", tasmaDao.findAll(pageable));
//    }
    
    @GetMapping("opcje/tasma/usun/{id}")
    public String usun(@PathVariable Long id) {
        tasmaDao.deleteById(id);
        return "redirect:/opcje/tasma";
    }

    @GetMapping("opcje/tasma/czysc")
    public String czysc() {
        tasmaDao.deleteAll();
        return "redirect:/opcje/tasma";
    }

    @GetMapping("opcje/tasma/wstaw")
    public String wstaw(Model model) {
        model.addAttribute("tasmadodaj", new Tasma());
        return "tasmadodaj";
    }

    @PostMapping("opcje/tasma/zapisz")
    public String zapisz(Tasma tasma) {
        tasmaDao.save(tasma);
        return "redirect:/opcje/tasma";
    }

    @GetMapping("opcje/tasma/edytuj/{id}")
    public String edytuj(@PathVariable Long id, Model model) {
        Tasma tasma = tasmaDao.findById(id).get();
        model.addAttribute("tasmadodaj", tasma);
        return "tasmadodaj";
    }

    @GetMapping("opcje/tasma/szczegoly/{id}")
    public String szczegoly(@PathVariable Long id, Model model) {
        Tasma tasma = tasmaDao.findById(id).get();
        model.addAttribute("tasmaszczegoly", tasma);
        return "tasmaszczegoly";
    }
}
