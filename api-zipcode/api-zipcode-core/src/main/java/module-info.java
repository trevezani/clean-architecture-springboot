module core {
	requires java.sql;
	requires spring.beans;
	requires spring.boot;

	exports br.com.trevezani.zipcode.core;
	exports br.com.trevezani.zipcode.core.ports;
	exports br.com.trevezani.zipcode.core.exception;
	exports br.com.trevezani.zipcode.core.usecase;	
}
