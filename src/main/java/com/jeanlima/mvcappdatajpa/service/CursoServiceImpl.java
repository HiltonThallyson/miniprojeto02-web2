package com.jeanlima.mvcappdatajpa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.jeanlima.mvcappdatajpa.model.Curso;
import com.jeanlima.mvcappdatajpa.repository.CursoRepository;

@Component
public class CursoServiceImpl implements CursoService {

    @Autowired
    CursoRepository cursoRepository;

    //public ArrayList<Curso> cursos = new ArrayList<Curso>();

    @Override
    public void removerCurso(Curso curso) {
        cursoRepository.delete(curso);
    }

    @Override
    public void salvarCurso(Curso curso) {
       // Integer id = cursos.size() + 1;
        //Curso novoCurso = new Curso(curso.getDescricao());
        //novoCurso.setId(id);
        // if (!cursos.contains(novoCurso)) {
        //     cursos.add(novoCurso);
        // }
        cursoRepository.save(curso);
    }

    @Override
    public void atualizarCurso(Curso curso){
        //int index = cursos.indexOf(getCursoById(curso.getId()));
        //cursos.get(index).setDescricao(curso.getDescricao());
        cursoRepository.deleteById(curso.getId());
        cursoRepository.save(curso);
    }

    @Override
    public List<Curso> getCursos() {
        return cursoRepository.findAll();
    }

    @Override
    public Curso getCursoById(Integer id) {
        return cursoRepository.findById(id).map(curso -> {
            return curso;
        }).orElseThrow(() -> null);

    }

}
