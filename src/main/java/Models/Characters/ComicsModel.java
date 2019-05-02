package Models.Characters;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ComicsModel {
    private int available;
    private int returned;
    private String collectionURI;
    private List<ItemModel> items;
}
