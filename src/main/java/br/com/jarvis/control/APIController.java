package br.com.jarvis.control;

import java.util.List;

import br.com.caelum.vraptor.Consumes;
import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.view.Results;
import br.com.jarvis.model.Atividade;
import br.com.jarvis.model.DAO;
import br.com.jarvis.model.Revision;
import br.com.jarvis.model.SolicitacaoMudanca;

@Path("/api")
@Controller
public class APIController extends SuperController {
	@Path("/sm/{id}")
	@Consumes({ "application/json" })
	public void getSM(Long id) {
		SolicitacaoMudanca sm = DAO.getByID(SolicitacaoMudanca.class, id);
		result.use(Results.json()).from(sm).include("atividades").serialize();
	}

	@Path("/atividade/{id}")
	@Consumes({ "application/json" })
	public void getRevisions(Long id) {
		Atividade atividade = DAO.getByID(Atividade.class, id);
		List<Revision> svnRevisions = Revision.getAll(atividade.getBranch());
		result.use(Results.json()).from(svnRevisions).serialize();
	}
}
