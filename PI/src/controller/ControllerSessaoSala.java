package controller;
import been.Sala;
import been.Sessao;

public class ControllerSessaoSala {
public class daoSala{
	public Sala cadastrar(Sala sal) {
		Sala saidaSal = sal;
		return saidaSal;
	}
	public Sala buscar(Sala sal) {
		Sala saidaSal = sal;
		return saidaSal;
	}
	public Sala listar(Sala sal) {
		Sala saidaSal = sal;
		return saidaSal;
	}
}
public class daoSessao{
	public Sessao atribuir(Sessao ses) {
		Sessao saidaSes = ses;
		return saidaSes;
	}
	public Sessao distribuir(Sessao ses) {
		Sessao saidaSes = ses;
		return saidaSes;
	}
	public Sessao listar(Sessao ses) {
		Sessao saidaSes = ses;
		return saidaSes;
	}
}

public class ControllerSala{
	daoSala daoSal;
	
	public Sala cadastrar(Sala sal) {
		daoSal = new daoSala();
		Sala saidaSal = daoSal.cadastrar(sal);
		return saidaSal;
	}
	public Sala buscar(Sala sal) {
		daoSal = new daoSala();
		Sala saidaSal = daoSal.buscar(sal);
		return saidaSal;
	}
	public Sala listar(Sala sal) {
		daoSal = new daoSala();
		Sala saidaSal = daoSal.listar(sal);
		return saidaSal;
	}
}
public class ControllerSessao {
	daoSessao daoSes;
	
	public Sessao atribuir(Sessao ses) {
		daoSes = new daoSessao();
		Sessao saidaSes = daoSes.atribuir(ses);
		return saidaSes;
	}
	public Sessao distribuir(Sessao ses) {
		daoSes = new daoSessao();
		Sessao saidaSes = daoSes.distribuir(ses);
		return saidaSes;
	}
	public Sessao listar(Sessao ses) {
		daoSes = new daoSessao();
		Sessao saidaSes = daoSes.listar(ses);
		return saidaSes;
	}
	
}

}
