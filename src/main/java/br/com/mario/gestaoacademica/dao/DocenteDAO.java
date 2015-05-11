package br.com.mario.gestaoacademica.dao;

import java.util.List;
import br.com.mario.gestaoacademica.model.Docente;

public interface DocenteDAO {
	
	public void adicionarDocente(Docente docente);
	public List<Docente> listarDocentes();
	public Docente verDocente(int id);
	
}
