import Services.BaseService;
import org.junit.BeforeClass;

public class Hooks {

    public BaseService baseService;

    @BeforeClass
    public void setUp(){

        baseService = new BaseService();
    }
}
