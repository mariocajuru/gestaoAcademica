package br.com.mario.gestaoacademica.service;

import java.util.List;

import br.com.mario.gestaoacademica.model.Docente;

public interface DocenteService {
	public void adicionarDocente(Docente docente);
	public List<Docente> listarDocentes();
	public Docente verDocente(int id);

}
