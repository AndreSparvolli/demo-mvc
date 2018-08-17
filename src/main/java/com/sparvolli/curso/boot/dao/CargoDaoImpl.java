package com.sparvolli.curso.boot.dao;

import org.springframework.stereotype.Repository;

import com.sparvolli.curso.boot.domain.Cargo;

@Repository
public class CargoDaoImpl extends AbstractDao<Cargo, Long> implements CargoDao {

}
