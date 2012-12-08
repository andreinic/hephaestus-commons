package org.hephaestus.hash;

import org.hephaestus.hash.SHA256;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * User: radutoev
 * Date: 14.11.2012
 * Time: 23:38
 */
public class SHA256Test
{
    @Test
    public void testHash() throws Exception{
        Assert.assertEquals(SHA256.hash("admin"), "8c6976e5b5410415bde908bd4dee15dfb167a9c873fc4bb8a81f6f2ab448a918");
    }
}
