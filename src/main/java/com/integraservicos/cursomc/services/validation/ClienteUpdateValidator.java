package com.integraservicos.cursomc.services.validation;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.HandlerMapping;

import com.integraservicos.cursomc.domain.Cliente;
import com.integraservicos.cursomc.dto.ClienteDTO;
import com.integraservicos.cursomc.repositories.ClienteRepository;
import com.integraservicos.cursomc.resources.exceptions.FieldMessage;

public class ClienteUpdateValidator implements ConstraintValidator<ClienteUpdate, ClienteDTO> {
	@Override
	public void initialize(ClienteUpdate ann){
		}
	@Autowired
	private HttpServletRequest request;
	
	@Autowired
	private ClienteRepository repo;

	@Override
	public boolean isValid(ClienteDTO objDto,ConstraintValidatorContext context){
		
		@SuppressWarnings("unchecked")
		Map<String, String> map = (Map<String, String>) request.getAttribute(HandlerMapping.URI_TEMPLATE_VARIABLES_ATTRIBUTE);
		Integer uriId = Integer.parseInt(map.get("id"));
		
		List<FieldMessage>list=new ArrayList<>();
		
		Cliente aux = repo.findByEmail(objDto.getEmail());
		if(aux != null && !aux.getId().equals(uriId))
		{
			list.add(new FieldMessage("Email", "Email já cadastrado"));
		}
		
		
		// inclua os testes aqui, inserindo erros na lista
		for(FieldMessage e:list){
			context.disableDefaultConstraintViolation();
			context.buildConstraintViolationWithTemplate(e.getMessage()).addPropertyNode(e.getFieldName()).addConstraintViolation();
			}
		return list.isEmpty();
	}
}
