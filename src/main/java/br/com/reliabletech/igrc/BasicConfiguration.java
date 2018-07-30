package br.com.reliabletech.igrc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

import br.com.reliabletech.igrc.components.ApplicationInitializationComp;
import br.com.reliabletech.igrc.conf.AppMvcConfigs;
import br.com.reliabletech.igrc.controllers.MainController;
import br.com.reliabletech.igrc.converters.StringToDateConverter;
import br.com.reliabletech.igrc.models.Risk;
import br.com.reliabletech.igrc.repositories.RiskRepository;
import br.com.reliabletech.igrc.services.RiskService;

@SpringBootApplication(scanBasePackageClasses={AppMvcConfigs.class, MainController.class, Risk.class, RiskService.class, RiskRepository.class, ApplicationInitializationComp.class, StringToDateConverter.class})
public class BasicConfiguration extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(BasicConfiguration.class, args);
	}

}
