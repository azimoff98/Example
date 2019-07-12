package az.azerconnect.mapper;

import az.azerconnect.dto.SubscriberPropertyDTO;
import az.azerconnect.model.SubscriberProperty;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface SubscriberPropertyMapper {

    SubscriberPropertyDTO toDTO(SubscriberProperty subscriberProperty);

    @Mapping(source = "name", target = "propertyName")
    @Mapping(source = "value", target = "propertyValue")
    SubscriberProperty toEntity(SubscriberPropertyDTO subscriberPropertyDTO);
}
