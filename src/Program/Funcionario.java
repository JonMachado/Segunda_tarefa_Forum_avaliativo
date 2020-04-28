package Program;

public class Funcionario {
	
	private static int mat_aux = 0;
	private  String nome;
	private  String funcao;
	private  float sal;
	private int mat;
	
	public Funcionario() {
		
		mat=++mat_aux;
	}
	
	public Funcionario(String nome, String funcao, float sal) {
		this();
		this.nome = nome;
		this.funcao = funcao;
		this.sal = sal;
		
	}
	
	public Funcionario(String nome, String funcao)
	{
	this(nome, funcao, CargosSalarios.buscaSalario(funcao));  
	}
	
	public static class CargosSalarios
	{
	public static float buscaSalario(String funcao)
	{
	if (funcao.equals("diretor"))
	return 5000;
	else
	if (funcao.equals("vendedor"))
	return 3000;
	else
	return 1000;
	}
	}


	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getFuncao() {
		return funcao;
	}

	public void setFuncao(String funcao) {
		this.funcao = funcao;
	}

	public float getSal() {
		return sal;
	}

	public void setSal(float sal) {
		this.sal = sal;
	}

	public int getMat() {
		return mat;
	}	

}
