package ma.xproce.inventoryservice.mapper;

import ma.xproce.inventoryservice.dao.entities.Creator;
import ma.xproce.inventoryservice.dtos.CreatorDto;
import org.apache.catalina.mapper.Mapper;
import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.stereotype.Component;

@Component
public class CreatorMapper {
   private ModelMapper mapper;

    public CreatorMapper() {
        this.mapper = new ModelMapper();

    }
    public CreatorDto convertCreatorToCreatorDto(Creator creator){
       return this.mapper.map(creator,CreatorDto.class);
    }
    public Creator convertCreatorDtoToCreator(CreatorDto creatorDto){
        return this.mapper.map(creatorDto,Creator.class);
    }
}
