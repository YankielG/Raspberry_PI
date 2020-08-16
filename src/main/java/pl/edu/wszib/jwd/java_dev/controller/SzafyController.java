package pl.edu.wszib.jwd.java_dev.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import pl.edu.wszib.jwd.java_dev.dao.SzafyDao;
import pl.edu.wszib.jwd.java_dev.model.Szafy;

@Controller
@PropertySource("classpath:messages.properties")
public class SzafyController {

    @Autowired
    private SzafyDao szafyDao;

    @GetMapping("opcje/szafy")
    public String szafy(Model model) {
        model.addAttribute("lista", szafyDao.findAll());
        return "szafy";
    }

    //    @GetMapping("opcje/szafy")
//    public ModelMap szafy(@PageableDefault(size = 5) Pageable pageable, @RequestParam(name = "id", required = false) Long id, Model model) {
////       if (id != null) {
////           return new ModelMap().addAttribute("lista", szafyDao.findAllById(id, pageable));
////        } else {
////            return new ModelMap().addAttribute("lista", szafyDao.findAll(pageable));
////        }
//        return new ModelMap().addAttribute("lista", szafyDao.findAll(pageable));
//    }
    
    @GetMapping("opcje/szafy/usun/{id}")
    public String usun(@PathVariable Long id) {
        szafyDao.deleteById(id);
        return "redirect:/opcje/szafy";
    }

    @GetMapping("opcje/szafy/czysc")
    public String czysc() {
        szafyDao.deleteAll();
        return "redirect:/opcje/szafy";
    }

    @GetMapping("opcje/szafy/wstaw")
    public String wstaw(Model model) {
        model.addAttribute("szafydodaj", new Szafy());
        return "szafydodaj";
    }

    @PostMapping("opcje/szafy/zapisz")
    public String zapisz(Szafy szafy) {
        szafyDao.save(szafy);
        return "redirect:/opcje/szafy";
    }

    @GetMapping("opcje/szafy/edytuj/{id}")
    public String edytuj(@PathVariable Long id, Model model) {
        Szafy szafy = szafyDao.findById(id).get();
        model.addAttribute("szafydodaj", szafy);
        return "szafydodaj";
    }

    @GetMapping("opcje/szafy/szczegoly/{id}")
    public String szczegoly(@PathVariable Long id, Model model) {
        Szafy szafy = szafyDao.findById(id).get();
        model.addAttribute("szafyszczegoly", szafy);
        return "szafyszczegoly";
    }
}
