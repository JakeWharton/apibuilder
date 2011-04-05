package com.jakewharton.apibuilder;

import junit.framework.Assert;
import junit.framework.TestCase;

public class ApiBuilderTest extends TestCase {
	public void test_simple_field_replace() {
		final String out = new ApiBuilder("/test/{test}")
			.field("{test}", "hello")
			.buildUrl();
		
		Assert.assertEquals("/test/hello", out);
	}
	
	public void test_remove_blank_field() {
		final String out = new ApiBuilder("/test/{fname}/{lname}")
			.field("{fname}", "Jake")
			.buildUrl();
		
		Assert.assertEquals("/test/Jake/", out);
	}
	
	public void test_adjacent_fields() {
		final String out = new ApiBuilder("/test/{fname}{lname}")
			.field("{fname}", "Jake")
			.field("{lname}", "Wharton")
			.buildUrl();
		
		Assert.assertEquals("/test/JakeWharton", out);
	}
	
	public void test_url_encoding() {
		final String out = new ApiBuilder("/test/{test}")
			.field("{test}", ",:=`@")
			.buildUrl();
		
		Assert.assertFalse("/test/,:=`@".equals(out));
		Assert.assertEquals("/test/%2C%3A%3D%60%40", out);
	}
	
	public void test_has_field() {
		ApiBuilder builder = new ApiBuilder("")
			.field("{one}", "one")
			.field("{three}", "three");
		
		Assert.assertTrue(builder.hasField("{one}"));
		Assert.assertFalse(builder.hasField("{two}"));
		Assert.assertTrue(builder.hasField("{three}"));
		Assert.assertFalse(builder.hasField("{four}"));
	}
	
	public void test_has_parameter() {
		ApiBuilder builder = new ApiBuilder("")
			.parameter("one", "one")
			.parameter("three", "three");
	
		Assert.assertTrue(builder.hasParameter("one"));
		Assert.assertFalse(builder.hasParameter("two"));
		Assert.assertTrue(builder.hasParameter("three"));
		Assert.assertFalse(builder.hasParameter("four"));
	}
}
