
package com.enigio.voco;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

public class TestVocoMain {

	@Ignore
	@Test
	public void testFel() {
		Assert.assertEquals("qwerty", VocoStart.VOCO);
	}

	@Test
	public void testRatt() {
		Assert.assertEquals("12345678o", VocoStart.VOCO);
	}

}
