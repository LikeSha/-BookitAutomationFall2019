package com.bookit.units;

import com.bookit.utilities.APIUtilities;
import org.junit.Assert;
import org.junit.Test;

/**
 * Class with unit tests for APIUtilities class
 * Here we ensure that utilities work fine before using
 */
public class APIUtilitiesUnitTests {

    @Test
    public void getTokenTest(){
        String token = APIUtilities.getToken();
        Assert.assertNotNull(token);
    }
}
