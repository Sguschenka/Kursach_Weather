package kr.netty;
import org.junit.Test;

import java.sql.SQLException;
import java.util.Set;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class DataBaseTest {

    @Test
    public void getWeatherTest() throws SQLException {
        String result = DataBase.Weather.getWeather("Saratov");
        assertEquals("+16", result);
    }

    @Test
    public void getCitiesTest() throws SQLException{
        Set<String> result = (Set<String>) DataBase.Weather.getCities();
        assertEquals(6,result.size());
        assertTrue(result.contains("Saratov"));

    }


}

