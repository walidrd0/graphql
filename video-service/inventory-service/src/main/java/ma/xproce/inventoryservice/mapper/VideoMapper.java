package ma.xproce.inventoryservice.mapper;

import ma.xproce.inventoryservice.dao.entities.Video;
import ma.xproce.inventoryservice.dtos.VideoDto;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class VideoMapper {

    private ModelMapper mapper;
    public VideoMapper(){
        mapper = new ModelMapper();
    }
    public VideoDto convertVideoToVideoDto(Video video){
        return this.mapper.map(video,VideoDto.class);
    }
    public Video convertVideoDtoToVideo(VideoDto videoDto){
        return this.mapper.map(videoDto,Video.class);
    }
}
