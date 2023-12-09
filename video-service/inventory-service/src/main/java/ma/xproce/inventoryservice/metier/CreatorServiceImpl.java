package ma.xproce.inventoryservice.metier;

import ma.xproce.inventoryservice.dao.entities.Creator;
import ma.xproce.inventoryservice.dao.repositories.CreatorRepository;
import ma.xproce.inventoryservice.dtos.CreatorDto;
import ma.xproce.inventoryservice.mapper.CreatorMapper;
import ma.xproce.inventoryservice.mapper.VideoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CreatorServiceImpl implements ICreatorService{
    @Autowired
    CreatorMapper creatorMapper ;
    @Autowired
    CreatorRepository creatorRepository;
    @Override
    public CreatorDto creatorById(Long id) {
        return creatorMapper.convertCreatorToCreatorDto(
                creatorRepository.findById(id)
                        .orElseThrow(()->new RuntimeException(String.format("Creator %s not found",id)))
        );
    }

    @Override
    public CreatorDto saveCreator(CreatorDto creatorDto) {
        System.out.println(creatorDto.getName());
        return creatorMapper.convertCreatorToCreatorDto(
                creatorRepository.save(creatorMapper.convertCreatorDtoToCreator(creatorDto)));
    }

}
