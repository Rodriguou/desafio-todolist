package br.com.rodrigo.desafiotodolist.repository;

import br.com.rodrigo.desafiotodolist.entity.Todo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoRepository extends JpaRepository<Todo, Long> {
}
