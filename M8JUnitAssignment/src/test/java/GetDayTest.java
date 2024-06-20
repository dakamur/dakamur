import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

public class GetDayTest {

    @ParameterizedTest
    @ValueSource(ints = {-1,4,8,3})
    public void getDayTest (int a){
        GetDay getDay = new GetDay();
        System.out.println(getDay.getDay(a));

    }
    @Test
    public void getDayNullTest (){
        GetDay getDay = new GetDay();
        System.out.println(getDay.getDay(null));

    }
    }

