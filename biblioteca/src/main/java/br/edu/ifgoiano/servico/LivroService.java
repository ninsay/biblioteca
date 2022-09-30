package br.edu.ifgoiano.servico;

import java.util.List;
import br.edu.ifgoiano.entidade.Livro;

public interface LivroService {
	public List<Livro> listarLivros();
}

//Regra de negócio (caso o nome tenha mais de 50 letras, ele informa)