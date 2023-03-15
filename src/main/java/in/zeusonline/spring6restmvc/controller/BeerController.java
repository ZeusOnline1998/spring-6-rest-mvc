package in.zeusonline.spring6restmvc.controller;

import in.zeusonline.spring6restmvc.model.Beer;
import in.zeusonline.spring6restmvc.services.BeerService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;

import java.util.UUID;

@Slf4j
@AllArgsConstructor
@Controller
public class BeerController {

    private final BeerService beerService;

    public Beer getBeerById(UUID id){

        log.debug("Get Beer by id - in controller");

        return beerService.getBeerId(id);
    }
}
