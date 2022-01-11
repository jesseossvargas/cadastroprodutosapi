package org.jesse.cadastroprodutosapi.produto;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/produto")
public class ProdutoController {

    private final ProdutoService produtoService;

    public ProdutoController(ProdutoService produtoService){
        this.produtoService = produtoService;
    }

    @GetMapping
    public List<Produto> getProdutos(){
        return produtoService.getProdutos();
    }

    @PostMapping
    public void cadastrarProduto(@RequestBody Produto produto){
        produtoService.incluirProduto(produto);
    }

}
