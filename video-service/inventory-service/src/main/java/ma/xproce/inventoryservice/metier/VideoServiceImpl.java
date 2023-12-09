package ma.xproce.inventoryservice.metier;

import ma.xproce.inventoryservice.dao.entities.Creator;
import ma.xproce.inventoryservice.dao.entities.Video;
import ma.xproce.inventoryservice.dao.repositories.CreatorRepository;
import ma.xproce.inventoryservice.dao.repositories.VideoRepository;
import ma.xproce.inventoryservice.dtos.VideoDto;
import ma.xproce.inventoryservice.mapper.VideoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class VideoServiceImpl implements IVideoService{
    @Autowired
    CreatorRepository creatorRepository;
    @Autowired
    VideoRepository videoRepository;
    @Autowired
    VideoMapper videoMapper;
    @Override
    public VideoDto save(Video video) {
        creatorRepository.save(video.getCreator());

        return videoMapper.convertVideoToVideoDto(
                videoRepository.save(video)
        );
    }

    @Override
    public List<VideoDto> videoList() {
        return videoRepository.findAll().stream().map(videoMapper::convertVideoToVideoDto).collect(Collectors.toList());
    }
}
