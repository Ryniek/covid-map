package pl.rynski.coronavirusmap.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import pl.rynski.coronavirusmap.service.VirusParser;

import java.io.IOException;

@Controller
public class MapController {

    private VirusParser virusParser;

    @Autowired
    public MapController(VirusParser virusParser) {
        this.virusParser = virusParser;
    }

    @GetMapping("/")
    public String getMap(Model model) throws IOException {
        model.addAttribute("points", virusParser.getVirusData());
        return "map";
    }
}
