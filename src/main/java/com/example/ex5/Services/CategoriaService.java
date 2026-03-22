package com.example.ex5.Services;

import com.example.ex5.Models.CategoriaModel;
import com.example.ex5.Repositories.CategoriaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoriaService {

    private CategoriaRepository categoriaRepository;

    public CategoriaRepository getCategoriaRepository() {
        return categoriaRepository;
    }

    public CategoriaService(CategoriaRepository categoriaRepository) {
        this.categoriaRepository = categoriaRepository;
    }

    public void setCategoriaRepository(CategoriaRepository categoriaRepository) {
        this.categoriaRepository = categoriaRepository;
    }

    public CategoriaModel criar(CategoriaModel categoriaModel) {
        return categoriaRepository.save(categoriaModel);
    }

    public List<CategoriaModel> listar() {
        return categoriaRepository.findAll();
    }

    public CategoriaModel buscarPorId(Long id) {
        return categoriaRepository.findById(id).get();
    }

    public void deletar(Long id) {
        categoriaRepository.deleteById(id);
    }
}
