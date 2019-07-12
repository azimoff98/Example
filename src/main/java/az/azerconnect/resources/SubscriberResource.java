package az.azerconnect.resources;

import az.azerconnect.dto.SubscriberDTO;
import az.azerconnect.service.SubscriberService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
public class SubscriberResource {

    private static final Logger log = LogManager.getLogger();

    @Autowired
    private SubscriberService subscriberService;

    @PostMapping("/create")
    public SubscriberDTO create(@Valid @RequestBody SubscriberDTO subscriberDTO) {
        log.debug("Rest Request...");
        return subscriberService.save(subscriberDTO);
    }

}
