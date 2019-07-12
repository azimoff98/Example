package az.azerconnect.service;

import az.azerconnect.dto.SubscriberDTO;
import az.azerconnect.mapper.SubscriberMapper;
import az.azerconnect.model.Subscriber;
import az.azerconnect.repository.SubscriberRepository;
import az.azerconnect.util.LoggingUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SubscriberService {

    private static final Logger log = LogManager.getLogger();

    @Autowired
    private SubscriberRepository repository;
    @Autowired
    private SubscriberMapper subscriberMapper;

    public SubscriberDTO save(SubscriberDTO subscriberDTO){
        System.out.println("SubscriberDTO was like ... ");
        String subscriberDTOLog = LoggingUtils.createBeautifiedJSON(subscriberDTO);
        System.out.println(subscriberDTOLog);
        Subscriber subscriber = subscriberMapper.toEntity(subscriberDTO);
        System.out.println("Subscriber converted to entity...");
        String subscriberLog = LoggingUtils.createBeautifiedJSON(subscriber);
        System.out.println(subscriberLog);;
        repository.save(subscriber);
        return subscriberDTO;
    }
}
