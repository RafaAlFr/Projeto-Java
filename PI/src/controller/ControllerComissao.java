package controller;
import been.Comissao;

public class ControllerComissao {
public class daoComissao{
	public Comissao credenciarApresentadores(Comissao com) {
		Comissao saidaCom = com;
		return saidaCom;
	}
	public Comissao listar(Comissao com) {
		Comissao saidaCom = com;
		return saidaCom;
	}
}
	daoComissao daoCom;
	public Comissao credenciarApresentadores(Comissao com) {
		daoCom = new daoComissao();
		Comissao saidaCom = daoCom.credenciarApresentadores(com);
		return saidaCom;
	}
	public Comissao listar(Comissao com) {
		daoCom = new daoComissao();
		Comissao saidaCom = daoCom.listar(com);
		return saidaCom;
	}
}
