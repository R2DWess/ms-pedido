package br.com.wzzy.mspedido.model.dto;

import lombok.Data;

import java.util.List;

@Data
public class CompraRequestDTO {

    private String emailCliente;
    private List<ProdutoDTO> produtos;

}
