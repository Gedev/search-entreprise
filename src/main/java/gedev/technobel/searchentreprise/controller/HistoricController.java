package gedev.technobel.searchentreprise.controller;


import gedev.technobel.searchentreprise.repository.EntrepriseRepository;
import gedev.technobel.searchentreprise.repository.HistoricRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.ArrayList;
import java.util.Date;

@Controller
@RequestMapping("/historic")
public class HistoricController {

    @Autowired
    private HistoricRepository historicRepository;

    @GetMapping
    public String historicListPage(Model model) {
        model.addAttribute("historics", historicRepository.findAll());
        return "historic/read";
    }
}
