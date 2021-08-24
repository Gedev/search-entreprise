package gedev.technobel.searchentreprise.controller;

import gedev.technobel.searchentreprise.entity.Entreprise;
import gedev.technobel.searchentreprise.repository.EntrepriseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/entreprises")

public class EntrepriseController {

    @Autowired
    private EntrepriseRepository entrepriseRepository;

    @GetMapping
    public String entreprisesListPage(Model model) {
        model.addAttribute("entreprises", entrepriseRepository.findAll());
        return "read";
    }

    @GetMapping("/create") //localhost:8090/entreprises/create
    public String create() {
        return "create";
    }

    @PostMapping("/save")
    public String save(Entreprise entreprise) {
        entrepriseRepository.save(entreprise);
        return "redirect:/entreprises";
    }
}
