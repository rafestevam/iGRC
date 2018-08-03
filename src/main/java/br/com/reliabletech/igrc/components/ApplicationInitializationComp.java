package br.com.reliabletech.igrc.components;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.IntStream;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.Multimap;

import br.com.reliabletech.igrc.models.Parameter;
import br.com.reliabletech.igrc.models.ParameterEnum;
import br.com.reliabletech.igrc.services.ParameterService;

@Component
public class ApplicationInitializationComp {

	@Autowired
	ParameterService parameterService;

	@PostConstruct
	public void initIGRCParameters() {

		if (parameterService.findByParamid("dbparamstd") == null) {

			Multimap<String, Object> paramMap = ArrayListMultimap.create();

			IntStream.range(0, 1).forEach(idx -> {
				HashMap<ParameterEnum, Object> paramValues = new HashMap<>();
				paramValues.put(ParameterEnum.PARAMID, "ctrlfreq00");
				paramValues.put(ParameterEnum.NAME, "--- Unspecified");
				paramValues.put(ParameterEnum.DESCRIPTION, "Empty value");
				paramValues.put(ParameterEnum.KIND, "Combo value");
				paramValues.put(ParameterEnum.VISIBLE, true);
				paramValues.put(ParameterEnum.ENABLED, true);
				paramValues.put(ParameterEnum.LANGUAGE, "EN");
				paramMap.put("ctrlfreq", paramValues); // ->Gravar o "PARATYPE" como primeiro parametro
			});

			IntStream.range(0, 1).forEach(idx -> {
			  HashMap<ParameterEnum, Object> paramValues = new HashMap<>();
			  paramValues.put(ParameterEnum.PARAMID, "ctrlfreq01");
			  paramValues.put(ParameterEnum.NAME, "On Demand");
			  paramValues.put(ParameterEnum.DESCRIPTION, "");
			  paramValues.put(ParameterEnum.KIND, "Combo value");
			  paramValues.put(ParameterEnum.VISIBLE, true);
			  paramValues.put(ParameterEnum.ENABLED, true);
			  paramValues.put(ParameterEnum.LANGUAGE, "EN");
				paramMap.put("ctrlfreq", paramValues); 
			});
			
			IntStream.range(0, 1).forEach(idx -> {
				HashMap<ParameterEnum, Object> paramValues = new HashMap<>();
			  paramValues.put(ParameterEnum.PARAMID, "ctrlfreq02");
			  paramValues.put(ParameterEnum.NAME, "Daily");
			  paramValues.put(ParameterEnum.DESCRIPTION, "");
			  paramValues.put(ParameterEnum.KIND, "Combo value");
			  paramValues.put(ParameterEnum.VISIBLE, true);
			  paramValues.put(ParameterEnum.ENABLED, true);
			  paramValues.put(ParameterEnum.LANGUAGE, "EN");
				paramMap.put("ctrlfreq", paramValues); 
			});
			
			IntStream.range(0, 1).forEach(idx -> {
				HashMap<ParameterEnum, Object> paramValues = new HashMap<>();
			  paramValues.put(ParameterEnum.PARAMID, "ctrlfreq03");
			  paramValues.put(ParameterEnum.NAME, "Weekly");
			  paramValues.put(ParameterEnum.DESCRIPTION, "");
			  paramValues.put(ParameterEnum.KIND, "Combo value");
			  paramValues.put(ParameterEnum.VISIBLE, true);
			  paramValues.put(ParameterEnum.ENABLED, true);
			  paramValues.put(ParameterEnum.LANGUAGE, "EN");
				paramMap.put("ctrlfreq", paramValues); 
			});
			
			IntStream.range(0, 1).forEach(idx -> {
				HashMap<ParameterEnum, Object> paramValues = new HashMap<>();
			  paramValues.put(ParameterEnum.PARAMID, "ctrlfreq04");
			  paramValues.put(ParameterEnum.NAME, "Monthly");
			  paramValues.put(ParameterEnum.DESCRIPTION, "");
			  paramValues.put(ParameterEnum.KIND, "Combo value");
			  paramValues.put(ParameterEnum.VISIBLE, true);
			  paramValues.put(ParameterEnum.ENABLED, true);
			  paramValues.put(ParameterEnum.LANGUAGE, "EN");
				paramMap.put("ctrlfreq", paramValues); 
			});
			
			IntStream.range(0, 1).forEach(idx -> {
				HashMap<ParameterEnum, Object> paramValues = new HashMap<>();
			  paramValues.put(ParameterEnum.PARAMID, "ctrlfreq05");
			  paramValues.put(ParameterEnum.NAME, "Quarterly");
			  paramValues.put(ParameterEnum.DESCRIPTION, "");
			  paramValues.put(ParameterEnum.KIND, "Combo value");
			  paramValues.put(ParameterEnum.VISIBLE, true);
			  paramValues.put(ParameterEnum.ENABLED, true);
			  paramValues.put(ParameterEnum.LANGUAGE, "EN");
				paramMap.put("ctrlfreq", paramValues); 
			});
			
			IntStream.range(0, 1).forEach(idx -> {
				HashMap<ParameterEnum, Object> paramValues = new HashMap<>();
			  paramValues.put(ParameterEnum.PARAMID, "ctrlfreq06");
			  paramValues.put(ParameterEnum.NAME, "Semiannually");
			  paramValues.put(ParameterEnum.DESCRIPTION, "");
			  paramValues.put(ParameterEnum.KIND, "Combo value");
			  paramValues.put(ParameterEnum.VISIBLE, true);
			  paramValues.put(ParameterEnum.ENABLED, true);
			  paramValues.put(ParameterEnum.LANGUAGE, "EN");
				paramMap.put("ctrlfreq", paramValues); 
			});
			
			IntStream.range(0, 1).forEach(idx -> {
				HashMap<ParameterEnum, Object> paramValues = new HashMap<>();
			  paramValues.put(ParameterEnum.PARAMID, "ctrlfreq07");
			  paramValues.put(ParameterEnum.NAME, "Annually");
			  paramValues.put(ParameterEnum.DESCRIPTION, "");
			  paramValues.put(ParameterEnum.KIND, "Combo value");
			  paramValues.put(ParameterEnum.VISIBLE, true);
			  paramValues.put(ParameterEnum.ENABLED, true);
			  paramValues.put(ParameterEnum.LANGUAGE, "EN");
				paramMap.put("ctrlfreq", paramValues); 
			});
			
			IntStream.range(0, 1).forEach(idx -> {
				HashMap<ParameterEnum, Object> paramValues = new HashMap<>();
			  paramValues.put(ParameterEnum.PARAMID, "ctrlfreq08");
			  paramValues.put(ParameterEnum.NAME, "Event Driven");
			  paramValues.put(ParameterEnum.DESCRIPTION, "");
			  paramValues.put(ParameterEnum.KIND, "Combo value");
			  paramValues.put(ParameterEnum.VISIBLE, true);
			  paramValues.put(ParameterEnum.ENABLED, true);
			  paramValues.put(ParameterEnum.LANGUAGE, "EN");
				paramMap.put("ctrlfreq", paramValues); 
			});
			
			IntStream.range(0, 1).forEach(idx -> {
				HashMap<ParameterEnum, Object> paramValues = new HashMap<>();
			  paramValues.put(ParameterEnum.PARAMID, "ctrltype00");
			  paramValues.put(ParameterEnum.NAME, "--- Unspecified");
			  paramValues.put(ParameterEnum.DESCRIPTION, "Empty value");
			  paramValues.put(ParameterEnum.KIND, "Combo value");
			  paramValues.put(ParameterEnum.VISIBLE, true);
			  paramValues.put(ParameterEnum.ENABLED, true);
			  paramValues.put(ParameterEnum.LANGUAGE, "EN");
				paramMap.put("ctrltype", paramValues); 
			});
			
			IntStream.range(0, 1).forEach(idx -> {
				HashMap<ParameterEnum, Object> paramValues = new HashMap<>();
			  paramValues.put(ParameterEnum.PARAMID, "ctrltype01");
			  paramValues.put(ParameterEnum.NAME, "Manual");
			  paramValues.put(ParameterEnum.DESCRIPTION, "");
			  paramValues.put(ParameterEnum.KIND, "Combo value");
			  paramValues.put(ParameterEnum.VISIBLE, true);
			  paramValues.put(ParameterEnum.ENABLED, true);
			  paramValues.put(ParameterEnum.LANGUAGE, "EN");
				paramMap.put("ctrltype", paramValues); 
			});
			
			IntStream.range(0, 1).forEach(idx -> {
				HashMap<ParameterEnum, Object> paramValues = new HashMap<>();
			  paramValues.put(ParameterEnum.PARAMID, "ctrltype02");
			  paramValues.put(ParameterEnum.NAME, "Automatic");
			  paramValues.put(ParameterEnum.DESCRIPTION, "");
			  paramValues.put(ParameterEnum.KIND, "Combo value");
			  paramValues.put(ParameterEnum.VISIBLE, true);
			  paramValues.put(ParameterEnum.ENABLED, true);
			  paramValues.put(ParameterEnum.LANGUAGE, "EN");
				paramMap.put("ctrltype", paramValues); 
			});
			
			IntStream.range(0, 1).forEach(idx -> {
				HashMap<ParameterEnum, Object> paramValues = new HashMap<>();
			  paramValues.put(ParameterEnum.PARAMID, "ctrltype03");
			  paramValues.put(ParameterEnum.NAME, "IT Managed");
			  paramValues.put(ParameterEnum.DESCRIPTION, "");
			  paramValues.put(ParameterEnum.KIND, "Combo value");
			  paramValues.put(ParameterEnum.VISIBLE, true);
			  paramValues.put(ParameterEnum.ENABLED, true);
			  paramValues.put(ParameterEnum.LANGUAGE, "EN");
				paramMap.put("ctrltype", paramValues); 
			});
			
			IntStream.range(0, 1).forEach(idx -> {
				HashMap<ParameterEnum, Object> paramValues = new HashMap<>();
			  paramValues.put(ParameterEnum.PARAMID, "stdfreq00");
			  paramValues.put(ParameterEnum.NAME, "--- Unspecified");
			  paramValues.put(ParameterEnum.DESCRIPTION, "Empty value");
			  paramValues.put(ParameterEnum.KIND, "Combo value");
			  paramValues.put(ParameterEnum.VISIBLE, true);
			  paramValues.put(ParameterEnum.ENABLED, true);
			  paramValues.put(ParameterEnum.LANGUAGE, "EN");
				paramMap.put("stdfreq", paramValues); 
			});
			
			IntStream.range(0, 1).forEach(idx -> {
				HashMap<ParameterEnum, Object> paramValues = new HashMap<>();
			  paramValues.put(ParameterEnum.PARAMID, "stdfreq01");
			  paramValues.put(ParameterEnum.NAME, "On Demand");
			  paramValues.put(ParameterEnum.DESCRIPTION, "");
			  paramValues.put(ParameterEnum.KIND, "Combo value");
			  paramValues.put(ParameterEnum.VISIBLE, true);
			  paramValues.put(ParameterEnum.ENABLED, true);
			  paramValues.put(ParameterEnum.LANGUAGE, "EN");
				paramMap.put("stdfreq", paramValues); 
			});
			
			IntStream.range(0, 1).forEach(idx -> {
				HashMap<ParameterEnum, Object> paramValues = new HashMap<>();
			  paramValues.put(ParameterEnum.PARAMID, "stdfreq02");
			  paramValues.put(ParameterEnum.NAME, "Daily");
			  paramValues.put(ParameterEnum.DESCRIPTION, "");
			  paramValues.put(ParameterEnum.KIND, "Combo value");
			  paramValues.put(ParameterEnum.VISIBLE, true);
			  paramValues.put(ParameterEnum.ENABLED, true);
			  paramValues.put(ParameterEnum.LANGUAGE, "EN");
				paramMap.put("stdfreq", paramValues); 
			});
			
			IntStream.range(0, 1).forEach(idx -> {
				HashMap<ParameterEnum, Object> paramValues = new HashMap<>();
			  paramValues.put(ParameterEnum.PARAMID, "stdfreq03");
			  paramValues.put(ParameterEnum.NAME, "Weekly");
			  paramValues.put(ParameterEnum.DESCRIPTION, "");
			  paramValues.put(ParameterEnum.KIND, "Combo value");
			  paramValues.put(ParameterEnum.VISIBLE, true);
			  paramValues.put(ParameterEnum.ENABLED, true);
			  paramValues.put(ParameterEnum.LANGUAGE, "EN");
				paramMap.put("stdfreq", paramValues); 
			});
			
			IntStream.range(0, 1).forEach(idx -> {
				HashMap<ParameterEnum, Object> paramValues = new HashMap<>();
			  paramValues.put(ParameterEnum.PARAMID, "stdfreq04");
			  paramValues.put(ParameterEnum.NAME, "Monthly");
			  paramValues.put(ParameterEnum.DESCRIPTION, "");
			  paramValues.put(ParameterEnum.KIND, "Combo value");
			  paramValues.put(ParameterEnum.VISIBLE, true);
			  paramValues.put(ParameterEnum.ENABLED, true);
			  paramValues.put(ParameterEnum.LANGUAGE, "EN");
				paramMap.put("stdfreq", paramValues); 
			});
			
			IntStream.range(0, 1).forEach(idx -> {
				HashMap<ParameterEnum, Object> paramValues = new HashMap<>();
			  paramValues.put(ParameterEnum.PARAMID, "stdfreq05");
			  paramValues.put(ParameterEnum.NAME, "Quarterly");
			  paramValues.put(ParameterEnum.DESCRIPTION, "");
			  paramValues.put(ParameterEnum.KIND, "Combo value");
			  paramValues.put(ParameterEnum.VISIBLE, true);
			  paramValues.put(ParameterEnum.ENABLED, true);
			  paramValues.put(ParameterEnum.LANGUAGE, "EN");
				paramMap.put("stdfreq", paramValues); 
			});
			
			IntStream.range(0, 1).forEach(idx -> {
				HashMap<ParameterEnum, Object> paramValues = new HashMap<>();
			  paramValues.put(ParameterEnum.PARAMID, "stdfreq06");
			  paramValues.put(ParameterEnum.NAME, "Semiannually");
			  paramValues.put(ParameterEnum.DESCRIPTION, "");
			  paramValues.put(ParameterEnum.KIND, "Combo value");
			  paramValues.put(ParameterEnum.VISIBLE, true);
			  paramValues.put(ParameterEnum.ENABLED, true);
			  paramValues.put(ParameterEnum.LANGUAGE, "EN");
				paramMap.put("stdfreq", paramValues); 
			});
			
			IntStream.range(0, 1).forEach(idx -> {
				HashMap<ParameterEnum, Object> paramValues = new HashMap<>();
			  paramValues.put(ParameterEnum.PARAMID, "stdfreq07");
			  paramValues.put(ParameterEnum.NAME, "Annually");
			  paramValues.put(ParameterEnum.DESCRIPTION, "");
			  paramValues.put(ParameterEnum.KIND, "Combo value");
			  paramValues.put(ParameterEnum.VISIBLE, true);
			  paramValues.put(ParameterEnum.ENABLED, true);
			  paramValues.put(ParameterEnum.LANGUAGE, "EN");
				paramMap.put("stdfreq", paramValues); 
			});
			
			IntStream.range(0, 1).forEach(idx -> {
				HashMap<ParameterEnum, Object> paramValues = new HashMap<>();
			  paramValues.put(ParameterEnum.PARAMID, "stdfreq08");
			  paramValues.put(ParameterEnum.NAME, "Event Driven");
			  paramValues.put(ParameterEnum.DESCRIPTION, "");
			  paramValues.put(ParameterEnum.KIND, "Combo value");
			  paramValues.put(ParameterEnum.VISIBLE, true);
			  paramValues.put(ParameterEnum.ENABLED, true);
			  paramValues.put(ParameterEnum.LANGUAGE, "EN");
				paramMap.put("stdfreq", paramValues); 
			});
			
			IntStream.range(0, 1).forEach(idx -> {
				HashMap<ParameterEnum, Object> paramValues = new HashMap<>();
			  paramValues.put(ParameterEnum.PARAMID, "defline00");
			  paramValues.put(ParameterEnum.NAME, "--- Unspecified");
			  paramValues.put(ParameterEnum.DESCRIPTION, "Empty value");
			  paramValues.put(ParameterEnum.KIND, "Combo value");
			  paramValues.put(ParameterEnum.VISIBLE, true);
			  paramValues.put(ParameterEnum.ENABLED, true);
			  paramValues.put(ParameterEnum.LANGUAGE, "EN");
				paramMap.put("defenseline", paramValues); 
			});
			
			IntStream.range(0, 1).forEach(idx -> {
				HashMap<ParameterEnum, Object> paramValues = new HashMap<>();
			  paramValues.put(ParameterEnum.PARAMID, "defline01");
			  paramValues.put(ParameterEnum.NAME, "First Defense Line (Owner)");
			  paramValues.put(ParameterEnum.DESCRIPTION, "");
			  paramValues.put(ParameterEnum.KIND, "Combo value");
			  paramValues.put(ParameterEnum.VISIBLE, true);
			  paramValues.put(ParameterEnum.ENABLED, true);
			  paramValues.put(ParameterEnum.LANGUAGE, "EN");
				paramMap.put("defenseline", paramValues); 
			});
			
			IntStream.range(0, 1).forEach(idx -> {
				HashMap<ParameterEnum, Object> paramValues = new HashMap<>();
			  paramValues.put(ParameterEnum.PARAMID, "defline02");
			  paramValues.put(ParameterEnum.NAME, "Second Defense Line (Internal Compliance)");
			  paramValues.put(ParameterEnum.DESCRIPTION, "");
			  paramValues.put(ParameterEnum.KIND, "Combo value");
			  paramValues.put(ParameterEnum.VISIBLE, true);
			  paramValues.put(ParameterEnum.ENABLED, true);
			  paramValues.put(ParameterEnum.LANGUAGE, "EN");
				paramMap.put("defenseline", paramValues); 
			});
			
			IntStream.range(0, 1).forEach(idx -> {
				HashMap<ParameterEnum, Object> paramValues = new HashMap<>();
			  paramValues.put(ParameterEnum.PARAMID, "defline03");
			  paramValues.put(ParameterEnum.NAME, "Third Defense Line (Internal/External Audit)");
			  paramValues.put(ParameterEnum.DESCRIPTION, "");
			  paramValues.put(ParameterEnum.KIND, "Combo value");
			  paramValues.put(ParameterEnum.VISIBLE, true);
			  paramValues.put(ParameterEnum.ENABLED, true);
			  paramValues.put(ParameterEnum.LANGUAGE, "EN");
				paramMap.put("defenseline", paramValues); 
			});
			
			IntStream.range(0, 1).forEach(idx -> {
				HashMap<ParameterEnum, Object> paramValues = new HashMap<>();
			  paramValues.put(ParameterEnum.PARAMID, "probab00");
			  paramValues.put(ParameterEnum.NAME, "--- Unspecified");
			  paramValues.put(ParameterEnum.DESCRIPTION, "Empty value");
			  paramValues.put(ParameterEnum.KIND, "Combo value");
			  paramValues.put(ParameterEnum.VISIBLE, true);
			  paramValues.put(ParameterEnum.ENABLED, true);
			  paramValues.put(ParameterEnum.LANGUAGE, "EN");
				paramMap.put("probab", paramValues); 
			});
			
			IntStream.range(0, 1).forEach(idx -> {
				HashMap<ParameterEnum, Object> paramValues = new HashMap<>();
			  paramValues.put(ParameterEnum.PARAMID, "probab01");
			  paramValues.put(ParameterEnum.NAME, "Rare/Remote");
			  paramValues.put(ParameterEnum.DESCRIPTION, "");
			  paramValues.put(ParameterEnum.KIND, "Combo value");
			  paramValues.put(ParameterEnum.VISIBLE, true);
			  paramValues.put(ParameterEnum.ENABLED, true);
			  paramValues.put(ParameterEnum.LANGUAGE, "EN");
				paramMap.put("probab", paramValues); 
			});
			
			IntStream.range(0, 1).forEach(idx -> {
				HashMap<ParameterEnum, Object> paramValues = new HashMap<>();
			  paramValues.put(ParameterEnum.PARAMID, "probab02");
			  paramValues.put(ParameterEnum.NAME, "Moderate");
			  paramValues.put(ParameterEnum.DESCRIPTION, "");
			  paramValues.put(ParameterEnum.KIND, "Combo value");
			  paramValues.put(ParameterEnum.VISIBLE, true);
			  paramValues.put(ParameterEnum.ENABLED, true);
			  paramValues.put(ParameterEnum.LANGUAGE, "EN");
				paramMap.put("probab", paramValues); 
			});
			
			IntStream.range(0, 1).forEach(idx -> {
				HashMap<ParameterEnum, Object> paramValues = new HashMap<>();
			  paramValues.put(ParameterEnum.PARAMID, "probab03");
			  paramValues.put(ParameterEnum.NAME, "Likely");
			  paramValues.put(ParameterEnum.DESCRIPTION, "");
			  paramValues.put(ParameterEnum.KIND, "Combo value");
			  paramValues.put(ParameterEnum.VISIBLE, true);
			  paramValues.put(ParameterEnum.ENABLED, true);
			  paramValues.put(ParameterEnum.LANGUAGE, "EN");
				paramMap.put("probab", paramValues); 
			});
			
			IntStream.range(0, 1).forEach(idx -> {
				HashMap<ParameterEnum, Object> paramValues = new HashMap<>();
			  paramValues.put(ParameterEnum.PARAMID, "probab04");
			  paramValues.put(ParameterEnum.NAME, "Almost Certain");
			  paramValues.put(ParameterEnum.DESCRIPTION, "");
			  paramValues.put(ParameterEnum.KIND, "Combo value");
			  paramValues.put(ParameterEnum.VISIBLE, true);
			  paramValues.put(ParameterEnum.ENABLED, true);
			  paramValues.put(ParameterEnum.LANGUAGE, "EN");
				paramMap.put("probab", paramValues); 
			});
			
			IntStream.range(0, 1).forEach(idx -> {
				HashMap<ParameterEnum, Object> paramValues = new HashMap<>();
			  paramValues.put(ParameterEnum.PARAMID, "qldamage00");
			  paramValues.put(ParameterEnum.NAME, "--- Unspecified");
			  paramValues.put(ParameterEnum.DESCRIPTION, "Empty value");
			  paramValues.put(ParameterEnum.KIND, "Combo value");
			  paramValues.put(ParameterEnum.VISIBLE, true);
			  paramValues.put(ParameterEnum.ENABLED, true);
			  paramValues.put(ParameterEnum.LANGUAGE, "EN");
				paramMap.put("qldamage", paramValues); 
			});
			
			IntStream.range(0, 1).forEach(idx -> {
				HashMap<ParameterEnum, Object> paramValues = new HashMap<>();
			  paramValues.put(ParameterEnum.PARAMID, "qldamage01");
			  paramValues.put(ParameterEnum.NAME, "Insignificant");
			  paramValues.put(ParameterEnum.DESCRIPTION, "");
			  paramValues.put(ParameterEnum.KIND, "Combo value");
			  paramValues.put(ParameterEnum.VISIBLE, true);
			  paramValues.put(ParameterEnum.ENABLED, true);
			  paramValues.put(ParameterEnum.LANGUAGE, "EN");
				paramMap.put("qldamage", paramValues); 
			});
			
			IntStream.range(0, 1).forEach(idx -> {
				HashMap<ParameterEnum, Object> paramValues = new HashMap<>();
			  paramValues.put(ParameterEnum.PARAMID, "qldamage02");
			  paramValues.put(ParameterEnum.NAME, "Low");
			  paramValues.put(ParameterEnum.DESCRIPTION, "");
			  paramValues.put(ParameterEnum.KIND, "Combo value");
			  paramValues.put(ParameterEnum.VISIBLE, true);
			  paramValues.put(ParameterEnum.ENABLED, true);
			  paramValues.put(ParameterEnum.LANGUAGE, "EN");
				paramMap.put("qldamage", paramValues); 
			});
			
			IntStream.range(0, 1).forEach(idx -> {
				HashMap<ParameterEnum, Object> paramValues = new HashMap<>();
			  paramValues.put(ParameterEnum.PARAMID, "qldamage02");
			  paramValues.put(ParameterEnum.NAME, "Average");
			  paramValues.put(ParameterEnum.DESCRIPTION, "");
			  paramValues.put(ParameterEnum.KIND, "Combo value");
			  paramValues.put(ParameterEnum.VISIBLE, true);
			  paramValues.put(ParameterEnum.ENABLED, true);
			  paramValues.put(ParameterEnum.LANGUAGE, "EN");
				paramMap.put("qldamage", paramValues); 
			});
			
			IntStream.range(0, 1).forEach(idx -> {
				HashMap<ParameterEnum, Object> paramValues = new HashMap<>();
			  paramValues.put(ParameterEnum.PARAMID, "qldamage03");
			  paramValues.put(ParameterEnum.NAME, "High");
			  paramValues.put(ParameterEnum.DESCRIPTION, "");
			  paramValues.put(ParameterEnum.KIND, "Combo value");
			  paramValues.put(ParameterEnum.VISIBLE, true);
			  paramValues.put(ParameterEnum.ENABLED, true);
			  paramValues.put(ParameterEnum.LANGUAGE, "EN");
				paramMap.put("qldamage", paramValues); 
			});
			
			IntStream.range(0, 1).forEach(idx -> {
				HashMap<ParameterEnum, Object> paramValues = new HashMap<>();
			  paramValues.put(ParameterEnum.PARAMID, "qldamage04");
			  paramValues.put(ParameterEnum.NAME, "Catastrophic");
			  paramValues.put(ParameterEnum.DESCRIPTION, "");
			  paramValues.put(ParameterEnum.KIND, "Combo value");
			  paramValues.put(ParameterEnum.VISIBLE, true);
			  paramValues.put(ParameterEnum.ENABLED, true);
			  paramValues.put(ParameterEnum.LANGUAGE, "EN");
				paramMap.put("qldamage", paramValues); 
			});
			
			IntStream.range(0, 1).forEach(idx -> {
				HashMap<ParameterEnum, Object> paramValues = new HashMap<>();
			  paramValues.put(ParameterEnum.PARAMID, "trendopt00");
			  paramValues.put(ParameterEnum.NAME, "--- Unspecified");
			  paramValues.put(ParameterEnum.DESCRIPTION, "Empty value");
			  paramValues.put(ParameterEnum.KIND, "Combo value");
			  paramValues.put(ParameterEnum.VISIBLE, true);
			  paramValues.put(ParameterEnum.ENABLED, true);
			  paramValues.put(ParameterEnum.LANGUAGE, "EN");
				paramMap.put("trendopt", paramValues); 
			});
			
			IntStream.range(0, 1).forEach(idx -> {
				HashMap<ParameterEnum, Object> paramValues = new HashMap<>();
			  paramValues.put(ParameterEnum.PARAMID, "trendopt01");
			  paramValues.put(ParameterEnum.NAME, "Will be worst fast");
			  paramValues.put(ParameterEnum.DESCRIPTION, "");
			  paramValues.put(ParameterEnum.KIND, "Combo value");
			  paramValues.put(ParameterEnum.VISIBLE, true);
			  paramValues.put(ParameterEnum.ENABLED, true);
			  paramValues.put(ParameterEnum.LANGUAGE, "EN");
				paramMap.put("trendopt", paramValues); 
			});
			
			IntStream.range(0, 1).forEach(idx -> {
				HashMap<ParameterEnum, Object> paramValues = new HashMap<>();
			  paramValues.put(ParameterEnum.PARAMID, "trendopt02");
			  paramValues.put(ParameterEnum.NAME, "Will be worst in short-term");
			  paramValues.put(ParameterEnum.DESCRIPTION, "");
			  paramValues.put(ParameterEnum.KIND, "Combo value");
			  paramValues.put(ParameterEnum.VISIBLE, true);
			  paramValues.put(ParameterEnum.ENABLED, true);
			  paramValues.put(ParameterEnum.LANGUAGE, "EN");
				paramMap.put("trendopt", paramValues); 
			});
			
			IntStream.range(0, 1).forEach(idx -> {
				HashMap<ParameterEnum, Object> paramValues = new HashMap<>();
			  paramValues.put(ParameterEnum.PARAMID, "trendopt03");
			  paramValues.put(ParameterEnum.NAME, "Will be worst in mid-term");
			  paramValues.put(ParameterEnum.DESCRIPTION, "");
			  paramValues.put(ParameterEnum.KIND, "Combo value");
			  paramValues.put(ParameterEnum.VISIBLE, true);
			  paramValues.put(ParameterEnum.ENABLED, true);
			  paramValues.put(ParameterEnum.LANGUAGE, "EN");
				paramMap.put("trendopt", paramValues); 
			});
			
			IntStream.range(0, 1).forEach(idx -> {
				HashMap<ParameterEnum, Object> paramValues = new HashMap<>();
			  paramValues.put(ParameterEnum.PARAMID, "trendopt04");
			  paramValues.put(ParameterEnum.NAME, "Will be worst in long-term");
			  paramValues.put(ParameterEnum.DESCRIPTION, "");
			  paramValues.put(ParameterEnum.KIND, "Combo value");
			  paramValues.put(ParameterEnum.VISIBLE, true);
			  paramValues.put(ParameterEnum.ENABLED, true);
			  paramValues.put(ParameterEnum.LANGUAGE, "EN");
				paramMap.put("trendopt", paramValues); 
			});
			
			IntStream.range(0, 1).forEach(idx -> {
				HashMap<ParameterEnum, Object> paramValues = new HashMap<>();
			  paramValues.put(ParameterEnum.PARAMID, "trendopt05");
			  paramValues.put(ParameterEnum.NAME, "Will not change");
			  paramValues.put(ParameterEnum.DESCRIPTION, "");
			  paramValues.put(ParameterEnum.KIND, "Combo value");
			  paramValues.put(ParameterEnum.VISIBLE, true);
			  paramValues.put(ParameterEnum.ENABLED, true);
			  paramValues.put(ParameterEnum.LANGUAGE, "EN");
				paramMap.put("trendopt", paramValues); 
			});
			
			IntStream.range(0, 1).forEach(idx -> {
				HashMap<ParameterEnum, Object> paramValues = new HashMap<>();
			  paramValues.put(ParameterEnum.PARAMID, "ctrlclass00");
			  paramValues.put(ParameterEnum.NAME, "--- Unspecified");
			  paramValues.put(ParameterEnum.DESCRIPTION, "Empty value");
			  paramValues.put(ParameterEnum.KIND, "Combo value");
			  paramValues.put(ParameterEnum.VISIBLE, true);
			  paramValues.put(ParameterEnum.ENABLED, true);
			  paramValues.put(ParameterEnum.LANGUAGE, "EN");
				paramMap.put("ctrlclass", paramValues); 
			});

			IntStream.range(0, 1).forEach(idx -> {
				HashMap<ParameterEnum, Object> paramValues = new HashMap<>();
			  paramValues.put(ParameterEnum.PARAMID, "ctrlclass01");
			  paramValues.put(ParameterEnum.NAME, "Predictive");
			  paramValues.put(ParameterEnum.DESCRIPTION, "");
			  paramValues.put(ParameterEnum.KIND, "Combo value");
			  paramValues.put(ParameterEnum.VISIBLE, true);
			  paramValues.put(ParameterEnum.ENABLED, true);
			  paramValues.put(ParameterEnum.LANGUAGE, "EN");
				paramMap.put("ctrlclass", paramValues); 
			});
			
			IntStream.range(0, 1).forEach(idx -> {
				HashMap<ParameterEnum, Object> paramValues = new HashMap<>();
			  paramValues.put(ParameterEnum.PARAMID, "ctrlclass02");
			  paramValues.put(ParameterEnum.NAME, "Preventive");
			  paramValues.put(ParameterEnum.DESCRIPTION, "");
			  paramValues.put(ParameterEnum.KIND, "Combo value");
			  paramValues.put(ParameterEnum.VISIBLE, true);
			  paramValues.put(ParameterEnum.ENABLED, true);
			  paramValues.put(ParameterEnum.LANGUAGE, "EN");
				paramMap.put("ctrlclass", paramValues); 
			});
			
			IntStream.range(0, 1).forEach(idx -> {
				HashMap<ParameterEnum, Object> paramValues = new HashMap<>();
			  paramValues.put(ParameterEnum.PARAMID, "ctrlclass02");
			  paramValues.put(ParameterEnum.NAME, "Corrective");
			  paramValues.put(ParameterEnum.DESCRIPTION, "");
			  paramValues.put(ParameterEnum.KIND, "Combo value");
			  paramValues.put(ParameterEnum.VISIBLE, true);
			  paramValues.put(ParameterEnum.ENABLED, true);
			  paramValues.put(ParameterEnum.LANGUAGE, "EN");
				paramMap.put("ctrlclass", paramValues); 
			});

			// Não editar este bloco
			IntStream.range(0, 1).forEach(idx -> {
				HashMap<ParameterEnum, Object> paramValues = new HashMap<>();
				paramValues.put(ParameterEnum.PARAMID, "dbparamstd");
				paramValues.put(ParameterEnum.NAME, "Standard Parameter Table");
				paramValues.put(ParameterEnum.DESCRIPTION, "Standard parameter to check if the table is fulfilled.");
				paramValues.put(ParameterEnum.KIND, "System Check");
				paramValues.put(ParameterEnum.VISIBLE, false);
				paramValues.put(ParameterEnum.ENABLED, true);
				paramValues.put(ParameterEnum.LANGUAGE, "EN");
				paramMap.put("std_init", paramValues);
			});

			System.out.println("inicio da gravacao dos parametros");

			saveParameters(paramMap);

			System.out.println("fim da gravacao dos parametros");

		}

	}

	private void saveParameters(Multimap<String, Object> paramMap) {
		paramMap.keySet().forEach(key -> {
			paramMap.get(key).forEach(value -> {
				Parameter parameter = new Parameter(key);
				Map<ParameterEnum, Object> values = (Map<ParameterEnum, Object>) value;
				values.entrySet().forEach(entry -> {
					parameter.setParamValues(entry.getKey(), entry.getValue());
				});
				parameterService.save(parameter);
				System.out.println(parameter.toString());
			});
		});
	}

}







