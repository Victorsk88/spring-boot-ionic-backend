package com.victorgabriel.cursomc.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Cliente implements Serializable{
			private static final long serialVersionUID = 1L;
			
			@Id
			@GeneratedValue(strategy=GenerationType.IDENTITY)
			private Integer id;
			private String nome;
			private String email;
			private String cpfouCnpj;
			private String TipoCliente;
			
			
			public Cliente() {	
			}

			public Cliente(Integer id, String nome, String email, String cpfouCnpj, String tipoCliente) {
				this.id = id;
				this.nome = nome;
				this.email = email;
				this.cpfouCnpj = cpfouCnpj;
				TipoCliente = tipoCliente;
			}

			public Integer getId() {
				return id;
			}

			public void setId(Integer id) {
				this.id = id;
			}

			public String getNome() {
				return nome;
			}

			public void setNome(String nome) {
				this.nome = nome;
			}

			public String getEmail() {
				return email;
			}

			public void setEmail(String email) {
				this.email = email;
			}

			public String getCpfouCnpj() {
				return cpfouCnpj;
			}

			public void setCpfouCnpj(String cpfouCnpj) {
				this.cpfouCnpj = cpfouCnpj;
			}

			public String getTipoCliente() {
				return TipoCliente;
			}

			public void setTipoCliente(String tipoCliente) {
				TipoCliente = tipoCliente;
			}

			@Override
			public int hashCode() {
				final int prime = 31;
				int result = 1;
				result = prime * result + ((id == null) ? 0 : id.hashCode());
				return result;
			}

			@Override
			public boolean equals(Object obj) {
				if (this == obj)
					return true;
				if (obj == null)
					return false;
				if (getClass() != obj.getClass())
					return false;
				Cliente other = (Cliente) obj;
				if (id == null) {
					if (other.id != null)
						return false;
				} else if (!id.equals(other.id))
					return false;
				return true;
			}

			
		
			
			
			
			
	

}
