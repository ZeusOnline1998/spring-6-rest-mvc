package in.zeusonline.spring6restmvc.services;

import in.zeusonline.spring6restmvc.model.Beer;

import java.util.UUID;

public interface BeerService {

    Beer getBeerId(UUID id);
}
