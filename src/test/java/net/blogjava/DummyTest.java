package net.blogjava;

import static org.assertj.core.api.Assertions.*;

import org.junit.Before;
import org.junit.Test;

public class DummyTest {
	Dummy dummy = new Dummy();

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test() {
		assertThat(true).isTrue();
	}

}
