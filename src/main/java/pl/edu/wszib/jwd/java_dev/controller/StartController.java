package pl.edu.wszib.jwd.java_dev.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
import pl.edu.wszib.jwd.java_dev.dao.StartDao;
import pl.edu.wszib.jwd.java_dev.model.Start;

@Controller
@PropertySource("classpath:messages.properties")
public class StartController {

    @Autowired
    private StartDao startDao;

    @PostMapping("login")
    public ModelAndView login() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("login");
        return modelAndView;
    }
    
    @GetMapping(value={"/", "/login"})
    public String wstaw(Model model) {
        model.addAttribute("startdodaj", new Start());
        model.addAttribute("lista", startDao.findAll());
        return "start";
    }
    
//    @GetMapping
//    public String start(Model model){
//    model.addAttribute("lista", startDao.findAll());
//        return "start";
//    }

    //    @GetMapping
//    public ModelMap start(@PageableDefault(size = 5) Pageable pageable, @RequestParam(name = "id", required = false) Long id, Model model) {
////       if (id != null) {
////           return new ModelMap().addAttribute("lista", startDao.findAllById(id, pageable));
////        } else {
////            return new ModelMap().addAttribute("lista", startDao.findAll(pageable));
////        }
//        return new ModelMap().addAttribute("lista", startDao.findAll(pageable));
//    }

    @GetMapping("start/usun/{id}")
    public String usun(@PathVariable Long id) {
        startDao.deleteById(id);
        return "redirect:/start";
    }

    @GetMapping("start/czysc")
    public String czysc() {
        startDao.deleteAll();
        return "redirect:/start";
    }

//    @GetMapping("start/wstaw")
//    public String wstaw(Model model) {
//        model.addAttribute("startdodaj", new Start());
//        return "startdodaj";
//    }
    
    @PostMapping("start/zapisz")
    public String zapisz(Start start) {
        startDao.save(start);
        return "redirect:/index";
    }

    @GetMapping("start/edytuj/{id}")
    public String edytuj(@PathVariable Long id, Model model) {
        Start start = startDao.findById(id).get();
        model.addAttribute("startdodaj", start);
        return "startdodaj";
    }

    @GetMapping("start/szczegoly{id}")
    public String szczegoly(@PathVariable Long id, Model model) {
        Start start = startDao.findById(id).get();
        model.addAttribute("startszczegoly", start);
        return "startszczegoly";
    }
    
}



