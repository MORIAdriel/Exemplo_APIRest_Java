package com.mori.Userdept.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mori.Userdept.entities.User;
import com.mori.Userdept.repositories.UserRepository;

@RestController
@RequestMapping(value = "/users") 
/*
* Reverente as manipulações feitas diretamente a URL. Referenciando ao
* hostlocal na web
*/

public class UserController {

	/*
	 * Criar um controlador Rest: Objeto para genenciar as aquisições/comandos do
	 * usuário e requisições parar poder manipular os dados na API
	 */

	@Autowired /* Injeção de dependência */
	/* Composição de componentes */
	private UserRepository repository;

	/* End Point */
	@GetMapping
	/* Requisição para configurar qual o verbo HTTP */
	public List<User> findAll() { /* Vai no banco de dados e busca todos os usuários */
		List<User> result = repository.findAll();
		return result;
	}
	
	@GetMapping(value = "/{id}")
	public User findById(@PathVariable Long id) { /* Vai no banco de dados e busca todos os usuários */
		User result = repository.findById(id).get();
		return result;
	}
	
	@PostMapping /*Para adicionar novo user*/
	public User insert(@RequestBody User user) { /* Vai no banco de dados e busca todos os usuários */
		User result = repository.save(user); /* Manda o objeto ja convertido no relacinal e já uma nova referencia para o objeto saldo(id)*/
		return result;
	}
	
	/* End of file */
}
