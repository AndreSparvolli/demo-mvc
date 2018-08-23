package com.sparvolli.curso.boot.web.validator;

import java.time.LocalDate;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.sparvolli.curso.boot.domain.Funcionario;

public class FuncionarioValidator implements Validator {

	@Override
	public boolean supports(Class<?> clazz) {
		return Funcionario.class.equals(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {
		Funcionario funcionario = (Funcionario) target;

		LocalDate dataEntrada = funcionario.getDataEntrada();

		if (funcionario.getDataSaida() != null) {
			if (funcionario.getDataSaida().isBefore(dataEntrada)) {
				errors.rejectValue("dataSaida", "PosteriorDataEntrada.funcionario.dataSaida");
			}
		}
	}
}
