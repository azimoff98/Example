package az.azerconnect.mapper;

import az.azerconnect.dto.SubscriberDTO;
import az.azerconnect.model.Subscriber;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;


@Mapper(componentModel = "spring", uses = {SubscriberDetailsMapper.class, SubscriberPropertyMapper.class})
public interface SubscriberMapper {

    SubscriberDTO toDTO(Subscriber subscriber);

    @Mapping(source = "subscriberDetailsDTO", target = "subscriberDetails")
    Subscriber toEntity(SubscriberDTO subscriberDTO);
}
