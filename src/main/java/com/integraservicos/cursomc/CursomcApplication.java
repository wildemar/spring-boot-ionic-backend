package com.integraservicos.cursomc;

import java.text.SimpleDateFormat;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.integraservicos.cursomc.domain.Categoria;
import com.integraservicos.cursomc.domain.Cidade;
import com.integraservicos.cursomc.domain.Cliente;
import com.integraservicos.cursomc.domain.Endereco;
import com.integraservicos.cursomc.domain.Estado;
import com.integraservicos.cursomc.domain.ItemPedido;
import com.integraservicos.cursomc.domain.Pagamento;
import com.integraservicos.cursomc.domain.PagamentoComBoleto;
import com.integraservicos.cursomc.domain.PagamentoComCartao;
import com.integraservicos.cursomc.domain.Pedido;
import com.integraservicos.cursomc.domain.Produto;
import com.integraservicos.cursomc.domain.enums.EstadoPagamento;
import com.integraservicos.cursomc.domain.enums.TipoCliente;
import com.integraservicos.cursomc.repositories.CategoriaRepository;
import com.integraservicos.cursomc.repositories.CidadeRepository;
import com.integraservicos.cursomc.repositories.ClienteRepository;
import com.integraservicos.cursomc.repositories.EnderecoRepository;
import com.integraservicos.cursomc.repositories.EstadoRepository;
import com.integraservicos.cursomc.repositories.ItemPedidoRepository;
import com.integraservicos.cursomc.repositories.PagamentoRepository;
import com.integraservicos.cursomc.repositories.PedidoRepository;
import com.integraservicos.cursomc.repositories.ProdutoRepository;

@SpringBootApplication
public class CursomcApplication implements CommandLineRunner{

	
	
	public static void main(String[] args) {
		SpringApplication.run(CursomcApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
	
	}

}
