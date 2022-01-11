package org.jesse.cadastroprodutosapi.produto;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProdutoService {

    private final ProdutoRepository produtoRepository;

    public ProdutoService(ProdutoRepository produtoRepository){
        this.produtoRepository = produtoRepository;
    }

    public List<Produto> getProdutos(){
        return produtoRepository.findAll();
    }

    public void incluirProduto(Produto produto){
        produtoRepository.save(produto);
    }
}
