package Models.Characters;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class CharactersModel {
    private int code;
    private String status;
    private String copyright;
    private String attributionText;
    private String attributionHTML;
    private DataModel data;
    private String etag;

}
