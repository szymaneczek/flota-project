package projectflota.program.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import projectflota.program.OccurenceFinder;
import projectflota.program.dto.OccurenceDTO;
import projectflota.program.service.OccurenceService;

@Slf4j
@RequiredArgsConstructor
@Controller
@RequestMapping("/occurence")
public class OccurenceController {

    private final OccurenceService occurenceService;

    private final OccurenceFinder occurenceFinder;

    @GetMapping("/create")
    ModelAndView createOccurenceView(){
        ModelAndView modelAndView = new ModelAndView("createOccurence.html");
        modelAndView.addObject("occurence", new OccurenceDTO());
        return modelAndView;
    }
    @GetMapping("/get")
    ModelAndView getOccurences() {
        ModelAndView modelAndView = new ModelAndView("occurences.html");
        modelAndView.addObject("occurences", occurenceFinder.occurenceList());
        return modelAndView;
    }

    @PostMapping("/create")
    String createOccurence(@ModelAttribute OccurenceDTO occurence){
        //System.out.println(car);
        occurenceService.createOccurence(occurence);
        return "redirect:/";
    }
}


