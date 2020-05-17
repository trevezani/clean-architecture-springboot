package br.com.trevezani.zipcode.core.usecase;

import java.sql.SQLException;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import br.com.trevezani.zipcode.core.ZipCode;
import br.com.trevezani.zipcode.core.exception.ZipCodeNotExistException;
import br.com.trevezani.zipcode.core.ports.ZipCodeRepositoryService;

public class GetZipInformationUseCaseImpl implements GetZipInformationUseCase {
	private final ZipCodeRepositoryService zipCodeRepositoryService;
	
	@Autowired
	public GetZipInformationUseCaseImpl(final ZipCodeRepositoryService zipCodeRepositoryService) {
		this.zipCodeRepositoryService = zipCodeRepositoryService;
	}	
	
	@Override
	public ZipCode execute(String zip) throws ZipCodeNotExistException, SQLException {
		final Optional<ZipCode> zipcode = zipCodeRepositoryService.findByZip(zip);
		
		return zipcode.map(this::mapZipCode).orElseThrow(() -> new ZipCodeNotExistException());
	}

	public ZipCode mapZipCode(ZipCode value) {
		return value;
	}
}