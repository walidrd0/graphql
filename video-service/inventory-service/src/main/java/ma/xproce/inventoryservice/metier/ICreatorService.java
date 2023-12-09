package ma.xproce.inventoryservice.metier;

import ma.xproce.inventoryservice.dao.entities.Creator;
import ma.xproce.inventoryservice.dtos.CreatorDto;
import org.springframework.graphql.data.method.annotation.Argument;


public interface ICreatorService {
    CreatorDto creatorById(Long id);
    CreatorDto saveCreator( CreatorDto creatorDto);
}
