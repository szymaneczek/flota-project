package projectflota.program.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import projectflota.program.CarFinder;
import projectflota.program.dto.CarDTO;
import projectflota.program.service.CarService;

@Slf4j
@RequiredArgsConstructor
@Controller
@RequestMapping("/car")
public class CarController {
    private final CarService carService;
    //private final Logger log = LoggerFactory.getLogger(CarController.class);
    //public CarController(CarService carService) {this.carService=carService;}
    private final CarFinder carFinder;

    @GetMapping("/create")
    ModelAndView createCarView(){
        ModelAndView modelAndView = new ModelAndView("createCar.html");
        modelAndView.addObject("car", new CarDTO());
        return modelAndView;
    }

    @PostMapping("/create")
    String createCar(@ModelAttribute CarDTO car){
        //System.out.println(car);
        carService.createOrUpdate(car);
        return "redirect:/";
    }

    @GetMapping("/get")
    ModelAndView getCars() {
        ModelAndView modelAndView = new ModelAndView("cars.html");
        modelAndView.addObject("cars", carFinder.carList());
        return modelAndView;
    }
//    @GetMapping
//    public List<CarDTO> list() {
//        log.info("GET /cars");
//        return carService.carList();
//    }
}


