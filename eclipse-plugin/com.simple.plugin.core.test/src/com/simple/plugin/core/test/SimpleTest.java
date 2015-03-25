package com.simple.plugin.core.test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import org.junit.Test;

import com.simple.plugin.core.Activator;

public class SimpleTest {

	@Test
	public void should_run_ok() {
		assertThat(Activator.run(), is("ok"));
	}
}
