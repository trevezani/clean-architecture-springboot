module infraestructure {
	requires java.instrument;
	
	requires java.sql;
	requires org.slf4j;

	requires spring.core;
	requires spring.web;
	requires spring.beans;
	
	requires spring.boot;
	requires spring.boot.autoconfigure;
	requires spring.context;
	requires com.fasterxml.jackson.databind;

	requires core;
	
	exports br.com.trevezani.zipcode.infraestructure;
	exports br.com.trevezani.zipcode.infraestructure.configuration;
	exports br.com.trevezani.zipcode.infraestructure.delivery.responses;
	exports br.com.trevezani.zipcode.infraestructure.delivery.rest;
	
	opens br.com.trevezani.zipcode.infraestructure;
	opens br.com.trevezani.zipcode.infraestructure.configuration;
	opens br.com.trevezani.zipcode.infraestructure.delivery.impl;
}
