package br.com.reliabletech.igrc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.convert.threeten.Jsr310JpaConverters;

import br.com.reliabletech.igrc.components.ApplicationInitializationComp;
import br.com.reliabletech.igrc.conf.AppMvcConfigs;
import br.com.reliabletech.igrc.controllers.MainController;
import br.com.reliabletech.igrc.models.Risk;
import br.com.reliabletech.igrc.repositories.RiskRepository;
import br.com.reliabletech.igrc.services.RiskService;

@SpringBootApplication(scanBasePackageClasses={AppMvcConfigs.class, MainController.class, Risk.class, RiskService.class, RiskRepository.class, ApplicationInitializationComp.class, Jsr310JpaConverters.class})
public class BasicConfiguration {

	public static void main(String[] args) {
		SpringApplication.run(BasicConfiguration.class, args);
	}

}
