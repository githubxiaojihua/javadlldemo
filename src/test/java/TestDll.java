import com.javadll.CLibrary;
import org.junit.jupiter.api.Test;

public class TestDll {
    @Test
    public void testC(){
        int result = CLibrary.INSTANCE.SNBC_InitComm(1001);
        System.out.println(result);

    }
}
