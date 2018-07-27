package br.com.reliabletech.igrc.components;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.reliabletech.igrc.models.Parameter;
import br.com.reliabletech.igrc.services.ParameterService;

@Component
public class ApplicationInitializationComp {

	@Autowired
	ParameterService parameterService;
	
	@PostConstruct
	public void initIGRCParameters(){
		
		if(parameterService.findByParamid("dbparamstd") == null){
			
			Parameter parameter5 = new Parameter();	
			parameter5.setParatype("ctrlfreq");
			parameter5.setParamid("ctrlfreq00");
			parameter5.setName("--- Unspecified");
			parameter5.setDescription("Empty value");
			parameter5.setKind("Combo value");
			parameter5.setVisible(true);
			parameter5.setEnabled(true);
			parameter5.setLanguage("EN");
			parameterService.save(parameter5);
			
			Parameter parameter6 = new Parameter();
			parameter6.setParatype("ctrlfreq");
			parameter6.setParamid("ctrlfreq01");
			parameter6.setName("On Demand");
			parameter6.setDescription("");
			parameter6.setKind("Combo value");
			parameter6.setVisible(true);
			parameter6.setEnabled(true);
			parameter6.setLanguage("EN");
			parameterService.save(parameter6);
			
			Parameter parameter7 = new Parameter();
			parameter7.setParatype("ctrlfreq");
			parameter7.setParamid("ctrlfreq02");
			parameter7.setName("Daily");
			parameter7.setDescription("");
			parameter7.setKind("Combo value");
			parameter7.setVisible(true);
			parameter7.setEnabled(true);
			parameter7.setLanguage("EN");
			parameterService.save(parameter7);

			Parameter parameter8 = new Parameter();
			parameter8.setParatype("ctrlfreq");
			parameter8.setParamid("ctrlfreq03");
			parameter8.setName("Weekly");
			parameter8.setDescription("");
			parameter8.setKind("Combo value");
			parameter8.setVisible(true);
			parameter8.setEnabled(true);
			parameter8.setLanguage("EN");
			parameterService.save(parameter8);
			
			Parameter parameter9 = new Parameter();
			parameter9.setParatype("ctrlfreq");
			parameter9.setParamid("ctrlfreq04");
			parameter9.setName("Monthly");
			parameter9.setDescription("");
			parameter9.setKind("Combo value");
			parameter9.setVisible(true);
			parameter9.setEnabled(true);
			parameter9.setLanguage("EN");
			parameterService.save(parameter9);
			
			Parameter parameter10 = new Parameter();
			parameter10.setParatype("ctrlfreq");
			parameter10.setParamid("ctrlfreq05");
			parameter10.setName("Quarterly");
			parameter10.setDescription("");
			parameter10.setKind("Combo value");
			parameter10.setVisible(true);
			parameter10.setEnabled(true);
			parameter10.setLanguage("EN");
			parameterService.save(parameter10);
			
			Parameter parameter11 = new Parameter();
			parameter11.setParatype("ctrlfreq");
			parameter11.setParamid("ctrlfreq06");
			parameter11.setName("Semiannually");
			parameter11.setDescription("");
			parameter11.setKind("Combo value");
			parameter11.setVisible(true);
			parameter11.setEnabled(true);
			parameter11.setLanguage("EN");
			parameterService.save(parameter11);
			
			Parameter parameter12 = new Parameter();
			parameter12.setParatype("ctrlfreq");
			parameter12.setParamid("ctrlfreq07");
			parameter12.setName("Annually");
			parameter12.setDescription("");
			parameter12.setKind("Combo value");
			parameter12.setVisible(true);
			parameter12.setEnabled(true);
			parameter12.setLanguage("EN");
			parameterService.save(parameter12);
			
			Parameter parameter13 = new Parameter();
			parameter13.setParatype("ctrlfreq");
			parameter13.setParamid("ctrlfreq08");
			parameter13.setName("Event Driven");
			parameter13.setDescription("");
			parameter13.setKind("Combo value");
			parameter13.setVisible(true);
			parameter13.setEnabled(true);
			parameter13.setLanguage("EN");
			parameterService.save(parameter13);
			
			Parameter parameter14 = new Parameter();
			parameter14.setParatype("ctrltype");
			parameter14.setParamid("ctrltype00");
			parameter14.setName("--- Unspecified");
			parameter14.setDescription("Empty value");
			parameter14.setKind("Combo value");
			parameter14.setVisible(true);
			parameter14.setEnabled(true);
			parameter14.setLanguage("EN");
			parameterService.save(parameter14);
			
			Parameter parameter15 = new Parameter();
			parameter15.setParatype("ctrltype");
			parameter15.setParamid("ctrltype01");
			parameter15.setName("Manual");
			parameter15.setDescription("");
			parameter15.setKind("Combo value");
			parameter15.setVisible(true);
			parameter15.setEnabled(true);
			parameter15.setLanguage("EN");
			parameterService.save(parameter15);
			
			Parameter parameter16 = new Parameter();
			parameter16.setParatype("ctrltype");
			parameter16.setParamid("ctrltype02");
			parameter16.setName("Automatic");
			parameter16.setDescription("");
			parameter16.setKind("Combo value");
			parameter16.setVisible(true);
			parameter16.setEnabled(true);
			parameter16.setLanguage("EN");
			parameterService.save(parameter16);
			
			Parameter parameter17 = new Parameter();
			parameter17.setParatype("ctrltype");
			parameter17.setParamid("ctrltype03");
			parameter17.setName("IT Managed");
			parameter17.setDescription("");
			parameter17.setKind("Combo value");
			parameter17.setVisible(true);
			parameter17.setEnabled(true);
			parameter17.setLanguage("EN");
			parameterService.save(parameter17);
			
			Parameter parameter18 = new Parameter();	
			parameter18.setParatype("stdfreq");
			parameter18.setParamid("stdfreq00");
			parameter18.setName("--- Unspecified");
			parameter18.setDescription("Empty value");
			parameter18.setKind("Combo value");
			parameter18.setVisible(true);
			parameter18.setEnabled(true);
			parameter18.setLanguage("EN");
			parameterService.save(parameter18);
			
			Parameter parameter19 = new Parameter();
			parameter19.setParatype("stdfreq");
			parameter19.setParamid("stdfreq01");
			parameter19.setName("On Demand");
			parameter19.setDescription("");
			parameter19.setKind("Combo value");
			parameter19.setVisible(true);
			parameter19.setEnabled(true);
			parameter19.setLanguage("EN");
			parameterService.save(parameter19);
			
			Parameter parameter20 = new Parameter();
			parameter20.setParatype("stdfreq");
			parameter20.setParamid("stdfreq02");
			parameter20.setName("Daily");
			parameter20.setDescription("");
			parameter20.setKind("Combo value");
			parameter20.setVisible(true);
			parameter20.setEnabled(true);
			parameter20.setLanguage("EN");
			parameterService.save(parameter20);

			Parameter parameter21 = new Parameter();
			parameter21.setParatype("stdfreq");
			parameter21.setParamid("stdfreq03");
			parameter21.setName("Weekly");
			parameter21.setDescription("");
			parameter21.setKind("Combo value");
			parameter21.setVisible(true);
			parameter21.setEnabled(true);
			parameter21.setLanguage("EN");
			parameterService.save(parameter21);
			
			Parameter parameter22 = new Parameter();
			parameter22.setParatype("stdfreq");
			parameter22.setParamid("stdfreq04");
			parameter22.setName("Monthly");
			parameter22.setDescription("");
			parameter22.setKind("Combo value");
			parameter22.setVisible(true);
			parameter22.setEnabled(true);
			parameter22.setLanguage("EN");
			parameterService.save(parameter22);
			
			Parameter parameter23 = new Parameter();
			parameter23.setParatype("stdfreq");
			parameter23.setParamid("stdfreq05");
			parameter23.setName("Quarterly");
			parameter23.setDescription("");
			parameter23.setKind("Combo value");
			parameter23.setVisible(true);
			parameter23.setEnabled(true);
			parameter23.setLanguage("EN");
			parameterService.save(parameter23);
			
			Parameter parameter24 = new Parameter();
			parameter24.setParatype("stdfreq");
			parameter24.setParamid("stdfreq06");
			parameter24.setName("Semiannually");
			parameter24.setDescription("");
			parameter24.setKind("Combo value");
			parameter24.setVisible(true);
			parameter24.setEnabled(true);
			parameter24.setLanguage("EN");
			parameterService.save(parameter24);
			
			Parameter parameter25 = new Parameter();
			parameter25.setParatype("stdfreq");
			parameter25.setParamid("stdfreq07");
			parameter25.setName("Annually");
			parameter25.setDescription("");
			parameter25.setKind("Combo value");
			parameter25.setVisible(true);
			parameter25.setEnabled(true);
			parameter25.setLanguage("EN");
			parameterService.save(parameter25);
			
			Parameter parameter26 = new Parameter();
			parameter26.setParatype("stdfreq");
			parameter26.setParamid("stdfreq08");
			parameter26.setName("Event Driven");
			parameter26.setDescription("");
			parameter26.setKind("Combo value");
			parameter26.setVisible(true);
			parameter26.setEnabled(true);
			parameter26.setLanguage("EN");
			parameterService.save(parameter26);			
			
			Parameter parameter27 = new Parameter();
			parameter27.setParatype("defenseline");
			parameter27.setParamid("defline00");
			parameter27.setName("--- Unspecified");
			parameter27.setDescription("Empty value");
			parameter27.setKind("Combo value");
			parameter27.setVisible(true);
			parameter27.setEnabled(true);
			parameter27.setLanguage("EN");
			parameterService.save(parameter27);			
			
			Parameter parameter28 = new Parameter();
			parameter28.setParatype("defenseline");
			parameter28.setParamid("defline01");
			parameter28.setName("First Defense Line (Owner)");
			parameter28.setDescription("");
			parameter28.setKind("Combo value");
			parameter28.setVisible(true);
			parameter28.setEnabled(true);
			parameter28.setLanguage("EN");
			parameterService.save(parameter28);			
			
			Parameter parameter29 = new Parameter();
			parameter29.setParatype("defenseline");
			parameter29.setParamid("defline02");
			parameter29.setName("Second Defense Line (Internal Compliance)");
			parameter29.setDescription("");
			parameter29.setKind("Combo value");
			parameter29.setVisible(true);
			parameter29.setEnabled(true);
			parameter29.setLanguage("EN");
			parameterService.save(parameter29);			

			Parameter parameter30 = new Parameter();
			parameter30.setParatype("defenseline");
			parameter30.setParamid("defline03");
			parameter30.setName("Third Defense Line (Internal/External Audit)");
			parameter30.setDescription("");
			parameter30.setKind("Combo value");
			parameter30.setVisible(true);
			parameter30.setEnabled(true);
			parameter30.setLanguage("EN");
			parameterService.save(parameter30);			
			
			Parameter parameter31 = new Parameter();
			parameter31.setParatype("probab");
			parameter31.setParamid("probab00");
			parameter31.setName("--- Unspecified");
			parameter31.setDescription("Empty value");
			parameter31.setKind("Combo value");
			parameter31.setVisible(true);
			parameter31.setEnabled(true);
			parameter31.setLanguage("EN");
			parameterService.save(parameter31);			
			
			Parameter parameter32 = new Parameter();
			parameter32.setParatype("probab");
			parameter32.setParamid("probab01");
			parameter32.setName("Rare/Remote");
			parameter32.setDescription("");
			parameter32.setKind("Combo value");
			parameter32.setVisible(true);
			parameter32.setEnabled(true);
			parameter32.setLanguage("EN");
			parameterService.save(parameter32);			
			
			Parameter parameter33 = new Parameter();
			parameter33.setParatype("probab");
			parameter33.setParamid("probab02");
			parameter33.setName("Moderate");
			parameter33.setDescription("");
			parameter33.setKind("Combo value");
			parameter33.setVisible(true);
			parameter33.setEnabled(true);
			parameter33.setLanguage("EN");
			parameterService.save(parameter33);			
			
			Parameter parameter34 = new Parameter();
			parameter34.setParatype("probab");
			parameter34.setParamid("probab03");
			parameter34.setName("Likely");
			parameter34.setDescription("");
			parameter34.setKind("Combo value");
			parameter34.setVisible(true);
			parameter34.setEnabled(true);
			parameter34.setLanguage("EN");
			parameterService.save(parameter34);			
			
			Parameter parameter35 = new Parameter();
			parameter35.setParatype("probab");
			parameter35.setParamid("probab04");
			parameter35.setName("Almost Certain");
			parameter35.setDescription("");
			parameter35.setKind("Combo value");
			parameter35.setVisible(true);
			parameter35.setEnabled(true);
			parameter35.setLanguage("EN");
			parameterService.save(parameter35);			
			
			Parameter parameter36 = new Parameter();
			parameter36.setParatype("qldamage");
			parameter36.setParamid("qldamage00");
			parameter36.setName("--- Unspecified");
			parameter36.setDescription("Empty value");
			parameter36.setKind("Combo value");
			parameter36.setVisible(true);
			parameter36.setEnabled(true);
			parameter36.setLanguage("EN");
			parameterService.save(parameter36);				
			
			Parameter parameter37 = new Parameter();
			parameter37.setParatype("qldamage");
			parameter37.setParamid("qldamage01");
			parameter37.setName("Insignificant");
			parameter37.setDescription("");
			parameter37.setKind("Combo value");
			parameter37.setVisible(true);
			parameter37.setEnabled(true);
			parameter37.setLanguage("EN");
			parameterService.save(parameter37);			

			Parameter parameter38 = new Parameter();
			parameter38.setParatype("qldamage");
			parameter38.setParamid("qldamage02");
			parameter38.setName("Low");
			parameter38.setDescription("");
			parameter38.setKind("Combo value");
			parameter38.setVisible(true);
			parameter38.setEnabled(true);
			parameter38.setLanguage("EN");
			parameterService.save(parameter38);			
			
			Parameter parameter39 = new Parameter();
			parameter39.setParatype("qldamage");
			parameter39.setParamid("qldamage02");
			parameter39.setName("Average");
			parameter39.setDescription("");
			parameter39.setKind("Combo value");
			parameter39.setVisible(true);
			parameter39.setEnabled(true);
			parameter39.setLanguage("EN");
			parameterService.save(parameter39);			
			
			Parameter parameter40 = new Parameter();
			parameter40.setParatype("qldamage");
			parameter40.setParamid("qldamage03");
			parameter40.setName("High");
			parameter40.setDescription("");
			parameter40.setKind("Combo value");
			parameter40.setVisible(true);
			parameter40.setEnabled(true);
			parameter40.setLanguage("EN");
			parameterService.save(parameter40);			
			
			Parameter parameter41 = new Parameter();
			parameter41.setParatype("qldamage");
			parameter41.setParamid("qldamage04");
			parameter41.setName("Catastrophic");
			parameter41.setDescription("");
			parameter41.setKind("Combo value");
			parameter41.setVisible(true);
			parameter41.setEnabled(true);
			parameter41.setLanguage("EN");
			parameterService.save(parameter41);			
			
			Parameter parameter42 = new Parameter();
			parameter42.setParatype("trendopt");
			parameter42.setParamid("trendopt00");
			parameter42.setName("--- Unspecified");
			parameter42.setDescription("Empty value");
			parameter42.setKind("Combo value");
			parameter42.setVisible(true);
			parameter42.setEnabled(true);
			parameter42.setLanguage("EN");
			parameterService.save(parameter42);				
			
			Parameter parameter43 = new Parameter();
			parameter43.setParatype("trendopt");
			parameter43.setParamid("trendopt01");
			parameter43.setName("Will be worst fast");
			parameter43.setDescription("");
			parameter43.setKind("Combo value");
			parameter43.setVisible(true);
			parameter43.setEnabled(true);
			parameter43.setLanguage("EN");
			parameterService.save(parameter43);			

			Parameter parameter44 = new Parameter();
			parameter44.setParatype("trendopt");
			parameter44.setParamid("trendopt02");
			parameter44.setName("Will be worst in short-term");
			parameter44.setDescription("");
			parameter44.setKind("Combo value");
			parameter44.setVisible(true);
			parameter44.setEnabled(true);
			parameter44.setLanguage("EN");
			parameterService.save(parameter44);			
			
			Parameter parameter45 = new Parameter();
			parameter45.setParatype("trendopt");
			parameter45.setParamid("trendopt03");
			parameter45.setName("Will be worst in mid-term");
			parameter45.setDescription("");
			parameter45.setKind("Combo value");
			parameter45.setVisible(true);
			parameter45.setEnabled(true);
			parameter45.setLanguage("EN");
			parameterService.save(parameter45);			
			
			Parameter parameter46 = new Parameter();
			parameter46.setParatype("trendopt");
			parameter46.setParamid("trendopt04");
			parameter46.setName("Will be worst in long-term");
			parameter46.setDescription("");
			parameter46.setKind("Combo value");
			parameter46.setVisible(true);
			parameter46.setEnabled(true);
			parameter46.setLanguage("EN");
			parameterService.save(parameter46);			
			
			Parameter parameter47 = new Parameter();
			parameter47.setParatype("trendopt");
			parameter47.setParamid("trendopt05");
			parameter47.setName("Will not change");
			parameter47.setDescription("");
			parameter47.setKind("Combo value");
			parameter47.setVisible(true);
			parameter47.setEnabled(true);
			parameter47.setLanguage("EN");
			parameterService.save(parameter47);			
			
			Parameter parameter48 = new Parameter();	
			parameter48.setParatype("ctrlclass");
			parameter48.setParamid("ctrlclass00");
			parameter48.setName("--- Unspecified");
			parameter48.setDescription("Empty value");
			parameter48.setKind("Combo value");
			parameter48.setVisible(true);
			parameter48.setEnabled(true);
			parameter48.setLanguage("EN");
			parameterService.save(parameter48);
			
			Parameter parameter49 = new Parameter();		
			parameter49.setParamid("ctrlclass01");
			parameter49.setParatype("ctrlclass");
			parameter49.setName("Predictive");
			parameter49.setDescription("");
			parameter49.setKind("Combo value");
			parameter49.setVisible(true);
			parameter49.setEnabled(true);
			parameter49.setLanguage("EN");
			parameterService.save(parameter49);
			
			Parameter parameter50 = new Parameter();	
			parameter50.setParatype("ctrlclass");
			parameter50.setParamid("ctrlclass02");
			parameter50.setName("Preventive");
			parameter50.setDescription("");
			parameter50.setKind("Combo value");
			parameter50.setVisible(true);
			parameter50.setEnabled(true);
			parameter50.setLanguage("EN");
			parameterService.save(parameter50);
			
			Parameter parameter51 = new Parameter();	
			parameter51.setParatype("ctrlclass");
			parameter51.setParamid("ctrlclass02");
			parameter51.setName("Corrective");
			parameter51.setDescription("");
			parameter51.setKind("Combo value");
			parameter51.setVisible(true);
			parameter51.setEnabled(true);
			parameter51.setLanguage("EN");
			parameterService.save(parameter51);
			
			
			//Não edite este bloco!
			Parameter parameterz = new Parameter();		
			parameterz.setParamid("dbparamstd");
			parameterz.setParatype("std_init");
			parameterz.setName("Standard Parameter Table");
			parameterz.setDescription("Standard parameter to check if the table is fulfilled.");
			parameterz.setVisible(false);
			parameterz.setEnabled(true);
			parameterz.setLanguage("EN");
			parameterz.setKind("System Check");
			parameterService.save(parameterz);
			
			
		}
		
	}
	
}
