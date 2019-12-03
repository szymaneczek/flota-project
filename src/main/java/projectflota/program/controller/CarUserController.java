package projectflota.program.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import projectflota.program.UserFinder;
import projectflota.program.dto.CarUserDTO;
import projectflota.program.service.CarUserService;

@Slf4j
@RequiredArgsConstructor
@Controller
@RequestMapping("/user")
public class CarUserController {
    private final CarUserService carUserService;

    private final UserFinder userFinder;

    @GetMapping("/create")
    ModelAndView createUserView(){
        ModelAndView modelAndView = new ModelAndView("createUser.html");
        modelAndView.addObject("user", new CarUserDTO());
        return modelAndView;

    }

    @GetMapping("/get")
    ModelAndView getOccurences() {
        ModelAndView modelAndView = new ModelAndView("users.html");
        modelAndView.addObject("users", userFinder.carUserList());
        return modelAndView;
    }

    @GetMapping("/redirect")
    ModelAndView getRedirection() {
        ModelAndView modelAndView = new ModelAndView("index.html");
        return modelAndView;
    }
    @PostMapping("/create")
    String createUser(@ModelAttribute CarUserDTO user){
        carUserService.createUser(user);
        return "redirect:/";
    }
}


