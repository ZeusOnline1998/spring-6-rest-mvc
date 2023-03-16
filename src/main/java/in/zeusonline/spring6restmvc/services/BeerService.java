package in.zeusonline.spring6restmvc.services;

import in.zeusonline.spring6restmvc.model.Beer;

import java.util.List;
import java.util.UUID;

public interface BeerService {

    List<Beer> listBeers();

    Beer getBeerId(UUID id);
    

    Beer saveNewBeer(Beer beer);

    void updateBeerById(UUID beerId, Beer beer);

    void deleteBeer(UUID beerId);
}
