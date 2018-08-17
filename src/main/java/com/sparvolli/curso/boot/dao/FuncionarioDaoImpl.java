package com.sparvolli.curso.boot.dao;

import org.springframework.stereotype.Repository;

import com.sparvolli.curso.boot.domain.Funcionario;

@Repository
public class FuncionarioDaoImpl extends AbstractDao<Funcionario, Long> implements FuncionarioDao {

}
