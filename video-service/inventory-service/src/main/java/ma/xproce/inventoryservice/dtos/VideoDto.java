package ma.xproce.inventoryservice.dtos;

import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import ma.xproce.inventoryservice.dao.entities.Creator;

import java.util.Date;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class VideoDto {
    private String name;
    private String url;
    private String description;
    private Date datePublication;

    private CreatorDto creatorDto;
}
