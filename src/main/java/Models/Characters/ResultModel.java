package Models.Characters;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResultModel {
    private int id;
    private String name;
    private String description;
    private String modified;
    private String resourceURI;
    private List<UrlModel> urls = null;
    private ThumbnailModel thumbnail;
    private ComicsModel comics;
    private StoriesModel stories;
    private EventsModel events;
    private SeriesModel series;
}
