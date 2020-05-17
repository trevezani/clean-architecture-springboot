module infraestructure {
	requires java.sql;
	requires org.slf4j;

	requires spring.web;
	requires spring.beans;
	
	requires spring.boot;
	requires spring.boot.autoconfigure;
	requires spring.context;
	requires com.fasterxml.jackson.databind;

	requires core;
}
