package com.stephen;

import org.junit.Test;

public class StringCataTest {

    @Test
    public void testParseOne() {
        StringCata stringCata = new StringCata("aqwhj332mb");
        assert(stringCata.input() == "aqwhj332mb");
    }


}
