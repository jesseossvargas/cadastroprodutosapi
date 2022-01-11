package org.jesse.cadastroprodutosapi.produto;

import lombok.NoArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity
@NoArgsConstructor
public class Produto {

    @Getter @Setter
    @Id
    @SequenceGenerator(
            name = "produto_sequence",
            sequenceName = "produto_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "produto_sequence"
    )
    private Long id;

    @Getter @Setter
    private Double preco;

    @Getter @Setter
    private Date dataValidade;

    @Getter @Setter
    private Date dataCadastro;

    @Getter @Setter
    private String nome;

    @Getter @Setter
    private Integer quantidade;

}
