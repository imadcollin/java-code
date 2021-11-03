package booleans;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AlarmTest {

    @Test
    public void setAlarmTest() {
        assertEquals(Alarm.setAlarm(true, true), false);
        assertEquals(Alarm.setAlarm(false, true), false);
        assertEquals(Alarm.setAlarm(false, false), false);
        assertEquals(Alarm.setAlarm(true, false), true);

    }

    @Test
    public void setAlarm2Test() {
        assertEquals(Alarm.setAlarm2(true, true), false);
        assertEquals(Alarm.setAlarm2(false, true), false);
        assertEquals(Alarm.setAlarm2(false, false), false);
        assertEquals(Alarm.setAlarm2(true, false), true);

    }

    @Test
    public void setAlarm3Test() {
        assertEquals(Alarm.setAlarm3(true, true), false);
        assertEquals(Alarm.setAlarm3(false, true), false);
        assertEquals(Alarm.setAlarm3(false, false), false);
        assertEquals(Alarm.setAlarm3(true, false), true);

    }

}