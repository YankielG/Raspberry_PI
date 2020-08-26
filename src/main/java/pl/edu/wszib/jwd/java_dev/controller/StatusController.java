package pl.edu.wszib.jwd.java_dev.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.PropertySource;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import pl.edu.wszib.jwd.java_dev.dao.*;
import pl.edu.wszib.jwd.java_dev.model.Status;

import java.awt.*;

@Controller
@PropertySource("classpath:messages.properties")
public class StatusController {

    @Autowired
    private StatusDao statusDao;

    @Autowired
    private TasmaDao tasmaDao;

    @Autowired
    private SzafyDao szafyDao;

    @Autowired
    private KoloryDao koloryDao;

    @Autowired
    private JasnoscDao jasnoscDao;

//    @Autowired
//    private RzadDao rzadcDao;

    @GetMapping("status")
    public String status(Model model) {
        model.addAttribute("lista", statusDao.findAll());
        return "status";
    }

        @GetMapping("status1")
    public ModelMap status(@PageableDefault(size = 5) Pageable pageable, @RequestParam(name = "id", required = false) Long id, Model model) {
//       if (id != null) {
//           return new ModelMap().addAttribute("lista", statusDao.findAllById(id, pageable));
//        } else {
//            return new ModelMap().addAttribute("lista", statusDao.findAll(pageable));
//        }
        return new ModelMap().addAttribute("lista", statusDao.findAll(pageable));
    }

    @GetMapping("status/usun/{id}")
    public String usun(@PathVariable Long id) {
        statusDao.deleteById(id);
        return "redirect:/status";
    }

    @GetMapping("status/czysc")
    public String czysc() {
        statusDao.deleteAll();
        return "redirect:/status";
    }

    @GetMapping("status/wstaw1")
    public String wstaw(Model model) {
        model.addAttribute("statusdodaj", new Status());
        return "statusdodaj1";
    }
    @GetMapping("status/wstaw")
    public String wstaw1(Model model) {
        model.addAttribute("statusdodaj", new Status());
        model.addAttribute("Szafy", szafyDao.findAll());
        model.addAttribute("Kolory", koloryDao.findAll());
        model.addAttribute("Jasnosci", jasnoscDao.findAll());
//        model.addAttribute("Rzad", rzadDao.findAll());
        return "statusdodaj";
    }

    @PostMapping("status/zapisz")
    public String zapisz(Status status) {
        statusDao.save(status);
        return "redirect:/status";
    }

    @GetMapping("status/edytuj/{id}")
    public String edytuj(@PathVariable Long id, Model model) {
        Status status = statusDao.findById(id).get();
        model.addAttribute("Szafy", szafyDao.findAll());
        model.addAttribute("Kolory", koloryDao.findAll());
        model.addAttribute("Jasnosci", jasnoscDao.findAll());
//        model.addAttribute("Rzad", rzadDao.findAll());
        model.addAttribute("statusdodaj", status);
        return "statusdodaj";
    }

    @GetMapping("status/edytuj1/{id}")
    public String edytuj1(@PathVariable Long id, Model model) {
        Status status = statusDao.findById(id).get();
        model.addAttribute("statusdodaj", status);
        return "statusdodaj";
    }

    @GetMapping("status/szczegoly/{id}")
    public String szczegoly(@PathVariable Long id, Model model) {
        Status status = statusDao.findById(id).get();
        model.addAttribute("statusszczegoly", status);
        return "statusszczegoly";
    }

}
