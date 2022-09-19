package com.jeanlima.mvcappdatajpa.service;

import java.util.ArrayList;

import com.jeanlima.mvcappdatajpa.model.Curso;

public interface CursoService {
    public void salvarCurso(Curso curso);
    public void removerCurso(Curso curso);
    public Curso getCursoById(Integer id);
    public ArrayList<Curso> getCursos();
    public void atualizarCurso(Curso curso);
}
