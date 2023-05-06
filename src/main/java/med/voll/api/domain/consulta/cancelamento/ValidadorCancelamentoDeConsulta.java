package med.voll.api.domain.consulta.cancelamento;

import med.voll.api.domain.consulta.DadosCancelamentoConsulta;
import org.springframework.stereotype.Component;

@Component
public interface ValidadorCancelamentoDeConsulta {

    void validar(DadosCancelamentoConsulta dados);

}
