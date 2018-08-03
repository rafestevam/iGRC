package br.com.reliabletech.igrc.components;
//package br.com.reliabletech.igrc.components;
//
//import java.util.HashMap;
//import java.util.Map;
//
//import javax.annotation.PostConstruct;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Component;
//
//import br.com.reliabletech.igrc.models.Parameter;
//import br.com.reliabletech.igrc.models.ParametersEnum;
//import br.com.reliabletech.igrc.services.ParameterService;
//
//@Component
//public class ApplicationInitializationComp {
//	
//	@Autowired
//	ParameterService parameterService;
//	
//	@PostConstruct
//	public void initIGRCParameters(){
//		
//		if(parameterService.findByParamid("dbparamstd") == null){
//
//			Map<String, Object> paramMap = new HashMap<>();
//			Map<ParametersEnum, Object> paramValues = new HashMap<>();
//		
//			paramValues.put(ParametersEnum.NAME, "--- Unspecified");
//			paramValues.put(ParametersEnum.DESCRIPTION, "Empty value");
//			paramValues.put(ParametersEnum.PARAMID, "ctrlfreq00");
//			paramValues.put(ParametersEnum.KIND, "Combo value");
//			paramValues.put(ParametersEnum.VISIBLE, true);
//			paramValues.put(ParametersEnum.ENABLED, true);
//			paramValues.put(ParametersEnum.LANGUAGE, "EN");
//			paramValues.put(ParametersEnum.PARATYPE, "ctrlfreq");
//	
//			 paramValues.put(ParametersEnum.PARAMID, "ctrlfreq01");
//			 paramValues.put(ParametersEnum.NAME, "On Demand");
//			 paramValues.put(ParametersEnum.DESCRIPTION, "");
//			 paramValues.put(ParametersEnum.KIND, "Combo value");
//			 paramValues.put(ParametersEnum.VISIBLE, true);
//			 paramValues.put(ParametersEnum.ENABLED, true);
//			 paramValues.put(ParametersEnum.LANGUAGE, "EN");
//			 paramValues.put(ParametersEnum.PARATYPE, "ctrlfreq");
//			
//			 paramValues.put(ParametersEnum.PARAMID, "ctrlfreq02");
//			 paramValues.put(ParametersEnum.NAME, "Daily");
//			 paramValues.put(ParametersEnum.DESCRIPTION, "");
//			 paramValues.put(ParametersEnum.KIND, "Combo value");
//			 paramValues.put(ParametersEnum.VISIBLE, true);
//			 paramValues.put(ParametersEnum.ENABLED, true);
//			 paramValues.put(ParametersEnum.LANGUAGE, "EN");
//			 paramValues.put(ParametersEnum.PARATYPE, "ctrlfreq");
//
//			 paramValues.put(ParametersEnum.PARAMID, "ctrlfreq03");
//			 paramValues.put(ParametersEnum.NAME, "Weekly");
//			 paramValues.put(ParametersEnum.DESCRIPTION, "");
//			 paramValues.put(ParametersEnum.KIND, "Combo value");
//			 paramValues.put(ParametersEnum.VISIBLE, true);
//			 paramValues.put(ParametersEnum.ENABLED, true);
//			 paramValues.put(ParametersEnum.LANGUAGE, "EN");
//			 paramValues.put(ParametersEnum.PARATYPE, "ctrlfreq");
//			
//			 paramValues.put(ParametersEnum.PARAMID, "ctrlfreq04");
//			 paramValues.put(ParametersEnum.NAME, "Monthly");
//			 paramValues.put(ParametersEnum.DESCRIPTION, "");
//			 paramValues.put(ParametersEnum.KIND, "Combo value");
//			 paramValues.put(ParametersEnum.VISIBLE, true);
//			 paramValues.put(ParametersEnum.ENABLED, true);
//			 paramValues.put(ParametersEnum.LANGUAGE, "EN");
//			 paramValues.put(ParametersEnum.PARATYPE, "ctrlfreq");
//			
//			 paramValues.put(ParametersEnum.PARAMID, "ctrlfreq05");
//			 paramValues.put(ParametersEnum.NAME, "Quarterly");
//			 paramValues.put(ParametersEnum.DESCRIPTION, "");
//			 paramValues.put(ParametersEnum.KIND, "Combo value");
//			 paramValues.put(ParametersEnum.VISIBLE, true);
//			 paramValues.put(ParametersEnum.ENABLED, true);
//			 paramValues.put(ParametersEnum.LANGUAGE, "EN");
//			 paramValues.put(ParametersEnum.PARATYPE, "ctrlfreq");
//			
//			 paramValues.put(ParametersEnum.PARAMID, "ctrlfreq06");
//			 paramValues.put(ParametersEnum.NAME, "Semiannually");
//			 paramValues.put(ParametersEnum.DESCRIPTION, "");
//			 paramValues.put(ParametersEnum.KIND, "Combo value");
//			 paramValues.put(ParametersEnum.VISIBLE, true);
//			 paramValues.put(ParametersEnum.ENABLED, true);
//			 paramValues.put(ParametersEnum.LANGUAGE, "EN");
//			 paramValues.put(ParametersEnum.PARATYPE, "ctrlfreq");
//			
//			 paramValues.put(ParametersEnum.PARAMID, "ctrlfreq07");
//			 paramValues.put(ParametersEnum.NAME, "Annually");
//			 paramValues.put(ParametersEnum.DESCRIPTION, "");
//			 paramValues.put(ParametersEnum.KIND, "Combo value");
//			 paramValues.put(ParametersEnum.VISIBLE, true);
//			 paramValues.put(ParametersEnum.ENABLED, true);
//			 paramValues.put(ParametersEnum.LANGUAGE, "EN");
//			 paramValues.put(ParametersEnum.PARATYPE, "ctrlfreq");
//			 paramMap.put("ctrlfreq", paramValues);			
//			
//			 paramValues.put(ParametersEnum.PARAMID, "ctrlfreq08");
//			 paramValues.put(ParametersEnum.NAME, "Event Driven");
//			 paramValues.put(ParametersEnum.DESCRIPTION, "");
//			 paramValues.put(ParametersEnum.KIND, "Combo value");
//			 paramValues.put(ParametersEnum.VISIBLE, true);
//			 paramValues.put(ParametersEnum.ENABLED, true);
//			 paramValues.put(ParametersEnum.LANGUAGE, "EN");
//			 paramValues.put(ParametersEnum.PARATYPE, "ctrlfreq");
//			 paramMap.put("ctrlfreq", paramValues);			
//			
//			 paramValues.put(ParametersEnum.PARAMID, "ctrltype00");
//			 paramValues.put(ParametersEnum.NAME, "--- Unspecified");
//			 paramValues.put(ParametersEnum.DESCRIPTION, "Empty value");
//			 paramValues.put(ParametersEnum.KIND, "Combo value");
//			 paramValues.put(ParametersEnum.VISIBLE, true);
//			 paramValues.put(ParametersEnum.ENABLED, true);
//			 paramValues.put(ParametersEnum.LANGUAGE, "EN");
//			 paramValues.put(ParametersEnum.PARATYPE, "ctrlfreq");
//			 paramMap.put("ctrltype", paramValues);
//			
//			 paramValues.put(ParametersEnum.PARAMID, "ctrltype01");
//			 paramValues.put(ParametersEnum.NAME, "Manual");
//			 paramValues.put(ParametersEnum.DESCRIPTION, "");
//			 paramValues.put(ParametersEnum.KIND, "Combo value");
//			 paramValues.put(ParametersEnum.VISIBLE, true);
//			 paramValues.put(ParametersEnum.ENABLED, true);
//			 paramValues.put(ParametersEnum.LANGUAGE, "EN");
//			 paramValues.put(ParametersEnum.PARATYPE, "ctrlfreq");
//			 paramMap.put("ctrltype", paramValues);			
//			
//			 paramValues.put(ParametersEnum.PARAMID, "ctrltype02");
//			 paramValues.put(ParametersEnum.NAME, "Automatic");
//			 paramValues.put(ParametersEnum.DESCRIPTION, "");
//			 paramValues.put(ParametersEnum.KIND, "Combo value");
//			 paramValues.put(ParametersEnum.VISIBLE, true);
//			 paramValues.put(ParametersEnum.ENABLED, true);
//			 paramValues.put(ParametersEnum.LANGUAGE, "EN");
//			 paramValues.put(ParametersEnum.PARATYPE, "ctrlfreq");
//			 paramMap.put("ctrltype", paramValues);			
//			
//			 paramValues.put(ParametersEnum.PARAMID, "ctrltype03");
//			 paramValues.put(ParametersEnum.NAME, "IT Managed");
//			 paramValues.put(ParametersEnum.DESCRIPTION, "");
//			 paramValues.put(ParametersEnum.KIND, "Combo value");
//			 paramValues.put(ParametersEnum.VISIBLE, true);
//			 paramValues.put(ParametersEnum.ENABLED, true);
//			 paramValues.put(ParametersEnum.LANGUAGE, "EN");
//			 paramValues.put(ParametersEnum.PARATYPE, "ctrlfreq");
//			 paramMap.put("ctrltype", paramValues);			
//			
//			 paramValues.put(ParametersEnum.PARAMID, "stdfreq00");
//			 paramValues.put(ParametersEnum.NAME, "--- Unspecified");
//			 paramValues.put(ParametersEnum.DESCRIPTION, "Empty value");
//			 paramValues.put(ParametersEnum.KIND, "Combo value");
//			 paramValues.put(ParametersEnum.VISIBLE, true);
//			 paramValues.put(ParametersEnum.ENABLED, true);
//			 paramValues.put(ParametersEnum.LANGUAGE, "EN");
//			 paramValues.put(ParametersEnum.PARATYPE, "stdfreq");
//			
//			 paramValues.put(ParametersEnum.PARAMID, "stdfreq01");
//			 paramValues.put(ParametersEnum.NAME, "On Demand");
//			 paramValues.put(ParametersEnum.DESCRIPTION, "");
//			 paramValues.put(ParametersEnum.KIND, "Combo value");
//			 paramValues.put(ParametersEnum.VISIBLE, true);
//			 paramValues.put(ParametersEnum.ENABLED, true);
//			 paramValues.put(ParametersEnum.LANGUAGE, "EN");
//			 paramValues.put(ParametersEnum.PARATYPE, "stdfreq");
//			
//			 paramValues.put(ParametersEnum.PARAMID, "stdfreq02");
//			 paramValues.put(ParametersEnum.NAME, "Daily");
//			 paramValues.put(ParametersEnum.DESCRIPTION, "");
//			 paramValues.put(ParametersEnum.KIND, "Combo value");
//			 paramValues.put(ParametersEnum.VISIBLE, true);
//			 paramValues.put(ParametersEnum.ENABLED, true);
//			 paramValues.put(ParametersEnum.LANGUAGE, "EN");
//			 paramValues.put(ParametersEnum.PARATYPE, "stdfreq");
//
//			 paramValues.put(ParametersEnum.PARAMID, "stdfreq03");
//			 paramValues.put(ParametersEnum.NAME, "Weekly");
//			 paramValues.put(ParametersEnum.DESCRIPTION, "");
//			 paramValues.put(ParametersEnum.KIND, "Combo value");
//			 paramValues.put(ParametersEnum.VISIBLE, true);
//			 paramValues.put(ParametersEnum.ENABLED, true);
//			 paramValues.put(ParametersEnum.LANGUAGE, "EN");
//			 paramValues.put(ParametersEnum.PARATYPE, "stdfreq");
//			
//			 paramValues.put(ParametersEnum.PARAMID, "stdfreq04");
//			 paramValues.put(ParametersEnum.NAME, "Monthly");
//			 paramValues.put(ParametersEnum.DESCRIPTION, "");
//			 paramValues.put(ParametersEnum.KIND, "Combo value");
//			 paramValues.put(ParametersEnum.VISIBLE, true);
//			 paramValues.put(ParametersEnum.ENABLED, true);
//			 paramValues.put(ParametersEnum.LANGUAGE, "EN");
//			 paramValues.put(ParametersEnum.PARATYPE, "stdfreq");
//			
//			 paramValues.put(ParametersEnum.PARAMID, "stdfreq05");
//			 paramValues.put(ParametersEnum.NAME, "Quarterly");
//			 paramValues.put(ParametersEnum.DESCRIPTION, "");
//			 paramValues.put(ParametersEnum.KIND, "Combo value");
//			 paramValues.put(ParametersEnum.VISIBLE, true);
//			 paramValues.put(ParametersEnum.ENABLED, true);
//			 paramValues.put(ParametersEnum.LANGUAGE, "EN");
//			 paramValues.put(ParametersEnum.PARATYPE, "stdfreq");
//			
//			 paramValues.put(ParametersEnum.PARAMID, "stdfreq06");
//			 paramValues.put(ParametersEnum.NAME, "Semiannually");
//			 paramValues.put(ParametersEnum.DESCRIPTION, "");
//			 paramValues.put(ParametersEnum.KIND, "Combo value");
//			 paramValues.put(ParametersEnum.VISIBLE, true);
//			 paramValues.put(ParametersEnum.ENABLED, true);
//			 paramValues.put(ParametersEnum.LANGUAGE, "EN");
//			 paramValues.put(ParametersEnum.PARATYPE, "stdfreq");
//			
//			 paramValues.put(ParametersEnum.PARAMID, "stdfreq07");
//			 paramValues.put(ParametersEnum.NAME, "Annually");
//			 paramValues.put(ParametersEnum.DESCRIPTION, "");
//			 paramValues.put(ParametersEnum.KIND, "Combo value");
//			 paramValues.put(ParametersEnum.VISIBLE, true);
//			 paramValues.put(ParametersEnum.ENABLED, true);
//			 paramValues.put(ParametersEnum.LANGUAGE, "EN");
//			 paramValues.put(ParametersEnum.PARATYPE, "stdfreq");
//			
//			 paramValues.put(ParametersEnum.PARAMID, "stdfreq08");
//			 paramValues.put(ParametersEnum.NAME, "Event Driven");
//			 paramValues.put(ParametersEnum.DESCRIPTION, "");
//			 paramValues.put(ParametersEnum.KIND, "Combo value");
//			 paramValues.put(ParametersEnum.VISIBLE, true);
//			 paramValues.put(ParametersEnum.ENABLED, true);
//			 paramValues.put(ParametersEnum.LANGUAGE, "EN");
//			 paramValues.put(ParametersEnum.PARATYPE, "stdfreq");
//			
//			 paramValues.put(ParametersEnum.PARAMID, "defline00");
//			 paramValues.put(ParametersEnum.NAME, "--- Unspecified");
//			 paramValues.put(ParametersEnum.DESCRIPTION, "Empty value");
//			 paramValues.put(ParametersEnum.KIND, "Combo value");
//			 paramValues.put(ParametersEnum.VISIBLE, true);
//			 paramValues.put(ParametersEnum.ENABLED, true);
//			 paramValues.put(ParametersEnum.LANGUAGE, "EN");
//			 paramValues.put(ParametersEnum.PARATYPE, "defenseline");
//			
//			 paramValues.put(ParametersEnum.PARAMID, "defline01");
//			 paramValues.put(ParametersEnum.NAME, "First Defense Line (Owner)");
//			 paramValues.put(ParametersEnum.DESCRIPTION, "");
//			 paramValues.put(ParametersEnum.KIND, "Combo value");
//			 paramValues.put(ParametersEnum.VISIBLE, true);
//			 paramValues.put(ParametersEnum.ENABLED, true);
//			 paramValues.put(ParametersEnum.LANGUAGE, "EN");
//			 paramValues.put(ParametersEnum.PARATYPE, "defenseline");
//			
//			 paramValues.put(ParametersEnum.PARAMID, "defline02");
//			 paramValues.put(ParametersEnum.NAME, "Second Defense Line (Internal Compliance)");
//			 paramValues.put(ParametersEnum.DESCRIPTION, "");
//			 paramValues.put(ParametersEnum.KIND, "Combo value");
//			 paramValues.put(ParametersEnum.VISIBLE, true);
//			 paramValues.put(ParametersEnum.ENABLED, true);
//			 paramValues.put(ParametersEnum.LANGUAGE, "EN");
//			 paramValues.put(ParametersEnum.PARATYPE, "defenseline");
//
//			 paramValues.put(ParametersEnum.PARAMID, "defline03");
//			 paramValues.put(ParametersEnum.NAME, "Third Defense Line (Internal/External Audit)");
//			 paramValues.put(ParametersEnum.DESCRIPTION, "");
//			 paramValues.put(ParametersEnum.KIND, "Combo value");
//			 paramValues.put(ParametersEnum.VISIBLE, true);
//			 paramValues.put(ParametersEnum.ENABLED, true);
//			 paramValues.put(ParametersEnum.LANGUAGE, "EN");
//			 paramValues.put(ParametersEnum.PARATYPE, "defenseline");
//			
//			 paramValues.put(ParametersEnum.PARAMID, "probab00");
//			 paramValues.put(ParametersEnum.NAME, "--- Unspecified");
//			 paramValues.put(ParametersEnum.DESCRIPTION, "Empty value");
//			 paramValues.put(ParametersEnum.KIND, "Combo value");
//			 paramValues.put(ParametersEnum.VISIBLE, true);
//			 paramValues.put(ParametersEnum.ENABLED, true);
//			 paramValues.put(ParametersEnum.LANGUAGE, "EN");
//			 paramValues.put(ParametersEnum.PARATYPE, "probab");
//			
//			 paramValues.put(ParametersEnum.PARAMID, "probab01");
//			 paramValues.put(ParametersEnum.NAME, "Rare/Remote");
//			 paramValues.put(ParametersEnum.DESCRIPTION, "");
//			 paramValues.put(ParametersEnum.KIND, "Combo value");
//			 paramValues.put(ParametersEnum.VISIBLE, true);
//			 paramValues.put(ParametersEnum.ENABLED, true);
//			 paramValues.put(ParametersEnum.LANGUAGE, "EN");
//			 paramValues.put(ParametersEnum.PARATYPE, "probab");
//			
//			 paramValues.put(ParametersEnum.PARAMID, "probab02");
//			 paramValues.put(ParametersEnum.NAME, "Moderate");
//			 paramValues.put(ParametersEnum.DESCRIPTION, "");
//			 paramValues.put(ParametersEnum.KIND, "Combo value");
//			 paramValues.put(ParametersEnum.VISIBLE, true);
//			 paramValues.put(ParametersEnum.ENABLED, true);
//			 paramValues.put(ParametersEnum.LANGUAGE, "EN");
//			 paramValues.put(ParametersEnum.PARATYPE, "probab");
//			
//			 paramValues.put(ParametersEnum.PARAMID, "probab03");
//			 paramValues.put(ParametersEnum.NAME, "Likely");
//			 paramValues.put(ParametersEnum.DESCRIPTION, "");
//			 paramValues.put(ParametersEnum.KIND, "Combo value");
//			 paramValues.put(ParametersEnum.VISIBLE, true);
//			 paramValues.put(ParametersEnum.ENABLED, true);
//			 paramValues.put(ParametersEnum.LANGUAGE, "EN");
//			 paramValues.put(ParametersEnum.PARATYPE, "probab");
//			
//			 paramValues.put(ParametersEnum.PARAMID, "probab04");
//			 paramValues.put(ParametersEnum.NAME, "Almost Certain");
//			 paramValues.put(ParametersEnum.DESCRIPTION, "");
//			 paramValues.put(ParametersEnum.KIND, "Combo value");
//			 paramValues.put(ParametersEnum.VISIBLE, true);
//			 paramValues.put(ParametersEnum.ENABLED, true);
//			 paramValues.put(ParametersEnum.LANGUAGE, "EN");
//			 paramValues.put(ParametersEnum.PARATYPE, "probab");
//			 
//			 paramValues.put(ParametersEnum.PARAMID, "qldamage00");
//			 paramValues.put(ParametersEnum.NAME, "--- Unspecified");
//			 paramValues.put(ParametersEnum.DESCRIPTION, "Empty value");
//			 paramValues.put(ParametersEnum.KIND, "Combo value");
//			 paramValues.put(ParametersEnum.VISIBLE, true);
//			 paramValues.put(ParametersEnum.ENABLED, true);
//			 paramValues.put(ParametersEnum.LANGUAGE, "EN");
//			 paramValues.put(ParametersEnum.PARATYPE, "qldamage");
//			
//			 paramValues.put(ParametersEnum.PARAMID, "qldamage01");
//			 paramValues.put(ParametersEnum.NAME, "Insignificant");
//			 paramValues.put(ParametersEnum.DESCRIPTION, "");
//			 paramValues.put(ParametersEnum.KIND, "Combo value");
//			 paramValues.put(ParametersEnum.VISIBLE, true);
//			 paramValues.put(ParametersEnum.ENABLED, true);
//			 paramValues.put(ParametersEnum.LANGUAGE, "EN");
//			 paramValues.put(ParametersEnum.PARATYPE, "qldamage");
//			 
//			 paramValues.put(ParametersEnum.PARAMID, "qldamage02");
//			 paramValues.put(ParametersEnum.NAME, "Low");
//			 paramValues.put(ParametersEnum.DESCRIPTION, "");
//			 paramValues.put(ParametersEnum.KIND, "Combo value");
//			 paramValues.put(ParametersEnum.VISIBLE, true);
//			 paramValues.put(ParametersEnum.ENABLED, true);
//			 paramValues.put(ParametersEnum.LANGUAGE, "EN");
//			 paramValues.put(ParametersEnum.PARATYPE, "qldamage");
//			 
//			 paramValues.put(ParametersEnum.PARAMID, "qldamage02");
//			 paramValues.put(ParametersEnum.NAME, "Average");
//			 paramValues.put(ParametersEnum.DESCRIPTION, "");
//			 paramValues.put(ParametersEnum.KIND, "Combo value");
//			 paramValues.put(ParametersEnum.VISIBLE, true);
//			 paramValues.put(ParametersEnum.ENABLED, true);
//			 paramValues.put(ParametersEnum.LANGUAGE, "EN");
//			 paramValues.put(ParametersEnum.PARATYPE, "qldamage");
//			 
//			 paramValues.put(ParametersEnum.PARAMID, "qldamage03");
//			 paramValues.put(ParametersEnum.NAME, "High");
//			 paramValues.put(ParametersEnum.DESCRIPTION, "");
//			 paramValues.put(ParametersEnum.KIND, "Combo value");
//			 paramValues.put(ParametersEnum.VISIBLE, true);
//			 paramValues.put(ParametersEnum.ENABLED, true);
//			 paramValues.put(ParametersEnum.LANGUAGE, "EN");
//			 paramValues.put(ParametersEnum.PARATYPE, "qldamage");
//			 
//			 paramValues.put(ParametersEnum.PARAMID, "qldamage04");
//			 paramValues.put(ParametersEnum.NAME, "Catastrophic");
//			 paramValues.put(ParametersEnum.DESCRIPTION, "");
//			 paramValues.put(ParametersEnum.KIND, "Combo value");
//			 paramValues.put(ParametersEnum.VISIBLE, true);
//			 paramValues.put(ParametersEnum.ENABLED, true);
//			 paramValues.put(ParametersEnum.LANGUAGE, "EN");
//			 paramValues.put(ParametersEnum.PARATYPE, "trendopt");
//			 
//			 paramValues.put(ParametersEnum.PARAMID, "trendopt00");
//			 paramValues.put(ParametersEnum.NAME, "--- Unspecified");
//			 paramValues.put(ParametersEnum.DESCRIPTION, "Empty value");
//			 paramValues.put(ParametersEnum.KIND, "Combo value");
//			 paramValues.put(ParametersEnum.VISIBLE, true);
//			 paramValues.put(ParametersEnum.ENABLED, true);
//			 paramValues.put(ParametersEnum.LANGUAGE, "EN");
//			 paramValues.put(ParametersEnum.PARATYPE, "trendopt");
//			
//			 paramValues.put(ParametersEnum.PARAMID, "trendopt01");
//			 paramValues.put(ParametersEnum.NAME, "Will be worst fast");
//			 paramValues.put(ParametersEnum.DESCRIPTION, "");
//			 paramValues.put(ParametersEnum.KIND, "Combo value");
//			 paramValues.put(ParametersEnum.VISIBLE, true);
//			 paramValues.put(ParametersEnum.ENABLED, true);
//			 paramValues.put(ParametersEnum.LANGUAGE, "EN");
//			 paramValues.put(ParametersEnum.PARATYPE, "trendopt");
//
//			 paramValues.put(ParametersEnum.PARAMID, "trendopt02");
//			 paramValues.put(ParametersEnum.NAME, "Will be worst in short-term");
//			 paramValues.put(ParametersEnum.DESCRIPTION, "");
//			 paramValues.put(ParametersEnum.KIND, "Combo value");
//			 paramValues.put(ParametersEnum.VISIBLE, true);
//			 paramValues.put(ParametersEnum.ENABLED, true);
//			 paramValues.put(ParametersEnum.LANGUAGE, "EN");
//			 paramValues.put(ParametersEnum.PARATYPE, "trendopt");
//			 
//			 paramValues.put(ParametersEnum.PARAMID, "trendopt03");
//			 paramValues.put(ParametersEnum.NAME, "Will be worst in mid-term");
//			 paramValues.put(ParametersEnum.DESCRIPTION, "");
//			 paramValues.put(ParametersEnum.KIND, "Combo value");
//			 paramValues.put(ParametersEnum.VISIBLE, true);
//			 paramValues.put(ParametersEnum.ENABLED, true);
//			 paramValues.put(ParametersEnum.LANGUAGE, "EN");
//			 paramValues.put(ParametersEnum.PARATYPE, "trendopt");
//			 
//			 paramValues.put(ParametersEnum.PARAMID, "trendopt04");
//			 paramValues.put(ParametersEnum.NAME, "Will be worst in long-term");
//			 paramValues.put(ParametersEnum.DESCRIPTION, "");
//			 paramValues.put(ParametersEnum.KIND, "Combo value");
//			 paramValues.put(ParametersEnum.VISIBLE, true);
//			 paramValues.put(ParametersEnum.ENABLED, true);
//			 paramValues.put(ParametersEnum.LANGUAGE, "EN");
//			 paramValues.put(ParametersEnum.PARATYPE, "trendopt");
//			 
//			 paramValues.put(ParametersEnum.PARAMID, "trendopt05");
//			 paramValues.put(ParametersEnum.NAME, "Will not change");
//			 paramValues.put(ParametersEnum.DESCRIPTION, "");
//			 paramValues.put(ParametersEnum.KIND, "Combo value");
//			 paramValues.put(ParametersEnum.VISIBLE, true);
//			 paramValues.put(ParametersEnum.ENABLED, true);
//			 paramValues.put(ParametersEnum.LANGUAGE, "EN");
//			 paramValues.put(ParametersEnum.PARATYPE, "trendopt");
//			 
//			 paramValues.put(ParametersEnum.PARAMID, "ctrlclass00");
//			 paramValues.put(ParametersEnum.NAME, "--- Unspecified");
//			 paramValues.put(ParametersEnum.DESCRIPTION, "Empty value");
//			 paramValues.put(ParametersEnum.KIND, "Combo value");
//			 paramValues.put(ParametersEnum.VISIBLE, true);
//			 paramValues.put(ParametersEnum.ENABLED, true);
//			 paramValues.put(ParametersEnum.LANGUAGE, "EN");
//			 paramValues.put(ParametersEnum.PARATYPE, "ctrlclass");
//			 
//			 paramValues.put(ParametersEnum.PARAMID, "ctrlclass01");
//			 paramValues.put(ParametersEnum.NAME, "Predictive");
//			 paramValues.put(ParametersEnum.DESCRIPTION, "");
//			 paramValues.put(ParametersEnum.KIND, "Combo value");
//			 paramValues.put(ParametersEnum.VISIBLE, true);
//			 paramValues.put(ParametersEnum.ENABLED, true);
//			 paramValues.put(ParametersEnum.LANGUAGE, "EN");
//			 paramValues.put(ParametersEnum.PARATYPE, "ctrlclass");
//			 
//			 paramValues.put(ParametersEnum.PARAMID, "ctrlclass02");
//			 paramValues.put(ParametersEnum.NAME, "Preventive");
//			 paramValues.put(ParametersEnum.DESCRIPTION, "");
//			 paramValues.put(ParametersEnum.KIND, "Combo value");
//			 paramValues.put(ParametersEnum.VISIBLE, true);
//			 paramValues.put(ParametersEnum.ENABLED, true);
//			 paramValues.put(ParametersEnum.LANGUAGE, "EN");
//			 paramValues.put(ParametersEnum.PARATYPE, "ctrlclass");
//			 
//			 paramValues.put(ParametersEnum.PARAMID, "ctrlclass02");
//			 paramValues.put(ParametersEnum.NAME, "Corrective");
//			 paramValues.put(ParametersEnum.DESCRIPTION, "");
//			 paramValues.put(ParametersEnum.KIND, "Combo value");
//			 paramValues.put(ParametersEnum.VISIBLE, true);
//			 paramValues.put(ParametersEnum.ENABLED, true);
//			 paramValues.put(ParametersEnum.LANGUAGE, "EN");
//			 paramValues.put(ParametersEnum.PARATYPE, "ctrlclass");
//			 
//			 paramValues.put(ParametersEnum.PARAMID, "audittype00");
//			 paramValues.put(ParametersEnum.NAME, "--- Unspecified");
//			 paramValues.put(ParametersEnum.DESCRIPTION, "Empty value");
//			 paramValues.put(ParametersEnum.KIND, "Combo value");
//			 paramValues.put(ParametersEnum.VISIBLE, true);
//			 paramValues.put(ParametersEnum.ENABLED, true);
//			 paramValues.put(ParametersEnum.LANGUAGE, "EN");
//			 paramValues.put(ParametersEnum.PARATYPE, "audittype");
//			 
//			 paramValues.put(ParametersEnum.PARAMID, "audittype01");
//			 paramValues.put(ParametersEnum.NAME, "ISO");
//			 paramValues.put(ParametersEnum.DESCRIPTION, "");
//			 paramValues.put(ParametersEnum.KIND, "Combo value");
//			 paramValues.put(ParametersEnum.VISIBLE, true);
//			 paramValues.put(ParametersEnum.ENABLED, true);
//			 paramValues.put(ParametersEnum.LANGUAGE, "EN");
//			 paramValues.put(ParametersEnum.PARATYPE, "audittype");
//			 
//			 paramValues.put(ParametersEnum.PARAMID, "audittype02");
//			 paramValues.put(ParametersEnum.NAME, "SOX");
//			 paramValues.put(ParametersEnum.DESCRIPTION, "");
//			 paramValues.put(ParametersEnum.KIND, "Combo value");
//			 paramValues.put(ParametersEnum.VISIBLE, true);
//			 paramValues.put(ParametersEnum.ENABLED, true);
//			 paramValues.put(ParametersEnum.LANGUAGE, "EN");
//			 paramValues.put(ParametersEnum.PARATYPE, "audittype");
//			 
//			 paramValues.put(ParametersEnum.PARAMID, "audittype03");
//			 paramValues.put(ParametersEnum.NAME, "Compliance Iniciative");
//			 paramValues.put(ParametersEnum.DESCRIPTION, "");
//			 paramValues.put(ParametersEnum.KIND, "Combo value");
//			 paramValues.put(ParametersEnum.VISIBLE, true);
//			 paramValues.put(ParametersEnum.ENABLED, true);
//			 paramValues.put(ParametersEnum.LANGUAGE, "EN");
//			 paramValues.put(ParametersEnum.PARATYPE, "audittype");
//			 
//			 paramValues.put(ParametersEnum.PARAMID, "audittype04");
//			 paramValues.put(ParametersEnum.NAME, "Process Change Triggered");
//			 paramValues.put(ParametersEnum.DESCRIPTION, "");
//			 paramValues.put(ParametersEnum.KIND, "Combo value");
//			 paramValues.put(ParametersEnum.VISIBLE, true);
//			 paramValues.put(ParametersEnum.ENABLED, true);
//			 paramValues.put(ParametersEnum.LANGUAGE, "EN");
//			 paramValues.put(ParametersEnum.PARATYPE, "audittype");
//			
//
//			 
//			 
//			//Não edite este bloco!
//			 paramValues.put(ParametersEnum.PARAMID, "dbparamstd");
//			 paramValues.put(ParametersEnum.NAME, "Standard Parameter Table");
//			 paramValues.put(ParametersEnum.DESCRIPTION, "Standard parameter to check if the table is fulfilled.");
//			 paramValues.put(ParametersEnum.VISIBLE, false);
//			 paramValues.put(ParametersEnum.ENABLED, true);
//			 paramValues.put(ParametersEnum.LANGUAGE, "EN");
//			 paramValues.put(ParametersEnum.KIND, "System Check");
//			 paramValues.put(ParametersEnum.PARATYPE, "std_init");
//			
//			saveParameters(paramValues);
//			
//		}
//		
//	}
//
//	private void saveParameters(Map<ParametersEnum, Object> paramValues) {
//		paramValues.entrySet()
//			.forEach(entry -> {
//				Parameter parameter = new Parameter();
////				Map<String, Object> values = (Map<String, Object>) entry.getValue();
//				parameter.setParamValues(entry.getKey(), entry.getValue());
//				parameterService.save(parameter);
//			});
//	}
//
//}
