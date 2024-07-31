package com.visualmix.api.doc.converter;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

@Component
public class StringToLocalDateTimeConverter implements Converter<String, LocalDateTime> {

    private static final DateTimeFormatter DATE_TIME_FORMATTER = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

    @Override
    public LocalDateTime convert(String source) {
        try {
            return LocalDateTime.parse(source, DATE_TIME_FORMATTER);
        } catch (DateTimeParseException e) {
            throw new IllegalArgumentException("Data e hora no formato inválido, esperado: dd/MM/yyyy HH:mm:ss");
        }
    }
}