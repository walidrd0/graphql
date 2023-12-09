package ma.xproce.inventoryservice.metier;

import ma.xproce.inventoryservice.dao.entities.Video;
import ma.xproce.inventoryservice.dtos.VideoDto;

import java.util.List;

public interface IVideoService {
    VideoDto save(Video video);
    List<VideoDto> videoList();
}
