package com.hp.devops.demoapp;

import org.json.JSONObject;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
// test test test
import java.security.InvalidParameterException;

/**
 * Created with IntelliJ IDEA. // test test test
 * User: gullery12// test test test// test test test
 * Date: 25/11/14
 * Time: 14:21
 * To change this         template use File | Settings | File Templates. 测试添
 * Testing hotspot widget by Ralu
 */
public class BandTest {
	//private String NON_RELATED;
	private JSONObject test;

	@Before
	public void beforeEach() {
		test = new JSONObject();
		test.put("id", 1);
		test.put("name", "Name");
		test.put("logo", "Logo");
		test.put("song", "Song");
		test.put("votes", 10);
	}

	@Test
	public void bandTestA() {
		try {
			Band band = new Band(null);
			Assert.fail("the  flow MUST have been fallen before");
		} catch (Exception e) {
			Assert.assertEquals(e.getClass(), NullPointerException.class);
		}
	}

	@Test
	public void failTestOnNullPointertestlongnamefordocviewtestralucafailTestOnNullPointertestlongnamefordocviewtestralucafailTestOnNullPointertestlongnamefordocviewtestraluca() {
		try {
			Band band = new Band(null);
			band.methodThatThrowsNullPointerException();
			Assert.assertEquals(true,true);
		} catch (Exception e) {
			Assert.assertEquals(true,false);
		}
	}

	@Test
	public void bandTestB() {
		try {
			Band band = new Band(new JSONObject());
			Assert.fail("the flow MUST have been fallen before");
		} catch (Exception e) {
			Assert.assertEquals(e.getClass(), InvalidParameterException.class);
			Assert.assertEquals(e.getMessage(), "json must have an id property");
		}
	}

	@Test
	public void bandTestC() {
		test.remove("name");
		test.remove("logo");
		Band band = new Band(test);
		Assert.assertEquals(band.id, 1);
		Assert.assertEquals(band.name, "");
		Assert.assertEquals(band.logo, "");
		Assert.assertEquals(band.song, "Song");
		Assert.assertEquals(band.votes, 10);
	}

	@Test
	@Ignore
	public void bandTestD() {
		Band band = new Band(test);
		Assert.assertEquals(test.toString(), band.toJSON().toString());
	}

	@Test
	public void bandTestE() {
		Band band = new Band(test);
		JSONObject tmp = new JSONObject();
		tmp.put("id", test.get("id"));
		tmp.put("votes", test.get("votes"));
		Assert.assertEquals(tmp.toString(), band.toJSONVotes().toString());
	}
}
