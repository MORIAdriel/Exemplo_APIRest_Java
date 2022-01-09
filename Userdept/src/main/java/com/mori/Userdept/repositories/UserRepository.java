package com.mori.Userdept.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mori.Userdept.entities.User;

/**
 * Manipular dados relacionados aos seus domínio
 * sendo um objeto específico para poder acessar 
 * cada entidade do meu programa/projeto
 * @author Adriel L. V. Mori
 */

public interface UserRepository extends JpaRepository<User, Long>{

	
}
