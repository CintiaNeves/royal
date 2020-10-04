package br.com.royalCity.domain.impl;

import javax.persistence.Entity;
import javax.persistence.Table;

import br.com.royalCity.domain.DomainEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@Table(name = "TSIBAI")
@Entity
@EqualsAndHashCode(callSuper=false)
public class Bairro extends DomainEntity{

	private String nome;
}
