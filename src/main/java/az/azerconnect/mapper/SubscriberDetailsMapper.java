package az.azerconnect.mapper;

import az.azerconnect.dto.SubscriberDetailsDTO;
import az.azerconnect.model.SubscriberDetails;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface SubscriberDetailsMapper{

    SubscriberDetailsDTO toDTO(SubscriberDetails subscriberDetails);

    @Mapping(source = "subscriberId", target = "id")
    SubscriberDetails toEntity(SubscriberDetailsDTO subscriberDetailsDTO);
}
