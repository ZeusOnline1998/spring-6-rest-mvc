package in.zeusonline.spring6restmvc.controller;

import in.zeusonline.spring6restmvc.services.BeerService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;

@AllArgsConstructor
@Controller
public class BeerController {

    private final BeerService beerService;


}
