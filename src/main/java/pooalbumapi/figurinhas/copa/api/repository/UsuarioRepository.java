package pooalbumapi.figurinhas.copa.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pooalbumapi.figurinhas.copa.api.model.UsuarioModel;

import java.util.Optional;

public interface UsuarioRepository extends JpaRepository<UsuarioModel, Integer> {

    public Optional<UsuarioModel> findByLogin(String login);

}
