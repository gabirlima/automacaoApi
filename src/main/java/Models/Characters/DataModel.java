package Models.Characters;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DataModel {
    private int offset;
    private int limit;
    private int total;
    private int count;
    private List<ResultModel> results;

}
