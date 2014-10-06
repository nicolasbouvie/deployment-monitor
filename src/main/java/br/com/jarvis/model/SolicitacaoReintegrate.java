package br.com.jarvis.model;

import java.util.Date;
import java.util.List;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

public class SolicitacaoReintegrate extends DAO {
	private static final long serialVersionUID = -3243325451385363424L;
	
	@Id
	@GeneratedValue
	private Long id;
	private SolicitacaoMudanca sm;
	private Atividade atividade;
	private List<Integer> revisions;
	private String motivos;
	private Date data = new Date();
	private Status status = Status.PENDENTE_REINTEGRATE;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public SolicitacaoMudanca getSm() {
		return sm;
	}
	public void setSm(SolicitacaoMudanca sm) {
		this.sm = sm;
	}
	public Atividade getAtividade() {
		return atividade;
	}
	public void setAtividade(Atividade atividade) {
		this.atividade = atividade;
	}
	public List<Integer> getRevisions() {
		return revisions;
	}
	public void setRevisions(List<Integer> revisions) {
		this.revisions = revisions;
	}
	public String getMotivos() {
		return motivos;
	}
	public void setMotivos(String motivos) {
		this.motivos = motivos;
	}
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
	public Status getStatus() {
		return status;
	}
	public void setStatus(Status status) {
		this.status = status;
	}
}
