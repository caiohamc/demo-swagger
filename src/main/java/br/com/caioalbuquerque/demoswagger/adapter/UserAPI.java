package br.com.caioalbuquerque.demoswagger.adapter;

import br.com.caioalbuquerque.demoswagger.domain.Usuario;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/usuario")
@Api(value = "API de usuários")
public class UserAPI {

    @GetMapping
    @ApiOperation("Retorna todos os usuários")
    public List<Usuario> getUsuarios() {
        return Arrays.asList(
                new Usuario("Caio", 2000L),
                new Usuario("Henrique", 1000L)
        );
    }

    @GetMapping("/{nomeUsuario}")
    @ApiOperation("Retorna um usuário")
    public Usuario getUsuario(@PathVariable("nomeUsuario") final String nomeUsuario) {
        return new Usuario(nomeUsuario, 1000L);
    }
}