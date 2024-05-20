package cz.czechitas.java2webapps.ukol3.controller;

import cz.czechitas.java2webapps.ukol3.entity.Vizitka;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.ModelAndView;
import java.util.List;

/**
 * Kontroler obsluhující zobrazování vizitek.
 */
@Controller
public class VizitkaController {



    // Vytvoření seznamu vizitek pomocí List.of()
    private List<Vizitka> seznamVizitek = List.of(
            new Vizitka("Jana Nováková", "Czechitas Praha", "Václavské náměstí 837/11", "186 00 Praha 1", "jana.novakova@czechitas.cz", "+420 123 456 789", "www.czechitas.cz"),
            new Vizitka("Petr Novotný", "Náměstí Svobody Brno", "Náměstí Svobody", "602 00 Brno-střed", "petr.novotny@brno.cz", "+420 987 654 321", "www.brno.cz"),
            new Vizitka("Karolína Dvořáková", "Ostravská univerzita Ostrava", "Studentská 1777/17", "700 00 Ostrava-Poruba", "karolina.dvorakova@osu.cz", "+420 111 222 333", "www.osu.cz"),
            new Vizitka("Lukáš Svoboda", "Svatý Kopeček Olomouc", "Svatý Kopeček", "783 36 Olomouc", null, "+420 444 555 666", "www.svatekopecek.cz"),
            new Vizitka("Veronika Kovářová", "Plzeňský Prazdroj Plzeň", "U Prazdroje 7", "304 97 Plzeň", "veronika.kovarova@plzen.cz", null, null),
            new Vizitka("Tomáš Novák", "Zámek Ústí nad Labem", "Zámecké náměstí 1", "400 01 Ústí nad Labem-centrum", null, "+420 777 888 999", "www.zamekusti.cz")
    );



    @GetMapping("/seznam")
    public ModelAndView seznam(){
        ModelAndView modelAndView = new ModelAndView("seznam");
        modelAndView.addObject("vizitka", seznamVizitek);
        return modelAndView;
    }






    @GetMapping("/detail/{id}")
    public ModelAndView detail(@PathVariable int id) {
        ModelAndView modelAndView = new ModelAndView("detail");
        Vizitka vizitka = seznamVizitek.get(id);
        modelAndView.addObject("vizitka", vizitka);
        return modelAndView;
    }
}
