package Models.Characters;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EventsModel {
    private int available;
    private int returned;
    private String collectionURI;
    private List<ItemModel> items;
}
