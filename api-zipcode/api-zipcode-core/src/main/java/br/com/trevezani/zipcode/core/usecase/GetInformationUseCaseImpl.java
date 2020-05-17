package br.com.trevezani.zipcode.core.usecase;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.info.BuildProperties;

import br.com.trevezani.zipcode.core.Info;

public class GetInformationUseCaseImpl implements GetInformationUseCase {
	private final BuildProperties buildProperties;
	
	@Autowired
	public GetInformationUseCaseImpl(final BuildProperties buildProperties) {
		this.buildProperties = buildProperties;
	}	

	@Override
	public Info execute() {
		return new Info(buildProperties.getName(), buildProperties.getVersion());
	}

}
