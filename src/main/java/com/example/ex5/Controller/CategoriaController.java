package com.example.ex5.Controller;

import com.example.ex5.Models.CategoriaModel;
import com.example.ex5.Services.CategoriaService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/categorias")
public class CategoriaController {

    private CategoriaService categoriaService;

    public CategoriaController(CategoriaService categoriaService) {
        this.categoriaService = categoriaService;
    }

    @GetMapping
    public List<CategoriaModel> listar() {
        return categoriaService.listar();
    }

    @PostMapping
    public CategoriaModel criar(@RequestBody CategoriaModel categoria) {
        return categoriaService.criar(categoria);
    }

    @GetMapping("/{id}")
    public CategoriaModel buscarPorId(@PathVariable Long id) {
        return categoriaService.buscarPorId(id);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        categoriaService.deletar(id);
    }
}