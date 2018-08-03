package br.com.reliabletech.igrc.converters;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class DateToStringConverter implements Converter<Date, String> {

	@Override
	public String convert(Date source) {
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		try {
			return sdf.format(source);
		}catch(Exception ex) {
			return null;
		}
	}

}
